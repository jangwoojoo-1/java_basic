package BookMarketProject.com.market.operation;

import BookMarketProject.com.market.cart.CartItem;
import BookMarketProject.com.market.common.ErrorCode;
import BookMarketProject.com.market.common.MenuText;
import BookMarketProject.com.market.common.ValidCheck;
import BookMarketProject.com.market.exception.CartException;
import BookMarketProject.com.market.exception.WrongInputException;
import BookMarketProject.com.market.bookitem.Book;
import BookMarketProject.com.market.cart.Cart;
import BookMarketProject.com.market.member.Admin;
import BookMarketProject.com.market.member.User;
import lombok.NoArgsConstructor;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


@NoArgsConstructor
public class MenuOperation {
    private Cart cart = new Cart();
    private ArrayList<Book> mBookList = new ArrayList<>(); // 책 리스트
    private Scanner sc = new Scanner(System.in);
    private User mUser;
    private boolean loop = true;
    private ValidCheck validCheck = new ValidCheck();

    public void run() {
        String userName = prompt(MenuText.INPUT_NAME.getText());
        String userMobile = prompt(MenuText.INPUT_PHONE.getText());

        mUser = new User(userName, userMobile);

        String menuNum;
        while (loop) {
            try {
                menuIntroduction();
                menuNum = prompt(MenuText.MENU_NUM.getText());
                validCheck.isMenuValid(menuNum);

                menuOp(menuNum);
            } catch (WrongInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //메뉴판 출력 함수
    public void menuIntroduction() {
        System.out.printf("%s\n", MenuText.MENU_LINE.getText());
        System.out.printf("        %s\n", MenuText.WELCOME_MENT1.getText());
        System.out.printf("        %s\n", MenuText.WELCOME_MENT2.getText());
        System.out.printf("%s\n", MenuText.MENU_LINE.getText());
        System.out.printf(" %-15s\t%-15s \n", MenuText.MENU1.getText(), MenuText.MENU4.getText());
        System.out.printf(" %-15s\t%-15s \n", MenuText.MENU2.getText(), MenuText.MENU5.getText());
        System.out.printf(" %-15s\t%-15s \n", MenuText.MENU3.getText(), MenuText.MENU6.getText());
        System.out.printf(" %-15s\t%-15s \n", MenuText.MENU7.getText(), MenuText.MENU8.getText());
        System.out.printf(" %-15s \n", MenuText.MENU9.getText());
        System.out.printf("%s\n", MenuText.MENU_LINE.getText());
    }

    //operation 함수
    public void menuOp(String menuNum) {
        try {
            switch (menuNum) {
                case "1" -> menuGustInfo(mUser);
                case "2" -> menuCartItemList();
                case "3" -> menuCartClear();
                case "4" -> menuCartAddItem();
                case "5" -> menuCartRemoveItemCount();
                case "6" -> menuCartRemoveItem();
                case "7" -> menuCartBill();
                case "8" -> menuExit();
                case "9" -> menuAdminLogin();
            }
        } catch (CartException e) {
            System.out.println(e.getMessage());
        } catch (WrongInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println(ErrorCode.NOT_NUMBER.getText());
        }

    }

    public void menuGustInfo(User user) {
        System.out.println(MenuText.USER.getText());
        System.out.println(MenuText.NAME.getText() + user.getUserName() + MenuText.PHONE.getText() + user.getUserMobile());
    }


    public void menuCartItemList() throws CartException {
        isCartEmpty();
        cart.printCart();
    }


    public void menuCartClear() throws CartException, WrongInputException {
        isCartEmpty();

        String str = prompt2(MenuText.CART_CLEAR.getText());

        validCheck.isOptionValid(str);
        switch (str) {
            case "Y" -> {
                System.out.println(MenuText.CLEAR_MSG.getText());
                cart.deleteBook();
            }
            case "N" -> System.out.println(MenuText.CANCEL_MSG.getText());
        }
    }

    //장바구니에 상품 담기 함수
    public void menuCartAddItem() throws WrongInputException {
        //책 리스트 출력
        bookList();
        cart.printBookList(mBookList);

        while (true) {
            String str = prompt2(MenuText.CART_ADD_ID.getText());

            //람다식을 활용한 도서리스트에서 도서 찾기
            //있으면 book 객체 반환, 없으면 null 반환
            Book findBook = mBookList.stream().filter(book -> book.getBookId().equals(str)).findFirst().orElse(null);

            //도서가 있으면
            if (findBook != null) {
                String str1 = prompt2(MenuText.CART_ADD.getText());

                validCheck.isOptionValid(str1);
                switch (str1) {
                    case "Y" -> {
                        System.out.println(findBook.getBookId() + MenuText.CART_ADD_MSG.getText());
                        if (!cart.isCartInBook(findBook.getBookId())) cart.insertBook(findBook);
                    }
                    case "N" -> System.out.println(MenuText.CANCEL_MSG.getText());
                }
                break;
            } else {
                throw new WrongInputException(ErrorCode.NO_BOOK.getText());
            }
        }
    }

    public void menuCartRemoveItemCount() throws CartException, WrongInputException, NumberFormatException {
        isCartEmpty();
        cart.printCart();

        while (true) {
            String str = prompt2(MenuText.CART_COUNT_ID.getText());
            int index = cart.mCartItem.indexOf(cart.mCartItem.stream().filter(item -> item.getBookID().equals(str)).findFirst().orElse(null));

            if (index != -1) {
                String str1 = prompt2(MenuText.CART_COUNT.getText());
                validCheck.isOptionValid(str1);
                System.out.println(MenuText.MENU_LINE.getText());
                switch (str1) {
                    case "Y" -> {
                        int n = Integer.parseInt(prompt(MenuText.COUNT.getText()));
                        cart.changeBookCount(index, n);
                        System.out.println(MenuText.CART_COUNT_MSG.getText());
                    }
                    case "N" -> System.out.println(MenuText.CANCEL_MSG.getText());
                }
                break;
            } else {
                throw new WrongInputException(ErrorCode.NO_BOOK.getText());
            }
        }

    }


    public void menuCartRemoveItem() throws CartException, WrongInputException {
        isCartEmpty();

        cart.printCart();
        while (true) {
            String str = prompt2(MenuText.CART_DELETE_ID.getText());

            int index = cart.mCartItem.indexOf(cart.mCartItem.stream().filter(item -> item.getBookID().equals(str)).findFirst().orElse(null));

            if (index != -1) {
                String str1 = prompt2(MenuText.CART_DELETE.getText());

                validCheck.isOptionValid(str1);
                switch (str1) {
                    case "Y" -> {
                        System.out.println(cart.mCartItem.get(index).getBookID() + MenuText.CART_DELETE_MSG.getText());
                        cart.removeCart(index);
                    }
                    case "N" -> System.out.println(MenuText.CANCEL_MSG.getText());
                }
                break;
            } else {
                throw new WrongInputException(ErrorCode.NO_BOOK.getText());
            }
        }
    }


    public void menuCartBill() throws CartException, WrongInputException {
        isCartEmpty();
        String str = prompt2(MenuText.USER_CHECK.getText());

        validCheck.isOptionValid(str);
        switch (str) {
            case "Y" -> {
                String address = prompt2(MenuText.ADDRESS_INPUT.getText());
                printBill(mUser.getUserName(), mUser.getUserMobile(), address);
            }
            case "N" -> {
                String name = prompt2(MenuText.NAME_INPUT.getText());
                String phone = prompt2(MenuText.PHONE_INPUT.getText());
                String address = prompt2(MenuText.ADDRESS_INPUT.getText());
                printBill(name, phone, address);
            }
        }
    }

    public void printBill(String name, String phone, String address) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(new Date());
        System.out.println();
        System.out.println(MenuText.USER_LINE.getText());
        System.out.printf("%s%s%s%s \n", MenuText.NAME.getText(), name, MenuText.PHONE.getText(), phone);
        System.out.printf("%s%s%s%s \n", MenuText.ADDRESS.getText(), address, MenuText.SEND_DATE.getText(), strDate);
        System.out.println();

        cart.printCart();

        System.out.printf("%30s%d%s \n", MenuText.CART_TOTAL_PRICE.getText(), cart.mCartItem.stream().mapToInt(CartItem::getTotalPrice).sum(), MenuText.WON.getText());
        System.out.println();
    }

    public void menuExit() {
        System.out.println(MenuText.EXIT.getText());
        loop = false;
    }

    public void menuAdminLogin() throws WrongInputException {
        System.out.println(MenuText.ADMIN.getText());
        String adminId = prompt(MenuText.ID.getText());
        String adminPW = prompt(MenuText.PASSWORD.getText());

        Admin admin = new Admin(mUser.getUserName(), mUser.getUserMobile());
        if (adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
            String str = prompt2(MenuText.ADMIN_ADD.getText());

            validCheck.isOptionValid(str);
            switch (str) {
                case "Y" -> addBook();
                case "N" -> showAdminInfo(admin);
            }
        } else {
            throw new WrongInputException(ErrorCode.ADMIN_WRONG.getText());
        }
    }

    private void addBook() {
        try(FileWriter fw = new FileWriter("book.txt", true)){
            String bookId = generateBookID();
            fw.write(bookId +"\n");
            System.out.println(MenuText.ADMIN_ADD_ID.getText() + bookId);

            fw.write(prompt(MenuText.ADMIN_ADD_NAME.getText()) + "\n");
            fw.write(prompt(MenuText.ADMIN_ADD_PRICE.getText()) + "\n");
            fw.write(prompt(MenuText.ADMIN_ADD_AUTHOR.getText()) + "\n");
            fw.write(prompt(MenuText.ADMIN_ADD_CONTENT.getText()) + "\n");
            fw.write(prompt(MenuText.ADMIN_ADD_CATEGORY.getText()) + "\n");
            fw.write(prompt(MenuText.ADMIN_ADD_RELDATE.getText()) + "\n");

            System.out.println(MenuText.ADMIN_ADD_MSG.getText());
        }catch (Exception e){
            System.out.println();
        }
    }

    private void showAdminInfo(Admin admin) {
        System.out.printf("%s%s%s%s \n", MenuText.NAME.getText(), admin.getUserName(), MenuText.PHONE.getText(), admin.getPassword());
        System.out.printf("%s%s%s%s \n", MenuText.ID.getText(), admin.getId(), MenuText.PASSWORD.getText(), admin.getPassword());
    }

    private String generateBookID() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyMMddHHmmss");
        return "ISBN" + formatter.format(new Date());
    }

    private String prompt(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    private String prompt2(String message) {
        System.out.println(message);
        System.out.print(" : ");
        return sc.nextLine();
    }

    public void bookList() {
        setFileToBookList();
    }

    public void setFileToBookList() {
        try (FileReader fr = new FileReader("C:/study/java_basic/src/BookMarketProject/com/market/BookMarket/book.txt"); BufferedReader br = new BufferedReader(fr)) {
            mBookList.clear();

            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("ISBN")) {
                    String isbn = line;
                    String title = br.readLine();
                    int price = Integer.parseInt(br.readLine());
                    String author = br.readLine();
                    String description = br.readLine();
                    String category = br.readLine();
                    String releaseDate = br.readLine();

                    mBookList.add(new Book(isbn, title, price, author, description, category, releaseDate));
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    public void isCartEmpty() throws CartException {
        if (cart.mCartItem.isEmpty()) throw new CartException(ErrorCode.EMPTY_CART.getText());
    }

}
