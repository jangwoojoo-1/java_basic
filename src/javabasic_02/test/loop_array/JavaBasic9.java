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
                        scores[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case '3':
                    for (int i = 0; i < count; i++) {
                        System.out.printf("scores[%d]: %d\n", i, scores[i]);
                    }
                    break;
                case '4':
                    for(int i = 0 ; i < count - 2 ; i++){
                        for (int j = 0 ; j < count-1 ; j++){
                            if(scores[j] < scores[j+1]){
                                int temp = scores[j];
                                scores[j] = scores[j+1];
                                scores[j+1] = scores[j];
                            }
                        }
                    }
                    System.out.println("최고 점수: " + scores[0]);
                    int total = 0;
                    for(int i = 0 ; i < count ; i++){
                        total += scores[i];
                    }
                    System.out.printf("평균 점수: %.1f\n", (double)total/count);
                    break;
                case '5':
                    tf = false;
                    break;
                default:
            }
        }
    }
}
