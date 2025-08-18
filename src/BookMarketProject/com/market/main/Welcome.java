package BookMarketProject.com.market.main;

import BookMarketProject.com.market.cart.Cart;
import BookMarketProject.com.market.member.User;
import BookMarketProject.com.market.operation.MenuOperation;

import java.util.Scanner;

public class Welcome {
    static Cart cart = new Cart();
    static User mUser;
    public static boolean loop = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 메뉴 구현 클래스
        MenuOperation menu = new MenuOperation();

        //이름 전화번호 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String userMobile = sc.nextLine();
        mUser = new User(userName, userMobile);

        // 메뉴판 만들기
        while (loop){
            //메뉴판 출력하기
            menu.menuIntroduction();

            try {
                System.out.print("메뉴 번호를 선택해주세요: ");
                int n = Integer.parseInt(sc.nextLine());
                menu.setMenuNum(n);
                menu.menuOp(mUser, cart);
            } catch(Exception e) {
                System.out.println("올바르지 않은 메뉴 선택으로 종료합니다.");
                loop = false;
            }

        }
    }
}
