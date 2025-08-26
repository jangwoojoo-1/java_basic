package student_score_program;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentOutput {
    private Map<String, Student> studentInfo;
    ArrayList<Student> datas;
    String[] names;

    class InnerClass{
        private void loadObjectFromFile(){
            try(ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("C:/Temp/student.dat"))){
                studentInfo = (Map<String, Student>) ois.readObject();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        private void rearrangeData(){
//            datas.add(studentInfo.entrySet().stream()
//            .collect();
        }

        private void printInfo(){

        }
    }
}
