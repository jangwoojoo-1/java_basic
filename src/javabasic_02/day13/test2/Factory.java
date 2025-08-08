package javabasic_02.day13.test2;

public abstract class Factory {
    private String name;
    private int openHour;
    private int closeHour;

    Factory(String name, int openHour, int closeHour){
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public String getFactoryName() {
        return name;
    }

    public int getWorkingTime(){
        return (this.closeHour - this.openHour);
    }

    abstract int makeProducts(char skill);
}
