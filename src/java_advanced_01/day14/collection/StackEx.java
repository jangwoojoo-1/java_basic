package java_advanced_01.day14.collection;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stackInt = new Stack<>();

        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);

        System.out.println(stackInt);

        System.out.println(stackInt.pop());
        System.out.println(stackInt.pop());
        System.out.println(stackInt.pop());
    }
}
