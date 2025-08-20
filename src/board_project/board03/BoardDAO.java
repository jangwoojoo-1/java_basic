package board_project.board03;

import board_project.board03.BoardManager;
import board_project.board03.common.BoardText;
import board_project.board03.common.ValidCheck;
import javabasic_02.day11.Inheritance.practice2.E;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

public class BoardDAO {
    private static ValidCheck validCheck = new ValidCheck();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static int size = 1;
    BoardManager boardManager;

    public BoardDAO(BoardManager boardManager) {
        this.boardManager = boardManager;
    }

    public void run(){
        while(true){
            list(); //게시물 출력 + 메뉴 선택창
        }
    }

    public void list(){
        // 삽입 삭제 용이해서
        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println(BoardText.HEADER.getText());
        System.out.println(BoardText.BOARD_LINE.getText());
        System.out.printf("%-4s %-20s %-20s %-20s\n", "no", "writer", "date", "title");

        List<Entry<String, Board>> entryList = new LinkedList<>(boardMap.entrySet());
        Collections.reverse(entryList);

        entryList.forEach(entry -> {

        });
    }
}
