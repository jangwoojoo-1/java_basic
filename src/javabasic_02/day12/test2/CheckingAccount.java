package javabasic_02.day12.test2;

public class CheckingAccount extends Account{
    private String cardNo;

    CheckingAccount(String accId, String ownerName, long balance, String cardNo){
        super(accId, balance, ownerName);
        this.cardNo = cardNo;
    }

    public void calcRate(){ }

    public void pay(String cardNo, long amount){
        if(this.cardNo.equals(cardNo) && this.getBalance() >= amount){
            this.setBalance(this.getBalance()-amount);
            return;
        }
        System.out.println("지불이 불가능합니다.");
    }
}
