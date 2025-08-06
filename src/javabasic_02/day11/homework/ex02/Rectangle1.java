package javabasic_02.day11.homework.ex02;

public class Rectangle1 {
    private int width;
    private int length;
    private String color = "흰색";

    public int getWidth() {
        return this.width;
    }

    public int getLenght() {
        return this.length;
    }

    public String getColor() {
        return this.color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int lenght) {
        this.length = lenght;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int area(){
        return this.length * this.width;
    }

    public int perimeter(){
        return (this.width + this.length) * 2;
    }

    public void compare(Rectangle1 b){
        if(this.area() > b.area()){
            System.out.println("넓이는 " + this.color + " 직사각형이 더 큽니다.");
        } else if (this.area() < b.area()) {
            System.out.println("넓이는 " + b.color + " 직사각형이 더 큽니다.");
        } else {
            System.out.println("넓이는 같습니다.");
        }

        if(this.perimeter() > b.perimeter()){
            System.out.println("둘레는 " + this.color + " 직사각형이 더 큽니다.");
        } else if (this.perimeter() < b.perimeter()) {
            System.out.println("둘레는 " + b.color + " 직사각형이 더 큽니다.");
        } else {
            System.out.println("둘레는 같습니다.");
        }
    }
}
