package javabasic_02.day13;

public class User1 {
    public static void main(String[] args) {
        Service service = new ServiceImpl();

        service.defaultMethod1();
        service.default2();

        Service.staticMethod1();
        Service.staticMethod2();
    }
}

