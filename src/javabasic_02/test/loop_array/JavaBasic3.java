package javabasic_02.test.loop_array;

public class JavaBasic3 {
    public static void main(String[] args) {
        boolean loop = true;

        while(loop){
            int num1 = (int)(Math.random()*6+1);
            int num2 = (int)(Math.random()*6+1);
            System.out.printf("(%d, %d)\n", num1, num2);

            if((num1 + num2) == 5) loop = false;
        }

        int count = 0;
        for(int i = 1 ; i <= 6 ; i++){
            for(int j = 1 ; j <= 6 ; j++){
                if( i+j == 5){
                    count++;
                }
            }
        }
        System.out.println("숫자의 합이 5가 되는 경우의 수 : " + count);
    }
}
