package javabasic_02.day8.stringBufferEx;
//StringBuffer 주요 메서드

public class StringBufferEx {
    public static void main(String[] args) {

        String str = "abcdefg";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("초기상태 : " + sb);

        //StringBuffer를 String 타입으로 변환
        System.out.println("초기상태 : " + sb.toString());

        String newStr = str.substring(2, 4);
        System.out.println("문자열 추출 : " + newStr);

        //문자 삽입 insert
        System.out.println("문자 삽입 : " + sb.insert(2, "k추가"));

        //문자 삭제 delete
        System.out.println("문자 삭제 : " + sb.delete(2,5));
        System.out.println(sb.toString());

        //sb에 문자 끝에 붙이기 append
        System.out.println("문자 붙이기 : " + sb.append("hijk"));

        //sb 길이 : length()
        System.out.println("문자열 길이 : " + sb.length());

        //sb 버퍼 용량 capacity
        System.out.println("버퍼 용량 : " + sb.capacity());

        //문자열의 역순 reverse()
        System.out.println("문자열의 역순 : " + sb.reverse());

        //현상태 문자열 확인
        System.out.println("마지막 상태 체크 : " + sb);


    }
}
