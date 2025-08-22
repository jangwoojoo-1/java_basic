package java_advanced_01.day20.sortedEx;


//스트림 내에서 요소를 오름차순 정렬(자연순서) 또는 사용자 정의 비교기에 따라 정렬할 수 있다.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedEx01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
            "신세계", "김윤진", "정현주", "남기주"
        );

        //1. 자연순 정렬 및 출력
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);

        //3. 내림차순 정렬
        List<String> sortedNames1 = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedNames1);

        //4. 중간 연산 체이닝

        List<String> names2 = Arrays.asList("Alice", "Bob", "Carl", "Dan", "Eve", "David");

        //names2의 이름 중 " D"로 시작하는 이름을 대문자로 바꾸어, 자연정렬하여 출력하세요
        List<String> sortedNames2 = names2.stream()
                .filter(name -> name.startsWith("D"))
                .map(str -> str.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNames2);

        //이거는 잘 모르겠어서 copilot 도움 받음
        List<String> sortedNames3 = names2.stream()
                .map(name -> name.startsWith("D")?name.toUpperCase():name)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNames3);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 10, 8);

        //1.
        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> number%2==0)
                .toList();
        System.out.println(filteredNumbers);

        //2.
        List<Integer> squaredNumbers = filteredNumbers.stream()
                .map(number -> number*number)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);

        //3.
        List<String> names4 = Arrays.asList("Alice", "Bob", "Carl", "Dan", "Eve", "David", "Alice", "Carl");
        List<String> distinctedNames = names4.stream()
                .distinct()
                .toList();
        System.out.println(distinctedNames);

        //4.
        List<Integer> sortedNumbers = squaredNumbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        //5.
        System.out.println(sortedNumbers.stream()
                .filter(number -> number%2==0)
                .mapToInt(number -> number)
                .sum());

        IntStream intStream = (IntStream) numbers.stream();
        //intStream.filter(number -> number%2==0).collect(Collectors.toList());

    }
}
