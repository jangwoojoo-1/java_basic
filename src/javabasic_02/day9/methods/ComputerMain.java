package javabasic_02.day9.methods;

public class ComputerMain {

    public static void main(String[] args) {
        Computer myCom = new Computer();
        int[] values = {1,2,3,4,5};

        String total = null;
        total = myCom.totalSum(values);
        System.out.printf("1부터 %d까지의 누적합은 %s입니다.\n", values.length, total);
    }
}
