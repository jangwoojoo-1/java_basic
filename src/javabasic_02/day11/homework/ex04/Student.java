package javabasic_02.day11.homework.ex04;

public class Student {
	private String name;
	private String subject;
	private int fee;
	private double returnFee;

	public Student(String name, String subject, int fee){
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}

	public void calcReturnFee(){
		if(this.subject.equals("javaprogram")){
			returnFee = (double)fee/4;
		} else if(this.subject.equals("jspprogram")){
			returnFee = (double)fee/5;
		} else{
			System.out.println("그런 과정명은 없습니다.");
			return;
		}
	}

	public void print(){
		System.out.printf("%s 씨의 과정명은 %s 이고 교육비는 %d 이며 환급금은 %.2f 입니다.\n",
				this.name, this.subject, this.fee, this.returnFee);
	}

	public static void main(String[] args){
		if (args.length != 3) {
			System.out.println("사용법: java Student 이름 과정명 교육비");
			return;
		}

		String name = args[0];
		String subject = args[1];
		int fee = Integer.parseInt(args[2]);

		Student stu = new Student(name, subject, fee);
		stu.calcReturnFee();
		stu.print();
	}

	// 마지막에 문제에서 주어진 main 메서드처럼 args로 이름, 과정명, 교육비 데이터를 받아서 Student 클래스 객체 생성해서 작성
	// 이게 무슨 말인지 제대로 이해 못해서 copilot 참고해서 IDE에서 실행설정에 인자를 넣어
	//args를 통해 실행이 되도록 했습니다.
}