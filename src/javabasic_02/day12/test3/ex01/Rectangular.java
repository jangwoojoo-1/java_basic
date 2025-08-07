package javabasic_02.day12.test3.ex01;

public class Rectangular extends Shape{
    private double width;
    private String height;

    Rectangular(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = Double.toString(height);
    }

    public double getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void calculationArea(){
        this.setArea(this.width * Double.parseDouble(this.height));
    };

    public void print(){
        System.out.printf("%s의 면적은 %.1f \n", this.getName(), this.getArea());
    }
}

