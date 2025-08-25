package java_advanced_01.day21.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterEx02 {
    public static void main(String[] args) throws IOException {

        //바이트 배열을 통채로 출력
        try {
            //1. 출력 스트림 생성 C://Temp/test1.db에 1byte 데이터를 저장
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");

            //2. 내보낼 데이터를 지정
            byte[] array = {10, 20, 30};

            //3. 데이터를 스트림에 보내서 해당 목적지에 쓴다. 배열의 모든 바이트를 출력
            os.write(array);

            //4. 스트림의 버퍼를 비운다 ( 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비운다)
            os.flush();

            //5. 스트림을 닫는다.
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
