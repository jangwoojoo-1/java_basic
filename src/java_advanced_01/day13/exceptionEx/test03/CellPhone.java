package java_advanced_01.day13.exceptionEx.test03;

public class CellPhone {
    String model;
    double battery;

    public CellPhone(String model){
        this.model = model;
    }

    public void call(int time) throws IllegalArgumentException{
        if(time < 0){
            throw new IllegalArgumentException("통화시간입력오류");
        }
        System.out.println("통화 시간 : " + time + "분");
        double decrease = 0.5 * time;
        if((battery - decrease) < 0){
            battery = 0.0;
        }else {
            battery -= decrease;
        }
    }

    public void charge(int time) throws IllegalArgumentException{
        if(time < 0){
            throw new IllegalArgumentException("충전시간입력오류");
        }
        System.out.println("충전 시간 : "+time + "분");
        double increase = 3 * time;
        if((battery + increase) > 100){
            battery = 100;
        } else {
            battery += increase;
        }
    }

    public void printBattery(){
        System.out.println("남은 배터리 양 : " + battery);
    }
}
