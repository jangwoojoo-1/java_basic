package BookMarketProject;

import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;
    public static Scanner sc = new Scanner(System.in);
    public static boolean loop = true;

    public static void main(String[] args) {
        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

        //이름 전화번호 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String userMobile = sc.nextLine();

        // 메뉴판 만들기
        while (loop){
            String divLine = "*******************************************************";
            String welcomeMent1 = "Welcome to Shopping Mall";
            String welcomeMent2 = "Welcome to Book Market";

            System.out.printf("%s\n", divLine);
            System.out.printf("        %s\n", welcomeMent1);
            System.out.printf("        %s\n", welcomeMent2);

            menuIntroduction();

            System.out.print("메뉴 번호를 선택해주세요 ");
            int menu_num = sc.nextInt();
            sc.nextLine();

            switch(menu_num){
                case 1:
                    menuGustInfo(userName, userMobile);
                    break;
                case 2:
                   // System.out.println("장바구니 상품 목록 : ");
                    menuCartItemList();
                    break;
                case 3:
                   // System.out.println("장바구니 상품 목록 : ");
                    menuCartClear();
                    break;
                case 4:
                    //System.out.println("장바구니 항목 추가: ");
                    menuCartAddItem(mBook);
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
                    System.out.println("1부터 8까지의 숫자를 입력하세요.");
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

    public static void menuCartItemList(){
        System.out.println("2. 장바구니 상품 목록 보기");
    }

    public static void menuCartClear(){
        System.out.println("3. 장바구니 비우기");
    }

    public static void menuCartAddItem(String[][] book){
        System.out.println("4. 장바구니에 항목 추가하기");
        BookList(book);
        for(int i = 0 ; i < NUM_BOOK ; i++){
            for(int j = 0 ; j < NUM_ITEM ; j++)
                System.out.print(book[i][j] + " | ");
            System.out.println("");
        }

        boolean loop = true;

        while(loop){
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");

            String str = sc.nextLine();

            boolean flag = false;
            int numId = -1;

            for(int i = 0 ; i < NUM_BOOK ; i++){
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
        loop = false;
    }

    public static void BookList(String[][] book){
        //도서 정보 저장
        book[0][0] = "ISBN9791170612759";
        book[0][1] = "가공범";
        book[0][2] = "22000";
        book[0][3] = "히가시노 게이고";
        book[0][4] = "히가시노 게이고 작가 데뷔 40주년!";
        book[0][5] = "미스터리";
        book[0][6] = "2025/07/21";

        book[1][0] = "ISBN9788936439743";
        book[1][1] = "혼모노";
        book[1][2] = "18000";
        book[1][3] = "성해나";
        book[1][4] = "무엇이 진짜이고 무엇이 가짜인가. 그 경계에서 혼모노를 묻다.";
        book[1][5] = "한국소설";
        book[1][6] = "2025/03/28";

        book[2][0] = "ISBN9791198754080";
        book[2][1] = "다크심리학";
        book[2][2] = "21900";
        book[2][3] = "다크 사이드 프로젝트";
        book[2][4] = "국내 최초 다크 심리학을 기반한 심리 기술";
        book[2][5] = "심리학";
        book[2][6] = "2025/07/31";
    }
}
