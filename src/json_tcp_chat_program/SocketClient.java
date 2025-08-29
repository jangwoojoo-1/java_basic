package json_tcp_chat_program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient implements Runnable {
    Socket socket;

    public SocketClient(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
        } finally {
            if(socket != null && !socket.isClosed()) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
