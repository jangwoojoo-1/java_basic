package java_advanced_01.day20.mappingEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
class Student{
    private String name;
    private int score;
}


public class MappingEx01 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("이름1", 90),
                new Student("이름2", 80),
                new Student("이름3", 100)
        );

        students.forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
        System.out.println("총점: " + students.stream().mapToInt(Student::getScore).sum());
        System.out.println("평균: " + String.format("%.1f", students.stream().mapToInt(Student::getScore).average().getAsDouble()));
    }
}
