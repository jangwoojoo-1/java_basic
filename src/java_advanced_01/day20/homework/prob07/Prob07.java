package java_advanced_01.day20.homework.prob07;
//이름과  가격이 있는 제품리스트가 주어지면, 이름의 첫 글자에 따라 그룹화하여 출력하세요
//Collectors.groupingBy() 사용하여 이름의 첫글자에 따라 제품을 그룹화합니다.
//키는 과일 이름의 첫번째 문자이고 값은 그 문자로 시작하는 과일 리스트입니다.


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
class Fruit{
    private String fruitName;
    private double price;
}


public class Prob07 {

    public static void main(String[] args) {
        List<Fruit> numbers = Arrays.asList(
                new Fruit("Apple",1.99),
                new Fruit("Avocado",2.50),
                new Fruit("Banana",0.99),
                new Fruit("Blueberry",3.02),
                new Fruit("Cherry",2.99)

        );

        Map<Character, List<String>> map = numbers.stream()
                .collect(Collectors.groupingBy(fruit -> fruit.getFruitName().charAt(0),
                        Collectors.mapping(fruit -> fruit.getFruitName(), Collectors.toList())
                        ));

        System.out.println(map);
    }
}
