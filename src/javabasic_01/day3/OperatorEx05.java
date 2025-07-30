package javabasic_01.day3;

import java.util.Scanner;

public class OperatorEx05 {
    public static void main(String[] args) {
        //삼항 연산자 (피연산자 ? 피연산자 : 피연산자)

        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요. ");
        int kor = sc.nextInt();

        char grade = (kor > 90) ? 'A' : (kor > 80) ? 'B' : 'C';

        System.out.println(grade);

        if(kor > 90){
            System.out.println('A');
        } else if (kor > 80) {
            System.out.println('B');
        } else {
            System.out.println('C');
        }
    }
}
