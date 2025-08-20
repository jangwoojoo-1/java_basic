package board_project.board02;

import java.util.LinkedHashMap;
import java.util.Map;

public class BoardManager {
    private Map<String,Board> boardMap = new LinkedHashMap<>();


    //Singletone pattern 을 적용하여 어드민계정은 하나이다. 어드민 계정은 게시글 저장소를 관리한다.
    private static BoardManager boardMangerSingleton = new BoardManager();

    public static BoardManager getInstance() {
        return boardMangerSingleton;
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }

    public static BoardManager getBoardMangerSingleton() {
        return boardMangerSingleton;
    }

    public static void setBoardMangerSingleton(BoardManager boardMangerSingleton) {
        BoardManager.boardMangerSingleton = boardMangerSingleton;
    }
}
