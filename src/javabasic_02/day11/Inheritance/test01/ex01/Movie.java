package javabasic_02.day11.Inheritance.test01.ex01;

public class Movie {
    private String title;
    private String genre;

    void play(){
        System.out.printf("%s(%s) 상영중입니다.\n", title, genre);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
