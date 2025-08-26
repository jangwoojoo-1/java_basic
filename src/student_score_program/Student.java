package student_score_program;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private List<Integer> record;
    private int total;
    private float average;
    private String grade;

    @Override
    public String toString() {
        return name + " (총점=" + total +
                ", 평균=" + String.format("%.1f", average) +
                ", 학점='" + grade + ")";
    }
}
