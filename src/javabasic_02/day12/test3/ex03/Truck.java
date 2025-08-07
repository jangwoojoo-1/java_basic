package javabasic_02.day12.test3.ex03;

public class Truck extends Wheeler{
    Truck(String carName, int velocity, int wheelNumber){
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    public void speedUp(int speed){
        this.velocity += (speed*5);
        if(velocity > 100){
            this.velocity = 100;
            System.out.println("트럭의 현재 속도는 100 입니다.");
        }
        System.out.println("트럭의 현재 속도는 " + this.velocity + " 입니다.");
    }

    public void speedDown(int speed){
        this.velocity -= (speed*5);
        if(this.velocity < 50){
            this.velocity = 50;
            System.out.println("트럭의 최저속도위반으로 속도를 50으로 올립니다.");
            return;
        }
        System.out.println("트럭의 현재 속도는 " + this.velocity + " 입니다.");
    }
}
