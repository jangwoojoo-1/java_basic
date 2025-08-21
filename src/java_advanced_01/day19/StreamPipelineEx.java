package java_advanced_01.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipelineEx {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("김진우", 90));
        students.add(new Student("이종우", 80));
        students.add(new Student("박진우", 60));

        List<Student> students1 = Arrays.asList(
                new Student("박지원", 90),
                new Student("배진용", 100),
                new Student("김진우", 50)
        );

        //방법1: 스트림 => 중간처리 => 최종 처리 => 학생들의 평균점수
        //스티림 얻기
        Stream<Student> studentStream1 = students.stream();

        //중간 처리(학생 객체를 정수로 매핑)
        IntStream scoreStream = studentStream1.mapToInt(
                Student -> Student.getScore()
        );

        //최종 처리 (평균구하기)
        double averageScore = scoreStream.average().getAsDouble();
        System.out.println(averageScore);

        //방법2: 람다식을 주입해서 파이프라인 처리 방식
        double averageScore2 = students1.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println(averageScore2);
    }
}
