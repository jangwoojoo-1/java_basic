package javabasic_02.day12.test1;

public class Book {
    //private 접근 제한자를 가진 멤버변수 title과 price
    private String title;
    private int price;

    //생성자
    Book(){ }

    Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    //public 접근제한자를 가진 getter 메서드
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    //public 접근 제한자를 가진 setter메서드
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
