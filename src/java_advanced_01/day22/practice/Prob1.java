package java_advanced_01.day22.practice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@AllArgsConstructor
@NoArgsConstructor
@ToString
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;
}

public class Prob1 {
    public static void main(String[] args) {
        //Person 객체 생성
        Person p = new Person("홍길동", 30);
        // 파일 경로
        Path path = Paths.get("person.dat");

        //파일 아웃풋 스트림 objectOutput 스트림에 연결해서 생성
        //try catch resource 응용
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(p);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //파일 인풋 스트림 objectInput 스트림에 연결해서 생성
        //try catch resource 응용
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Person p1 = (Person) ois.readObject();
            System.out.println(p1.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
