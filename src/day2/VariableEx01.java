package day2;

public class VariableEx01 {
    public static void main(String[] args) {
        //주석 단축키
        //한줄 주석 ctrl + / , 해제도 같음
        /*여러줄 주석 ctrl + shift + / , 해제도 같음*/
        
        // 1. 정수형 변수 value를 선언하시오.
        int value; // 변수 선언 시 데이터 타입, 변수이름; 선언함.

        // 2. 변수 value에 20을 저장(할당)하세요
        value = 20; // 변수에 원하는 값 할당, 초기화

        // 3. 변수 result에 value 변수에 30을 더한 후 저장하세요.
        int result = value + 30;

        // 4. 변수 result의 값을 콘솔에 출력하세요
        System.out.println(result);

        int y = 0x2A0F;
        System.out.println(y);
    }
}
//변수는 데이터타입 변수명으로 선언한 뒤 변수는 초기화가 필요하다.