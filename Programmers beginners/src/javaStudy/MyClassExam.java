package javaStudy;

public class MyClassExam {
	
	public static void main(String[] args) {
	// 클래스가 가진 메소드를 사용하기 위해서는  객체로 만들어야 사용 할 수 있다
	MyClass myclass = new MyClass();
	myclass.method1(); //Myclass의 메소드 때문에  m1이 실행됨을 출력 
	myclass.method2(10); // Myclass의 메소드 method2가 실행되기 때문에 매개변수의 값에 따라 값이 달라진다
	int value = myclass.method3(); // Myclass의 메소드 method3 실행 
	System.out.println("m3이 리턴한 값" + value); 
	myclass.method4(5, 10); // 15m4를 실행 return
	
	int value2 = myclass.method5(55); // 55이용한 m5 실행 
	System.out.println("m5가 리턴한 값:" + value2); // m5가 리턴한 값: 110 
	
	}
}
