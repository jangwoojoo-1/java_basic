package javabasic_02.day13.test3;

public class Prob1 {

	public static void main(String args[]) {
		
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("SDS", 6, '#') );
		System.out.println( prob1.leftPad("SDS", 5, '$') ); 
		System.out.println( prob1.leftPad("SDS", 2, '&') ); 
		 
	}
	
	public String leftPad(String str, int size, char padChar) {
		StringBuffer sb = new StringBuffer();
		while(sb.length() < (size - str.length())){
			sb.append(padChar);
		}
		sb.append(str);
		String str1 = sb.toString();
		return str1;
	}
	
}
