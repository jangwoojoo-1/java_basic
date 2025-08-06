package javabasic_02.day11.Inheritance.practice1;

public class BB extends AA {
    private int cc = 30;

    void adder(){ //super는 부모 객체의 주소값을 가지고 있음
        int result = this.getAA() + this.getBB() + cc;
        System.out.println(result);
    }

    public int getCC(){
        return cc;
    }
}
