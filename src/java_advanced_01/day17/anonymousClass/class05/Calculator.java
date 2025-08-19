package java_advanced_01.day17.anonymousClass.class05;

import java_advanced_01.day17.anonymousClass.class05.Operate;

public class Calculator {
    private final int number1;
    private final int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    //인터페이스 타입을 매개변수로 받는 메서드
    public int calculate(Operate op){
        return op.operate(this.number1, this.number2);
    }
}
