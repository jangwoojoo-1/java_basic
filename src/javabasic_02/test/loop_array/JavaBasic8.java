package javabasic_02.test.loop_array;

import java.util.Scanner;

public class JavaBasic8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int money = 0;
        char n = '1';

        while(n != '4'){
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("------------------------------------");

            System.out.print("선택> ");
            n = sc.nextLine().charAt(0);

            switch (n){
                case '1':
                    System.out.print("예금액>");
                    int inputMoney = Integer.parseInt(sc.nextLine());
                    money += inputMoney;
                    System.out.println();
                    break;
                case '2':
                    System.out.print("출금액>");
                    int outputMoney = Integer.parseInt(sc.nextLine());
                    if(money < outputMoney){
                        System.out.println("잔고가 부족합니다.");
                    } else {
                        money -= outputMoney;
                        System.out.println();
                    }
                    break;
                case '3':
                    System.out.printf("잔고>%d\n\n", money);
                    break;
                case '4':
                    System.out.println("\n 프로그램 종료");
                    break;
                default:
                    System.out.println("숫자를 잘못 입력했습니다.");
            }

        }
    }
}
