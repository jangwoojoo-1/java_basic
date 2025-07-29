package day5;

public class ContinueEx01 {
    public static void main(String[] args) {
        //Continue 문은 반복문인 for, while, do-while에서만 사용됨
        //블록내부에서 continue문이 사용되면, for문의 증감식, 또는 while, do-whle문의 조건식으로 바로 이동

        //continue문은 반복문을 종료시키지 않고 계속 반복을 수행한다는 점이 break와 다름

        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("i = " + i);
            if(i % 2 != 0){//홀수 스킵
                continue;
            }
            System.out.println("결과출력 : " + i);//짝수만 출력
        }
    }
}
