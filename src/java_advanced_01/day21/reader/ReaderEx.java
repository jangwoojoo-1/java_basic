package java_advanced_01.day21.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) throws Exception {

        Reader reader = null;

        reader = new FileReader("C:/Temp/testChar.txt");

        //1. 문자 하나씩 읽기
        while(true){
            int c = reader.read();
            if(c == -1)break;
            System.out.print((char)c);
        }

        reader.close();
        System.out.println();

        reader = new FileReader("C:/Temp/testChar.txt");

        //2. 문자 배열로 읽기
        char[] chars = new char[100];

        while(true){
            int c = reader.read(chars);
            if(c == -1)break;
            for (int i = 0; i < c; i++) {
                char aChar = chars[i];
                System.out.print(aChar);
            }
        }
        reader.close();
        System.out.println();

        //3. 문자열 읽기


    }
}
