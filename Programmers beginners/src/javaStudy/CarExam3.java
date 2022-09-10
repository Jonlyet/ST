package javaStudy;

public class CarExam3 {
	// Car 생성자 참조 
	// 생성자도 여러개 생성 가능 
	// 생성자 오버로딩: 메소드와 마찬가지로 매개변수의 수와 타입이 다르다면 여러개의 생성자 선언 가능
	public static void main(String[] args) {
		Car c1 = new Car("소방차");
		Car c2 = new Car();
		Car c3 = new Car("구급차, 1111");
		
		
	}
}
