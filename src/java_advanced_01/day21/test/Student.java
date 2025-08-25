package java_advanced_01.day21.test;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class Student implements Comparable<Student>, Serializable {
    private String name;
    private int age;
    private double score;

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}
