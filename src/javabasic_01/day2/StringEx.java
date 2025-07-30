package javabasic_01.day2;

public class StringEx {
    public static void main(String[] args) {
        String name = "신세계";
        String job = "프로그래머";

        System.out.println(name + " 과장의 직무는 " + job +"입니다." + 10);

        String str = "나는 \'자바\'를 배우고 있습니다.";
        System.out.println(str);

        String str1 = "나는\t자바\t를 배우고 있습니다.";
        System.out.println(str1);

        //java14부터 지원 """ """ - 쓰는 대로 출력

        String str3 = """
                  {
                    "id": "spring,
                    "name": "봄이
                  }
                """;
        System.out.println(str3);

        // \ 붙이면 이어서 붙음
        String str4 = """
                    나는 자바프로그래밍 \
                    공부를 하고 있습니다.
                    나는 자바개발자를 희망합니다.
                """;
        System.out.println(str4);
    }
}
