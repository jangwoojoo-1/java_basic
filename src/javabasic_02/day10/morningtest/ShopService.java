package javabasic_02.day10.morningtest;

public class ShopService {
    //싱글톤 클래스 객체를 담을 인스턴스 변수
    private static ShopService instance;

    //생성자를 private로 선언 (외부 new 못하게)
    private ShopService(){}

    public static ShopService getInstance(){
        if(instance == null){
            instance = new ShopService();
        }
        return instance;
    }

}
