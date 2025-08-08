package javabasic_02.day13.test1;

public class Chicken extends Animal implements Cheatable{

    Chicken(int speed){
        super(speed);
    }

    @Override
    public void run(int hours) {
        this.setDistance(this.getDistance() + (double)this.getSpeed()*hours);
    }

    @Override
    public void fly() {
        this.setSpeed(this.getSpeed()*2);
    }
}
