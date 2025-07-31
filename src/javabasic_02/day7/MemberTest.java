package javabasic_02.day7;

public class MemberTest {
    public static void main(String[] args) {
        Member p = new Member();
        p.name = "홍길동";
        p.age = 30;
        p.phone = "010-1111-1111";
        p.email = "fc@naver.com";
        p.address = "서울";
        p.weight = 57.6;

        Member[] memList = new Member[10];
        memList[0] = p;

        System.out.println("이름 : " + memList[0].name);
        System.out.println("나이 : " + memList[0].age);
        System.out.println("전화번호 : " + memList[0].phone);
        System.out.println("이메일 : " + memList[0].email);
        System.out.println("거주지 : " + memList[0].address);
        System.out.println("몸무게 : " + memList[0].weight + "kg");
    }
}
