package java_advanced_01.day19;

import java.util.stream.IntStream;

public class RangeStreamEx {
    public static int sum = 0;

    public static void main(String[] args) {
        IntStream i1_100 = IntStream.rangeClosed(1, 100);
        i1_100.forEach(number -> sum += number);
        System.out.println(sum);

        IntStream i1_10 = IntStream.range(1, 11);
        i1_10.forEach(number -> sum += number);
        System.out.println(sum);
    }
}
