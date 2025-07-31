package javabasic_02.day7;

public class DoubleArrayEx01 {
    public static void main(String[] args) {
        int[][] studentScores = new int[3][3];

        studentScores[0][0] = 90;
        studentScores[0][1] = 50;
        studentScores[0][2] = 80;

        System.out.println(studentScores[0][0] + " " + studentScores[0][1] + " " + studentScores[0][2]);

        System.out.println("=============================");

        studentScores[1][0] = 100;
        studentScores[1][1] = 70;
        studentScores[1][2] = 90;

        System.out.println(studentScores[1][0] + " " + studentScores[1][1] + " " + studentScores[1][2]);

        System.out.println("=============================");

        studentScores[2][0] = 70;
        studentScores[2][1] = 90;
        studentScores[2][2] = 90;

        System.out.println(studentScores[2][0] + " " + studentScores[2][1] + " " + studentScores[2][2]);
        System.out.println("==============================");

        for (int i = 0; i < studentScores.length; i++) {
            int total = 0;
            System.out.printf("학생%d : ", i+1);
            for (int j = 0; j < studentScores[i].length; j++) {
                System.out.print(studentScores[i][j] + " ");
                total += studentScores[i][j];
            }
            System.out.printf("총점: %d 평균 %.1f\n", total, total/3.0);
        }
    }
}
