package java_advanced_01.day21.datainoutstream;

import java.io.*;

public class DataInputOutputEx {
    public static void main(String[] args) throws Exception {
        //데이터입출력객체 생성
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        fos = new FileOutputStream("C:/Temp/primitive.db");
        dos = new DataOutputStream(fos);

        dos.writeUTF("주장우");
        dos.writeInt(25);
        dos.writeDouble(3.14);
        dos.writeBoolean(Boolean.TRUE);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("C:/Temp/primitive.db");
        dis = new DataInputStream(fis);

//        for(int i = 0 ; i < 4 ; i++){
            String name = dis.readUTF();
            int age = dis.readInt();
            double price = dis.readDouble();
            boolean flag = dis.readBoolean();
            System.out.println(name + " " + age + " " + price + " " + flag);

//        }

        dis.close();
        fis.close();
    }
}
