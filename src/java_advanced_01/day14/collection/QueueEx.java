package java_advanced_01.day14.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

    public static void main(String[] args) {

        Queue<Integer> queueInt = new LinkedList<>();
        Queue<String> queueStr = new LinkedList<>();

        //데이터(객체) 추가

        queueInt.add(1);
        queueInt.add(2);
        queueInt.add(3);
        queueInt.add(4);

        queueInt.offer(2);

        System.out.println(queueInt.remove(2));

        queueInt.poll();

        System.out.println(queueInt);
    }
}
