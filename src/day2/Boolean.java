package day2;

public class Boolean {
    public static void main(String[] args) {
        boolean stop = false;
        //boolean stop = true;
        if(stop){
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 30;

        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        boolean result3 = (x > 0 && x < 30);
        boolean result4 = (x < 0 || x >= 30);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
