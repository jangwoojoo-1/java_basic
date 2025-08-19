package BookMarketProject.com.market.cart;

import BookMarketProject.com.market.bookitem.Book;

import java.util.ArrayList;

public class Cart implements CartInterface{
    public ArrayList<CartItem> mCartItem = new ArrayList<>();
    public static int mCartCount = 0;

    public Cart(){}

    @Override
    public void printBookList(ArrayList<Book> p) {
        for (int i = 0; i < p.size(); i++) {
            Book book = p.get(i);
            System.out.print(book.getBookId() + " | ");
            System.out.print(book.getName() + " | ");
            System.out.print(book.getUnitPrice() + " | ");
            System.out.print(book.getAuthor() + " | ");
            System.out.print(book.getDescription() + " | ");
            System.out.print(book.getCategory() + " | ");
            System.out.println(book.getReleaseDate());
        }
    }

    @Override
    public boolean isCartInBook(String id) {//이미 장바구니 안에 책 있을 때 수량 플러스
        boolean flag = false;
        for(int i = 0 ; i < mCartCount ; i++){
            CartItem book = mCartItem.get(i);
            if(id.equals(book.getBookID())){
                book.setQuantity(book.getQuantity()+1);
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public void insertBook(Book p) {
        mCartItem.add(new CartItem(p));
        mCartCount++;
    }

    @Override
    public void removeCart(int numId) { //장바구니 항목 삭제
        mCartItem.remove(numId);
        mCartCount--;
    }

    @Override
    public void deleteBook() { //장바구니 비우기
        mCartItem.clear();
        mCartCount = 0;
    }

    public void printCart(){
        System.out.println("장바구니 상품 목록 : ");
        System.out.println("------------------------------------------");
        System.out.println("   도서ID \t |    수량 \t |    합계");
        for(int i = 0 ; i < mCartCount ; i++){
            System.out.print("   " + mCartItem.get(i).getBookID() + " \t | ");
            System.out.print("   " + mCartItem.get(i).getQuantity() + " \t | ");
            System.out.println("   " + mCartItem.get(i).getTotalPrice());
        }
        System.out.println("------------------------------------------");
    }
}
