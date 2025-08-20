package board_project.board03.common;

public enum ErrorCode {
    INVALID_MENU_OPTION("잘못된 메뉴 번호입니다. [1-4]번 다시 입력하세요"),
    INVALID_CHECK_OPTION("잘못된 번호입니다. [1 or 2]번을 입력하세요"),
    INVALID_CHECK_READ_OPTION("잘못된 번호입니다. [1-3]번 다시 입력하세요"),
    INVALID_CHECK_NUMBER("게시판 숫자 번호를 입력하세요!"),
    INVALID_BOARD_NUMBER("해당 게시물은 존재하지 않습니다."),
    INVALID_EMPTY("게시물 번호를 입력하세요.");

    private String msg;

    ErrorCode(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
