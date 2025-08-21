package board_project.board03;

import board_project.board03.BoardManager;
import board_project.board03.common.BoardText;
import board_project.board03.common.ValidCheck;
import board_project.board03.exception.BoardException;
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
            Scanner sc = new Scanner(System.in);
            String menuNum = sc.nextLine();
            try{
                validCheck.isMenuValid(menuNum);
                switch (menuNum) {
                    case "1" -> create();
                    case "2" -> read();
                    case "3" -> clear();
                    case "4" -> exit();
                }
            } catch (BoardException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void create() throws BoardException{
        Scanner sc = new Scanner(System.in);
        System.out.println(BoardText.CREATE.getText());
        System.out.print(BoardText.TITLE.getText());
        String title = sc.nextLine();
        System.out.print(BoardText.BOARD.getText());
        String content = sc.nextLine();
        System.out.print(BoardText.WRITER.getText());
        String author = sc.nextLine();

        if(checkMenu()){
            Board board = Board.builder()
                    .bno(size)
                    .author(author)
                    .title(title)
                    .content(content)
                    .date(new Date())
                    .build();
            Map<String, Board> boardMap = boardManager.getBoardMap();
            boardMap.put(String.valueOf(size), board);
            boardManager.setBoardMap(boardMap);
            size++;
        }
    }

    public boolean checkMenu() throws BoardException{
        Scanner sc = new Scanner(System.in);
        System.out.print(BoardText.CHECK_MENU.getText());
        while(true){
            String inputNumber = sc.nextLine();
            validCheck.isCheckMenuValid(inputNumber);
            return inputNumber.equals("1");
        }
    }

    private void exit() {
        System.out.println(BoardText.EXIT.getText());
        System.exit(0);
    }

    public void read() throws BoardException {
        Scanner input = new Scanner(System.in);
        System.out.println(BoardText.READ.getText());
        System.out.print(BoardText.READ_NUMBER.getText());
        String number = input.nextLine();
        validCheck.isValidBoardNumber(number, boardManager.getBoardSize());

        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println(BoardText.READ_LINE.getText());
        Board board = boardMap.get(number);

        System.out.println(BoardText.BNO.getText() + board.getBno());
        System.out.println(BoardText.TITLE.getText() + board.getTitle());
        System.out.println(BoardText.BOARD.getText() + board.getContent());
        System.out.println(BoardText.WRITER.getText() + board.getAuthor());
        System.out.println(BoardText.DATE.getText() + dateFormat.format(board.getDate()));
        System.out.println(BoardText.READ_LINE.getText());
        readOption(Integer.parseInt(number));
    }

    /*
        readOption(): 읽기 메서드의 옵션 메서드
     */
    public void readOption(int bno) throws BoardException{
        Scanner input = new Scanner(System.in);
        System.out.print(BoardText.READ_CHECK_MENU.getText());
        String numberInput = input.nextLine();
        validCheck.isReadOptionMenuValid(numberInput);
        switch(numberInput) {
            case "1" -> update(bno);
            case "2" -> delete(bno);
            case "3" -> run();
        }
    }

    /*
        read의 옵션 update
     */
    public void update(int bno) throws BoardException{
        Scanner input = new Scanner(System.in);
        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println(BoardText.UPDATE.getText());
        System.out.print(BoardText.TITLE.getText());
        String title = input.nextLine();
        System.out.print(BoardText.BOARD.getText());
        String content = input.nextLine();
        System.out.print(BoardText.WRITER.getText());
        String author = input.nextLine();
        System.out.println(BoardText.BOARD_LINE.getText());

        Board board = Board.builder()
                .title(title)
                .content(content)
                .author(author)
                .date(new Date())
                .build();

        if (checkMenu()) {
            boardMap.replace(String.valueOf(bno), board);
            boardMap.get(String.valueOf(bno)).setBno(bno);
            boardManager.setBoardMap(boardMap);
        }

    }

    /*
        read의 옵션 delete
     */
    public void delete(int bno) {
        int num = 1;
        size--;
        Map<String, Board> boardMap = boardManager.getBoardMap();
        Map<String, Board> newBoardMap = new LinkedHashMap<>();
        for (Entry<String, Board> entry : boardMap.entrySet()) {
            String key = entry.getKey();
            Board board = entry.getValue();
            if (key.equals(String.valueOf(bno))) {
                continue;
            } else if (Integer.parseInt(key) < bno) {
                newBoardMap.put(key, board);
                num++;
            } else {
                newBoardMap.put(String.valueOf(num), board);
                board.setBno(num);
                num++;
            }
        }
        boardManager.setBoardMap(newBoardMap);
    }

    /*
        게시판 내용 전체 삭제
     */
    public void clear() {
        boardManager.setBoardMap(new LinkedHashMap<>());
        size = 1;
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
            Board value = entry.getValue();
            System.out.printf("%-4d %-20s %-20s %-20s\n", value.getBno(), value.getAuthor(), dateFormat.format(value.getDate()), value.getTitle());
        });
        System.out.println(BoardText.BOARD_LINE.getText());

        mainMenu();
    }

    public void mainMenu(){
        System.out.print(BoardText.MAIN_MENU.getText());
    }
}
