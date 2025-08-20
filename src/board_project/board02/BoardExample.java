package board_project.board02;

import java.text.SimpleDateFormat;
import java.util.*;

//사용자가 현재 게시물목록 읽을 수 있다.
//사용자가 메뉴를 선택하여 글을 생성, 생성한 글을 읽을 수도 있고, 삭제할 수도 있다.
//사용자는 게시판을 프로그램을 종료할 수 있다.
public class BoardExample {
    static Scanner scanner = new Scanner(System.in);   //static 처리 => scanner 객체는 공용객체
    private static final String menuNumberRegex = "[1-4]";
    private static final String checkNumber = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    private static int bno = 1;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    BoardManager boardManager;

    public BoardExample(){}
    public BoardExample(BoardManager boardManger){
        this.boardManager = boardManger;
    }

    // 현재 게시판의 전체 게시물 목록을 출력 기능
    public void list() {
        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println("\n[게시물 목록]");
        System.out.println("-".repeat(60));
        System.out.printf("%-4s %-20s %-20s %-20s\n", "no", "writer", "date", "title");

        //매니저에게 전체 게시물 목록을 요청
        List<Map.Entry<String,Board>> entryList = new LinkedList<>(boardMap.entrySet());
        Collections.reverse(entryList);

        entryList.forEach(entry -> {
            Board value = entry.getValue();
            System.out.printf("%-4s %-20s %-20s %-20s\n", value.getBno(), value.getBWriter(),
                    dateFormat.format(value.getBDate()), value.getBTitle());
        });
        System.out.println("-".repeat(60));

        mainMenu();
    }

    //메인 메뉴
    public void mainMenu() {
        String mainMenu = """
                --------------------------------------------------------
                메인메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit 
                --------------------------------------------------------
                """;
        System.out.println(mainMenu);

    }

    // 게시물 메인 메뉴 선택 기능
    public void run() {
        while (true) {
            list();
            System.out.print("메뉴 선택 : ");
            String input = scanner.nextLine();  //외부에서 사용자가 입력한 데이터타입은 모두 문자열

            if (input.equals("4")) {
                System.out.println("\n게시판 종료");
                break;
            }
            if (input.matches(menuNumberRegex)) {
                switch (input) {
                    case "1":
                        //System.out.println("*** create() 메소드 실행됨");
                        create();
                        break;
                    case "2":
                        System.out.println("*** read() 메소드 실행됨");
                        break;
                    case "3":
                        System.out.println("*** clear() 메소드 실행됨");
                        break;
                }
            } else {
                System.out.println("[1-4]번 번호를 입력하세요");
            }


        }
    }

    //checkMenu() : 보조메뉴 확인, 선택 메서드
    public boolean checkMenu(){
        System.out.println("보조 메뉴 : 1.OK | 2. Cancel");
        System.out.println("메뉴 선택 : ");
        while(true){
            String input = scanner.nextLine();
            if(input.matches(checkNumber)){
                return input.equals("1");
            } else {
                System.out.println("[1 or 2]");
            }
        }
    }

    public void create(){
        System.out.println("\n[새 게시물 입력]");
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("내용: ");
        String content = scanner.nextLine();
        System.out.print("작성자: ");
        String writer = scanner.nextLine();


        //1번 입력
        if(checkMenu()){
            //BoardBuilder를 이용하여 새 글을 생성
            Board board = Board.builder()
                    .bno(bno)
                    .bWriter(writer)
                    .bTitle(title)
                    .bContent(content)
                    .bDate(new Date())
                    .build();
            Map<String,Board> boardMap = boardManager.getBoardMap();
            boardMap.put(String.valueOf(bno), board);
            boardManager.setBoardMap(boardMap);
            bno++;
        }
    }

}
