package java_advanced_01.day17.lambdaEx.lambda01;

import java.util.Scanner;

public class LambdaEx01 {

    //사용자가 입력한 숫자 두개의 결과를 처리하는 형태
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Consumer 타입
        action((x, y)->{
            int result = x+y;
            System.out.println(result);
        });

        action((x, y)->{
            int result = x-y;
            System.out.println(result);
        });
    }

    public static void action(Calculable calculable) {
        //데이터 부
        System.out.print("num1 : ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("num2 : ");
        int y = sc.nextInt();
        calculable.calculate(x, y);
    }
}
