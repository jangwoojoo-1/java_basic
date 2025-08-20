package java_advanced_01.day18.test03;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

//        for (String key : map.keySet()) {
//            int value = map.get(key);
//            totalScore += value;
//            if(maxScore < value){
//                maxScore = value;
//                name= key;
//            }
//        }

        //stream() 활용
        //map의 value 컬렉션을 stream()으로 스트림 생성후 mapToImt()로 int stream으로 변환해서 sum()으로 다 더함
        totalScore = map.values().stream().mapToInt(Integer::intValue).sum();
        //Map을 스트림으로 변환해서 entry를 value를 기준으로 비교해서 값이 가장 큰 entry를 maxEntry에 저장, orElse는 Map이 Null일 경우 대비
        Map.Entry<String,Integer> maxEntry = map.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);

        System.out.println("평균 점수: " + (int)(totalScore/map.size()));
        System.out.println("최고 점수: " + maxEntry.getValue());
        System.out.println("최고 점수를 받은 아이디: " + maxEntry.getKey());

    }
}
