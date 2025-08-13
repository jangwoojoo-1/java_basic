package java_advanced_01.day14.generic.ex01;

public class Main {
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Fruit());
        box.add(new Banana());
    }
}
