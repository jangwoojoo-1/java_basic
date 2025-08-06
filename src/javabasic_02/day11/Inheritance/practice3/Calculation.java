package javabasic_02.day11.Inheritance.practice3;

public class Calculation {
    private int a = 20;
    private int b= 10;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    void addition(){
        System.out.printf("두 수의 덧셈 : %d \n", (a+b));
    }

    void subtraction(){
        System.out.printf("두 수의 뺄셈 : %d \n", (a-b));
    }
}
