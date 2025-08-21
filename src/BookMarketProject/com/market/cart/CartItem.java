package BookMarketProject.com.market.cart;

import BookMarketProject.com.market.bookitem.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CartItem {
    private Book itemBook;
    private String bookID; //책 개인키
    private int quantity; //책 수량
    private int totalPrice; //장바구니 가격

    //생성자2
    public CartItem(Book bookList){
        this.itemBook = bookList;
        this.bookID = bookList.getBookId();
        this.quantity = 1;
        updateTotalPrice();
    }

    public void updateTotalPrice(){
        totalPrice = this.itemBook.getUnitPrice() * this.quantity;
    }
}
