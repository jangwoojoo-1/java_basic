package java_advanced_01.day21.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReaderEx01 {
    public static void main(String[] args) {

        try {
            //1. 리소스 객체를 대상으로 입력 스트림을 생성
            InputStream in = new FileInputStream("C:/Temp/test3.db");

            //2. 리소스의 데이터가 존재한다면 읽어온다.\
            while(true){
                int data = in.read();
                //파일은 끝이 있다. EOF(End of File) => -1 return

                if(data == -1) break;

                System.out.println(data);

            }

            //3. 다 읽었으면 입력 스트림 닫기
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        } catch (Exception e){
            System.out.println("Exception");
        }


    }
}
