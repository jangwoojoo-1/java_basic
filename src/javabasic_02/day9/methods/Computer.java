package javabasic_02.day9.methods;

import java.util.Arrays;
//가변길이 매개변수
// 메서드를 호출할 때 매개변수의 개수에 맞게 매개 값을 제공해야 한다.
//만약 메서드가 가변길이 매개변수를 가지면 매개변수의 개수와 상관없이 매개값을 줄 수 있다.
public class Computer {
    static int sum = 0;

    public static String totalSum(int ... values){
        for(int i = 0 ; i < values.length ; i++){
            sum += values[i];
        }
        return "sum"+sum;
        //return Integer.toString(Arrays.stream(values).sum());
    }
}
