package javabasic_02.day13.se01;

public class User {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl;
        ia.methodA();

        IntefaceB ib = impl;
        ib.methodB();

        InterfaceC ic = impl;
        ic.methodC();
        ic.methodB();
        ic.methodA();

        
    }
}
