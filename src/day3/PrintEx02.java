package day3;

import java.util.Scanner;

public class PrintEx02 {
    public static void main(String[] args) {
        System.out.printf("상품의 가격: %d원\n", 5000);
        System.out.printf("상품의 가격: %6d원\n", 5000);
        System.out.printf("상품의 가격: %06d원\n\n", 5000);

        Scanner sc = new Scanner(System.in);
        System.out.print("반지름을 입력하세요. ");
        int radius = sc.nextInt();
        System.out.printf("반지름이 %d인 원의 넓이: %.1f", radius, radius*radius*Math.PI);
    }
}
