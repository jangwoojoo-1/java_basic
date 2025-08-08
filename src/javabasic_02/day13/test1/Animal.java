package javabasic_02.day13.test1;

public abstract class Animal {
    private int speed;
    private double distance = 0;

    Animal(int speed){
        this.speed = speed;
    }

    public abstract void run(int hours);

    public double getDistance(){
        return this.distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
