package javabasic_02.day7;

public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.title = "아바타";
        m1.releaseDate = "2022.12.14";
        m1.mainActor = "제이크 설리";
        m1.genre = "액션";
        m1.runTime = 192;
        m1.ageLimit = 12;

        Movie[] movieList = new Movie[10];
        movieList[0] = m1;

        System.out.println("영화제목 : " + movieList[0].title);
        System.out.println("개봉일 : " + movieList[0].releaseDate);
        System.out.println("주인공 : " + movieList[0].mainActor);
        System.out.println("장르 : " + movieList[0].genre);
        System.out.println("러닝타임 : " + movieList[0].runTime);
        System.out.println("등급 : " + movieList[0].ageLimit + "세");
    }
}
