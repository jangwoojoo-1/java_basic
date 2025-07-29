package day5;

public class whileEx02 {
    public static void main(String[] args) {
        //1부터 100까지 합 출력 while 이용

        int sum = 0;
        int num = 1;

        while (num <= 100){
            sum += num;
            num++;
        }

        System.out.println("1부터 100의 합은 " + sum);
    }
}
