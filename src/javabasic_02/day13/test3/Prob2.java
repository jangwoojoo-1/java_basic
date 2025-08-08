package javabasic_02.day13.test3;

import java.util.Scanner;

public class Prob2 {
 
	public static void main(String[] args) {
		String inputStr;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		inputStr = keyboard.nextLine();
		
		//프로그램을 구현하세요.
		StringBuffer sb = new StringBuffer(inputStr);
		sb.reverse();
		String str1 = sb.toString().toUpperCase();

		System.out.println(str1);
		
	}

}
