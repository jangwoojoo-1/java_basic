package javabasic_02.day11.Inheritance.test01.ex03;

public class Duck {
    private static String name;
    private static int legs;
    private static int length;

    public void setName(String name) {
        this.name = name;
    }

    public static void fly(){
        System.out.printf("오리(%s)는 날지 않습니다. \n", name);
    }

    public static void sing(){
        System.out.printf("오리(%s)가 소리내어 웁니다. \n", name);
    }

    @Override
    public String toString() {
        return "오리의 이름은 " + name + " 입니다.";
    }
}
