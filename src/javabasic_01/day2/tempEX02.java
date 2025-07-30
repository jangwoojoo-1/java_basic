package javabasic_01.day2;

public class tempEX02 {
    public static void main(String[] args) {
        //1.
        int x = 3;
        int y = 5;
        int temp = 0;

        System.out.printf("x = %d\ny = %d\ntemp = %d \n", x, y, temp);

        //2.
        temp = x;

        //3.
        x = y;

        //4.
        y = temp;

        //5.
        System.out.printf("x = %d\ny = %d\ntemp = %d \n", x, y, temp);
    }
}
