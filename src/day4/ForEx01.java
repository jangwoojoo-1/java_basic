package day4;

import java.util.Scanner;

public class ForEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번 반복할까요? ");
        int number = sc.nextInt();

        for (int i = 1 ; i <= number ; i++){
            System.out.println(i + "번째");
        }
    }
}
