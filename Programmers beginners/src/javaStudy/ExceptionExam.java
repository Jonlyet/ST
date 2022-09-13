package javaStudy;

public class ExceptionExam {
	
	public static void main(String[] args) {
		
	int i = 10;
	int j = 0;
	try {
	int k = i/j; 
	System.out.println(k);
	} catch(ArithmeticException e) {
		System.out.println("0으로 나눌 수 없습니다." + e.toString()); // 예외클래스변수명.toString() -> 예외의 정보를 알려주는 메소드
	}finally {
		System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행");
	}
	System.out.println("main end");
	
	}
}

//0으로 나눌 수 없습니다.java.lang.ArithmeticException: / by zero
//오류가 발생했든 발생하지 않았든 무조건 실행
//main end
