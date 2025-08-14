package java_advanced_01.day15.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardExample {
    BoardExample(){}
    ArrayList<Board> boards = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //게시물 목록 출력 메서드
    public void list(){
        System.out.println("""
                ------------------------------------------------------
                no \twriter \t date \ttitle
                ------------------------------------------------------
                """);
        for (Board board : boards) {
            System.out.printf("%d \t%s \t%s %t \n",
                    board.getBno(), board.getBwriter(), board.getBdate(),
                    board.getBtitle());
        }
        System.out.println("------------------------------------------------------");
        mainMenu();
    }

    public void mainMenu(){
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                create();
                break;
            case 2:
                read();
                break;
            case 3:
                clear();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("숫자를 잘못 입력했습니다.");
        }
    }

    public void create(){
        System.out.println("\n[새 게시물 입력]");
        String title = scanner.nextLine();
        String content = scanner.nextLine();
        String writer = scanner.nextLine();
        System.out.println("------------------------------------------------------");

        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        int m = scanner.nextInt();
        if (m == 1) {

        }

    }

    public void read(){
        System.out.println("\n*** read() 메서드 실행됨\n");
    }

    public void clear(){
        System.out.println("\n*** clear() 메서드 실행됨\n");
    }

    public void exit(){
        System.out.println("\n*** exit() 메서드 실행됨\n");
    }


}
