package BookMarketProject.com.market.member;

public class User extends Person{
    //상속, User 클래스 자식 클래스, 유저 관리용

    public User(String name, String phone){
        super(name, phone);//부모클래스 생성자1 호출
    }

    public User(String username, String phone, String address){
        super(username, phone, address); //부모클래스 생성자2 호출
    }
}
