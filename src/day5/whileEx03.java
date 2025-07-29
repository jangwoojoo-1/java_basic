package day5;

import java.util.Scanner;

public class whileEx03 {
    public static void main(String[] args) {
        //키보드에서 입력했을 때 "1"-속도증가, "2"-속도감소, "3"-프로그램 종료
        Scanner sc = new Scanner(System.in);

        //속도 증감 비교할 변수
        boolean run = true;

        //속도 값 조절 변수
        int speed = 0;

        while (run){
            System.out.println("------------------------------");
            System.out.println("1. 증가   |  2. 감소  |  3. 종료 ");
            System.out.println("------------------------------");
            System.out.print("선택하세요 : ");

            String stringNum = sc.nextLine();

            if(stringNum.equals("1")){
                speed++;
                System.out.println("현재 속도 = " + speed);
            }else if (stringNum.equals("2")){
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if (stringNum.equals("3")) {
                run = false;
                System.out.println("엔진 끄기");
            }
        }

        System.out.println("프로그램 종료");
    }
}
