package javabasic_02.day8.stringBufferEx;

public class StringEx01 {
    public static void main(String[] args) {
        String result = "";
        result += "Hello";
        result += " ";
        result += "Java Programming";
        System.out.println(result);
        // + 연산자를 이용하여 String 인스턴스의 문자열을 결합하면, 내용이 합쳐진 새로운 String 인스턴스 생성
        // 문자열을 많이 결합하면 할수록 메모리 낭비 및 속도도 느려지는 단점이 있다.
        // StringBuffer 클래스는 클래스 내부에 버퍼라는 독립적인 공간을 가지고 있어 문자열을
        //바로 추가할 수 있어 공간의 낭비없이 문자열 연산속도를 빠르게 처리할 수 있다.

        StringBuffer sb1 = new StringBuffer();
        sb1.append("hello");
        sb1.append(" ");
        sb1.append("java programming ");
        result = sb1.toString();
        System.out.println(result);
    }
}
