package javabasic_02.day9.methods;

public class MyCalculator {
    int[] numbers = new int[2];  //수를 저장하는 정수형 배열

    public void adder(int[] numbers){
        int n1 = numbers[0];
        int n2 = numbers[1];
        System.out.println(n1 + n2);
    }

}
