package day2;

public class PromotionEx {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue; //자동 타입변화이 이루어진 것

        //카멜 표기법
        long longValue = 500000000L;
        //long 리터럴 정의시 long과 integer을 구분하기 위해서 long의 뒤에는 대문자 또는 소문자 L을 붙임

        float floatValue = longValue;
        double doubleValue = longValue;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        //5.0E8
        /*e 또는 E가 포함된 10의 거듭제곱 리터럴*/
        double d1 = 5e2;
        System.out.println(d1);

        double d2 = 0.12E-2; //0.12 * 10^-2
        System.out.println(d2);

        double d3 = 3.14;
        double d4 = 314e-2;
        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);

        float f1 = (float)3.14f; //강제 형변환 뒤에 f붙이거나 앞에 (float) 붙임
        //float 리터럴 값은 마지막에 f,F를 붙임
        float f2 = 3E6F;
        System.out.println(f1 + " " + f2);

    }
}
