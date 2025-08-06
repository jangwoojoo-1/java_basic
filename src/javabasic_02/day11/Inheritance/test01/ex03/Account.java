package javabasic_02.day11.Inheritance.test01.ex03;

public class Account {
    private static String accNo;
    private static int balance = 0;

    public static String getAccNo() {
        return accNo;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setAccNo(String accNo) {
        Account.accNo = accNo;
        System.out.println(Account.accNo + " 계좌가 개설되었습니다.");
    }

    public static void save(int money){
        balance += money;
        System.out.printf("%s 계좌에 %d만원이 입금되었습니다. \n", accNo, money);
    }

    public static void deposit(int money){
        if(balance < money) System.out.println("잔고가 부족합니다.");
        balance -= money;

        System.out.printf("%s 계좌에 %d만원이 출금되었습니다. \n", accNo, money);
    }
}
