package java_advanced_01.day17.test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TeacherMain2 {

    public static void main(String[] args) {


        class User  {
            String name;
            int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }

        }

        User[] users = new User[]{
                new User("김유신", 64),
                new User("홍길동", 32),
                new User("김동성", 48),
                new User("박희동", 14),
        };
        System.out.println("-------나이 순 오름차순-----------");
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.age, o2.age); //Integer 클래스에 정의된 compare 함수로 두 정수값을 비교
            }
        });

        Arrays.sort(users,(u1,u2)->Integer.compare(u1.age, u2.age));   //람다식으로 표현한 나이순 오름차순 정렬

        System.out.println("-------이름 순 오름차순 정렬----compareTo()--문자열 정렬-----");

        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.compareTo(o2.name); //Integer 클래스에 정의된 compare 함수로 두 정수값을 비교
            }
        });

        System.out.println();
        Arrays.sort(users,(u1,u2)-> u1.name.compareTo(u2.name));

        for (User u : users) {
            System.out.println(u.name + " " + u.age + "세");
        }


        System.out.println("------나이 순 내림차순--------------");
        Arrays.sort(users, Collections.reverseOrder());
        for (User u : users) {
            System.out.println(u.name + " " + u.age+"세");
        }
    }
}
