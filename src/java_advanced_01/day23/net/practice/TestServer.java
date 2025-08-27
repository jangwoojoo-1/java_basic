package java_advanced_01.day23.net.practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TestServer {
    static ExecutorService executor = Executors.newCachedThreadPool();
    static AtomicInteger counter = new AtomicInteger(1);

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down");
            executor.shutdown();
        }));

        try(ServerSocket serverSocket = new ServerSocket(5555)) {
           while(true) {
               Socket socket = serverSocket.accept();
               startServer(serverSocket, socket);
           }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static void startServer(ServerSocket serverSocket, Socket socket) {
            Thread thread = new Thread(new Runnable() {
            public void run() {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){
                    String str = reader.readLine();
                    System.out.println(str);
                    writer.write(str);
                     } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
