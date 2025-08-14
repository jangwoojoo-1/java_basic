package java_advanced_01.day15.board;

import java.util.ArrayList;

public class BoardExample <T> {
    BoardExample(){}
    ArrayList<T> boards = new ArrayList<>();

    //게시물 목록 출력 메서드
    public void list(){
        System.out.println("""
                ------------------------------------------------------
                no \twriter \t date \ttitle
                ------------------------------------------------------
                """);
        for (T board : boards) {
            System.out.printf("%d \t%s \t%s %");
        }
    }
}
