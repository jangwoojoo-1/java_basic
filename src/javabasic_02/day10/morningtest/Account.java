package javabasic_02.day10.morningtest;

public class Account {
    public static final int MIN_BALANCE = 0;
    //public static final int MAX_BALANCE = 1000000;

    private String accountNum;
    private String name;
    private int balance;

    Account(){}

    Account(String accountNum, String name, int balance){
        this.accountNum = accountNum;
        this.name = name;
        this.balance = balance;
    }

    public void setBalance(int balance) {
        if(balance >= MIN_BALANCE) this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
