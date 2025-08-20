package board_project.board01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardExample {
    ArrayList<Board> boards = new ArrayList<>();  //(Board)글이 등록(저장)  공간 => 게시판
    Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    BoardExample(){}

    //게시물 목록 출력 메서드
    public void list(){

            System.out.print("""
                ------------------------------------------------------
                no \t writer \t date \t\t\t title
                ------------------------------------------------------
                """);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
            for (int i = boards.size() -1; i >= 0; i--) {
                Board board = boards.get(i);
                String date = dateFormat.format(board.getBdate());
                System.out.printf("%d \t %s \t\t %s \t %s \n",
                        board.getBno(), board.getBwriter(), date,
                        board.getBtitle());
            }
            System.out.println("------------------------------------------------------");
            mainMenu();

    }

    public void mainMenu(){
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
        try{
            int n = sc.nextInt();
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
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요.");
        } catch (InputMismatchException e) {
            System.out.println("숫자를 제대로 입력해주세요.");
        }
    }

    public void create(){
        System.out.println("\n[새 게시물 입력]");
        System.out.print("제목: ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.print("내용: ");
        String content = sc.nextLine();
        System.out.print("작성자: ");
        String writer = sc.nextLine();
        System.out.println("------------------------------------------------------");

        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        try{
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    Date date = new Date();
                    boards.add(new Board((boards.size()+1), title, content, writer, date));
                    break;
                case 2:
                    System.out.println("작업을 취소합니다.");
                    break;
                default:
                    System.out.println("숫자 1 또는 2를 입력해주세요.");
            }
        } catch (NumberFormatException e){
            System.out.println("숫자를 입력해주세요.");
        } catch (InputMismatchException e) {
            System.out.println("숫자를 제대로 입력해주세요.");
        }
    }

    public void read(){
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        try {
            int no = sc.nextInt();
            System.out.println("#############");
            System.out.println(boards.get(no-1).toString());
            System.out.println("#############");
            change(no);
        } catch (NumberFormatException e){
            System.out.println("숫자를 입력해주세요.");
        } catch (InputMismatchException e) {
            System.out.println("숫자를 제대로 입력해주세요.");
        }
    }

    public void change(int no){
        System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
        System.out.print("메뉴 선택: ");
        try{
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    update(no);
                    break;
                case 2:
                    delete(no);
                    break;
                case 3:
                   // List(no);
            }
        } catch (NumberFormatException e){
            System.out.println("숫자를 입력해주세요.");
        } catch (InputMismatchException e) {
            System.out.println("숫자를 제대로 입력해주세요.");
        }
    }

    public void clear(){
        System.out.println("\n[게시물 전체 삭제]");
        System.out.println("------------------------------------------------------");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        try{
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    boards.clear();
                    break;
                case 2:
                    System.out.println("작업을 취소합니다.");
                    break;
                default:
                    System.out.println("숫자 1 또는 2를 입력해주세요.");
            };
        } catch (NumberFormatException e){
            System.out.println("숫자를 입력해주세요.");
        } catch (InputMismatchException e) {
            System.out.println("숫자를 제대로 입력해주세요.");
        }
    }

    public void exit(){
        loop = false;
    }

    public void update(int no){
        System.out.println("\n[수정 내용 입력]");
        System.out.print("제목: ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.print("내용: ");
        String content = sc.nextLine();
        System.out.print("작성자: ");
        String writer = sc.nextLine();
        System.out.println("------------------------------------------------------");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        try{
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    Date date = new Date();
                    boards.get(no-1).setBtitle(title);
                    boards.get(no-1).setBcontent(content);
                    boards.get(no-1).setBwriter(writer);
                    break;
                case 2:
                    System.out.println("작업을 취소합니다.");
                    break;
                default:
                    System.out.println("숫자 1 또는 2를 입력해주세요.");
            };
        } catch (NumberFormatException e){
            System.out.println("숫자를 입력해주세요.");
        } catch (InputMismatchException e) {
            System.out.println("숫자를 제대로 입력해주세요.");
        }
    }

    public void delete(int no){
        boards.remove(no-1);
    }

    public static void main(String[] args) {
        BoardExample boardExample = new BoardExample();
        while(loop){
            boardExample.list();
        }
    }
}
