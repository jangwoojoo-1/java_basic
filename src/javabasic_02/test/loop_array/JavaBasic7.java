package javabasic_02.test.loop_array;

public class JavaBasic7 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 3 ; i++){
            for(int j = 3-i ; j > 0 ; j--){
                System.out.print(" ");
            }
            for(int s = 0 ; s < i*2-1 ; s++){
                System.out.print("@");
            }
            System.out.println();
        }
        for(int i = 2 ; i >= 1 ; i--){
            for(int j = 3-i ; j > 0 ; j--){
                System.out.print(" ");
            }
            for(int s = 0 ; s < i*2-1 ; s++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
