package javabasic_02.test.loop_array;

public class JavaBasic5 {
    public static void main(String[] args) {
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
