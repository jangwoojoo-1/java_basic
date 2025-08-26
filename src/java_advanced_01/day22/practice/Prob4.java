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
class Account implements Serializable {
    private static final long serialVersionUID = 17L;
    private String owner;
    transient private int balance;

    // copilot 활용
    // 메서드 오버라이드 방법
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(this.balance);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        this.balance = ois.readInt();
    }
}

public class Prob4 {
    public static void main(String[] args) {
        //Account 객체 생성
        Account a = new Account("철수", 10000);

        //파일 경로
        Path path = Paths.get("C:/Temp/account.dat");

        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(a);
        }catch (IOException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Account readAccount = (Account) ois.readObject();
            System.out.println(readAccount.toString());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
