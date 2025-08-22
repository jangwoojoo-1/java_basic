package java_advanced_01.day20.homework.prob06;
//문제 : 이름과 나이와 같은 속성을 가진 사람들의 리스트입니다. 나이에 따라 그룹화하여 결과를 출력하세요

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
class Person{
    private String name;
    private int age;
}


public class Prob06 {
    public static void main(String[] args) {
        List<Person> numbers = Arrays.asList(
                new Person("Alice",30),
                new Person("Bob",25),
                new Person("Charlie",30),
                new Person("David",25),
                new Person("Eve",35)

                );

        Map<Integer, List<String>> map = numbers.stream().collect(Collectors.groupingBy(
                Person::getAge,
                Collectors.mapping(Person::getName, Collectors.toList()) // 이 부분 어려움 다시 공부 필요
        ));

        System.out.println(map);

    }
}
