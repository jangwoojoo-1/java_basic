package java_advanced_01.day21.test;

import java.io.*;

// 문제 1: 텍스트 파일에 문자열 저장
//         문자열 "Hello Java!"를 hello.txt에 저장하세요.
public class Prob1 {

    //text 파일과 문자열
    // -> 문자열 스트림 사용
    public static void main(String[] args) {
        String fileName = "C:/Temp/hello.txt";
        try {
            Writer os = new FileWriter(fileName);
            String str = "Hello java!";

            os.write(str);

            os.flush();

            os.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
