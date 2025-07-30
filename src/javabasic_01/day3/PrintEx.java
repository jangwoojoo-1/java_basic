package javabasic_01.day3;

public class PrintEx {
    public static void main(String[] args) {
        //표준 출력 장치인 모니터에 갓을 출력
        //System. + out. + println(리터럴 또는 변수);
        //시스템으로 출력하는 데 괄호 안의 내용을 출력하고 행을 바꿔라
        //출력방법에 따라 println(), print(), printf()

        System.out.printf("과목명: %s \n", "자바");
        System.out.printf("과목명: %1$s 이름: %2$s\n", "자바", "주장우");
        //$ 순번을 매길 수 있음
        System.out.printf("과목명: %1$s 이름: %2$s 학번: %3$s\n", "자바", "주장우", "1234");

        //정수 123을 printf() 를 이용해 출력
        System.out.printf("%d \n", 123);
        //정수 ___123을 출력
        System.out.printf("%6d \n", 123);
        //정수 123___ 출력 앞에 - 붙이기
        System.out.printf("%-6d \n", 123);
        //공백 0으로 채우기
        System.out.printf("%06d \n", 123);
        System.out.printf("%6d \n", 123);

        //실수
        double num1 = 3.14;
        
        //정수 7자리, 소수점, 소수 2자리, 왼쪽 공백
        System.out.printf("%10.2f \n", num1);
        // 소수점은 기본 반올림
        num1 = 3.158;
        System.out.printf("%10.2f \n", num1);
        //공백 0
        System.out.printf("%010.2f \n", num1);

        //문자열
        System.out.printf("%s \n", "dfsfadf");
        System.out.printf("%10s \n", "dfsfadf");

        //특수 문자 \t, \n, %%, \", \\ 등
        System.out.printf("소금물의 농도 %d%%\n", 50);

    }
}
