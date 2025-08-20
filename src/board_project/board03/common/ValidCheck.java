package board_project.board03.common;

import board_project.board03.exception.BoardException;

public class ValidCheck { //전체적인 유효 검사를 위한 클래스

    private static final String MENU_NUMBER = "^[1-4]$";
    //정규표현식
    // ^ : 문자열의 시작
    // [1-4] : 1, 2, 3, 4 중 하나의 문자
    // $ : 문자열의 끝
    // 의미 -> 문자열 전체가 1~4 중 하나의 숫자 하나로만 이루어져 있을 때만 매칭된다는 것
    private static final String CHECK_MENU_NUMBER = "^[1-2]$";
    private static final String CHECK_NUMBER = "^[0-9]*$";
    // * : 0 개 이상 반복
    // 의미 -> 숫자면 매칭된다는 것
    private static final String READ_OPTION_NUMBER = "^[1-3]$";

    //메인메뉴 번호 입력 검사 [1-4]
    public void isMenuValid(String menu){
        if(!(menu.matches(MENU_NUMBER))){
            throw new BoardException(ErrorCode.INVALID_MENU_OPTION);
        }
    }

    //OK Cancel 유효 검사
    public void isCheckMenuValid(String menu){
        if(!(menu.matches(CHECK_MENU_NUMBER))){
            throw new BoardException(ErrorCode.INVALID_CHECK_OPTION);
        }
    }

    //Read 유효 검사
    public void isValidBoardNumber(String number, int boardSize){
        //read 입력값이 숫자가 아닌 경우
        if(number.isEmpty()){
            throw new BoardException(ErrorCode.INVALID_EMPTY);
        }
        //숫자인지 검사
        if(!number.matches(CHECK_NUMBER)){
            throw new BoardException(ErrorCode.INVALID_CHECK_NUMBER);
        }

        //read 입력 값이 게시판에 존재하지 않는 경우
        int num = Integer.parseInt(number);
        if(num < 1 || num > boardSize){
            throw new BoardException(ErrorCode.INVALID_BOARD_NUMBER);
        }
    }

    public void isReadOptionMenuValid(String number){
        if(!number.matches(READ_OPTION_NUMBER)){
            throw new BoardException(ErrorCode.INVALID_CHECK_READ_OPTION);
        }
    }

}
