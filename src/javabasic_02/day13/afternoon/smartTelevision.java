package javabasic_02.day13.afternoon;

public class smartTelevision implements RemoteControl, Searchable{
    @Override
    public void turnOn() {
        System.out.println("TV를 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url + " 검색합니다.");
    }
}
