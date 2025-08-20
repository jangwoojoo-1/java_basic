package board_project.board02;

public class BoardMain {
    public static void main(String[] args) {
        BoardManager boardManager = new BoardManager();
        BoardExample boards = new BoardExample(boardManager);
//        BoardExample boardExample = new BoardExample();

        boards.run();
    }
}
