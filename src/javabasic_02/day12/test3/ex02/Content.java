package javabasic_02.day12.test3.ex02;

public abstract class Content {
    private String title;
    private int price;

    Content(){ }

    Content(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void totalPrice();

    public void show(){
        System.out.printf("%s 비디오의 가격은 %d원 입니다. \n", this.title, this.price);
    }
}
