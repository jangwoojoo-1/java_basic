package BookMarketProject.com.market.cart;

import BookMarketProject.com.market.bookitem.Book;

public class CartItem {
    //private String[] itemBook = new String[7]; //책 정보 배열
    private Book itemBook;
    private String bookID; //책 개인키
    private int quantity; //책 수량
    private int totalPrice; //장바구니 가격

    //생성자1
    private CartItem(){}

    //생성자2
    public CartItem(Book bookList){
        this.itemBook = bookList;
        this.bookID = bookList.getBookId();
        this.quantity = 1;
        updateTotalPrice();
    }

    // 값 반환 메서드들
    public Book getItemBook() {
        return itemBook;
    }

    public String getBookID() {
        return bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    //값 설정 메서드들
    public void setItemBook(Book itemBook) {
        this.itemBook = itemBook;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
        this.updateTotalPrice();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.updateTotalPrice();
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }

    public void updateTotalPrice(){
        totalPrice = this.itemBook.getUnitPrice() * this.quantity;
    }
}
