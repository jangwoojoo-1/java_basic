package javabasic_02.test.loop_array;

public class JavaBasic2 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1 ; i <= 100 ; i++){
            if(i%3 == 0){
                total += i;
            }
        }
        System.out.println("1부터 100까지의 정수 중 3의 배수의 총합 : " + total);
    }
}
