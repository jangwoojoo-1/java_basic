package javabasic_02.day12.test3.ex01;

public abstract class Shape {
    private double area;
    private String name;

    Shape(){ }

    Shape(String name){
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void calculationArea();

    public void print(){
        System.out.printf("%s의 면적은 %f \n", this.getName(), this.getArea());
    }

}
