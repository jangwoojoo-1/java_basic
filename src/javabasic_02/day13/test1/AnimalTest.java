package javabasic_02.day13.test1;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		
		if(cheatableChicken instanceof Chicken){
			cheatableChicken.fly();
		}

//		if(chicken instanceof Cheatable){
//			cheatableChicken.fly();
//		} //chicken은 animal 타입이기에  cheatable 타입으로 변환할 수 없지만
		//이 경우에는 객체가 Chicken이기에 변환 가능
		
		for(int i = 1 ; i <=3 ; i++){
			System.out.println(i+"시간 후");
			dog.run(1);
			chicken.run(1);
			cheatableChicken.run(1);
			System.out.println("개의 이동거리=" + dog.getDistance());
			System.out.println("닭의 이동거리=" + chicken.getDistance());
			System.out.println("날으는 닭의 이동거리=" + cheatableChicken.getDistance());
		}
	
	}
}












