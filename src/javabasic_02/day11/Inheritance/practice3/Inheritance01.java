package javabasic_02.day11.Inheritance.practice3;

public class Inheritance01 extends Calculation {
    void multiplication() {
        System.out.printf("두 수의 곱셈 : %d \n", this.getA() * this.getB());
    }
}