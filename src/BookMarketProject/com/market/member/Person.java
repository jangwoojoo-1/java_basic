package BookMarketProject.com.market.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String userName;
    private String userMobile;
    private String address;

    public Person(String name, String phone){
        this.userName = name;
        this.userMobile = phone;
    }
}
