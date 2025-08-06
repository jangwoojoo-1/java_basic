package javabasic_02.day11.Inheritance.test01.ex03;

public class Sparrow {
    private static String name;
    private static int legs;
    private static int length;

    public void setName(String name) {
        this.name = name;
    }

    public static void fly(){
        System.out.printf("참새(%s)가 날아다닙니다. \n", name);
    }

    public static void sing(){
        System.out.printf("참새(%s)가 소리내어 웁니다. \n", name);
    }

    @Override
    public String toString() {
        return "참새의 이름은 " + name + " 입니다.";
    }
}
