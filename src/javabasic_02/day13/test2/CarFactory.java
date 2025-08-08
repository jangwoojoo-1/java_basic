package javabasic_02.day13.test2;

public class CarFactory extends Factory implements IWorkingTogether{
    CarFactory(String name, int openHour, int closeHour){
        super(name, openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        switch (skill){
            case 'A':
                return this.getWorkingTime()*3;
            case 'B':
                return this.getWorkingTime()*2;
            case 'C':
                return this.getWorkingTime();
            default:
                return 0;
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        //return ((CarFactory)partner).getWorkingTime()*2;
        return ((CarFactory)partner).makeProducts('B');
    }
}
