package java_advanced_01.day18.test01;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List<Board> boards = new ArrayList<Board>();

    public BoardDao() {
        boards.add(new Board("제목1", "내용1"));
        boards.add(new Board("제목2", "내용2"));
        boards.add(new Board("제목3", "내용3"));
    }

    public List<Board> getBoardList() {
        return boards;
    }
}
