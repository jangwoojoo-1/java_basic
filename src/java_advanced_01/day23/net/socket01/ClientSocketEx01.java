package java_advanced_01.day23.net.socket01;

import java.io.IOException;
import java.net.Socket;

public class ClientSocketEx01 {
    public static void main(String[] args) {

        //Socket 생성과 동시에   localhost 또는 IP의    Port로 연결 요청
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("Connected to server 성공!");

            socket.close();
            System.out.println("클라이언트 연결 종료");
        } catch (IOException e) {
            System.out.println("연결 실패");
        }
    }
}
