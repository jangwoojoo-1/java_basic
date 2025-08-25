package java_advanced_01.day21.test;

import java.io.*;

// 문제 6: 이미지 복사 (바이트 스트림 활용)
//        image.jpg 파일을 읽어서 copy.jpg 파일로 복사하세요.  image.jpg는 여러분이 지정합니다.
public class Prob6 {

    public static void main(String[] args) {
        String fileName = "C:/Temp/image.jpg";
        String fileName2 = "C:/Temp/copy.jpg";

        try(InputStream is = new FileInputStream(fileName);
            OutputStream os = new FileOutputStream(fileName2)){
            is.transferTo(os);

            os.flush();
        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        } catch (IOException e){
            System.out.println("I/O Exception");
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
