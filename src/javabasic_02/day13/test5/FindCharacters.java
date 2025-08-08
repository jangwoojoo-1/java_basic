package javabasic_02.day13.test5;

import java.util.Scanner;

public class FindCharacters {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();

		String s = sc.nextLine();
		System.out.println("입력 스트림 : String s = \"" +
				s + "\" ;");


		char c = sc.nextLine().charAt(0);
		if((s.contains(Character.toString(c).toLowerCase())  && c >= 65 && c <= 90) || (s.contains(Character.toString(c).toUpperCase()) && c >= 97 && c <= 122)){
			System.out.print("a. c = \'"+c+"\' 인 경우 => "+fc.countChar(s, c)+" 리턴");
			System.out.printf(" (%s와 %s는 서로 다르므로 다른 것으로 간주) \n", Character.toUpperCase(c), Character.toLowerCase(c));
		}else{
			System.out.println("a. c = \'"+c+"\' 인 경우 => "+fc.countChar(s, c)+" 리턴");
		}
		c = sc.nextLine().charAt(0);
		if((s.contains(Character.toString(c).toLowerCase())  && c >= 65 && c <= 90) || (s.contains(Character.toString(c).toUpperCase()) && c >= 97 && c <= 122)){
			System.out.print("b. c = \'"+c+"\' 인 경우 => "+fc.countChar(s, c)+" 리턴");
			System.out.printf(" (%s와 %s는 서로 다르므로 다른 것으로 간주) \n", Character.toUpperCase(c), Character.toLowerCase(c));
		}else{
			System.out.println("b. c = \'"+c+"\' 인 경우 => "+fc.countChar(s, c)+" 리턴");
		}



	}
	public int countChar(String str, char c) {
		// Method를 완성하세요...
		char[] chars = str.toCharArray();
		int count = 0;
		for (char aChar : chars) {
			if(aChar == c) count++;
		}

		return count;
	}
}
