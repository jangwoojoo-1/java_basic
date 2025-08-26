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
class Product implements Serializable{
    private static final long serialVersionUID = 17L;
    private String name;
    private int price;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class Order implements Serializable {
    private static final long serialVersionUID = 11L;
    private int orderId;
    private Product product;
}

public class Prob5 {
    public static void main(String[] args) {
        Order order = new Order(1234, new Product("상품1", 1000));

        Path path = Paths.get("C:/Temp/order.dat");

        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(order);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Order readOrder = (Order) ois.readObject();
            System.out.println(readOrder.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
