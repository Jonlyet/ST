package javaStudy;

public class MyClass {
	//메서드 선언방법 : public 리턴타입 메소드이름 (매개변수){구현}
	
	public void  method1() { // 리턴 타입이 없는 메서드는 void를 갖는다.  method1는 메소드 이름 
		System.out.println("m1이 실행됨");
	}

	public void method2(int x) { // 정수 매개변수를 받지만 return을 하지 않는 메서드의 경우
		System.out.println( x  + "를 이용한" );
	}

	
	public int method3() {	// 매개변수를 받지 않았지만 정수 return 값을 돌려주는 메서드
		System.out.println("m3 실행");
		return 10; 
	}
  
	public void method(int x, int y){//두개의 정수값 매개변수를 받았지만 return을 하지 않는 메서드의 경우
	System.out.println(x + y + "m4를 실행 ");
	}

	public int method5(int y) {//매개변수를 받아서 return하는 경우 
		System.out.println(y +"이용한 m5 실행");
		return y * 2; 
	}

}