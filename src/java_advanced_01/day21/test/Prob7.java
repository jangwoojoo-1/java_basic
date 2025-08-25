package java_advanced_01.day21.test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {

    public static void main(String[] args) {
        String fileName = "C:/Temp/copy.jpg";

        int size = 0;
        try(InputStream in = new FileInputStream(fileName)){
            byte[] buf = new byte[100];
            while(true){
                int n = in.read(buf);
                if(n == -1){break;}
                size += n;
            }
        }catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        } catch (IOException e){
            System.out.println("IOException");
        } catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println(size + "bytes");
    }
}
