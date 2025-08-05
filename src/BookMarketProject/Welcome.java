package BookMarketProject;

import java.util.Scanner;

public class Welcome {
    public static final int NUM_BOOK = 3;
    public static final int NUM_ITEM = 7;
    public static Scanner sc = new Scanner(System.in);
    static CartItem[] mCartItem = new CartItem[NUM_BOOK];
    public static int mCartCount = 0;
    static User mUser;
    static String[][] mbook = new String[NUM_BOOK][NUM_ITEM];

    public static void main(String[] args) {
        bookList(mbook); // 책 정보 입력

        // 메뉴 구현 클래스
        MenuOperation menu = new MenuOperation();

        //이름 전화번호 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String userMobile = sc.nextLine();
        mUser = new User(userName, userMobile);

        // 메뉴판 만들기
        menu.setLoop(true);
        while (menu.isLoop()){
            //메뉴판 출력하기
            menu.menuIntroduction();

            try {
                System.out.print("메뉴 번호를 선택해주세요: ");
                int n = Integer.parseInt(sc.nextLine());
                menu.setMenuNum(n);
                menu.menuOp(mUser, mbook, mCartItem);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 정확히 입력해주세요.");
            }

        }
    }

    public static void bookList(String[][] book){
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
