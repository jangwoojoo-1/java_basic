package javabasic_02.day7;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        int[] b = new int[]{10, 20, 40, 50};

        int zeroIndexValue = a[0];
        int thirdIndexValue = a[3];
        int result = zeroIndexValue + thirdIndexValue;
        System.out.println(result);

    }
}
