package java_advanced_01.day17.test1;

import java.util.Comparator;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        class User{
            String name;
            int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        class UserComparator implements Comparator<User> {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.age, o2.age);
            }
        }

        TreeSet<User> treeSet1 = new TreeSet<>(new UserComparator());

        treeSet1.add(new User("홍길동", 32));
        treeSet1.add(new User("박희동", 14));
        treeSet1.add(new User("김유신", 64));
        treeSet1.add(new User("김동성", 48));

        System.out.println("결과");
        for (User user : treeSet1) {
                System.out.println(user.name + " " + user.age + "세");
        }
    }
}
