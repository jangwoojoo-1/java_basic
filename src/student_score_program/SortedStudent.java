package student_score_program;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SortedStudent {
    Map<String, Student> studentInfo = null;
    Set<Student> sortedStudents = null;

    class InnerClass {
        private void loadObjectFromFile() {
            try (ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("C:/Temp/student.dat"))) {
                if (ois.readObject() instanceof HashMap) {
                    studentInfo = (HashMap<String, Student>) ois.readObject();
                } else {
                    System.out.println("타입 오류 발생");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        private void createTreeeSet() {
            sortedStudents = new TreeSet<Student>(Comparator.comparing(Student::getAverage).thenComparing(Student::getName));
            studentInfo.entrySet().stream().map(Map.Entry::getValue).forEach(sortedStudents::add);
        }

        private void printResult() {
            System.out.println("[정렬 및 저장: 평균 오름차순]");
            System.out.println("불러온 학생 수: " + studentInfo.size());
            System.out.println("정렬 규칙: 평균 ASC, 평균 동률이면 이름 사전순 ASC \n");
            System.out.println("저장 대상(미리보기 상위 10명): ");
            //limit 개수 제한
            sortedStudents.stream().limit(10)
                    .forEach(s -> System.out.println("- " + s.getName() + "(평균 " + String.format("%.1f", s.getAverage()) + ")"));
            System.out.println();
        }

        private void outputObject(){
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Temp/orderByAvg.dat"))){
                oos.writeObject(sortedStudents);
                System.out.println("결과 파일: C:/Temp/orderByAvg.dat");
                System.out.println("[완료] 정렬된 결과를 파일로 저장했습니다.");
            } catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void run(){
        InnerClass innerClass = new InnerClass();
        innerClass.loadObjectFromFile();
        innerClass.createTreeeSet();
        innerClass.printResult();
        innerClass.outputObject();
    }

}
