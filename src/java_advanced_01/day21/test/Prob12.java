package java_advanced_01.day21.test;

import java.io.*;

//문제 : 10,20,30 을 numbers.dat 파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob12 {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/Temp/numbers.dat"));

        dos.writeInt(10);
        dos.writeInt(20);
        dos.writeInt(30);

        dos.flush();
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("C:/Temp/numbers.dat"));
        int n1 = dis.readInt();
        int n2 = dis.readInt();
        int n3 = dis.readInt();

        dis.close();
        System.out.println(n1 + " " + n2 + " " + n3);
    }
}
