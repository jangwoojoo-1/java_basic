package javabasic_02.day11.Inheritance.test01.ex03;

public class Account {
    private String accNo;
    private int balance = 0;

    public String getAccNo() {
        return this.accNo;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(this.accNo + " 계좌가 개설되었습니다.");
    }

    public void save(int money){
        this.balance += money;
        System.out.printf("%s 계좌에 %d만원이 입금되었습니다. \n", this.accNo, money);
    }

    public void deposit(int money){
        if(balance < money) System.out.println("잔고가 부족합니다.");
        this.balance -= money;

        System.out.printf("%s 계좌에 %d만원이 출금되었습니다. \n", this.accNo, money);
    }
}
