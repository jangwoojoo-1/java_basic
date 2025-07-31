package javabasic_02.test.loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class JavaBasic9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean tf = true;
        int[] scores = null;

        while(tf){
            printMenu();//메뉴판 출력

            char n = selectMenu(); //번호 선택

            switch (n){
                case '1':
                    scores = inputStudentCount();
                    break;
                case '2':
                    inputStudentScore(scores);
                    break;
                case '3':
                    printStudentScore(scores);
                    break;
                case '4':
                    analyzeScore(scores);
                    break;
                case '5':
                    programExit();
                    tf = false;
                    break;
                default:
                    System.out.println("숫자를 잘못 입력했습니다.");
            }
        }
    }

    public static void printMenu(){
        System.out.println("--------------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("--------------------------------------------------");
        System.out.print("선택> ");
    }

    public static char selectMenu(){
        String input = sc.nextLine();

        while (input.length() != 1 || input.charAt(0) < '1' || input.charAt(0) > '5') {
            System.out.println("1~5 중 하나의 숫자로 입력해주세요.");
            input = sc.nextLine();
        }

        return input.charAt(0);
    }

    public static int[] inputStudentCount(){

        while (true) {
            System.out.print("학생수> ");
            try {
                int count = Integer.parseInt(sc.nextLine());
                if (count > 0) {
                    int[] array = new int[count];
                    array[0] = -1;//후에 입력 확인을 위해서
                    return array;
                } else {
                    System.out.println("학생 수를 다시 입력하세요.");
                }
            } catch (NumberFormatException e) {//숫자가 아닌 입력 예외처리
                System.out.println("정수를 입력해주세요.");
            }
        }
    }

    public static boolean arrayIsNull(int[] array){
        return array == null;
    }

    public static void inputStudentScore(int[] array){
        if(arrayIsNull(array)){
            System.out.println("학생수부터 입력해주시기 바랍니다.");
            return;
        }
        for (int i = 0 ; i < array.length ; i++){
            while (true) {
                System.out.printf("scores[%d]> ", i);
                try {
                    int score = Integer.parseInt(sc.nextLine());
                    if (score < 0 || score > 100) {
                        System.out.println("0~100 사이의 점수를 입력해주세요.");
                    } else {
                        array[i] = score;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("숫자로 입력해주세요.");
                }
            }
        }
    }
    
    public static void printStudentScore(int[] array){
        if(arrayIsNull(array)){
            System.out.println("학생수부터 입력해주시기 바랍니다.");
            return;
        }
        if (array[0] == -1) {
            System.out.println("점수 입력을 부탁드립니다.");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("scores[%d]: %d\n", i, array[i]);
        }
    }

    public static void analyzeScore(int[] array){
        if(arrayIsNull(array)){
            System.out.println("학생수부터 입력해주시기 바랍니다.");
            return;
        } else if (array[0] == -1) {
            System.out.println("점수 입력을 부탁드립니다.");
            return;
        } else {
            int maxScore = Arrays.stream(array).max().orElse(0);
            int total = Arrays.stream(array).sum();
            System.out.println("최고 점수: " + maxScore);
            System.out.printf("평균 점수: %.1f\n", (double)total/array.length);
        }
    }

    public static void programExit(){
        System.out.println("프로그램 종료");
    }
}
