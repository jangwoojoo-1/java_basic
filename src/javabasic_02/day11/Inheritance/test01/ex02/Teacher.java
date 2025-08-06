package javabasic_02.day11.Inheritance.test01.ex02;

public class Teacher {
    private String name;
    private int age;
    private String subject;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void print(){
        System.out.printf("이  름 : %s\t나 이 : %d\t%4s\t: %s\n",
                this.name, this.age, "담당과목", this.subject);
    }
}
