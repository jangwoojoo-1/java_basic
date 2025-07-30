package javabasic_01.day4;

public class If_Ex01 {
    public static void main(String[] args) {
        // score 변수에 93 저장
        int score = 93;

        //현재 score 값이 90 이상이면 A, 미만이면 Fail 출력
        if(score >= 90){
            System.out.println("A");
        } else {
            System.out.println("Fail");
        }

    }
}
