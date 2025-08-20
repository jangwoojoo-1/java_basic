package board_project.board03;

import board_project.board03.BoardManager;

public class BoardMain {
    public static void main(String[] args) {
        BoardManager boardManager = new BoardManager();
        BoardDAO board = new BoardDAO(boardManager);

        board.run();
    }
}
