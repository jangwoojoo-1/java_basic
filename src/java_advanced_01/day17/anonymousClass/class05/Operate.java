package java_advanced_01.day17.anonymousClass.class05;

public interface Operate {
    int operate(int a, int b);

    //default method
    default void print() {
        System.out.println("print");
    }
}
