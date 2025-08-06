package javabasic_02.day11.Inheritance.test01.ex01;

public class Movie {
    static String title;
    static String genre;

    void play(){
        System.out.printf("%s(%s) 상영중입니다.\n", title, genre);
    }

    public static void setTitle(String title) {
        Movie.title = title;
    }

    public static void setGenre(String genre) {
        Movie.genre = genre;
    }
}
