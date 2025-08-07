package javabasic_02.day12.test3.ex02;

public class Coffee extends Beverage{
    static int amount;

    Coffee(String name){
        super(name);
        this.amount++;
        calcPrice();
    }

    public void calcPrice(){
        switch(this.getName()){
            case "Americano":
                this.setPrice(1500);
                break;
            case "CafeLatte":
                this.setPrice(2500);
                break;
            case "Cappuccino":
                this.setPrice(3000);
                break;
            default:
                System.out.println("찾는 커피가 없습니다.");
        }
    }
}
