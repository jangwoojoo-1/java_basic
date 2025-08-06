package javabasic_02.day11.homework.ex03;

public class Alcohol extends Drink{
    private double alcper;

    Alcohol(String name, int price, int count, double alcper){
        super(name, price, count);
        this.alcper = alcper;
    }

    static void printTitle(){
        System.out.printf("%s \t%s \t %s \t %s \n",
                "상품명(도수[%%]) ", "단가 ", "수량 ", "금액 ");
    }

    void printData(){
        System.out.printf("%s(%.1f) \t\t\t%d \t %d \t\t %d \n",
                this.name, this.alcper, this.price, this.count, this.price*this.count);
    }


}
