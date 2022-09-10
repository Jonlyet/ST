package javaStudy;

public class Car {

	
	//타입 필드명
	String name; 
	int number;
	
	public Car(String name) { //this : 객체 자신을 참조하는 키워드 
		this.name = name; 
	}
	
	public Car() {
//		this.name ="이름없음";
//		this.number = 0;  밑에 있는 name과 number가 반복 되기 때문에 아래와 같이 변경 가능
		this("이름없음", 0 );
		
	}
	
	public Car (String name, int number) {
		this.name = name; 
		this.number = number; 
		
	}
}