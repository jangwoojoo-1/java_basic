package java_advanced_01.day14.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardListMain {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("컬렉션 학습 1일차", "내용 쉽지 않다.", "jjw"));
        list.add(new Board("컬렉션 학습 1일차", "내용 쉽지 않다.", "jjw1"));
        list.add(new Board("컬렉션 학습 1일차", "내용 쉽지 않다.", "jjw2"));
        list.add(new Board("컬렉션 학습 1일차", "내용 쉽지 않다.", "jjw3"));
        list.add(new Board("컬렉션 학습 1일차", "내용 쉽지 않다.", "jjw4"));

        System.out.println("전체 글 수 : " + list.size());

        for (Board board1 : list) {
            System.out.println("제목 : " + board1.getSubject());
            System.out.println("내용 : " + board1.getContent());
            System.out.println("글쓴이 : " + board1.getWriter());

        }

        Board board = list.get(2);
        System.out.println("제목 : " + board.getSubject());
        System.out.println("내용 : " + board.getContent());
        System.out.println("글쓴이 : " + board.getWriter());

        list.remove(2);
    }
}
