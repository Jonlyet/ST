package javaStudy;

public class MyClass2 {
	// 1.정수 두개 받아서 그 정수 두개를 더해서 리턴 하는 메서드
	public int plus (int x, int y) {
	return x + y; 
	}

	// 2.정수 세개를 받아서 그 정수 세개를 더해서 리턴 하는 메서드 
	public int plus (int x, int y, int z) {
	return x + y + z; 
	}
	
	//3.문자 두개를 받아서 리턴하는 메서드
	public String plus (String x, String y) {
	return 	x + y;
	
//	4. pulbic int plus (int i, int j) {
//	} -> 에러 발생. why? 1번과 매개변수 수가 같고 타입이 같다. 매개변수 이름은 중요하지 않고 타입이 중요하다 
	
	// 똑같은 이름으로 메서드를 정의 한 것 : 메서드 오버로딩
	// 메서드 오버로딩 : 타입과 매개변수 수가 중요. 1,2는 타입은 같지만 매개변수 수가 달라 가능 2,3는 매개변수 수는 같지만 타입이 달라 가능 
	
	}
}
