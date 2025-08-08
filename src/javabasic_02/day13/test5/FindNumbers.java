package javabasic_02.day13.test5;

public class FindNumbers {
	
	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();
		
		long number = 228754462;
		System.out.println( "입력 숫자 = " + number );		
		System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
		System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
	}
	
	/*  이곳에 countNumber 메소드를 작성하십시오. */
	public int countNumber(long number, int i){
		if(Integer.toString(i).length() > 1) return 0;
		String str = Long.toString(number);
		int count = 0;
		for(int j = 0 ; j < str.length() ; j++){
			if(str.charAt(j) == Integer.toString(i).charAt(0)) count++;
		}
		return count;
	}
}
