package java_advanced_01.day23.net.socket01;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ServerSocketEx01 {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("---------------------Server started--------------------");
        System.out.println("서버를 종료하려면 q 또는 Q 를 입력하고 Enter 키를 입력하세요!");
        System.out.println("-------------------------------------------------------");

        //TCP 서버 시작
        startServer();

        //멀티 스레드
          // startServer의 스레드와 메인 메서드의 Scanner 스레드가 병렬로 실행되고 있음

        //키보드 입력
        Scanner sc = new Scanner(System.in);
        while(true){
            String key = sc.nextLine();
            if(key.toLowerCase().equals("q")) break;
        }

        //TCP 서버 종료
        stopServer();

    }

    public static void startServer(){
        //스레드 Thread : 실행 단위
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버]시작됨!");
                    while(!serverSocket.isClosed()){
                        System.out.println("\n[서버] 연결요청을 기다립니다.\n");
                        //연결 수락
                        Socket socket = serverSocket.accept();
                        
                        //연결된 클라이언트의 IP 정보 얻기
                        InetSocketAddress ia = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버]" + 
                                ia.getAddress() + ":" + 
                                ia.getPort() + "의 연결 수락");
                        
                        //연결 끊기
                        socket.close();
                        System.out.println("[서버] 연결 종료");
                    }
                } catch (SocketException e){
                    System.out.println("accept 중단");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        //스레드 시작, run 동작
        thread.start();
    }



    public static void stopServer(){
        try {
            serverSocket.close();
            System.out.println("[서버 종료]");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
