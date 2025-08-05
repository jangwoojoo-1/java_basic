package BookMarketProject;

import java.util.Scanner;

public class MenuOperation {
    private int menuNum;
    private boolean loop = true;

    // 생성자
    MenuOperation(){}

    public int getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(int menuNum) {
        this.menuNum = menuNum;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
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

        System.out.printf("%s\n", divLine);
        System.out.printf("        %s\n", welcomeMent1);
        System.out.printf("        %s\n", welcomeMent2);
        System.out.printf("%s\n", divLine);
        System.out.printf(" %-20s\t%s \n", menu1, menu4);
        System.out.printf(" %s \t%s \n", menu2, menu5);
        System.out.printf(" %-20s\t%s \n", menu3, menu6);
        System.out.printf(" %-20s\t%s \n", menu7, menu8);
        System.out.printf("%s\n", divLine);
    }

    public void menuOp(User user, String[][] book, CartItem[] cart){
        switch(menuNum){
            case 1:
                menuGustInfo(user.getUserName(), user.getUserMobile());
                break;
            case 2:
                menuCartItemList(cart);
                break;
            case 3:
                menuCartClear();
                break;
            case 4:
                menuCartAddItem(book);
                break;
            case 5:
                menuCartRemoveItemCount();
                break;
            case 6:
                menuCartRemoveItem();
                break;
            case 7:
                menuCartBill();
                break;
            case 8:
                menuExit();
                break;
            default:
                System.out.println("1부터 8까지의 숫자를 입력하세요.");
        }
    }

    public void menuGustInfo(String name, String phone){
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + name + "  연락처 " + phone);
    }

    public void menuCartItemList(CartItem[] cart){
        int count = Welcome.mCartCount;
        System.out.println("2. 장바구니 상품 목록 : ");
        System.out.println("---------------------------------------");
        System.out.println("    도서ID \t|     수량 \t|      합계");
        for (int i = 0; i < count; i++) {
            System.out.print("    " + cart[i].getBookID() + " \t| ");
            System.out.print("    " + cart[i].getQuantity() + " \t| ");
            System.out.print("    " + cart[i].getTotalPrice());
            System.out.println("  ");
        }
        System.out.println("---------------------------------------");
    }

    public void menuCartClear(){
        System.out.println("3. 장바구니 비우기");
    }

    public void menuCartAddItem(String[][] book){
        int numBook = Welcome.NUM_BOOK;
        int numItem = Welcome.NUM_ITEM;
        Scanner sc = new Scanner(System.in);
        System.out.println("4. 장바구니에 항목 추가하기");
        for(int i = 0 ; i < numBook ; i++){
            for(int j = 0 ; j < numItem ; j++)
                System.out.print(book[i][j] + " | ");
            System.out.println("");
        }

        boolean loop = true;

        while(loop){
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");

            String str = sc.nextLine();

            boolean flag = false;
            int numId = -1;

            for(int i = 0 ; i < numBook ; i++){
                if(str.equals(book[i][0])){
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if(flag){
                System.out.println("장바구니에 추가하겠습니까? Y | N ");
                str = sc.nextLine();

                if(str.toUpperCase().equals("Y")){
                    System.out.println(book[numId][0] + "도서가 장바구니에 입력되었습니다.");
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

    public void menuCartRemoveItem(){
        System.out.println("6. 장바구니의 항목 삭제하기");
    }

    public void menuCartBill(){
        System.out.println("7. 영수증 표시하기");
    }

    public void menuExit(){
        System.out.println("8. 프로그램 종료");
        loop = false;
    }

    public boolean isLoop() {
        return loop;
    }
}
