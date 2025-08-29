package json_tcp_chat_program;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(50001);
            SocketClient socket = new SocketClient(serverSocket.accept());
            socket.run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
            }
        }
    }
}
