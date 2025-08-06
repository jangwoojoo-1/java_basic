package javabasic_02.day11.Inheritance.test01.ex03;

public class Sparrow {
    private String name;
    private int legs;
    private int length;

    public void setName(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.printf("참새(%s)가 날아다닙니다. \n", this.name);
    }

    public void sing(){
        System.out.printf("참새(%s)가 소리내어 웁니다. \n", this.name);
    }

    @Override
    public String toString() {
        return "참새의 이름은 " + this.name + " 입니다.";
    }
}
