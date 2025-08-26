package java_advanced_01.day22.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Student implements Serializable {
    private static final long serialVersionUID = 11L;
    private String name;
    private int grade;
}

public class Prob3 {
    public static void main(String[] args) {
        //student 객체 생성
        Student s1 = new Student("학생1", 1);
        Student s2 = new Student("학생2", 3);

        //파일 경로
        Path path = Paths.get("students.dat");

        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(s1);
            oos.writeObject(s2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            while(true){
                Object obj = ois.readObject();
                if(obj instanceof Student){
                    Student s = (Student) obj;
                    System.out.println(s.toString());
                } else{
                    System.out.println("자료형이 잘못됨");
                    break;
                }
            }
        }catch (EOFException e){
            System.out.println("파일 끝");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
