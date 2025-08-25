package java_advanced_01.day21.test;

import java.io.*;

//문제 : 정수 100, 실수 3.14, 문자열 "Java" ,
// 불리언 true 를 data.dat에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob13 {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/Temp/dat.dat"));
        dos.writeInt(100);
        dos.writeDouble(3.14);
        dos.writeUTF("Java");
        dos.writeBoolean(true);

        dos.flush();
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("C:/Temp/dat.dat"));
        int n1 = dis.readInt();
        Double n2 = dis.readDouble();
        String n3 = dis.readUTF();
        boolean n4 = dis.readBoolean();

        dis.close();
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);

    }
}
