package java_advanced_01.day17.anonymousClass.class01;


class Animal {
    public String eat(){
        return "맛있게 먹었습니다.";
    }
}

class Dog extends Animal{
    @Override
    public String eat() {
        return "강아지가 냠냠 먹습니다.";
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
    }
}
