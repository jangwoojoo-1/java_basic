package javabasic_01.day4;

public class RandomEx01 {
    public static void main(String[] args) {
        double a = Math.random(); // 0.0부터 1.0 이전까지의 값 반환
        //0부터 6까지의 값이 필요한 경우
        //(int)math.Random()*6 + 1

        int number = (int)(Math.random() * 45) + 1;

        //start부터 시작하는 n개의 정수 중에서 하나의 정수를 얻기 위한 코드
        //int num = ((int)Math.random() * n) + start

        //주사위 예제

        System.out.println("3번을 연달아 주사위를 던지고 나온 값을 출력하세요.");


        int num = 0;
        for (int i = 1 ; i < 4 ; i++){
            num = (int)(Math.random() * 6) + 1;
            System.out.println(i + "번째 나온 주사위 수 " + num);
        }
    }
}
