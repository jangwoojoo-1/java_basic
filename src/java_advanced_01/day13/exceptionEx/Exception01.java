package java_advanced_01.day13.exceptionEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception01 {
    //컴파일 예외 클래스 종류와 처리
    // 1. IOException : 입출력을 다루는 메서드는 반드시 IOException을 처리하도록 규정되어 있음
    //2.  FileNotFoundException : 파일에 접근하려고 하는데 지정 위치에 해당 파일이 없다.

    public static void main(String[] args) throws IOException{
        byte[] list = {'a', 'b', 'c', 'd'};
//        try {
//            System.out.write(list);
//        } catch (IOException e) {
//            e.getMessage();
//        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}
