package java_advanced_01.day20.homework.prob05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//문제 : 아래와 같이  문자열 리스트가 주어졌을때 자바스트림을 사용하여 쉼표로 구분된 단일 문자열로(Collectors.joining() API 참조하여 적용해보기) 연결하여 스트링으로 수집한 후 결과를 출력하세요
public class Prob05 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Are", "Powerful");

        String word = words.stream().collect(Collectors.joining(","));

        System.out.println(word);
    }
}
