package javabasic_02.day10.morningtest;

public class SingleTone {
    //싱글톤 클래스 객체를 담을 인스턴스 변수
    private static SingleTone instance;

    //생성자를 private로 선언 (외부 new 못하게)
    private SingleTone(){}

    public static SingleTone getInstance(){
        if(instance == null){
            instance = new SingleTone();
        }
        return instance;
    }
    //객체 인스턴스를 얻어야만 뭘 할 수 있게 설정함으로써 컨트롤할 수 있음

    public static void main(String[] args) {
        SingleTone s1 = SingleTone.getInstance();
        SingleTone s2 = SingleTone.getInstance();
        SingleTone s3 = SingleTone.getInstance();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
    }
}
