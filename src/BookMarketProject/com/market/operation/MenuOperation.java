package BookMarketProject.com.market.operation;

import BookMarketProject.com.market.common.MenuText;
import BookMarketProject.com.market.exception.CartException;
import BookMarketProject.com.market.exception.WrongInputException;
import BookMarketProject.com.market.main.Welcome;
import BookMarketProject.com.market.bookitem.Book;
import BookMarketProject.com.market.cart.Cart;
import BookMarketProject.com.market.member.Admin;
import BookMarketProject.com.market.member.User;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuOperation {
    private int menuNum; //메뉴 선택 번호 저장 변수
    ArrayList<Book> mBookList = new ArrayList<>(); // 책 리스트
    private Scanner sc = new Scanner(System.in);

    // 생성자
    public MenuOperation() {
    }

    //메뉴 번호 접근 함수 - 값 설정
    public void setMenuNum(int menuNum) {
        this.menuNum = menuNum;
    }

    //메뉴판 출력 함수
    public void menuIntroduction(){
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

    public void run(){

    }

    //operation 함수
    public void menuOp(User user, Cart cart){
        try{ //각 함수에서 던지는 exception 처리
            switch(menuNum){
                case 1:
                    menuGustInfo(user.getUserName(), user.getUserMobile());
                    break;
                case 2:
                    menuCartItemList(cart);
                    break;
                case 3:
                    menuCartClear(cart);
                    break;
                case 4:
                    menuCartAddItem(cart);
                    break;
                case 5:
                    menuCartRemoveItemCount();
                    break;
                case 6:
                    menuCartRemoveItem(cart);
                    break;
                case 7:
                    menuCartBill(user, cart);
                    break;
                case 8:
                    menuExit();
                    break;
                case 9:
                    menuAdminLogin(user);
                    break;
                default:
                    System.out.println("1부터 9까지의 숫자를 입력하세요.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    //고객 정보 출력 함수
    public void menuGustInfo(String name, String phone){
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + name + "  연락처 " + phone);
    }

    // 장바구니 목록 출력 함수
    public void menuCartItemList(Cart cart) throws CartException{
        if(cart.mCartItem.size() == 0) throw new CartException("장바구니에 항목이없습니다.");
        cart.printCart();
    }

    // 장바구니 비우기 함수
    public void menuCartClear(Cart cart) throws CartException, WrongInputException {
        // 장바구니에 항목이 없을 경우 예외 던지기
        if(cart.mCartItem.size() == 0) throw new CartException("장바구니에 항목이 없습니다.");

        //2차 확인
        System.out.println("장바구니의 모든 항목을 삭제하겠습니까? Y | N ");
        String str = sc.nextLine();

        //Y 입력 시 삭제, N 입력 시 작업 취소, 다른 것들 입력시 오류 처리
        switch (str.trim().toUpperCase()){
            case "Y":
                System.out.println("장바구니의 모든 항목을 삭제했습니다.");
                cart.deleteBook();
                break;
            case "N":
                System.out.println("작업을 취소합니다.");
                break;
            default:
                throw new WrongInputException("잘못된 입력입니다.");
        }
    }

    //장바구니에 상품 담기 함수
    public void menuCartAddItem(Cart cart) throws WrongInputException{
        //책 리스트 출력
        bookList();
        cart.printBookList(mBookList);
        boolean loop = true;

        while(loop){
            //도서 입력
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");
            String str = sc.nextLine();

            //람다식을 활용한 도서리스트에서 도서 찾기
            //있으면 book객체 반환, 없으면 null 반환
            Book findBook = mBookList.stream().filter(book->book.getBookId().equals(str)).findFirst().orElse(null);

            //도서가 있으면
            if(findBook != null){
                System.out.println("장바구니에 추가하겠습니까? Y | N ");
                String str1 = sc.nextLine();

                //Y 입력 시 삭제, N 입력 시 작업 취소, 다른 것들 입력시 오류 처리
                switch (str1.trim().toUpperCase()){
                    case "Y":
                        System.out.println(findBook.getBookId() + "도서가 장바구니에 입력되었습니다.");
                        if(!cart.isCartInBook(findBook.getBookId()))
                            cart.insertBook(findBook);
                        break;
                    case "N":
                        System.out.println("작업을 취소합니다.");
                        break;
                    default:
                        throw new WrongInputException("잘못된 입력입니다.");
                }
                //loop 종료
                break;
            } else {
                System.out.println("다시 입력해주세요.");
            }
        }
    }

    public void menuCartRemoveItemCount(){
        System.out.println("5. 장바구니의 항목 수량 줄이기");
    }

    public void menuCartRemoveItem(Cart cart) throws CartException, WrongInputException{
        if(cart.mCartItem.size() == 0) throw new CartException("장바구니에 항목이 없습니다.");
        else{
            cart.printCart();
            boolean flag = true;
            while(flag){
                System.out.print("장바구니에서 삭제할 도서의 ID를 입력하세요 : ");
                String str = sc.nextLine();

                //장바구니에서 삭제할 도서 찾기
                int index = cart.mCartItem.indexOf(cart.mCartItem.stream().filter(item->item.getBookID().equals(str)).findFirst().orElse(null));

                if(index != -1){
                    System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N ");
                    String str1 = sc.nextLine();

                    switch (str1.trim().toUpperCase()){
                        case "Y":
                            System.out.println(cart.mCartItem.get(index).getBookID() +
                                    "장바구니에서 도서가 삭제되었습니다.");
                            cart.removeCart(index);
                            break;
                        case "N":
                            System.out.println("작업을 취소합니다.");
                            break;
                        default:
                            throw new WrongInputException("잘못된 입력입니다.");
                    }
                    //loop 종료
                    break;
                } else {
                    System.out.println("다시 입력해주세요.");
                }
            }
        }
    }

    public void menuCartBill(User user, Cart cart) throws CartException{
        if(cart.mCartItem.size() == 0) throw new CartException("장바구니에 항목이 없습니다.");
        else {
            System.out.println("배송받을 분은 고객 정보와 같습니까? Y | N ");
            String str = sc.nextLine();

            if(str.toUpperCase().equals("Y")){
                System.out.println("배송지를 입력해주세요 ");
                String address = sc.nextLine();
                printBill(user.getUserName(), user.getUserMobile(), address, cart);
            } else {
                System.out.print("배송받을 고객명을 입력하세요 ");
                String name = sc.nextLine();
                System.out.println("배송받을 고객의 연락처를 입력하세요 ");
                String phone = sc.nextLine();
                System.out.println("배송받을 고객의 배송지를 입력해주세요 ");
                String address = sc.nextLine();
                printBill(name, phone, address, cart);
            }
        }
    }

    public void printBill(String name, String phone, String address, Cart cart){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println();
        System.out.println("--------------배송받을 고객 정보--------------");
        System.out.println("고객명 : " + name + "  \t\t연락처 : " + phone);
        System.out.println("배송지 : " + address + "t\t발송일 : " + strDate);
        cart.printCart();

        int sum = 0;
        for(int i = 0; i < cart.mCartItem.size() ; i++){
            sum += cart.mCartItem.get(i).getTotalPrice();
        }

        System.out.println("\t\t\t주문 총금액 : " + sum + "원\n");
        System.out.println("---------------------------------------------");
        System.out.println();

    }

    public void menuExit(){
        System.out.println("8. 프로그램 종료");
        Welcome.loop = false;
    }

    public void menuAdminLogin(User user){
        System.out.println("관리자 정보를 입력하세요");
        System.out.print("아이디 : ");
        String adminId = sc.next();
        System.out.print("비밀번호 : ");
        String adminPW = sc.next();

        Admin admin = new Admin(user.getUserName(), user.getUserMobile());
        if(adminId.equals(admin.getId())&&adminPW.equals(admin.getPassword())){
            String[] writeBook = new String[7];
            System.out.println("도서 정보를 추가하겠습니까? Y | N ");
            String str = sc.next();

            if(str.toUpperCase().equals("Y")){
                Date date = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyMMddhhmmss");
                String strDate = formatter.format(date);
                writeBook[0] = "ISBN" + strDate;
                System.out.println("도서ID : " + writeBook[0]);
                String str1 = sc.nextLine();
                System.out.print("도서명 : ");
                writeBook[1] = sc.nextLine();
                System.out.print("가격 : ");
                writeBook[2] = sc.nextLine();
                System.out.print("저자 : ");
                writeBook[3] = sc.nextLine();
                System.out.print("설명 : ");
                writeBook[4] = sc.nextLine();
                System.out.print("분야 : ");
                writeBook[5] = sc.nextLine();
                System.out.print("출판일 : ");
                writeBook[6] = sc.nextLine();
                try {
                    FileWriter fw = new FileWriter("book.txt", true);

                    for(int i = 0; i < 7; i++)fw.write(writeBook[i]+"\n");
                    fw.close();
                    System.out.println("새 도서 정보가 저장되었습니다.");
                }catch (Exception e){
                    System.out.println(e);
                }
            } else {
                System.out.println("이름 "+admin.getUserName() + " 연락처 " + admin.getUserMobile());
                System.out.println("아이디 " + admin.getId() + " 비밀번호 " + admin.getPassword());
            }
        } else{
            System.out.println("관리자 정보가 일치하지 않습니다.");
        }
    }

    public void bookList(){
        setFiletoBookList();
    }

    public void setFiletoBookList() {
        try(FileReader fr = new FileReader("C:/study/java_basic/src/BookMarketProject/com/market/BookMarket/book.txt"); BufferedReader br = new BufferedReader(fr)) {
            String line;

            while ((line = br.readLine()) != null) {
                if(line.contains("ISBN")){
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
        } catch(IOException e){
            System.out.println(e);
        } catch(NumberFormatException e){
            System.out.println(e);
        }
    }

}
