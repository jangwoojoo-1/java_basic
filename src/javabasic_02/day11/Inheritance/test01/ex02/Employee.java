package javabasic_02.day11.Inheritance.test01.ex02;

public class Employee {
    public String name;
    public int age;
    public String dept;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getDept() {
        return this.dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public void print(){
        System.out.printf("이  름 : %s\t나 이 : %d\t%5s\t: %s\n",
                this.name, this.age, "부   서", this.dept);
    }
}
