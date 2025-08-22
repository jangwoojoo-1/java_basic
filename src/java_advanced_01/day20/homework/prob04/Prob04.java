package java_advanced_01.day20.homework.prob04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 주어진 정수리스트를 자바스트림을 사용하여 중복을 제거하고 정렬된 리스트로 반환하여 결과를 출력
public class Prob04 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 23, 43, 4,10,25,30,43,100,97,30);

        List<Integer> distSortedNumbers = numbers.stream().sorted().distinct().toList();

        System.out.println(distSortedNumbers);
    }
}
