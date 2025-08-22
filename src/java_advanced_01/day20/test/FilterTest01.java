package java_advanced_01.day20.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bobi", "Charlie", "David", "Eve");

        //1.
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);


        List<String> names2 = Arrays.asList("Alice", "Bobi", "Charlie");

        List<Integer> nameLengths = names2.stream()
                .map(String::length).toList();

        //2.
        System.out.println(nameLengths);

    }
}
