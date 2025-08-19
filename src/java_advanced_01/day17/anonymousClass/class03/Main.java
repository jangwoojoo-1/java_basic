package java_advanced_01.day17.anonymousClass.class03;


class Animal {
    public String eat(){
        return "맛있게 먹었습니다.";
    }
}

public class Main {
    public static void main(String[] args) {
        //익명 클래스 : 클래스의 정의와 객체화를 동시, 일회성 객체 사용
        Animal dog = new Animal(){
            public String eat() {
                String run = run();
                return "강아지 멍멍" + run;
            }
            public String run() {
                return "강아지가 뛴다.";
            }
        };

        String eat = dog.eat();
    }
}
