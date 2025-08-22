package java_advanced_01.day20.filterEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringEx01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Joo");
        list.add("Kim");
        list.add("Park");
        list.add("Lee");
        list.add("Joo");

        List<String> list1 = Arrays.asList(
          new String("신명선"),
          new String("신명선"),
                new String("김중신")
        );

        list.stream().forEach(s -> System.out.println(s));
        System.out.println();
        list.stream().distinct().forEach(System.out::println);
        System.out.println();

        list1.stream().forEach(s -> System.out.println(s));
        System.out.println();
        list1.stream().distinct().filter(s -> s.contains("신")).forEach(System.out::println);
        System.out.println();
        list1.stream().distinct().filter(s->s.startsWith("신")).forEach(System.out::println);
    }
}
