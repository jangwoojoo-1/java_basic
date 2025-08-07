package javabasic_02.day12.test3.ex03;

public class Bike extends Wheeler{
    Bike(String carName, int velocity, int wheelNumber){
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    public void speedUp(int speed){
        this.velocity += speed;
        if(velocity > 40){
            this.velocity = 100;
            System.out.println("자전거의 현재 속도는 40 입니다.");
            return;
        }
        System.out.println("자전거의 현재 속도는 " + this.velocity + " 입니다.");
    }

    public void speedDown(int speed){
        this.velocity -= speed;
        if(this.velocity < 10){
            this.velocity = 10;
            System.out.println("자전거의 최저속도위반으로 속도를 10으로 올립니다.");
            return;
        }
        System.out.println("자전거의 현재 속도는 " + this.velocity + " 입니다.");
    }
}
