package javabasic_02.day9.oop;

import java.util.Arrays;

public class Student {
    //student 클래스의 멤버(필드)
    private String stu_name;
    private Integer stu_age;
    private String address;
    private String stu_ssun;
    private String gender;
    private int[] scores;

    //생성자를 통하여 학생 개체의 필드를 초기화
    Student(){ }//기본 생성자

    Student(String stu_name, String stu_ssun, int[] scores){
        this.stu_name = stu_name;
        this.stu_ssun = stu_ssun;
        this.scores = scores;

    }

    Student(String stu_name, Integer stu_age, String address, String stu_ssun, int[] scores){
        this.stu_name = stu_name;
        this.stu_ssun = stu_ssun;
        this.stu_age = stu_age;
        this.address = address;
        this.scores = scores;
    }

    Student(int[] scores){
        this.scores = scores;
    }

    public String getStu_name() {
        return stu_name;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public String getAddress() {
        return address;
    }

    public String getStu_ssun() {
        return stu_ssun;
    }

    public String getGender(){
        return gender;
    }

    public String getScores(){
        return Arrays.toString(scores);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //Object 클래스의 toString()
    @Override // alt + insert 누른 후 toString 눌러서 OK 함.
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", address='" + address + '\'' +
                ", stu_ssun='" + stu_ssun + '\'' +
                ", gender='" + gender + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }

    public void calculateScores(){
        System.out.println("===================");
        System.out.println(stu_name);
        if(scores == null || scores.length == 0){
            System.out.println("점수가 입력되지 않았습니다.");
            return;
        }
        System.out.println("총점 : " + Arrays.stream(scores).sum());
        System.out.printf("평균 : %.1f", (double)Arrays.stream(scores).sum()/3);
    }
}
