package java_advanced_01.day19;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamEx {
    public static void main(String[] args) {
        String[] strings = new String[]{"1", "2", "3", "4", "5"};
        Stream<String> stream = Arrays.stream(strings);
        stream.forEach(System.out::println);

        Integer[] numbers = new Integer[]{1,2,3,4,5};
        IntStream intStream = Arrays.stream(numbers).mapToInt(Integer::intValue);
        intStream.forEach(System.out::println);
    }
}
