package json_tcp_chat_program;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//1. 서버에 연결 요청
//2. SocketClient와 1대1 통신
    //메시지 받고 메세지 보내고
public class ChatClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 50001)
                ;BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {

            Thread readThread = new Thread(() -> {
                while (true) {
                    try {
                        if(br.readLine().equals("exit")) {
                            break;
                        }
                        System.out.println(br.readLine());
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            });
            readThread.start();

            Thread writeThread = new Thread(() -> {
                while (true) {
                    try {
                        if(keyboard.readLine().equals("exit")) {
                            pw.println("exit");
                            break;
                        }
                        pw.println(keyboard.readLine());
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            });
            writeThread.start();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
