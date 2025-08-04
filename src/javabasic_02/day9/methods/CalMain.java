package javabasic_02.day9.methods;

public class CalMain {
    public static void main(String[] args) {
        MyCalculator myCalculator1 = new MyCalculator();

        myCalculator1.numbers[0] = 10;
        myCalculator1.numbers[1] = 20;

        myCalculator1.adder(myCalculator1.numbers);

    }
}
