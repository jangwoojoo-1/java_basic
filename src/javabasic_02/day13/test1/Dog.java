package javabasic_02.day13.test1;

public class Dog extends Animal{

    Dog(int speed){
        super(speed);
    }

    @Override
    public void run(int hours) {
        this.setDistance(this.getDistance() + (double)this.getSpeed()/2*hours);
    }
}
