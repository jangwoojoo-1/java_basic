package java_advanced_01.day24.socket_practice;

import java.io.IOException;
import java.net.Socket;

public class Client {
    static Socket socket = null;
    public static void main(String[] args){
        try {
            socket = new Socket("localhost",5000);
            System.out.println("[접속완료]");
            socket.close();
            System.out.println("[접속해제]");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
