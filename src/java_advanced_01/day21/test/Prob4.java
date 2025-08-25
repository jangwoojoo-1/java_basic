package java_advanced_01.day21.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 문제 4: 바이트 단위 파일 쓰기
//         byte_output.txt 파일에 "ABCDEF"를 바이트 단위로 저장하고 성공하면 "저장완료"  출력하세요
public class Prob4 {

    public static void main(String[] args){
        String fileName = "c:/Temp/byte_output.txt";

        try (OutputStream os = new FileOutputStream(fileName)){
            byte[] str = "ABCDEF".getBytes();

            os.write(str);

            os.flush();
        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }catch (IOException e){
            System.out.println("IOException");
        }catch (Exception e){
            System.out.println("Exception");
        } finally {
            System.out.println("저장완료");
        }
    }
}
