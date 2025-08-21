package BookMarketProject.com.market.common;

public enum MenuText {
    WELCOME_MENT1("Welcome to Shopping Mall"),
    WELCOME_MENT2("Welcome to Book Market"),
    MENU_LINE("*".repeat(40)),
    MENU1("1. 고객 정보 확인하기"),
    MENU2("2. 장바구니 상품 목록 보기"),
    MENU3("3. 장바구니 비우기"),
    MENU4("4. 장바구니에 항목 추가하기"),
    MENU5("5. 장바구니의 항목수량 줄이기"),
    MENU6("6. 장바구니의 항목 삭제하기"),
    MENU7("7. 영수증 표시하기"),
    MENU8("8. 종료"),
    MENU9("9. 관리자 로그인"),

    CART("장바구니 상품 목록 : "),
    BOOKID("도서ID"),
    QUANTITY("수량"),
    TOTAL("합계"),

    INPUT_NAME("당신의 이름을 입력하세요 : "),
    INPUT_PHONE("연락처를 입력하세요 : "),
    MENU_NUM("메뉴 번호를 선택해주세요: "),
    USER("현재 고객 정보 : "),
    NAME("이름 : "),
    PHONE("  연락처 : "),

    CART_CLEAR("장바구니의 모든 항목을 삭제하겠습니까? Y | N "),
    CLEAR_MSG("장바구니의 모든 항목을 삭제했습니다."),
    CANCEL_MSG("작업을 취소합니다.");

    private final String text;

    MenuText (String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
