package java_advanced_01.day19;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFileEx {
    public static void main(String[] args) throws URISyntaxException, IOException {
        //data.txt 파일의 경로 객체 얻기
        Path path = Paths.get(StreamFileEx.class.getResource("data.txt").toURI());

        //Path로부터 파일을 열고 한 행 씩 읽으면서 문자열 스트림 생성
        //기본 UTF-8 문자셋으로 읽기함
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        stream.close(); // nio는 항상 닫아줘야 함.
    }
}
