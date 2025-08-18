package BookMarketProject.com.market.operation;

import BookMarketProject.com.market.exception.CartException;
import BookMarketProject.com.market.main.Welcome;
import BookMarketProject.com.market.bookitem.Book;
import BookMarketProject.com.market.cart.Cart;
import BookMarketProject.com.market.member.Admin;
import BookMarketProject.com.market.member.User;
import java_advanced_01.day13.B;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MenuOperation {
    private int menuNum;
    private int mCartCount = 0;
    static final int NUM_BOOK = 3;

    //private String[][] book = new String[NUM_BOOK][NUM_ITEM];
    Book[] mBookList = new Book[NUM_BOOK];
    private Scanner sc = new Scanner(System.in);


    // 생성자
    public MenuOperation(){bookList(mBookList);}

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
//        System.out.println("2. 장바구니 상품 목록 : ");
//        System.out.println("---------------------------------------");
//        System.out.printf("   %-19s \t|   %-4s\t|   %-10s\n", "도서ID", "수량", "합계");
//        for (int i = 0; i < mCartCount; i++) {
//            System.out.printf("   %-19s \t|   %-4s\t|   %-10s\n",
//                    cart.[i].getBookID(), cart[i].getQuantity(), cart[i].getTotalPrice());
//        }
//        System.out.println("---------------------------------------");
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
//        for(int i = 0 ; i < NUM_BOOK ; i++){
//            for(int j = 0 ; j < NUM_ITEM ; j++)
//                System.out.print(book[i][j] + " | ");
//            System.out.println("");
//        }
        cart.printBookList(mBookList);

        boolean loop = true;

        while(loop){
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");

            String str = sc.nextLine();

            boolean flag = false;
            int numId = -1;

            for(int i = 0 ; i < NUM_BOOK ; i++){
                if(str.equals(mBookList[i].getBookId())){
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if(flag){
                System.out.println("장바구니에 추가하겠습니까? Y | N ");
                str = sc.nextLine();

                if(str.toUpperCase().equals("Y")){
                    System.out.println(mBookList[numId].getBookId() + "도서가 장바구니에 입력되었습니다.");
                    if(!cart.isCartInBook(mBookList[numId].getBookId()))
                        cart.insertBook(mBookList[numId]);
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
                    if(str.equals(cart.mCartItem[i].getBookID())){
                        numId = i;
                        TF = true;
                        break;
                    }
                }
                if(TF){
                    System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N ");
                    str = sc.nextLine();
                    if(str.toUpperCase().equals("Y")){
                        System.out.println(cart.mCartItem[numId].getBookID() +
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
        //System.out.println("7. 영수증 표시하기");
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
            sum += cart.mCartItem[i].getTotalPrice();
        }

        System.out.println("\t\t\t주문 총금액 : " + sum + "원\n");
        System.out.println("---------------------------------------------");
        System.out.println();

    }

    public void menuExit(){
        System.out.println("8. 프로그램 종료");
        Welcome.loop = false;
    }

//    public boolean isCartInBook(Cart cart, String bookId) {
//        boolean flag = false;
//        for (int i = 0; i < mCartCount; i++) {
//            if (bookId.equals(cart[i].getBookID())) {
//                cart[i].setQuantity(cart[i].getQuantity() + 1);
//                cart[i].updateTotalPrice();
//                flag = true;
//            }
//        }
//        return flag;
//    }

    public void menuAdminLogin(User user){
        System.out.println("관리자 정보를 입력하세요");
        System.out.print("아이디 : ");
        String adminId = sc.next();
        System.out.print("비밀번호 : ");
        String adminPW = sc.next();

        Admin admin = new Admin(user.getUserName(), user.getUserMobile());
        if(adminId.equals(admin.getId())&&adminPW.equals(admin.getPassword())){
            System.out.println("이름 " + admin.getUserName() + "  연락처 " + admin.getUserMobile());
            System.out.println("아이디 " + admin.getId() + "  비밀번호 " + admin.getPassword());
        } else{
            System.out.println("관리자 정보가 일치하지 않습니다.");
        }
    }

    public void bookList(Book[] booklist){
        //도서 정보 저장
        booklist[0] = new Book("ISBN9791170612759", "가공범", 22000);
        booklist[0].setAuthor("히가시노 게이고");
        booklist[0].setDescription("히가시노 게이고 작가 데뷔 40주년!");
        booklist[0].setCategory("미스터리");
        booklist[0].setReleaseDate("2025/07/21");

        booklist[1] = new Book("ISBN9788936439743", "혼모노",
                18000, "성해나", "무엇이 진짜이고 무엇이 가짜인가. 그 경계에서 혼모노를 묻다.",
                "한국소설", "2025/03/28");

        booklist[2] = new Book("ISBN9791198754080", "다크심리학",
                21900, "다크 사이드 프로젝트", "국내 최초 다크 심리학을 기반한 심리 기술",
                "심리학", "2025/07/31");
    }

    public int totalFiletoBookList(Book[] booklist) {
        try {
            FileReader fr = new FileReader("book.txt");
            BufferedReader br = new BufferedReader(fr);

            String str;
            int num = 0;
            while ((str = br.readLine()) != null) {
                if(str.contains("ISBN")){
                    ++num;
                }
            }
            br.close();
            fr.close();

            return num;
        } catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }

    public void setFiletoBookList(Book[] booklist) {
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
                booklist[count++] = new Book(readBook[0],readBook[1], Integer.parseInt(readBook[2]),
                        readBook[3], readBook[4], readBook[5], readBook[6]);
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

}
