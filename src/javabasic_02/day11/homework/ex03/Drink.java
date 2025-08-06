package javabasic_02.day11.homework.ex03;

public class Drink {
    String name;
    int price;
    int count;

    Drink(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }

    int getTotalPrice(){
        return this.price * this.count;
    }

    static void printTitle(){
        System.out.printf("%s \t%s \t %s \t %s \n",
                "상품명", "단가", "수량", "금액");
    }

    void printData(){
        System.out.printf("%s \t%d \t %d \t\t %d \n",
                this.name, this.price, this.count, this.price*this.count);
    }
}
