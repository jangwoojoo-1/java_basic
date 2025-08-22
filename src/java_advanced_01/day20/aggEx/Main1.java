package java_advanced_01.day20.aggEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
class Student{
    private String name;
    private int score;
}

public class Main1 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Alice", 92),
                new Student("David", 95),
                new Student("Bob", 88)
        );

        List<Student> students2 = Arrays.asList();

        int total = students.stream().mapToInt(Student::getScore).sum();

        int sum2 = students.stream().mapToInt(Student::getScore).reduce(0,(a,b)->a+b);
        //reduce() 스트림에 요소가 없을 경우 예외가 발생하지만, identity 매개값이 주어지면 디폴트 값으로 리턴한다.

        int sum3 = students2.stream().mapToInt(Student::getScore).reduce(0,(a,b)->a+b);
//        int sum4 = students2.stream().mapToInt(Student::getScore).sum();

        System.out.println(total);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
