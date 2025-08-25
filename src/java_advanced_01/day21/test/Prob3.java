package java_advanced_01.day21.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
public class Prob3 {

    public static void main(String[] args) {
        String fileName = "C:/Temp/hello.txt";
        int total = 0;
        try(Reader reader = new FileReader(fileName)){
            char[] buf = new char[100];
            while(true){
                int read = reader.read(buf);
                if(read == -1){break;}
                total += read;
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("I/O exception");
        } catch(Exception e){
            System.out.println("Exception");
        }

        System.out.println(total);
    }
}
