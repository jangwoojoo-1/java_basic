package BookMarketProject.com.market.operation;

import BookMarketProject.com.market.exception.CartException;
import BookMarketProject.com.market.main.Welcome;
import BookMarketProject.com.market.bookitem.Book;
import BookMarketProject.com.market.cart.Cart;
import BookMarketProject.com.market.member.Admin;
import BookMarketProject.com.market.member.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuOperation {
    private int menuNum;

    ArrayList<Book> mBookList;
//    int mTotalBook = 0;
    private Scanner sc = new Scanner(System.in);


    // 생성자
    public MenuOperation() {
//        mTotalBook = totalFiletoBookList();
        mBookList = new ArrayList<>();
        bookList(mBookList);
    }

    public int getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(int menuNum) {
        this.menuNum = menuNum;
    }

    public void menuIntroduction(){
        //메뉴판 문자열
        String divLine = "*******************************************************";
        String welcomeMent1 = "Welcome to Shopping Mall";
        String welcomeMent2 = "Welcome to Book Market";
        String menu1 = "1. 고객 정보 확인하기";
        String menu2 = "2. 장바구니 상품 목록 보기";
        String menu3 = "3. 장바구니 비우기";
        String menu4 = "4. 장바구니에 항목 추가하기";
        String menu5 = "5. 장바구니의 항목수량 줄이기";
        String menu6 = "6. 장바구니의 항목 삭제하기";
        String menu7 = "7. 영수증 표시하기";
        String menu8 = "8. 종료";
        String menu9 = "9. 관리자 로그인";

        System.out.printf("%s\n", divLine);
        System.out.printf("        %s\n", welcomeMent1);
        System.out.printf("        %s\n", welcomeMent2);
        System.out.printf("%s\n", divLine);
        System.out.printf(" %-20s\t%s \n", menu1, menu4);
        System.out.printf(" %s \t%s \n", menu2, menu5);
        System.out.printf(" %-20s\t%s \n", menu3, menu6);
        System.out.printf(" %-20s\t%s \n", menu7, menu8);
        System.out.printf(" %-20s \n", menu9);
        System.out.printf("%s\n", divLine);
    }

    public void menuOp(User user, Cart cart){
        try{
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

    public void menuGustInfo(String name, String phone){
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + name + "  연락처 " + phone);
    }

    public void menuCartItemList(Cart cart){
        if(cart.mCartCount >= 0){
            cart.printCart();
        }
    }

    public void menuCartClear(Cart cart) throws CartException {
        System.out.println("3. 장바구니 비우기");
        if(cart.mCartCount == 0){
            throw new CartException("장바구니에 항목이 없습니다.");
        } else {
            System.out.println("장바구니의 모든 항목을 삭제하겠습니까? Y | N ");
            String str = sc.nextLine();

            if(str.toUpperCase().equals("Y")){
                System.out.println("장바구니의 모든 항목을 삭제했습니다.");
                cart.deleteBook();
            }
        }
    }

    public void menuCartAddItem(Cart cart){
        System.out.println("4. 장바구니에 항목 추가하기");
        cart.printBookList(mBookList);

        boolean loop = true;

        while(loop){
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");

            String str = sc.nextLine();

            boolean flag = false;
            int numId = -1;

            for(int i = 0 ; i < mBookList.size() ; i++){
                if(str.equals(mBookList.get(i).getBookId())){
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if(flag){
                System.out.println("장바구니에 추가하겠습니까? Y | N ");
                str = sc.nextLine();

                if(str.toUpperCase().equals("Y")){
                    System.out.println(mBookList.get(numId).getBookId() + "도서가 장바구니에 입력되었습니다.");
                    if(!cart.isCartInBook(mBookList.get(numId).getBookId()))
                        cart.insertBook(mBookList.get(numId));
                }

                loop = false;
            } else {
                System.out.println("다시 입력해주세요.");
            }
        }
    }

    public void menuCartRemoveItemCount(){
        System.out.println("5. 장바구니의 항목 수량 줄이기");
    }

    public void menuCartRemoveItem(Cart cart) throws CartException{
        System.out.println("6. 장바구니의 항목 삭제하기");
        if(cart.mCartCount == 0)
            throw new CartException("장바구니에 항목이 없습니다.");
        else{
            cart.printCart();
            boolean flag = true;
            while(flag){
                System.out.print("장바구니에서 삭제할 도서의 ID를 입력하세요 : ");
                String str = sc.nextLine();
                boolean TF = false;
                int numId = -1;

                for(int i = 0; i < cart.mCartCount ; i++){
                    if(str.equals(cart.mCartItem.get(i).getBookID())){
                        numId = i;
                        TF = true;
                        break;
                    }
                }
                if(TF){
                    System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N ");
                    str = sc.nextLine();
                    if(str.toUpperCase().equals("Y")){
                        System.out.println(cart.mCartItem.get(numId).getBookID() +
                                "장바구니에서 도서가 삭제되었습니다.");
                    }
                    cart.removeCart(numId);
                    flag = false;
                } else {
                    System.out.println("다시 입력해주세요.");
                }
            }
        }

    }

    public void menuCartBill(User user, Cart cart) throws CartException{
        if(cart.mCartCount == 0) throw new CartException("장바구니에 항목이 없습니다.");
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
        for(int i = 0; i < cart.mCartCount ; i++){
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

    public void bookList(ArrayList<Book> booklist){
        //도서 정보 저장
        setFiletoBookList(booklist);
    }

//    public int totalFiletoBookList() {
//        try {
//            FileReader fr = new FileReader("book.txt");
//            BufferedReader br = new BufferedReader(fr);
//
//            String str;
//            int num = 0;
//            while ((str = br.readLine()) != null) {
//                if(str.contains("ISBN")){
//                    ++num;
//                }
//            }
//            br.close();
//            fr.close();
//
//            return num;
//        } catch(Exception e){
//            System.out.println(e);
//        }
//        return 0;
//    }

    public void setFiletoBookList(ArrayList<Book> booklist) {
        try {
            FileReader fr = new FileReader("book.txt");
            BufferedReader br = new BufferedReader(fr);

            String str;
            String[] readBook = new String[7];
            int count = 0;

            while ((str = br.readLine()) != null) {
                if(str.contains("ISBN")){
                    readBook[0] = str;
                    readBook[1] = br.readLine();
                    readBook[2] = br.readLine();
                    readBook[3] = br.readLine();
                    readBook[4] = br.readLine();
                    readBook[5] = br.readLine();
                    readBook[6] = br.readLine();
                }
                booklist.add(new Book(readBook[0],readBook[1], Integer.parseInt(readBook[2]),
                        readBook[3], readBook[4], readBook[5], readBook[6]));
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

}
