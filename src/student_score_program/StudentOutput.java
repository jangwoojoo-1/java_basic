package student_score_program;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class StudentOutput {
    private Map<String, Student> studentInfo;
    private List<Student> datas = new ArrayList<>();
    private String[] names;

    class InnerClass{
        private void loadObjectFromFile(){
            try(ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("C:/Temp/student.dat"))){
                if(ois.readObject() instanceof HashMap) {
                    studentInfo = (HashMap<String, Student>) ois.readObject();
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

//            while (!keys.isEmpty()) {
//                String minKey = null;
//                double minAvg = Double.MAX_VALUE;
//
//                for (String key : keys) {
//                    double avg = studentInfo.get(key).getAverage();
//                    if (avg < minAvg) {
//                        minAvg = avg;
//                        minKey = key;
//                    }
//                }
//
//                if (minKey != null) {
//                    datas.add(studentInfo.get(minKey));
//                    names[index++] = minKey;
//                    keys.remove(minKey);
//                }
//            }
            try {
                while(true){
                    Optional<Student> student = keys.stream()
                            .map(key -> studentInfo.get(key))
                            .max(Comparator.comparingDouble(s -> s.getAverage()));
//                    datas.add(student);
//                    studentInfo.remove(student.getName());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        private void printInfo(){

        }
    }

    public void run(){
        InnerClass innerClass = new InnerClass();
        innerClass.loadObjectFromFile();
        innerClass.rearrangeData();
        innerClass.printInfo();
    }
}
