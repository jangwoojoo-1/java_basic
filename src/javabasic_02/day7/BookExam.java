package javabasic_02.day7;

public class BookExam {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.title = "삼국지";
        b1.author = "나관중";
        b1.company = "알에이치코리아";
        b1.price = 16200;
        b1.isbn = "8925568799";
        b1.page = 364;

        System.out.printf("%s의 가격은 %d이고 저자는 %s입니다.", b1.title, b1.price, b1.author);
    }
}
