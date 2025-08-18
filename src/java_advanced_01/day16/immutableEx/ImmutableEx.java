package java_advanced_01.day16.immutableEx;

import java.util.List;
import java.util.Map;

public class ImmutableEx {
    public static void main(String[] args) {
        List<String> immList = List.of("Apple", "Banana", "Pear", "Orange");

        //add 안 됨
        for (String string : immList) {
            System.out.println(string);
        }

        Map<String, Integer> map = Map.of("Apple", 1, "Banana", 2, "Pear", 3, "Orange", 4);
        for (String string : map.keySet()) {
            System.out.println(string);
            System.out.println(map.get(string));
        }
    }
}
