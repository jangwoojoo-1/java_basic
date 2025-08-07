package javabasic_02.day12.test3.ex02;

public abstract class Beverage {
    private String name;
    private int price;

    Beverage(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void calcPrice();

    public void print(){

    }
}
