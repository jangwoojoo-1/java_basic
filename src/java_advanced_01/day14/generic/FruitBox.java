package java_advanced_01.day14.generic;

import java.util.ArrayList;
import java.util.List;

public class FruitBox <T> {
    List<T> fruits = new ArrayList<>(); //T가 클래스 필드로 지정

    public void add(T fruit){ //T가 메서드의 매개변수의 타입 지정
        fruits.add(fruit);
    }
}
