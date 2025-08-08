package javabasic_02.day13.se01;

public class InterfaceImpl implements InterfaceC{
    @Override
    public void methodC() {
        System.out.println("C");
    }

    @Override
    public void methodB() {
        System.out.println("B");
    }

    @Override
    public void methodA() {
        System.out.println("A");
    }
}
