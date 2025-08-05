package javabasic_02.day10.morningtest;

public class pratice {
    public static void main(String[] args) {
        int[][] array = {
                {95, 66},
                {11, 13, 15},
                {11, 44, 55, 66, 77}
        };
        System.out.println(array.length);
        System.out.println(array[1].length);

        int total = 0;

        int count = 0;

        for(int i = 0 ; i < array.length ; i++){

            for(int j = 0 ; j < array[i].length ; j++){

                total += array[i][j];

                count++;

            }

        }

        System.out.printf("전체 합 : %d  평균 : %.1f", total, (double)total/count);
    }
}
