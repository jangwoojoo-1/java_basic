package javabasic_01.day4;

import java.util.Scanner;

public class SwitchEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학점을 입력하세요.(A, B, C 가운데): ");
        char grade = sc.next().charAt(0);
        grade = Character.toUpperCase(grade);

        switch(grade){
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("노력하세요");
                break;
            default:
                System.out.println("ABC 중 하나를 입력해주세요");
        }
    }
}
