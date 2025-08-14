package java_advanced_01.day15.board;

import java.util.Date;

public class Board {
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;

    public Board (){}

    public int getBno() {
        return bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public String getBwriter() {
        return bwriter;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    @Override
    public String toString() {
        return "Board{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bwriter='" + bwriter + '\'' +
                ", bdate=" + bdate +
                '}';
    }
}
