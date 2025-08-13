package java_advanced_01.day14.generic.ex01;

import java.util.ArrayList;
import java.util.List;

public class FruitBox <T>{
    List<T> fruits = new ArrayList<>();

    public void add(T fruit){
        fruits.add(fruit);
    }
}
