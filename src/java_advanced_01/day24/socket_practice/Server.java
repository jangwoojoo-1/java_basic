package java_advanced_01.day24.socket_practice;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        try{
            serverSocket = new ServerSocket(5000);
            while(true) {
                Socket socket = serverSocket.accept();
                System.out.println("[서버]와 연결되었습니다.");
                socket.close();
                System.out.println("[서버]와 연결 해제");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
