package BookMarketProject.com.market.common;

import BookMarketProject.com.market.exception.WrongInputException;

public class ValidCheck {
    private static final String MENU_NUM = "^[1-9]$";
    private static final String MENU_YN = "^[YyNn]$";

    public void isMenuValid(String menuNum) throws WrongInputException {
        if(!(menuNum.matches(MENU_NUM))){
            throw new WrongInputException(ErrorCode.WRONG_MENU_CHOICE.getText());
        }
    }

    public void isOptionValid(String option) throws WrongInputException {
        if(!(option.matches(MENU_YN))){
            throw new WrongInputException(ErrorCode.WRONG_INPUT.getText());
        }
    }
}
