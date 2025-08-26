package java_advanced_01.day22.serialize;

//자바는 메모리에 생성된 객체를 파일 또는 네트워크로 출력할 수 있다.
// 객체를 입출력할 수 있는 보조 스트림
// ObjectInputStream(바이트 스트림과 연결되어 객체로 복원하는 역직렬화),
// ObjectOutputStream(바이트 스트림과 연결되어 객체를 직렬화)

import javabasic_02.day11.Inheritance.practice2.E;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
class User implements Serializable {
    private static final long serialVersionUID = 10L;
    private String name;
    private transient int age;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Serializable {
    private static final long seralVersionUID = 1L;
    private String pname;
    private int price;
}

public class ObjectInputEx {

    public static void main(String[] args) throws EOFException, Exception {
        // C:/Temp/object.dat 에 파일 객체에 파일입력 스트림 객체를 생성
        String fileName = "C:/Temp/object.dat";
        FileOutputStream fos = new FileOutputStream(fileName);

        // 2. 생성된 파일 입력 스트림 객체에 객체 출력스트림 객체를 끼워라(연결해라).
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //3. 객체 생성
        User user = new User("신세계", 20);
        Product product = new Product("노트북", 1500000);
        int[] arr1 = { 10, 20, 30};
        List<Product> products = Arrays.asList(product, product);

        // 4. 위 4개의 객체를 object.dat 파일에 저장
        oos.writeObject(user);
        oos.writeObject(product);
        oos.writeObject(arr1);
        oos.writeObject(products);

        //5.
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

        try{
            while(true){
                Object obj = ois.readObject();
                if(obj instanceof Product){
                    Product p = (Product) obj;
                    System.out.println(p);
                } else if(obj instanceof List<?>){
                    List<?> list = (List<?>) obj;
                    list.forEach(System.out::println);
                } else if(obj instanceof User){
                    User u = (User) obj;
                    System.out.println(u);
                } else{
                    int[] arr = (int[]) obj;
                    System.out.println(Arrays.toString(arr));
                }
            }
        } catch (EOFException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        ois.close();

    }
}
