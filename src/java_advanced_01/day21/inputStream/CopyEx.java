package java_advanced_01.day21.inputStream;

import java.io.*;

//파일 복사
public class CopyEx {
    public static void main(String[] args) throws IOException {
        try {
            String originalFile = "C:/Temp/test.jpg";
            String newFile = "C:/Temp/testCopy1.jpg";

            //InputStream, OutputStream 객체 생성 => 파일을 대상으로 입출력 스트림 생성
            InputStream is = new FileInputStream(originalFile);
            OutputStream os = new FileOutputStream(newFile);

//            // 이미지 객체의 데이터를 바이트로 읽는다.
//            byte[] buffer = new byte[is.available()];
//
//            while(true) {
//                int numRead = is.read(buffer);
//                if(numRead == -1) break;
//                os.write(buffer, 0, numRead);
//            }
//
//            // 내부 비우기

            is.transferTo(os); //위 내용 한 줄로 요약

            os.flush();

            //스트림 닫기
            os.close();
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
