package java_advanced_01.day20.homework.prob02;

import java.util.Arrays;
import java.util.List;

// 문제 : 아래와 같이 정수 리스트가 주어졌을때, 자바 스트림을 사용하여 각 정수를 제곱한 후, 그 제곱의 합(reduce())을 구하여 출력하세요
public class Prob2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        System.out.println(numbers.stream().map(x -> x * x).reduce(0, Integer::sum));

    }
}
