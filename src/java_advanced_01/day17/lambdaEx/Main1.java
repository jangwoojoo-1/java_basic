package java_advanced_01.day17.lambdaEx;

public class Main1 {

    Runnable runnable = new Runnable() {


        @Override
        public void run() {
            System.out.println("Hello, Lambda");
        }
    };

    Runnable runnable1 = () -> System.out.println("Hello");
}
