package java_advanced_01.day19;

import java.util.*;
import java.util.stream.Stream;

public class StreanEx01 {
    public static void main(String[] args) {

        //지금까지 컬렉션이나 배열에서는 저장된 요소를 반복처리하기 위해서는 for문을 이용하거나
        //iterator(반복자)를 이용했음.

        //지금 구현한 코드는
        //List 컬렉션에서 저장되어 있는 요소를 하나씩 처리하는 for문
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        // 향상된 for문
        for (String string : list) {
            System.out.println(string);
        }

        //iterator 사용
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //stream 활용

        Stream<String> stream = list.stream();
//        stream.forEach(item -> System.out.println(item));
        stream.forEach(System.out::println);

        Set<String> names = new HashSet<>();
        names.add("홍길동");
        names.add("감나무");
        names.add("김꽃분");
        Stream<String> stream2 = names.stream();
        stream2.forEach(System.out::println);
    }
}
