package java_advanced_01.day15.mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        //객체 저장(INSERT, CREATE, SAVE)
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        System.out.println(map.size());

        //객체 읽기(READ, SEARCH, GET)
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        int value = map.get("A");

        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 읽고 싶다.
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer val = map.get(key);
        }

        //엔트리 Set 컬렉션을 얻고 반복해서 키와 값을 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key + " : " + val);
        }

        //키로 엔트리 삭제

        map.remove("B");
        System.out.println(map.size());
        System.out.println();
    }
}
