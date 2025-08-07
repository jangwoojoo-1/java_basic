package javabasic_02.day12.test3.ex01;

public class Circle extends Shape{
    private double radius;

    Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculationArea(){
        this.setArea(this.radius * this.radius * Math.PI);
    };

    public void print(){
        System.out.printf("%s의 면적은 %.13f \n", this.getName(), this.getArea());
    }
}
