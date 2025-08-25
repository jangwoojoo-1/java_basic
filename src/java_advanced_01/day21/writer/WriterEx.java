package java_advanced_01.day21.writer;

//Writer 클래스는 OutputStream과 사용법은 동일하지만, 출력단위가 문자이다.
//문자열을 출력하는 write(String str) 메서드가 추가 제공된다.
// Writer 클래스를 활용하여 하나의 문자, 문자배열, 문자열을 출력하는 기능 구현

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("C:/Temp/testChar.txt");

        //1. 문자 출력
        char ch = 'A';
        writer.write(ch);
        char ch2 = 'B';
        writer.write(ch2);

        //2. char 배열 파일 출력
        char[] chars = {'C', 'D', 'E', 'F'};
        writer.write(chars);

        //3. 문자열 파일 출력
        String str = "\nHello IOStream!!";
        writer.write(str);

        writer.flush();
        writer.close();
    }
}
