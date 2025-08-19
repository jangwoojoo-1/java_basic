package java_advanced_01.day17.test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TeacherMain3 {

    public static void main(String[] args) {


        class User  {
            private String name;
            private int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

        }

        User[] users = new User[]{
                new User("김유신", 64),
                new User("홍길동", 32),
                new User("김동성", 48),
                new User("박희동", 14),
        };
        System.out.println("-------나이 순 오름차순-----------");

        Arrays.sort(users, Comparator.comparing(User::getAge));
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getAge() + "세");
        }

        System.out.println("-------이름 순 오름차순-----------");
        Arrays.sort(users, Comparator.comparing(User::getName));
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getAge() + "세");
        }

        System.out.println("-------나이 순 오름차순 후 같은 나이면 이름 순-----------");
        Arrays.sort(users, Comparator.comparing(User::getAge).thenComparing(User::getName));
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getAge() + "세");
        }
    }
}
