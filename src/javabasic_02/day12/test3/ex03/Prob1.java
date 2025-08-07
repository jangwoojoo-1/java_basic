package javabasic_02.day12.test3.ex03;

public class Prob1 {
    public static void main(String[] args) {
        Wheeler[] wheelers = new Wheeler[2];
        Truck truck = new Truck("트럭", 50, 4);
        Bike bike = new Bike("자전거", 10, 2);
        wheelers[0] = truck;
        wheelers[1] = bike;
        System.out.println(wheelers[0].carName + " : 바퀴 " + wheelers[0].wheelNumber + "개입니다");
        System.out.println(wheelers[1].carName + " : 바퀴 " + wheelers[1].wheelNumber + "개입니다");
        wheelers[1] = bike;
        for (int i = 0; i < 2; i++) {
            wheelers[0].speedUp(10);
            wheelers[1].speedUp(15);
            wheelers[0].speedDown(20);
            wheelers[1].speedDown(25);
            wheelers[0].stop();
            wheelers[1].stop();
        }
    }
}
