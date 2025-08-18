package BookMarketProject.com.market.member;

public class Admin extends Person{
    // Person 자식 클래스, 관리자용

    //관리자 id, 비밀번호 선언
    private String id = "Admin";
    private String password = "Admin1234";

    //생성자
    public Admin(String name, String phone){
        super(name, phone); //Person 생성자 호출
    }

    //관리자 id, 비밀번호 가져오는 메서드들, 바꾸지는 못함
    public String getId(){
        return id;
    }

    public String getPassword(){
        return password;
    }
}
