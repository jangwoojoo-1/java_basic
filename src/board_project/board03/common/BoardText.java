package board_project.board03.common;

public enum BoardText {
    //상수를 생성자를 통해 text변수에 담아 getText 메서드로 가져오는 방식

    HEADER("\n[게시물 목록]"),
    BOARD_LINE("-".repeat(60)),
    MAIN_MENU("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit \n메뉴 선택: "),
    CREATE("\n[새 게시물 입력]"),
    UPDATE("\n[수정 내용 입력]"),
    READ("\n[게시물 읽기]"),
    EXIT("\n게시판 종료"),
    READ_NUMBER("bno: "),
    BNO("번호: "),
    Title("제목: "),
    BOARD("내용: "),
    WRITER("작성자: "),
    DATE("날짜: "),
    READ_LINE("#".repeat(30)),
    CHECK_MENU("보조 메뉴: 1.OK | 2.Cancel"),
    READ_CHECK_MENU("보조 메뉴: 1.Update | 2.Delete | 3.List");


    private final String text;

    BoardText(String s) {
        this.text = s;
    }

    public String getText() {
        return text;
    }
}
