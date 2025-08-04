package javabasic_02.day9.methods;

import java.util.Scanner;

public class Example01 {
    //사용자가 원하는 만큼 method() 기능을 호출
    public static Scanner sc = new Scanner(System.in);
    //공용

    public static void method(){
        System.out.println("메서드 시작");
        //System.out.println("static Method");
        //System.out.println(" 5+6 = 11");
        System.out.println("메서드 끝");
    }

    public static void main(String[] args) {
        //method(); //정적 메서드(static method) 호출
        int counter = 0;
        System.out.print("몇 번을 수행할까요? ");
        counter = sc.nextInt();

        for(int i = 0 ; i < counter ; i++){
            System.out.println((i+1) +"번째 호출");
            method();
        }
        System.out.println("원하는 만큼 method() 호출 후 여기로 돌아옴.");
    }
}
