package java_advanced_01.day20.homework.prob01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prob01 {
// 문제 :  정수리스트가 아래와 같이 주어졌을때 , 자바 스트림을 이용하여 짝수를 필터링하고   홀수를 리스트로 수집하여 출력하세요.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filteredNumbers = numbers.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());

        System.out.println(filteredNumbers);

    }
}
