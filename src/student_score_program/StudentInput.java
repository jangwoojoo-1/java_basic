package student_score_program;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StudentInput {
    String fileName = "C:/Temp/student.dat";
    // 자료구조 객체 생성
    File file = new File(fileName);
    Map<String, Student> studentInfo = new HashMap<>();

    class InnerClass {
        private void loadCheck(){
            if(!file.exists()){
                file.mkdir();
                saveData();
            }
        }

        private void printUsage() {
            System.out.println("[학생 성적 입력 프로그램");
            System.out.println("- 종료하려면 이름에 ^^ 를 입력하세요.");
            System.out.println("- 점수는 0~100 사이의 정수만 허용됩니다.");
        }

        private void inputInfo() {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
                while (true){
                    System.out.print("\n이름 : ");
                    String name = br.readLine();
                    if(name.equals("^^")) {exit(); break;}
                    Student student = new Student(name);

                    System.out.print("국어: ");
                    student.getRecord().add(Integer.parseInt(br.readLine()));
                    System.out.print("영어: ");
                    student.getRecord().add(Integer.parseInt(br.readLine()));
                    System.out.print("수학: ");
                    student.getRecord().add(Integer.parseInt(br.readLine()));
                    System.out.print("과학: ");
                    student.getRecord().add(Integer.parseInt(br.readLine()));
                    checkKeyAndInputData(student);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void exit(){
            System.out.println("exit");
            System.out.println("입력을 종료합니다.");
            System.out.println("[완료] " + studentInfo.size() + "명의 정보가 " + fileName + " 에 저장되었습니다.");
        }

        private void checkKeyAndInputData(Student student) {
            if(studentInfo.entrySet().stream()
                    .anyMatch(s -> s.getKey().equals(student.getName()))){
                System.out.println("[오류] 이미 존재하는 이름입니다. 다른 이름을 입력하세요.");
            } else {
                if(student.getRecord().stream()
                        .allMatch(s -> s >= 0 && s <= 100)) {
                    student.setTotal(student.getRecord().stream().mapToInt(s -> Integer.valueOf(s)).sum());
                    student.setAverage((float)student.getRecord().stream().mapToInt(s->Integer.valueOf(s)).average().getAsDouble());
                    if(student.getAverage() >= 90) student.setGrade("A");
                    else if(student.getAverage() >= 80) student.setGrade("B");
                    else if(student.getAverage() >= 70) student.setGrade("C");
                    else if(student.getAverage() >= 60) student.setGrade("D");
                    else if(student.getAverage() < 60) student.setGrade("F");

                    studentInfo.put(student.getName(), student);
                    System.out.printf("=> 저장됨: %s (총점=%d, 평균=%.1f, 학점=%s) \n",
                            student.getName(), student.getTotal(), student.getAverage(), student.getGrade());
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

    public void run(){
        InnerClass innerClass = new InnerClass();
        innerClass.loadCheck();
        innerClass.printUsage();
        innerClass.inputInfo();
        innerClass.saveData();
    }
}
