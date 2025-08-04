package javabasic_02.day9.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static Scanner sc = new Scanner(System.in);
    public static boolean loop = true;
    public static String[] splitData(String str){
        String[] strs = str.split(" ");
        return strs;
    }

    public static void main(String[] args) {

        while(loop){
            printMenu();
            String str = sc.nextLine();
            if(str.length() == 1 && Integer.parseInt(str) == 5){
                System.out.println("\n프로그램 종료");
                break;
            }
            String[] data = splitData(str);

            calculator(data);
        }
    }

    public static void printMenu(){
        System.out.println("""
                ==================================================
                                  사칙연산 계산기
                ==================================================
                1. 덧셈  2. 뺄셈  3. 곱셈  4. 나눗셈  5. 프로그램 종료  
                
                두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해 주세요.  
                """);
    }

    public static int inputInt(){
        while(true){
            try{
                int n = sc.nextInt();
                return n;
            }catch (InputMismatchException e){
                System.out.println("숫자를 입력해주세요.");
                sc.next();
            }
        }
    }

    public static void calculator(String[] strs){
        int n1 = Integer.parseInt(strs[0]);
        int n2 = Integer.parseInt(strs[1]);
        int op = Integer.parseInt(strs[2]);

        System.out.println("\n결과는 \n");

        switch (op){
            case 1:
                System.out.printf("%d + %d = %d\n\n", n1, n2, adder(n1, n2));
                break;
            case 2:
                System.out.printf("%d - %d = %d\n\n", n1, n2, minus(n1, n2));
                break;
            case 3:
                System.out.printf("%d * %d = %d\n\n", n1, n2, multi(n1, n2));
                break;
            case 4:
                System.out.printf("%d / %d = %.1f\n\n", n1, n2, divide(n1, n2));
                break;
            case 5:
                System.out.println("프로그램 종료");
                loop = false;
                break;
            default:
                System.out.println("1-5 사이에 숫자를 입력해주세요.");
        }
    }

    public static int adder(int n1, int n2){
        return n1+n2;
    }

    public static int minus(int n1, int n2){
        return n1-n2;
    }

    public static int multi(int n1, int n2){
        return n1*n2;
    }

    public static double divide(int n1, int n2){
        return (double)n1/n2;
    }
}
