package day5;

public class BreakEx02 {
    public static void main(String[] args) {
        //반복문이 중첩이 되면 break를 사용시 가장 가까운 반복문만 종료, 바깥 반복문은 종료X
        //중첩 반복문에서 바깥쪽 반복문까지 종료하려면 바깥쪽 반복문에 레이블(이름)을 붙이고 break 레이블;
        
        Outter:
        for(char upper = 'A' ; upper <= 'Z'; upper++){
            for(char lower = 'a' ; lower <= 'z' ; lower++){
                System.out.println(upper + " - " + lower);
                if(lower == 'k'){
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
