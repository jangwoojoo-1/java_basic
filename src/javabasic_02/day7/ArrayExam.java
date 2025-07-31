package javabasic_02.day7;

public class ArrayExam {
    public static void main(String[] args) {
        char[] c = {'A', 'P', 'P', 'L', 'E'};

        for (char c1 : c) {
            // 다른 방식: String.valueOf(c1).toLowerCase()
            System.out.printf("%c", Character.toLowerCase(c1));
        }
    }
}
