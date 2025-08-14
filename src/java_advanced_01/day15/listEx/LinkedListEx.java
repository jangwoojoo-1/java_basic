package java_advanced_01.day15.listEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        //시작시간과 끝 시간을 저장할 변수
        long startTime, endTime;

        //ArrayList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));

        }

        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 데이터 삽입시간 : ",
                (endTime-startTime));
        //LinkedList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));

        }

        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "LinkedList 데이터 삽입시간 : ",
                (endTime-startTime));
    }
}
