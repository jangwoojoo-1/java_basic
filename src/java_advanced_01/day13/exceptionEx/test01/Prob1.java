package java_advanced_01.day13.exceptionEx.test01;

import java.util.Scanner;


public class Prob1 {
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
		String str= scan.nextLine();
		int result= 0;
		//여기를 작성하십시오.
		try{
			result = convert(str);
			System.out.printf("변환된 숫자는 %d 입니다. \n", result);
		}catch (IllegalArgumentException e){
			System.out.println("예외가 발생되었습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다.");
		}
	}
	
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	//throws로 호출한 쪽으로 예외 던지는 것이고,
	//밑에  throw new 예외는 예외를 발생시키는 것
	private static int convert(String str) throws IllegalArgumentException{
		//여기를 작성하십시오.
		if(str.equals(null) || str.length() == 0){
			throw new IllegalArgumentException("입력값이 null이거나 문자열의 길이가 0입니다.");
		}
		return Integer.parseInt(str);
	}
}