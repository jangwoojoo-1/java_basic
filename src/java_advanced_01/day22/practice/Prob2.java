package java_advanced_01.day22.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Book implements Serializable {
    private static long serialVersionUID = 10L;
    private String title;
    private int price;
}

public class Prob2 {
    public static void main(String[] args) {
        //BookList 생성
        List<Book> books = new ArrayList<Book>();

        //객체 저장
        books.add(new Book("삼국지", 20000));
        books.add(new Book("초한지", 22000));
        books.add(new Book("서유기", 18000));

        // 파일 경로
        Path path = Paths.get("books.dat");

        //파일 아웃풋 스트림 objectOutput 스트림에 연결해서 생성
        //try catch resource 응용
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(books);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //파일 인풋 스트림 objectInput 스트림에 연결해서 생성
        //try catch resource 응용
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            List<Book> readBooks = (List<Book>) ois.readObject();
            readBooks.forEach(System.out::println);
        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
