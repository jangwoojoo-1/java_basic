package java_advanced_01.day20.homework.prob03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 문제 :  문자열 리스트가 주어졌을때, 자바 스트림을 사용하여 길이를 기준으로 그룹화 (키를 길이 , 값이 해당길이의 단어) 하세요. Collectors.groupingBy()사용
public class Prob03 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date","grep");

        Map<Integer, List<String>> map = words.stream().collect(Collectors.groupingBy(w -> w.length()));

        System.out.println(map);

    }
}
