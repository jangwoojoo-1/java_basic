package javabasic_01.day3;

import java.util.Scanner;

public class BlockScope {
    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
//        Scanner sc1 = new Scanner(System.in);

        System.out.print("이름 입력: ");
        String name = sc1.nextLine(); //string name 위치와 callname의 매개변수 위치는 다름. 값 복사한 것

        for(int i = 1; i<=2;i++){
            callName(name);
        }

        System.out.println("나의 이름은 " + name + "입니다.");
    }

    private static void callName(String name){ //static은 static끼리만 붙음
        System.out.println("나의 이름은 " + name);
        System.out.print("직무입력: ");
        String job = sc1.nextLine();
        System.out.println(job + "입니다.");
    }

}
