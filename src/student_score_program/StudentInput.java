package student_score_program;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentInput {
    // 자료구조 객체 생성
    File file = new File("C:/Temp/student.dat");
    Map<String, Student> studentInfo = new HashMap<>();

    public StudentInput() {
        InnerClass innerClass = new InnerClass();
    }

//    public void inputStudent(){
//        BufferedReader br = new BufferedReader(Files.newInputStream(System.in));
//    }

    class InnerClass {
        private void loadCheck(){
            if(!file.exists()){
                file.mkdir();
            }
        }

        private void printUsage() {
            System.out.println("[학생 성적 입력 프로그램");
            System.out.println("- 종료하려면 이름에 ^^ 를 입력하세요.");
            System.out.println("- 점수는 0~100 사이의 정수만 허용됩니다. \n");
        }

        private void checkKeyAndInputData(Student student) {
            if(studentInfo.entrySet().stream()
                    .anyMatch(s -> s.getKey().equals(student.getName()))){
                System.out.println("[오류] 이미 존재하는 이름입니다. 다른 이름을 입력하세요.");
            } else {
                if(student.getRecord().stream()
                        .allMatch(s -> Integer.toString(s).matches("^[1-100]*"))) {
                    student.setTotal(student.getRecord().stream().mapToInt(s -> Integer.valueOf(s)).sum());
                    student.setAverage((float)student.getRecord().stream().mapToInt(s->Integer.valueOf(s)).average().getAsDouble());
                    if(student.getTotal() >= 90) student.setGrade("A");
                    if(student.getTotal() >= 80) student.setGrade("B");
                    if(student.getTotal() >= 70) student.setGrade("C");
                    if(student.getTotal() >= 60) student.setGrade("D");
                    if(student.getTotal() < 60) student.setGrade("F");
                    studentInfo.put(student.getName(), student);
                } else{
                    System.out.println("점수 입력이 잘못되었습니다.");
                }
            }
        }

        private void saveData(){
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
                oos.writeObject(studentInfo);
            } catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
