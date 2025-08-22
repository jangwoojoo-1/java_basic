package BookMarketProject.com.market.cart;

import BookMarketProject.com.market.bookitem.Book;
import BookMarketProject.com.market.common.MenuText;

import java.util.ArrayList;

public class Cart implements CartInterface{
    public ArrayList<CartItem> mCartItem = new ArrayList<>();

    public Cart(){}

    @Override
    public void printBookList(ArrayList<Book> p) {
        p.stream().forEach(book -> {
            System.out.print(book.getBookId() + " | ");
            System.out.print(book.getName() + " | ");
            System.out.print(book.getUnitPrice() + " | ");
            System.out.print(book.getAuthor() + " | ");
            System.out.print(book.getDescription() + " | ");
            System.out.print(book.getCategory() + " | ");
            System.out.println(book.getReleaseDate());
        });
    }

    @Override
    public boolean isCartInBook(String id) {//이미 장바구니 안에 책 있을 때 수량 플러스
        return mCartItem.stream().filter(item -> item.getBookID().equals(id)).findFirst().map(item -> {item.setQuantity(item.getQuantity() + 1);return true;}).orElse(false);
    }

    @Override
    public void insertBook(Book p) {
        mCartItem.add(new CartItem(p));
    }

    @Override
    public void removeCart(int numId) { //장바구니 항목 삭제
        mCartItem.remove(numId);
    }

    @Override
    public void deleteBook() { //장바구니 비우기
        mCartItem.clear();
    }

    public void printCart(){
        System.out.println(MenuText.CART.getText());
        System.out.println(MenuText.MENU_LINE.getText());
        System.out.printf("%-15s | %-10s | %-10s \n", MenuText.BOOKID.getText(), MenuText.QUANTITY.getText(), MenuText.TOTAL.getText());
        mCartItem.stream().forEach(cart -> {
            System.out.printf("%-15s | %-10d | %-10d \n", cart.getBookID(), cart.getQuantity(), cart.getTotalPrice());
        });
//        System.out.println(MenuText.MENU_LINE.getText());
    }
}
