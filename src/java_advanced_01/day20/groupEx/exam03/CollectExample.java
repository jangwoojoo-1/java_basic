package java_advanced_01.day20.groupEx.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        List<Student> maleList = totalList.stream()
                .filter(student -> student.getGender().equals("남"))
                .collect(Collectors.toList());
        maleList.forEach(student -> System.out.println(student.getName()));

        Map<String, Integer> map = totalList.stream()
                .collect(Collectors.toMap(Student::getName, Student::getScore));

        System.out.println(map);

        Map<String, Integer> map2 = totalList.stream()
                .collect(Collectors.groupingBy(student -> student.getGender(),
                        Collectors.summingInt(Student::getScore))
                );
        System.out.println(map2);
    }
}
