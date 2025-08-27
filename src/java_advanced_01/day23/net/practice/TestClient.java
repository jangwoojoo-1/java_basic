package java_advanced_01.day23.net.practice;

import java.io.*;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 5555);
             BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));) {

            out.println("1234");

            String str = reader.readLine();

            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
