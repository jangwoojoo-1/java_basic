package java_advanced_01.day21.test;

import lombok.Data;

import java.io.*;

//문제 : 학생 이름 "신세계" 나이 25 학점 3.8 을 student.dat파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob15 {
    public static void main(String[] args) throws Exception {
        Student student = Student.builder()
                .name("신세계").age(25).score(3.8).build();

        String fileName = "C:/Temp/student.dat";

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));) {
            dos.writeUTF(student.getName());
            dos.writeInt(student.getAge());
            dos.writeDouble(student.getScore());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            String name =dis.readUTF();
            int age =dis.readInt();
            double score = dis.readDouble();

            System.out.println(name + " " + age + " " + score);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
