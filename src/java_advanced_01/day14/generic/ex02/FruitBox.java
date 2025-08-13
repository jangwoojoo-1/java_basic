package java_advanced_01.day14.generic.ex02;

import java.util.ArrayList;
import java.util.List;

public class FruitBox <T,U>{
    List<T> apples = new ArrayList<>();
    List<U> bananas = new ArrayList<>();

    public void add(T apple, U banana){
        apples.add(apple);
        bananas.add(banana);
    }
}
