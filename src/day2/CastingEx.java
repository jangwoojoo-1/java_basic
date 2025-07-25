package day2;

public class CastingEx {
    public static void main(String[] args) { //psvm도 가능
        long longValue = 300;
        int intValue = (int)longValue; //강제 타입변환 예시

        System.out.println(intValue);

        // int ==> char
        // 주의사항: int타입은 char타입으로 자동변화되지 않고, (char)강제 캐스팅해야 한다. 0~65535 음수X

        int intValue2 = 65;
        char charValue = (char)intValue2;
        System.out.println(charValue);

        //실수 => 정수
        double doubleValue2 = 3.14;
        int intValue3 = (int)doubleValue2;
        System.out.println(intValue3);

        byte result = 10+20;  //리터럴 피연산자 사용시 컴파일 byte result = 30  => 바이트 코드로 생성

        int result1 = intValue2 + intValue3; // 변수를 피연산자 사용시 컴파일 단계에서 연산이 이루어지지 않음

        double result2 = 1.2f + 2.4F; //컴파일 시 연산이 됨 byte result2 = 4.6f; 되며 => 자동변환의로 double result2 = 4.6 변환됨

        double result3 = 1.2f + 3.4; //1.2 double 자동변환, 3.4 자동 변환 -> 컴파일시 double 변환

        //예외사항 정리
        //자바에서 + 연산자가 두 가지 기능을 가지고 있음, 뎃셈 연산, 연결연산
        //피연산자 중 하나라도 문자라면 나머지도 문자열로 자동변환되어 문자열 연결(결합) 연산
        int v1 = 3+ 7; //int v1 = 10;
        System.out.println(v1);

        String str1 = "3" + 7; //String str1 = "3" + "7" str1 = "37"
        System.out.println(str1);

        String str2 = 3 + "7"; //String str1 = "3" + "7" str1 = "37"
        System.out.println(str2);

        int v2 = 1 + 2 + 3;
        String str = ""; //문자열 초기화 방법

        str = 1 + 2 + "3"; //3+ "3" => "33"
        System.out.println(str);

        str = 1 + "2" + 3; //"12" + 3 => "123"
        System.out.println(str);

        str = "1" + 2 + 3; //"12" + 3 => "123"
        System.out.println(str);

        str = "1" + (2+3); //"1" + 5 => "1" + 5 => "15"
        System.out.println(str);


    }
}
