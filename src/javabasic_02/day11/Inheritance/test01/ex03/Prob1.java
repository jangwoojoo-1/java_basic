package javabasic_02.day11.Inheritance.test01.ex03;

public class Prob1 {
	
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.setId("12345");
		emp.setName("홍길동");
		emp.setBaseSalary(50000);
		System.out.println( emp.toString() );
		System.out.println( "봉급 = " + emp.getSalary( 30 ) );
		
	}

}
