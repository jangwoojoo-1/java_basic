package javabasic_02.day11.Inheritance.test01.ex02;

public class Employee {
    public static String name;
    public static int age;
    public static String dept;

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static String getDept() {
        return dept;
    }

    public static void setName(String name) {
        Employee.name = name;
    }

    public static void setAge(int age) {
        Employee.age = age;
    }

    public static void setDept(String dept) {
        Employee.dept = dept;
    }
    public void print(){
        System.out.printf("이  름 : %s\t나 이 : %d\t%5s\t: %s\n",
                name, age, "부   서", dept);
    }
}
