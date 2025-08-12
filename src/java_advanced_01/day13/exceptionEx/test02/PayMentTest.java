package java_advanced_01.day13.exceptionEx.test02;

public class PayMentTest {

	// main() : 수정하지 마세요.
	public static void main(String[] args) throws PayException {
		
		CardPayment card1 = new CardPayment("11번가","Java책",17000,"123-432-111","0070",0);
		payProcess( card1 );		
		System.out.println("-------------------------------------");		
		CashPayment cash1 = new CashPayment("인터파크","에어컨",2400000,"198-32");
		payProcess( cash1 );
		System.out.println("-------------------------------------");	
		
		// 아래는 Exception 발생  테스트 코드임. 주석을 풀고~ Exception 처리되는지 확인 해 보세요. 
		
		// Exception 예제 1. 문제파일의 출력 그림 참고하세요.
//		CardPayment card2 = new CardPayment("예스24","소설책",2000,"843-12-434","1234",-2);
//		payProcess( card2 );
		
		// Exception 예제 2. 문제파일의 출력 그림 참고하세요.
//		CashPayment cash2 = new CashPayment("G마켓","핸드폰",0,"999-56");
//		payProcess( cash2 );

	}
	
	// payProcess() : 수정하지 마세요.
	public static void payProcess( Payment p ) throws PayException {
		p.pay();
		System.out.println( p );		
	}

}
