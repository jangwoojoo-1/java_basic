package javabasic_02.day11.Inheritance.test01.ex02;

public class Student {
    private static String name;
    private static int age;
    private static int id;

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static int getId() {
        return id;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static void setAge(int age) {
        Student.age = age;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public void print(){
        System.out.printf("이  름 : %s\t나 이 : %d\t%5s\t: %d\n",
                name, age, "학   번", id);
    }
}
