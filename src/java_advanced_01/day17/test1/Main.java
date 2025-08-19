package java_advanced_01.day17.test1;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        class User implements Comparable<User>{
            String name;
            int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }


            @Override
            public int compareTo(User o) {
                if (this.age > o.age) return 1;
                else if (this.age < o.age) return -1;
                else return 0;
            }
        }

        TreeSet<User> treeSet = new TreeSet<>();


        treeSet.add(new User("홍길동", 32));
        treeSet.add(new User("박희동", 14));
        treeSet.add(new User("김유신", 64));
        treeSet.add(new User("김동성", 48));

        System.out.println("결과");
        for (User user : treeSet) {
                System.out.println(user.name + " " + user.age + "세");
        }
    }
}
