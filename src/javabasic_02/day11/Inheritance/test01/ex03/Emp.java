package javabasic_02.day11.Inheritance.test01.ex03;

public class Emp {
    private static String id;
    private static String name;
    private static int baseSalary;

    public static String getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public static int getBaseSalary() {
        return baseSalary;
    }

    public static void setId(String id) {
        Emp.id = id;
    }

    public static void setName(String name) {
        Emp.name = name;
    }

    public static void setBaseSalary(int baseSalary) {
        Emp.baseSalary = baseSalary;
    }

    public static double getSalary(double bonus){
        double salary = baseSalary + baseSalary*bonus;
        return salary;
    }

    @Override
    public String toString() {
        return name + "(" + id + ") 사원의 기본급은 "
                + baseSalary + "원 입니다.";
    }
}
