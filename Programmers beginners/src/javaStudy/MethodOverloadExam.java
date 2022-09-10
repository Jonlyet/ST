package javaStudy;

// MyClass2를 이용하기 위한 메서드 
public class MethodOverloadExam {

	public static void main(String[] args) {
	
		MyClass2 m = new MyClass2();
	
		System.out.println(m.plus(4,5));
		
		System.out.println(m.plus(4,6,7));
	
		System.out.println(m.plus("hello", "world"));
	}		
}
