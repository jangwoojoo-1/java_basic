package board_project.board01;

import lombok.Data;

import java.util.Date;

@Data
public class Board{
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;

    public Board (){}

    public Board(int bno, String btitle, String bcontent, String bwriter, Date bdate) {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
        this.bdate = bdate;
    }

    @Override
    public String toString() {
        return "번호: " + bno +
                "\n제목: " + btitle +
                "\n내용: " + bcontent +
                "\n작성자: " + bwriter +
                "\n날짜: " + bdate;
    }
}
