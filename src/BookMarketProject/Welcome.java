package BookMarketProject;

import java.util.Scanner;

public class Welcome {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 메뉴 구현 클래스
        MenuPage menu = new MenuPage();

        //이름 전화번호 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        menu.setUserName(sc.nextLine());
        System.out.print("연락처를 입력하세요 : ");
        menu.setUserMobile(sc.nextLine());


        // 메뉴판 만들기
        menu.setLoop(true);
        while (menu.isLoop()){
            //메뉴판 출력하기
            menu.menuIntroduction();

            try {
                System.out.print("메뉴 번호를 선택해주세요: ");
                int n = Integer.parseInt(sc.nextLine());
                menu.setMenuNum(n);
                menu.menuOperation();
            } catch (NumberFormatException e) {
                System.out.println("숫자를 정확히 입력해주세요.");
            }

        }
    }
}
