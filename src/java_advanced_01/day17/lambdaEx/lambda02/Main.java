package java_advanced_01.day17.lambdaEx.lambda02;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(
                ()->{
                    System.out.println("9시까지 출근을 합니다.");
                    System.out.println("12시부터 1시까지 점심시간입니다.");
                    System.out.println("1시부터 5시까지 오후 업무시간입니다.");
                }
        );

        person.action(
                ()->System.out.println("퇴근을 합니다.")
        );


    }
}
