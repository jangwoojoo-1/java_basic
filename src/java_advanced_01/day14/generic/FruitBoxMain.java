package java_advanced_01.day14.generic;

public class FruitBoxMain {

    public static void main(String[] args) {
        //제네릭 타입 매개변수에 정수 타입을 할당
        FruitBox<Integer> intBox = new FruitBox<>();
        //제네릭 타입 매개변수에 실수 타입을 할당
        FruitBox<Double> doubleBox = new FruitBox<>();
        //제네릭 타입 매개변수에 문자열 타입을 할당
        FruitBox<String> stringBox = new FruitBox<>();
        //제네릭 타입 매개변수에 Apple 클래스 타입 할당
        FruitBox<Apple> appleBox = new FruitBox<>();

        Apple apple = new Apple();
        appleBox.add(apple);
    }
}
