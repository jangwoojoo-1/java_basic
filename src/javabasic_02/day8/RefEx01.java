package javabasic_02.day8;

public class RefEx01 {
    public static void main(String[] args) {
        String refVar1 = null;
        String refVar2 = null;


        //두 방식은 다른 방식임
        refVar1 = new String("자바"); //힙에 들어가 있음
        refVar2 = "자바"; //literal pool에 만들어짐
        //literal pool
        // 값이 같은 것들은 동일한 주소 값을 가짐
        // 즉, 이미 있는 것에 대한 새 변수는 동일한 주소를 할당

        String refVar3 = "자바";
        String refVar4 = null; //아직 힙에서 공간을 할당받지 못한 것

        System.out.println(refVar1 == refVar2);
        System.out.println(refVar1 == refVar3);
        System.out.println(refVar2 == refVar3);
        System.out.println("---------------------");
        System.out.println(refVar1.equals(refVar2));
        System.out.println(refVar2.equals(refVar3));

        System.out.println("-----nullPoint Exception");
        System.out.println(refVar4);
        System.out.println(refVar3.length());

    }
}
