package board_project.board02;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BoardExample {
    static Scanner input = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static final String menuNumberRegex = "[1-4]";
    private static final String checkNumber = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    private static int bno = 1;

    BoardManager boardManager;

    public BoardExample(BoardManager boardManager) {
        this.boardManager = boardManager;
    }

    /*
        게시물 목록 출력, mainMenu 메서드 출력
     */

    public void run() {
        while (true) {
            list();
            Scanner input = new Scanner(System.in);
            String inputNumber = input.nextLine();
            if (inputNumber.equals("4")) {
                System.out.println("\n게시판 종료");
                break;
            }
            if (inputNumber.matches(menuNumberRegex)) {
                switch (inputNumber) {
                    case "1":
                        create();
                        break;
                    case "2":
                        read();
                        break;
                    case "3":
                        clear();
                        break;
                }
            } else {
                System.out.println("[1-4]번 번호를 입력하세요.");
            }
        }
    }

    /*
        checkMenu(): 보조 메뉴 확인 선택 메서드
     */
    public boolean checkMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("보조 메뉴: 1.OK | 2. Cancel");
        System.out.print("메뉴 선택: ");
        while (true) {
            String inputNumber = input.nextLine();
            if (inputNumber.matches(checkNumber)) {
                return inputNumber.equals("1");
            } else {
                System.out.println("[1 or 2]번을 입력하세요.");
            }
        }
    }

    /*
        create(): 게시물 생성 메서드
        사용자에게 제목, 내용, 작성자 입력 받고 Board 객체로 만들어 map에 입력
     */
    public void create() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("[새 게시물 입력]");
        System.out.print("제목: ");
        String title = input.nextLine();
        System.out.print("내용: ");
        String content = input.nextLine();
        System.out.print("작성자: ");
        String writer = input.nextLine();
        //1번 입력하면
        if (checkMenu()) {
            Board board = Board.builder()
                    .bno(bno)
                    .bWriter(writer)
                    .bTitle(title)
                    .bContent(content)
                    .bDate(new Date())
                    .build();
            Map<String, Board> boardMap = boardManager.getBoardMap();
            boardMap.put(String.valueOf(bno), board);
            boardManager.setBoardMap(boardMap);
            bno++;
        }
    }

    /*
        read(): 게시물 읽기 메소드
     */
    public void read() {
        System.out.println("\n[게시물 읽기]");
        Scanner input = new Scanner(System.in);
        int numberInput = 0;
        while (true) {

            try {
                System.out.print("bno: ");
                numberInput = input.nextInt();
                if (numberInput < 0 || numberInput > boardManager.getBoardMap().size()) {
                    throw new IllegalArgumentException("해당 게시물은 존재하지 않습니다.");
                } else {
                    Map<String, Board> boardMap = boardManager.getBoardMap();
                    System.out.println("#".repeat(30));
                    Board boardOne = boardMap.get(String.valueOf(numberInput));
                    System.out.println("번호:  " + boardOne.getBno());
                    System.out.println("제목:  " + boardOne.getBTitle());
                    System.out.println("내용:  " + boardOne.getBContent());
                    System.out.println("작성자:  " + boardOne.getBWriter());
                    System.out.println("날짜: " + dateFormat.format(boardOne.getBDate()));
                    //System.out.println(String.format(String.format(boardOne.getBDate().toString())));
                    System.out.println("#".repeat(30));
                    readOption(numberInput);
                    break;
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    /*
        readOption(): 읽기 메서드의 옵션 메서드
     */
    public void readOption(int bno) {
        Scanner input = new Scanner(System.in);
        System.out.println("보조 메뉴: 1.Update | 2. Delete | 3.List");
        System.out.print("메뉴 선택: ");
        while (true) {
            String numberInput = input.nextLine();
            if (numberInput.matches(readOptionRegex)) {
                switch (numberInput) {
                    case "1":
                        update(bno);
                        break;
                    case "2":
                        delete(bno);
                        break;
                    case "3":
                        run();
                        break;
                }
                break;
            } else {
                System.out.println("[1-3]번 중 번호를 선택하세요.");
            }
        }
    }

    /*
        read의 옵션 update
     */
    public void update(int bno) {
        System.out.println("\n수정 내용 입력");
        System.out.print("제목: ");
        String title = input.nextLine();
        System.out.print("내용: ");
        String content = input.nextLine();
        System.out.print("작성자: ");
        String writer = input.nextLine();
        System.out.println("-".repeat(60));
        if (checkMenu()) {
            Board board = boardManager.getBoardMap().get(Integer.toString(bno));
            board.setBTitle(title);
            board.setBContent(content);
            board.setBWriter(writer);
        } else {
            System.out.println("작업을 취소합니다.");
        }
    }

    /*
        read의 옵션 delete
     */
    public void delete(int bno) {
        if (checkMenu()) {
            boardManager.getBoardMap().remove(Integer.toString(bno));
        } else{
            System.out.println("작업을 취소합니다.");
        }
    }

    /*
        게시판 내용 전체 삭제
     */
    public void clear() {
        boardManager.getBoardMap().clear();
    }

    /*
        게시물 출력
     */
    public void list() {
        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println("\n[게시물 목록]");
        System.out.println("-".repeat(60));
        //System.out.println("no\twriter\tdate\ttitle");
        System.out.printf("%-4s %-20s %-20s %-20s\n", "no", "writer", "date", "title");


        List<Entry<String, Board>> entryList = new LinkedList<>(boardMap.entrySet());
        Collections.reverse(entryList);

        entryList.forEach(entry -> {
            Board value = entry.getValue();
            //System.out.println(value.getBno() + "\t" + value.getWriter() + "\t" + dateFormat.format(value.getDate()) + "\t" + value.getTitle());
            System.out.printf("%-4d %-20s %-20s %-20s\n", value.getBno(), value.getBWriter(), dateFormat.format(value.getBDate()), value.getBTitle());
        });
        System.out.println("-".repeat(60));


        mainMenu();
    }

    public void mainMenu() {
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
    }
}
