package board_project.board03.exception;

import board_project.board03.common.ErrorCode;

public class BoardException extends RuntimeException {
    private ErrorCode errorCode;

    public BoardException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }
}
