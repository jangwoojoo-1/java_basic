package day2;

public class CharEx {
    public static void main(String[] args) {
        char c1 = 'A';
        System.out.println(c1);
        char c2 = 65; // 65와 매핑된 문자 출력
        System.out.println(c2);
        char c3 = ' '; // 문자데이터 초기화는 공백문자 하나 넣어서, 공백의 유니코드 값 32
        //'' 안됨, 공백 문자 넣어야 함.

        char c4 = '가';
        char c5 = 44032; //'가'의 유니코드 값
        System.out.println(c4);
        System.out.println(c5);

        String v1 = "A";
//        public final class 최종 클래스, 변경불가 -> String
    }
    // 0~9 ASCII 상 48~57 / a~z ASCII 상 97~122
}
