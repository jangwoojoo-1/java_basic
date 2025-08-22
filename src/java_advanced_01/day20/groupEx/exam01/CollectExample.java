package java_advanced_01.day20.groupEx.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList< >();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        //남학생만 묶어 List 생성
        Map<String, List<Student>> map = totalList.stream().collect(Collectors.groupingBy(Student::getGender));

        List<Student> maleList = map.get("남");
        maleList.stream().forEach(student -> System.out.println(student.getName()));

        List<Student> femaleList = map.get("여");
        femaleList.stream().forEach(student -> System.out.println(student.getName()));

        //학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성


    }
}
