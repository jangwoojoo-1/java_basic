package java_advanced_01.day14.generic;

public class Box extends Object{
    //Box에 넣을 내용물 content 필드 선언\
    //Object 타입은 모든 클래스의 최상위 부모 클래스이므로 프로모션이 됨
    // 즉, 모든 객체는 부모 타입인 Object로 자동 타입 변환할 수 있음.
    //content는 어떤 객체든 대입이 가능
    public Object content;

    public static void main(String[] args) {
        Box box = new Box();
        box.content = "바비인형";
        box.content = 100;
        box.content = 100.0001;
        //그러나 Box 안의 content를 얻을 때 문제 발생
        //content는 Object 타입이므로 어떤 객체가 대입되었는지 확실하게 알 수 없음

        //이 때는 instanceof를 이용하여 타입조사를 할 수 있지만
        //타입을 모두 다 조사할 수는 없다.

        //제네릭을 통해 이 문제 해결 가능
    }
}


