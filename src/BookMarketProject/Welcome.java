package BookMarketProject;

import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

        //이름 전화번호 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String userMobile = sc.nextLine();

        //메뉴 번호 구별 변수
        int menu_num = 0;

        // 메뉴판 만들기
        while (menu_num != 8){
            String divLine = "*******************************************************";
            String welcomeMent1 = "Welcome to Shopping Mall";
            String welcomeMent2 = "Welcome to Book Market";

            System.out.printf("%s\n", divLine);
            System.out.printf("        %s\n", welcomeMent1);
            System.out.printf("        %s\n", welcomeMent2);

            menuIntroduction();

            System.out.print("메뉴 번호를 선택해주세요 ");
            menu_num = sc.nextInt();

            switch(menu_num){
                case 1:
                    menuGustInfo(userName, userMobile);
                    break;
                case 2:
                   // System.out.println("장바구니 상품 목록 : ");
                    //menuCartItemList();
                    break;
                case 3:
                   // System.out.println("장바구니 상품 목록 : ");
                    menuCartClear();
                    break;
                case 4:
                    //System.out.println("장바구니 항목 추가: ");
                    menuCartAddItem();
                    break;
                case 5:
                    //System.out.println("장바구니 항목 : ");
                    menuCartRemoveItemCount();
                    break;
                case 6:
                    //System.out.println("장바구니 항목 삭제 : ");
                    menuCartRemoveItem();
                    break;
                case 7:
                    //System.out.println("영수증 표시 : ");
                    menuCartBill();
                    break;
                case 8:
                   // System.out.println("프로그램 종료");
                    menuExit();
                    break;
                default:
                    System.out.println("번호를 잘못 입력했습니다.");
            }
        }
    }

    public static void menuIntroduction(){
        //메뉴판 문자열
        String divLine = "*******************************************************";
        String menu1 = "1. 고객 정보 확인하기";
        String menu2 = "2. 장바구니 상품 목록 보기";
        String menu3 = "3. 장바구니 비우기";
        String menu4 = "4. 장바구니에 항목 추가하기";
        String menu5 = "5. 장바구니의 항목수량 줄이기";
        String menu6 = "6. 장바구니의 항목 삭제하기";
        String menu7 = "7. 영수증 표시하기";
        String menu8 = "8. 종료";

        System.out.printf("%s\n", divLine);
        System.out.printf(" %-20s\t%s \n", menu1, menu4);
        System.out.printf(" %s \t%s \n", menu2, menu5);
        System.out.printf(" %-20s\t%s \n", menu3, menu6);
        System.out.printf(" %-20s\t%s \n", menu7, menu8);
        System.out.printf("%s\n", divLine);
    }

    public static void menuGustInfo(String name, String phone){
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + name + "  연락처 " + phone);
    }

    public static void menuCartItemList(String[][] book){
        System.out.println("2. 장바구니 상품 목록 보기");
    }

    public static void menuCartClear(){
        System.out.println("3. 장바구니 비우기");
    }

    public static void menuCartAddItem(){
        System.out.println("4. 장바구니에 항목 추가하기");
    }

    public static void menuCartRemoveItemCount(){
        System.out.println("5. 장바구니의 항목 수량 줄이기");
    }

    public static void menuCartRemoveItem(){
        System.out.println("6. 장바구니의 항목 삭제하기");
    }

    public static void menuCartBill(){
        System.out.println("7. 영수증 표시하기");
    }
    
    public static void menuExit(){
        System.out.println("8. 프로그램 종료");
    }

    public static void BookList(String[][] book){
        //도서 정보 저장

    }
}
