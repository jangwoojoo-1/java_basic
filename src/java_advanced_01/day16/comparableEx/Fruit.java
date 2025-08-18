package java_advanced_01.day16.comparableEx;

import java.util.TreeSet;

//과일을 가격 기준으로 오름차순 정렬할 수 있도록 하는 비교기 구현
public class Fruit implements Comparable<Fruit>{
    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Fruit o) {
        if(this.price > o.price) return 1;
        else if(this.price < o.price) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        TreeSet<Fruit> fruitStore = new TreeSet<>();

        fruitStore.add(new Fruit("사과", 10000));
        fruitStore.add(new Fruit("귤", 12000));
        fruitStore.add(new Fruit("복숭아", 8000));
        fruitStore.add(new Fruit("포도", 18000));

        for (Fruit fruit : fruitStore) {
            System.out.println(fruit.toString());
        }

    }
}
