package java_advanced_01.day20.optinonalEx;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();

        //방법1
        //Optional 처리
        OptionalDouble optionalDouble = list.stream().mapToInt(Integer::intValue).average();

        if(optionalDouble.isPresent()) {
            System.out.println(optionalDouble.getAsDouble());
        } else {
            System.out.println("0,0");
        }

        //방법2
        double avg2 = list.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0.0);
        System.out.println(avg2);

        //방법3
        list.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
    }
}
