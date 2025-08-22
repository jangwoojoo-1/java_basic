package BookMarketProject.com.market.common;

public enum ErrorCode {
    WRONG_MENU_CHOICE("올바르지 않은 메뉴 선택입니다."),
    EMPTY_CART("장바구니에 항목이 없습니다."),
    ADMIN_WRONG("관리자 정보가 일치하지 않습니다."),
    NO_BOOK("입력하신 책을 찾을 수 없습니다."),
    WRONG_INPUT("잘못된 입력입니다.");



    private final String text;

    ErrorCode(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
