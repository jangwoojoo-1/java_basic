package javabasic_02.day11.Inheritance.test01.ex02;

public class Student {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print(){
        System.out.printf("이  름 : %s\t나 이 : %d\t%5s\t: %d\n",
                this.name, this.age, "학   번", this,id);
    }
}
