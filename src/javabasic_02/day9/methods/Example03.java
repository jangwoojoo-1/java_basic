package javabasic_02.day9.methods;

import java.util.Scanner;


public class Example03 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("두 수를 차례대로 입력주시면 나누기 결과 제공해 드립니다.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int num = division(n1, n2);
        System.out.println("요청하신 + n1" + " /" + n2 + "의 나누기 결과는" + num);
        System.out.println(num);
    }

    public static int division(int a, int b){
        int result = 0;

        if(b != 0){
            result = a/b;
        } else System.out.println("0으로 나누기 금지");

        return result;
    }
}
