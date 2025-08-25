package java_advanced_01.day21.test;

import javabasic_02.day11.Inheritance.practice2.E;
import lombok.Data;

import java.io.*;
import java.util.ArrayList;

//문제 : 3명의 학생 (김철수,21,3.5), (이영희,22,3.9) (박민수, 20,3.2) 학생 정보를
// students.dat파일에 저장하고 다시 읽어 출력 ex) 반 총점 = 10.6  반 평균 = 3.5 (소수 첫째자리 표현)을 출력하고
// 학생정보를 나이순으로 콘솔에 출력하세요
//학생정보
// 박민수 , 20세
// 김철수 , 21세
// 이영희 , 22세
public class Prob16 {
    public static void main(String[] args){
        String fileName = "C:/Temp/students.dat";

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(Student.builder().name("김철수").age(21).score(3.5).build());
            oos.writeObject(Student.builder().name("이영희").age(22).score(3.9).build());
            oos.writeObject(Student.builder().name("박민수").age(20).score(3.2).build());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        /*
        Student st1 = Student.builder().name("김철수").age(21).score(3.5).build();
        Student st2 = Student.builder().name("이영희").age(22).score(3.9).build();
        Student st3 = Student.builder().name("박민수").age(20).score(3.2).build();

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))){
            dos.writeUTF(st1.getName());
            dos.writeInt(st1.getAge());
            dos.writeDouble(st1.getScore());

            dos.writeUTF(st2.getName());
            dos.writeInt(st2.getAge());
            dos.writeDouble(st2.getScore());

            dos.writeUTF(st3.getName());
            dos.writeInt(st3.getAge());
            dos.writeDouble(st3.getScore());


        } catch (Exception e){
            e.printStackTrace();
        }
        */

        ArrayList<Student> students = new ArrayList<Student>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            students.add((Student) ois.readObject());
            students.add((Student) ois.readObject());
            students.add((Student) ois.readObject());
        } catch (Exception e){
            e.printStackTrace();
        }

        /*
        try(DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            students.add(Student.builder().name(dis.readUTF()).age(dis.readInt()).score(dis.readDouble());
            students.add(Student.builder().name(dis.readUTF()).age(dis.readInt()).score(dis.readDouble());
            students.add(Student.builder().name(dis.readUTF()).age(dis.readInt()).score(dis.readDouble());
        } catch (Exception e){
            e.printStackTrace();
        }
        */

        System.out.println("반 총점=" + students.stream()
                .mapToDouble(student -> student.getScore()).sum()
                + "  " + "반 평균=" + String.format("%.1f", students.stream()
                .mapToDouble(student -> student.getScore())
                .average().getAsDouble()));


        System.out.println("학생정보");
        students.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()))
                .forEach(Student -> {
                    System.out.println(Student.getName() + ", " + Student.getAge());
                });
    }
}