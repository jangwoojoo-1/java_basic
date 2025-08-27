package student_score_program;

public class StudentApp {
    public static void main(String[] args) {
        StudentInput studentInput = new StudentInput();
        studentInput.run();
        StudentOutput studentOutput = new StudentOutput();
        studentOutput.run();
        SortedStudent sortedStudent = new SortedStudent();
        sortedStudent.run();
    }
}
