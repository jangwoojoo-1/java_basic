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
            String input = sc.nextLine();

            if (input.length() != 1 || input.charAt(0) < '1' || input.charAt(0) > '4') {
                System.out.println("⚠1~4 중 하나의 숫자로 입력해주세요.");
                continue;  // 다시 메뉴 출력
            }

            n = input.charAt(0);

            switch (n){
                case '1':
                    try{
                        System.out.print("예금액>");
                        int inputMoney = Integer.parseInt(sc.nextLine());
                        money += inputMoney;
                        System.out.println();
                    } catch (NumberFormatException e){
                        System.out.println("숫자만 입력해주세요.");
                    }
                    break;
                case '2':
                    try{
                        System.out.print("출금액>");
                        int outputMoney = Integer.parseInt(sc.nextLine());
                        if(money < outputMoney){
                            System.out.println("잔고가 부족합니다.");
                        } else {
                            money -= outputMoney;
                            System.out.println();
                        }
                    } catch (NumberFormatException e){
                        System.out.println("숫자만 입력해주세요.");
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
