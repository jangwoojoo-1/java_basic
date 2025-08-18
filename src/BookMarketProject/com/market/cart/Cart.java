package BookMarketProject.com.market.cart;

import BookMarketProject.com.market.bookitem.Book;

public class Cart implements CartInterface{
    static final int NUM_BOOK = 3;
    public CartItem[] mCartItem = new CartItem[NUM_BOOK];
    public static int mCartCount = 0;

    public Cart(){}

    @Override
    public void printBookList(Book[] bookList) {
        for (Book book : bookList) {
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
            if(id == mCartItem[i].getBookID()){
                mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
                mCartItem[i].updateTotalPrice();
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public void insertBook(Book p) {
        mCartItem[mCartCount++] = new CartItem(p);
    }

    @Override
    public void removeCart(int numId) { //장바구니 항목 삭제
        CartItem[] cartItem = new CartItem[NUM_BOOK];
        int num = 0;

        for(int i = 0 ; i < mCartCount ; i++){
            if(numId != i){
                cartItem[num++] = mCartItem[i];
            }
        }

        mCartCount = num;
        mCartItem = cartItem;
    }

    @Override
    public void deleteBook() { //장바구니 비우기
        mCartItem = new CartItem[NUM_BOOK];
        mCartCount = 0;
    }

    public void printCart(){
        System.out.println("장바구니 상품 목록 : ");
        System.out.println("------------------------------------------");
        System.out.println("   도서ID \t |    수량 \t |    합계");
        for(int i = 0 ; i < mCartCount ; i++){
            System.out.print("   " + mCartItem[i].getBookID() + " \t | ");
            System.out.print("   " + mCartItem[i].getQuantity() + " \t | ");
            System.out.println("   " + mCartItem[i].getTotalPrice());
        }
        System.out.println("------------------------------------------");
    }
}
