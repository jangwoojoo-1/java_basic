package java_advanced_01.day23.net.multiserverecho;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiEchoServer {
    private static final int PORT = 5000;
    private static final ExecutorService POOL = Executors.newCachedThreadPool();
    //스레드 풀 생성해주는 메서드
    // Executors.newCachedThreadPool() : 필요에 따라 새로운 스레드를 생성하고, 사용하지 않는 스레드는 일정 시간이 지나면 해제하는 유연한 스레드 풀을 만듦
    // .submit : 작업 제출하기(Runnable 또는 Callable 작업을 ExecutorService에 제출)(Runnable 반환값 없는 작업, Callable 반환값 있는 작업)
    // .shutdownNow : 스레드 풀 종료
    private static final AtomicInteger CLIENT_SEQ = new AtomicInteger(1);
    //멀티스레드 환경에서 동기화 없이도 안전하게 정수 값을 업데이트할 수 있도록 설계된 클래스
    // .getAndIncrement : 현재 값을 반환한 후 1 증가
    // .decrementAndGet : 값을 1 감소시키고 결과 반환

    public static void main(String[] args) {
        System.out.println("[Server] Starting on port " + PORT);
        // Ctrl+C 시 스레드 풀 정리
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n[Server] Shutting down...");
            POOL.shutdownNow();
        }));
        //Runtime.getRuntime() : 자바 애플리케이션의 런타임 환경을 가져옴
        // .addShutdownHook(Thread) : 프로그램이 종료되기 직전에 실행할 작업을 등록 -> 여기서는 Thread 하나를 등록

        try (ServerSocket serverSocket = new ServerSocket(PORT)) { //
            while (true) {
                Socket socket = serverSocket.accept();
                int id = CLIENT_SEQ.getAndIncrement();
                System.out.println("[Server] Client#" + id + " connected from " + socket.getRemoteSocketAddress());
                POOL.submit(new ClientHandler(socket, id));
            }
        } catch (IOException e) {
            System.err.println("[Server] Error: " + e.getMessage());
        }
    }

    private static class ClientHandler implements Runnable {
        private final Socket socket;
        private final int clientId;

        ClientHandler(Socket socket, int clientId) {
            this.socket = socket;
            this.clientId = clientId;
        }

        @Override
        public void run() {
            try (
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    PrintWriter out = new PrintWriter(
                            new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true)
            ) {
                out.println("Welcome! You are Client#" + clientId + ". Type 'exit' to quit.");
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println("[Server] From Client#" + clientId + ": " + line);
                    if ("exit".equalsIgnoreCase(line.trim())) {
                        out.println("Bye Client#" + clientId);
                        break;
                    }
                    // 받은 메시지를 그대로 돌려주는 에코
                    out.println("Echo to #" + clientId + ": " + line);
                }
            } catch (IOException e) {
                System.err.println("[Server] Client#" + clientId + " I/O error: " + e.getMessage());
            } finally {
                try { socket.close(); } catch (IOException ignored) {}
                System.out.println("[Server] Client#" + clientId + " disconnected.");
            }
        }
    }
}