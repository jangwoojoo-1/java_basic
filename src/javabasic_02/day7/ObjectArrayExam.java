package javabasic_02.day7;

public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] movieList = new Movie[3];

        movieList[0] = new Movie();
        movieList[1] = new Movie();
        movieList[2] = new Movie();

        movieList[0].title = "아바타";
        movieList[1].title = "아이언맨";
        movieList[2].title = "베트맨";

        for (Movie movie : movieList) {
            System.out.println(movie.title);
        }
    }
}
