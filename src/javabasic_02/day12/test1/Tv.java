package javabasic_02.day12.test1;

public class Tv {
    // 멤버 변수 선언, 초기화 X
    String color;
    boolean power;
    int channel;

    Tv(){ //초기화 값 대입
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    //power 반대값 변환
    public void power(){
        this.power = this.power == true ? false : true;
    }

    //channel 값 1 증가
    public void channelUp(){
        this.channel++;
    }

    //channel 값 1 감소
    public void channelDown(){
        this.channel--;
    }

    //정보 출력
    public void print(){
        System.out.printf("color : %s \t power : %b \t channel : %d \n",
                this.color, this.power, this.channel);
    }
}
