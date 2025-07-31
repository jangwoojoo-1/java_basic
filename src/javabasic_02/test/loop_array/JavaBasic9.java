package javabasic_02.test.loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class JavaBasic9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean tf = true;
        Integer[] scores = new Integer[30];
        int count = 0;

        while(tf){
            System.out.println("--------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");
            char n = sc.nextLine().charAt(0);

            switch (n){
                case '1':
                    System.out.print("학생수> ");
                    count = Integer.parseInt(sc.nextLine());
                    break;
                case '2':
                    for (int i = 0 ; i < count ; i++){
                        System.out.printf("scores[%d]: ", i);
                        int num = Integer.parseInt(sc.nextLine());
                        while(num < 0 || num > 100){
                            System.out.printf("scores[%d]: ", i);
                            num = Integer.parseInt(sc.nextLine());
                        }
                        scores[i] = num;
                    }
                    break;
                case '3':
                    for (int i = 0; i < count; i++) {
                        System.out.printf("scores[%d]: %d\n", i, scores[i]);
                    }
                    break;
                case '4':
                    int max = 0;
                    for(int i = 0 ; i < count ; i++){
                        if(max < scores[i]){
                            max = scores[i];
                        }
                    }
                    System.out.println("최고 점수: " + max);
                    int total = 0;
                    for(int i = 0 ; i < count ; i++){
                        total += scores[i];
                    }
                    System.out.printf("평균 점수: %.1f\n", (double)total/count);
                    break;
                case '5':
                    System.out.println("프로그램 종료");
                    tf = false;
                    break;
                default:
            }
        }
    }
}
