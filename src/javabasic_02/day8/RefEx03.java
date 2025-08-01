package javabasic_02.day8;

public class RefEx03 {
    public static void main(String[] args) {
        //자바 String 변수 선언 방식 2가지

        //1. 리터럴 방식
        String str1 = "Java";
        String str2 = "Java";

        System.out.println(str1 == str2); //주소값 비교
        System.out.println(str1.equals(str2)); //실제 값 비교

        //2. new 연산자 방식
        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println("------------리터럴 주소, 실제 값 비교--------------");
        System.out.println(str3 == str4); // 주소값 비교
        System.out.println(str3.equals(str4));// 실제 값 비교

        // 두 방식은 메모리에 적재되는 형태가 차이가 있음

        //리터럴과 객체 문자열 비교
        System.out.println("-----------리터럴 객체 비교--------------");
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

    }
}
