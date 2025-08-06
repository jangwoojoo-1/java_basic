package javabasic_02.day11.homework.ex01;

public class Rectangle {
    private int width;
    private int height;
    private String color = "흰색";
    private int area;

    Rectangle(){}

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    Rectangle(int width, int height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public String getColor() {
        return this.color;
    }

    public int getArea() {
        return this.area;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void calculateArea(){
        this.area = this.width * this.height;
    }
}
