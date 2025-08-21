package BookMarketProject.com.market.member;

import lombok.Getter;

@Getter
public class Admin extends Person{
    private String id = "Admin";
    private String password = "Admin1234";

    public Admin(String name, String phone){
        super(name, phone); //Person 생성자 호출
    }
}
