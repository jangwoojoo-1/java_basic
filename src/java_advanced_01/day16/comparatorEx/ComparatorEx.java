package java_advanced_01.day16.comparatorEx;

import java.util.TreeSet;

public class ComparatorEx {

    public static void main(String[] args) {
        //과일 가게에서 과일을 관리할 때 FruitComparator 을 기준을 정렬하여 관리
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
        treeSet.add(new Fruit("Apple", 10));
        treeSet.add(new Fruit("Banana", 5));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + " : " + fruit.price);
        }

    }
}
