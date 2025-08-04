package javabasic_02.day9.oop;

public class StudentMain {

    public static void main(String[] args) {
        Student 경민 = new Student();
        Student 우혁 = new Student("강우혁", "12345", new int[]{100, 80, 90});
        Student 형근 = new Student("김형근", 27, "경기도 의정부시", "1234567", new int[]{90, 10, 20});
        Student 기웅 = new Student("박기웅", 25, "서울시 강남구", "12345678", new int[]{70, 66, 95});

        System.out.println(경민.toString());//객체 출력
        System.out.println(우혁.toString());
        System.out.println(형근.toString());
        System.out.println(기웅.toString());

        //값 출력, 변수로 받아서 재가공 가능
        System.out.println(기웅.getStu_name());
        System.out.println(기웅.getAddress());

        String 기웅주소 = 기웅.getAddress();
        System.out.println(기웅주소 + "에 살고 있습니다.");
        기웅.setGender("남자");
        경민.setGender("남자"); // default는 public처럼 사용 가능

        System.out.println(기웅.getGender());
        System.out.println(경민.getGender());

        System.out.println(형근.getScores());
        형근.calculateScores();
    }
}
