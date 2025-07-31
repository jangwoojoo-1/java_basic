package javabasic_02.test.loop_array;

public class JavaBasic6 {
    public static void main(String[] args) {
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 5-i ; j >= 1 ; j--){
                System.out.print(" ");
            }
            for(int s = 0 ; s <= i ; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
