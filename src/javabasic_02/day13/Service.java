package javabasic_02.day13;

public interface Service {
    default void defaultMethod1(){
        System.out.println("default1()");
        defaultCommon();
    }

    default void default2(){
        System.out.println("default2()");
        defaultCommon();
    }

    private void defaultCommon(){
        System.out.println("defaultMethod의 중복코드 A");
        System.out.println("defaultMethod의 중복코드 B");
    }

    static void staticMethod1(){
        System.out.println("staticMethod() 코드");
        staticCommon();
    }

    static void staticMethod2(){
        System.out.println("staticMethod() 코드");
        staticCommon();
    }

    private static void staticCommon(){
        System.out.println("staticMethod 중복코드A");
        System.out.println("staticMethod 중복코드B");
    }

}
