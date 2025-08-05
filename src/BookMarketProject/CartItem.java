package BookMarketProject;

public class CartItem {
    private String[] itemBook = new String[7]; //책 정보 배열
    private String bookID; //책 개인키
    private int quantity; //책 수량
    private int totalPrice; //장바구니 가격

    //생성자1
    private CartItem(){}

    //생성자2
    public CartItem(String[] book){
        this.itemBook = book;
        this.bookID = book[0];
        this.quantity = 1;
        updateTotalPrice();
    }

    // 값 반환 메서드들
    public String[] getItemBook() {
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
    public void setItemBook(String[] itemBook) {
        this.itemBook = itemBook;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void updateTotalPrice(){
        totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
    }
}
