package javabasic_01.day5;

import java.util.Scanner;

public class StarEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        n = sc.nextInt();
        for (int i =  1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            for(int j = n ; j > 0 ; j--){
                if(i < j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("======================");

        n = sc.nextInt();
        for (int i = n ; i >= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");

        n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("_");
            }
            for(int s = 0 ; s <= 5-i ; s++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");

        n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            for(int j = 0 ; j <= n ; j++){
                if(j < i){
                    System.out.print("_");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("======================");

        n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            for(int j = 0 ; j <= n-i ; j++){
                System.out.print("_");
            }
            for(int s = 1 ; s <= i*2-1 ; s++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");

        n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int s = 1 ; s <= i*2-1 ; s++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" ");
            }
            for(int s = (n-i)*2-1 ; s >= 1 ; s--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");

        int row, col; // 행, 열 값 저장할 변수 선언

        n = sc.nextInt();

        for(row = 1 ; row <= n ; row++){
            for(col = row ; col <= n ; col++){
                System.out.print(" ");
            }
            for(col = 1 ;  col <= (2*row-1) ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
