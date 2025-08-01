package javabasic_02.day8.methods;

public class StringEx01 {
    public static void main(String[] args) {
        //1. 문자열에서 원하는 위치의 문자 추출 charAt(0)
        String subject = "자바객체프로그래밍";

        char charValue = subject.charAt(0);
        System.out.println(charValue);

        String ssn  = "9508213456123";
        char gender = ssn.charAt(6);
        switch (gender){
            case '1':
            case '3':
                System.out.println("남성");
                break;
            case '2':
            case '4':
                System.out.println("여성");
                break;

        }

        //2. 문자열 길이 필요할 때 length()
        int length = ssn.length();
        System.out.println(length);

        // 3. 문자열 대체 기능: replace("원본", "바꾸고 싶은 문자열")
        String oldStar = "신세계 자바 과정";
        //oldStar의 문자열을  "자바" "자바 백엔드" 요청
        String newStr = oldStar.replace("자바", "자바 백엔드");
        System.out.println(newStr);

        //4. 문자열 잘라내기 : subString(int beggingIndex, int endIndex);
        //subString(int beggingIndex);

        String ssn1 = "880815-1234567";

        // - 기준으로 앞 숫자 문자열과 뒤숫자를 분리하여 각각 추출하여 출력

        String firstNum = ssn1.substring(0, 6);
        System.out.println(firstNum);
        String secondNum = ssn1.substring(7);
        System.out.println(secondNum);

        //5. 문자열 찾기 : 문자열에서 특저 문자의 위치 찾을 때 indexOf()
        //index 값 리턴

        int index = subject.indexOf("프로그래밍");
        if(index == -1){ //없을 때 -1 반환
            System.out.println("포함되어 있지 않다.");
        } else {
            System.out.println("포함되어 있다.");
        }

        System.out.println(index);

        //6. 문자열이 포함여부 확인 : contains()
        boolean result = subject.contains("프로그래밍");
        System.out.println(result);

        //7. 문자열 분리 : split()
        // 매우 중요
        // 여러 개의 문자열로 구성, 이를 따로 분리해서 문자열을 처리

        String board = "번호,제목,내용,설명";
        String[] boardStr = board.split(",");
        for (String string : boardStr) {
            System.out.print(string + " ");
        }

        //8.

    }
}
