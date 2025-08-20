package board_project.board03;

import java_advanced_01.day13.B;

import java.util.LinkedHashMap;
import java.util.Map;

public class BoardManager {
    private static BoardManager boardManagerSingleTone = new BoardManager();
    private static Map<String, Board> boardMap = new LinkedHashMap<>();

    public static BoardManager getInstance() {
        return boardManagerSingleTone;
    }

    public int getBoardSize() {
        return boardMap.size();
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }
}
