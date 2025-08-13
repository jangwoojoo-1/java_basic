package java_advanced_01.day14.collection;

import java.util.ArrayList;

public class Myqueue <T>{
    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item){
        queue.add(item);
    }

    public T dequeue(){
        if(queue.isEmpty()){
            return null;
        }

        return queue.remove(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Myqueue<Integer> mq = new Myqueue<>();

        mq.enqueue(1);
        mq.enqueue(10);
        mq.enqueue(20);
        mq.enqueue(30);

        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());

    }
}
