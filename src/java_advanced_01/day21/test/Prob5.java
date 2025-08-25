package java_advanced_01.day21.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// 문제 5: 바이트 단위 파일 읽기
//        byte_output.txt 파일을 읽어 화면에 출력하세요.
public class Prob5 {

    public static void main(String[] args) {
        String fileName = "C:/Temp/byte_output.txt";

        try(InputStream is = new FileInputStream(fileName)){
            byte[] buf = new byte[100];

            while(true){
                int n = is.read(buf);
                if(n == -1){break;}
                System.out.println(new String(buf,0,n));
            }
        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        } catch (IOException e){
            System.out.println("IOException");
        } catch (Exception e){
            System.out.println("Exception");
        }
    }
}
