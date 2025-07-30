package javabasic_02.day6;

// == , != 연산자는 변수의 값이 같은지 아닌지를 조사
//참조 타입 변수의 값은 객체의 주소(번지)이므로
//        참조타입 변수의 ==, != 비교는 주소값을 비교하는 것

public class PrimitiveEqualType {
    public static void main(String[] args) {
        //정수형 배열 arr1, arr2, arr3 선언, 아직 값 X
        int[] arr1;
        int[] arr2;
        int[] arr3;

        //정수형 배열 arr1, arr2, arr3의 메모리 생성
        arr1 = new int[3];
        arr2 = new int[3];
        arr3 = new int[3];

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);

        arr1[0] = 1; //직접 할당
        System.out.println(arr1[0]);
        System.out.println(arr1[1]); //초기화 0, 자신의 타입의 default 값으로 초기화 됨.

        arr1[1] = 3;
        System.out.println(arr1[1]);

        //arr3에 차례차례 1,2,3 할당, 결과 확인
        for(int i = 0 ; i < arr1.length ; i++){
            arr1[i] = i + 1;
        }

        System.out.println("==================");
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }

        //itar 자동완성
        /*for (int i = 0; i < arr3.length; i++) {
            int i1 = arr3[i];

        }*/

        //iter 자동완성
        for (int i : arr1) {
            System.out.println(i);
        }

        //arr3에 값을 차례로 itar, iter 방식을 통해서 5,6,7을 할당
        //할당한 값을 iter,itar방식으로 확인

        for (int i = 0; i < arr3.length; i++) {
            int value = 5;
            value += i;
            arr3[i] = value;
        }

        System.out.println("===================");
        for (int i : arr3) {
            System.out.println(i);
        }

        System.out.println("==========");
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println("==============");
        System.out.println(arr1==arr2);
        System.out.println(arr3==arr2);
        System.out.println(arr1==arr3);

        System.out.println("========== 주소값 복사하여 다른 참조변수에 할당 =========");
        arr2 = arr3;
        System.out.println("======주소값 비교=========");
        System.out.println(arr2 == arr3);

        for (int i : arr2) {
            System.out.println(i);
        }
        System.out.println("===========");
        for (int i = 0; i < arr3.length; i++) {
            int i1 = arr3[i];
            System.out.println(i1);
        }
    }
}
