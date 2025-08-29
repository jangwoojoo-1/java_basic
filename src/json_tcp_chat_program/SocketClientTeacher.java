package json_tcp_chat_program;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

//클라이언트와 1:1 로 통신하는 역할
public class SocketClientTeacher {

    //필요 객체 (필드)
    ChatServerTeacher chatServer;  //ChatServer()의 메소드를 호출을 위해
    Socket socket;          //연결을 끊을때 필요
    DataInputStream dis;    //문자열을 읽을때
    DataOutputStream dos;  //문자열을 보낼때
    public String clientIp;     //클라이언트 Ip
    String chatName;      //닉네임(대화명)

    public SocketClientTeacher(ChatServerTeacher chatServer, Socket socket) {
        try {
            this.chatServer = chatServer;
            this.socket = socket;
            this.dis = new DataInputStream(socket.getInputStream());
            this.dos = new DataOutputStream(socket.getOutputStream());
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            this.clientIp = isa.getHostName();
            receive();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //메소드 : JSON 메세지 받기  : 클라이어트가 보낸 JSON 메시지를 읽는 업무를 수행한다.
    // dis.readUTF()로 JSON을 읽고 JSONObject로 파싱해서 command값을 얻어내어 처리함
    //command : incomming=> JSON에서 대화명을 읽는다. chatRoom에 SocketClient를 추가
    //            message => 메세지를 읽고 연결되어 있는 모든 클라이언트들에게 메시지를 보낸다.
    //          클라이언트가 채팅을 종료할 경우 dis.UTF()에서 IOException발생하므로 예외처리를 하여
    // chatRoom에 저장되어 있는 SocketClient를 제거한다.

    public void receive(){

        chatServer.threadPool.execute(
                () -> {

                    try {
                        while (true) {

                            String receiveJson = dis.readUTF();

                            JSONObject obj = new JSONObject(receiveJson);
                            String command = obj.getString("command");

                            switch (command) {
                                case "incoming" :
                                    this.chatName = obj.getString("data");
                                    chatServer.sendToAll(this,"입장하셨습니다.");
                                    chatServer.addSocketClient(this);
                                    break;
                                case "message" :
                                    String message = obj.getString("data");
                                    chatServer.sendToAll(this,message);
                                    break;
                            }

                        }
                    } catch (IOException e) {
                        chatServer.sendToAll(this,"퇴장하셨습니다.");
                        chatServer.removetSocketClient(this);
                    }


                }

        );
    }

    //메소드 : JSON 보내기  연결된 클라이언트로 JSON메세지를 보내는 기능
    public void send(String json){
        try {
            dos.writeUTF(json);
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 메소드 연결 종료
    public void close(){
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
