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
    ADDRESS("배송지 : "),
    SEND_DATE("  발송일 : "),
    CART_TOTAL_PRICE("주문 총금액 : "),
    WON("원"),

    CART_CLEAR("장바구니의 모든 항목을 삭제하겠습니까? Y | N "),
    CLEAR_MSG("장바구니의 모든 항목을 삭제했습니다."),
    CANCEL_MSG("작업을 취소합니다."),
    CART_ADD_ID("장바구니에 추가할 도서의 ID를 입력하세요 : "),
    CART_ADD("장바구니에 추가하겠습니까? Y | N "),
    CART_ADD_MSG("도서가 장바구니에 입력되었습니다."),
    CART_DELETE_ID("장바구니에서 삭제할 도서의 ID를 입력하세요 : "),
    CART_DELETE("장바구니의 항목을 삭제하겠습니까? Y | N "),
    CART_DELETE_MSG("장바구니에서 도서가 삭제되었습니다."),
    USER_CHECK("배송받을 분은 고객 정보와 같습니까? Y | N "),
    ADDRESS_INPUT("배송지를 입력해주세요 "),
    NAME_INPUT("배송받을 고객명을 입력해주세요 "),
    PHONE_INPUT("연락처를 입력해주세요."),
    USER_LINE("-".repeat(15)+"배송받을 고객 정보"+"-".repeat(15)),
    EXIT("8. 프로그램 종료"),
    ADMIN("관리자 정보를 입력하세요"),
    ID("아이디 : "),
    PASSWORD("비밀번호 : "),
    ADMIN_ADD_ID("도서 ID : "),
    ADMIN_ADD_NAME("도서명 : "),
    ADMIN_ADD_PRICE("가격 : "),
    ADMIN_ADD_AUTHOR("저자 : "),
    ADMIN_ADD_CONTENT("설명 : "),
    ADMIN_ADD_CATEGORY("분야 : "),
    ADMIN_ADD_RELDATE("출판일 : "),
    ADMIN_ADD_MSG("새 도서 정보가 저장되었습니다.");



    private final String text;

    MenuText (String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
