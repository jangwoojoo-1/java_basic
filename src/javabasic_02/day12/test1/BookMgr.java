package javabasic_02.day12.test1;

public class BookMgr {
	//책 객체를 여러 개 저장할 수 있는 책 목록 변수
	Book[] booklist;

	//배열 변수 초기화 생성자
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void printBooklist(){
		for (Book book : booklist) {
			System.out.println(book.getTitle());
		}
	}
	
	public void printTotalPrice(){
		int total = 0;
		for (Book book : booklist) {
			total += book.getPrice();
		}
		System.out.println("전체 책 가격의 합 : " + total);
	}
}
