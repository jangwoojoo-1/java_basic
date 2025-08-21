package BookMarketProject.com.market.common;

import BookMarketProject.com.market.exception.WrongInputException;

public class ValidCheck {
    private static final String MENU_NUM = "^[1-9]$";

    public void isMenuValid(String menuNum) throws WrongInputException {
        if(!(menuNum.matches(MENU_NUM))){
            throw new WrongInputException("잘못된 입력입니다.");
        }
    }
}
