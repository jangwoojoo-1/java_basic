package javabasic_02.day9.methods;

public class Example02 {
    public static String greeting(){
        String greeting = "Hello";
        return greeting;
    }

    public static void main(String[] args) {
        String str = greeting();
        System.out.println(str);
        System.out.println(str + " java");

        System.out.println(greeting());
    }


}
