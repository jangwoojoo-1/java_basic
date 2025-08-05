package javabasic_02.day10.morningtest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApplication {
    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;
    static Account[] users = new Account[100];
    static int count = 0;

    public static void main(String[] args) {
        while(loop) {
            printMenu();
            String str = sc.nextLine();

            try {
                selectAction(str);
            } catch (NumberFormatException e) {
                System.out.println("정수만 입력해주세요.");
            }
        }
    }

    public static void printMenu(){
        System.out.print("""
                ----------------------------------------------
                1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
                ----------------------------------------------
                선택>\t""");
    }

    public static void selectAction(String s){
        int n = Integer.parseInt(s);
        switch (n){
            case 1:
                makeAccount();
                break;
            case 2:
                printAccounts();
                break;
            case 3:
                deposit();
                break;
            case 4:
                withdrawal();
                break;
            case 5:
                programExit();
                break;
            default:
                System.out.println("1~5 사이의 정수를 입력해주세요.");
        }
    }

    private static void makeAccount(){
        System.out.println("""
                -----------
                계좌생성
                -----------""");

            System.out.print("계좌번호: ");
            String accountNum = sc.nextLine();
            System.out.print("계좌주: ");
            String name = sc.nextLine();
            System.out.print("초기입금액: ");

        try{
            int balance = Integer.parseInt(sc.nextLine());

            //입금액 음수인 경우 예외처리 필요
            if(balance < 0){
                System.out.println("입금액이 음수입니다.");
                return;
            }

            // 객체 생성
            Account account = new Account(accountNum, name, balance);

            // 배열에 저장
            users[count] = account;
            count++;

            System.out.println("결과: 계좌가 생성되었습니다.");
        }catch (NumberFormatException e){
            System.out.println("결과: 입력이 잘못되었습니다.");
        }
    }

    private static void printAccounts(){
        System.out.println("""
                -----------
                계좌목록
                -----------""");
        for(int i = 0 ; i < count ; i++){
            System.out.printf("%-10s   %-10s   %-10d \n",
                    users[i].getAccountNum(), users[i].getName(), users[i].getBalance());
        }
    }

    private static void deposit(){
        System.out.println("""
                -----------
                예금
                -----------""");

        System.out.print("계좌번호: ");
        String str1 = sc.nextLine();
        int index = findUserIndex(str1);

        if(index == -1){
            System.out.println("계좌번호를 찾을 수 없습니다.");
            return;
        }
        System.out.print("예금액: ");

        try {
            int money = Integer.parseInt(sc.nextLine());
            if(money <= 0){
                System.out.println("예금액이 음수입니다.");
                return;
            }
            users[index].setBalance(users[index].getBalance() + money);
        }catch (NumberFormatException e){
            System.out.println("입력이 잘못되었습니다.");
        }
    }

    private static void withdrawal(){
        System.out.println("""
                -----------
                출금
                -----------""");
        System.out.print("계좌번호: ");
        String str1 = sc.nextLine();
        int index = findUserIndex(str1);

        if(index == -1){
            System.out.println("계좌번호를 찾을 수 없습니다.");
            return;
        }
        System.out.print("출금액: ");
        try{  //try catch는 최소한의 범위로 감싸는 게 좋음
            int money = Integer.parseInt(sc.nextLine());
            if(money > users[index].getBalance()){
                System.out.println("출금액이 잔고를 초과합니다.");
                return;
            }
            users[index].setBalance(users[index].getBalance() - money);
            System.out.println("결과: 출금이 성공되었습니다.");
        }catch (NumberFormatException e){
            System.out.println("입력이 잘못되었습니다.");
        }
    }

    private static void programExit(){
        System.out.println("프로그램 종료");
        loop = false;
    }

    private static int findUserIndex(String accountNum){
        for(int i = 0 ; i < count ; i++){
            if(users[i].getAccountNum().equals(accountNum)) return i;
        }
        return -1;
    }
}
