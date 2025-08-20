package java_advanced_01.day18.test04;

public class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student (String id, int score){
        this.id = id;
        this.score = score;
    }


    @Override
    public int compareTo(Student o) {
        if(this.score < o.score) return -1;
        else if(this.score > o.score) return 1;
        else return 0;
    }
}
