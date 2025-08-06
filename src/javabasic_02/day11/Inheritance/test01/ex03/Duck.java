package javabasic_02.day11.Inheritance.test01.ex03;

public class Duck {
    private String name;
    private int legs;
    private int length;

    public void setName(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.printf("오리(%s)는 날지 않습니다. \n", this.name);
    }

    public void sing(){
        System.out.printf("오리(%s)가 소리내어 웁니다. \n", this.name);
    }

    @Override
    public String toString() {
        return "오리의 이름은 " + this.name + " 입니다.";
    }
}
