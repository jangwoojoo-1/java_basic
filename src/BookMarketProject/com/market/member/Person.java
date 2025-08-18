package BookMarketProject.com.market.member;

public class Person {
    //private 변수 선언
    private String userName;
    private String userMobile;
    private String address;

    //생성자1 이름과 연락처만
    public Person(String name, String phone){
        this.userName = name;
        this.userMobile = phone;
    }

    //생성자2 이름 + 연락처 + 주소
    public Person(String name, String phone, String address){
        this.userName = name;
        this.userMobile = phone;
        this.address = address;
    }

    // 값을 반환하는 메서드들
    public String getUserName() {
        return userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public String getAddress() {
        return address;
    }

    //값을 설정하는 메서드들
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
