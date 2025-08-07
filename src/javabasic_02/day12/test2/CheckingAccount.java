package javabasic_02.day12.test2;

public class CheckingAccount extends Account{
    private String cardNo;

    public void calcRate(){

    }
    CheckingAccount(String accId,long balance,String ownerName, String cardNo){
        super(accId, balance, ownerName);
        this.cardNo = cardNo;
    }
}
