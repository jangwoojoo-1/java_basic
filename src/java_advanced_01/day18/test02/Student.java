package java_advanced_01.day18.test02;

import java.util.Objects;

public class Student{
    public int studentNum;
    public String name;

    public Student(int studentNum, String name){
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentNum);
    }
}
