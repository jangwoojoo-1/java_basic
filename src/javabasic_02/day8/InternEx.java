package javabasic_02.day8;

//Intern() : 자바에서 문자열을 최적화하여 관리를 위한 메서드
//문자열을 리터럴로 선언할 경우 내부적으로 String의 intern() 메서드가 호출이 됨
// 해당 리터럴이 문자열 상수 pool 안에 존재하는지 확인,
//만약 존재하면 해당 pool 안에 있는 리터럴을 리턴
//존재하지 않는다면 리터럴을 pool 안에 집어넣고 새로운 주소 값을 반환하는 기능을 수행함
//intern() 사용 시 equals() 없이 문자열 비교가 가능

public class InternEx {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String(new char[]{'H','e','l','l','o'}).intern();

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        //둘의 주소 값이 같음. 이는 문자 배열을 문자열로 선언한 후 intern 메서드로 pool 안에 있는 리터럴을 반환한 것

        String str3 = "Hi";
        String str4 = new String("Hi");

        str4 = str4.intern();
        System.out.println(str3 == str4);
    }
}
