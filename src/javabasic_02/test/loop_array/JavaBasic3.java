package javabasic_02.test.loop_array;

public class JavaBasic3 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;

        while((num1 + num2) != 5){
            num1 = (int)(Math.random()*6+1);
            num2 = (int)(Math.random()*6+1);
            System.out.printf("(%d, %d)\n", num1, num2);
        }
    }
}
