package day2;
import java.util.Scanner;

public class FourArithmetic {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        a = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        b = sc.nextInt();

        System.out.printf("a+b=%d\n", a+b);
        System.out.printf("a-b=%d\n", a-b);
        System.out.printf("a*b=%d\n", a*b);
        System.out.printf("a/b=%d", a/b);

        int kor, eng, total;
        double avg;;

        kor = 77;
        eng = 87;
        total = kor + eng;
        avg = total/2;

        System.out.printf("총점:%d\n평균:%f", total, avg);
    }
}
