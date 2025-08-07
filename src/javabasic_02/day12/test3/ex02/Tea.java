package javabasic_02.day12.test3.ex02;

public class Tea extends Beverage{
    static int amount = 0;

    Tea(String name){
        super(name);
        this.amount++;
        calcPrice();
    }

    public void calcPrice(){
        switch(this.getName()){
            case "lemonTea":
                this.setPrice(1500);
                break;
            case "ginsengTea":
                this.setPrice(2000);
                break;
            case "redginsengTea":
                this.setPrice(2500);
                break;
            default:
                System.out.println("찾는 커피가 없습니다.");
        }
    }
}
