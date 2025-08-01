package javabasic_02.day8;

//

public class RefEx02 {
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a.hashCode());

        a += "Java Programming";
        System.out.println(a.hashCode());
        System.out.println(a);

        // 결과 확인 시 두 해시코드 값은 틀림
        // 문자열 값 자체는 불변이라 변경할 수 없음
        // 따라서 새로운 문자열 데이터 객체에 대한 공간을 새롭게 할당
    }
}
