package student_score_program;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class StudentOutput {
    private Map<String, Student> studentInfo;
    private List<Student> datas = new ArrayList<>();
    private String[] names;

    class InnerClass{
        private void loadObjectFromFile(){
            try(ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("C:/Temp/student.dat"))){
                Object obj = ois.readObject();
                if(obj instanceof HashMap) {
                    studentInfo = (HashMap<String, Student>) obj;
                } else {
                    System.out.println("타입 오류 발생");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        private void rearrangeData(){
            Set<String> keys = new HashSet<>(studentInfo.keySet());
            names = new String[studentInfo.size()];
            int index = 0;

            try {
                while(true){
                    Student student = keys.stream()
                            .map(key -> studentInfo.get(key))
                            .max(Comparator.comparingDouble(Student::getAverage)).get();
                    datas.add(student);
                    names[index++] = student.getName();
                    studentInfo.remove(student.getName());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        private void printInfo(){
            System.out.println("[평균 오름차순 성적표]");
            AtomicInteger i = new AtomicInteger(1);
            Arrays.stream(names).forEach(name ->{
                Student student = studentInfo.get(name);
                System.out.println((i.getAndIncrement()) + ") " + name);
                System.out.println("점수: " + student.getRecord().toString());
                System.out.println("총점: " + student.getTotal() + ", 평균: " + student.getAverage() + ", 학점: " + student.getGrade());
            });
        }
    }

    public void run(){
        InnerClass innerClass = new InnerClass();
        innerClass.loadObjectFromFile();
        innerClass.rearrangeData();
        innerClass.printInfo();
    }
}
