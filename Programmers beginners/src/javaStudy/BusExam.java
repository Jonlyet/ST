package javaStudy;

// public class 클래스명 extends 부모클래스명 
public class BusExam extends Car {

	public static void main(String[] args) {
		
	Bus bus = new Bus();
	bus.run(); //Car에 있는 run을 가져와서 달리다를 return 
	
	bus.ppangppang(); // Bus에서 메서드를 가져와 빵빵을 return 
	
	Car car = new Car();
	car.run();
	
	// car.ppangppang(); // 부모클래스는 자식 클래스를 사용 불가하여 error 발생 
	}
}
