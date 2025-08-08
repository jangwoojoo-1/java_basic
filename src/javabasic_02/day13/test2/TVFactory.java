package javabasic_02.day13.test2;

public class TVFactory extends Factory implements IWorkingTogether{
    TVFactory(String name, int openHour, int closeHour){
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        switch (skill){
            case 'A':
                return this.getWorkingTime()*8;
            case 'B':
                return this.getWorkingTime()*5;
            case 'C':
                return this.getWorkingTime()*3;
            default:
                return this.getWorkingTime();
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((TVFactory)partner).getWorkingTime()*3;
    }
}
