package javabasic_02.day9.methods;

import java.util.Scanner;

public class Calculator2 {
    static Scanner sc = new Scanner(System.in);
    static boolean a = true;

    public static String[] splitData(String str){
        String[] strs = str.split(" ");
        return strs;
    }

    public static void main(String[] args) {
        while (a) {
            menu();
            String str = sc.nextLine();
            if(str.length() == 1 && Integer.parseInt(str) == 5){
                System.out.println("\n프로그램 종료");
                break;
            }
            String[] data = splitData(str);

            calculator(data);
        }
    }

    //사용자가 입력한 아이디와 비밀번호를 idPwPrint()를 이용하여 출력하세요.
    public static void calculator(String[] strings) {
        int n1, n2, menuNum = 0;
        n1 = Integer.parseInt(strings[0]);
        n2 = Integer.parseInt(strings[1]);
        menuNum = Integer.parseInt(strings[2]);

        switch (menuNum) {
            case 1:
                System.out.printf("%d + %d = %d \n",n1, n2,n1+n2);
                break;
            case 2:
                System.out.printf("%d - %d = %d \n",n1, n2,n1-n2);
                break;
            case 3:
                System.out.printf("%d * %d = %d \n",n1, n2,n1*n2);
                break;
            case 4:
                System.out.printf("%d / %d = %.1f \n",n1, n2,(double)n1/n2);
                break;
            case 5:
                a = false;
                break;
            default:
                System.out.println("1-5 사이에 숫자를 입력해주세요.");
        }
    }
    public static void menu() {
        System.out.println("======================================================");
        System.out.println("                     사칙 연산 계산기                    ");
        System.out.println("======================================================");
        System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");

    }
}
