package javabasic_02.day11.Inheritance.test01.ex02;

public class Teacher {
    private static String name;
    private static int age;
    private static String subject;

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static String getSubject() {
        return subject;
    }

    public static void setName(String name) {
        Teacher.name = name;
    }

    public static void setAge(int age) {
        Teacher.age = age;
    }

    public static void setSubject(String subject) {
        Teacher.subject = subject;
    }

    public void print(){
        System.out.printf("이  름 : %s\t나 이 : %d\t%4s\t: %s\n",
                name, age, "담당과목", subject);
    }
}
