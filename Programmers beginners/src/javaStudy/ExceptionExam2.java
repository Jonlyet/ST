package javaStudy;

public class ExceptionExam2 {
	
	public static void main(String[] args) {
		
	int i = 10;
	int j = 0;
	try {
	int k = divide(i, j );
	System.out.println(k);
	} catch(ArithmeticException e) {
		System.out.println( e.toString()); // 예외클래스변수명.toString() -> 예외의 정보를 알려주는 메소드
		}
	}
	
	public static int divide(int i, int j) throws ArithmeticException{
		int k = i/j;
		return k;
	}
	
}  //java.lang.ArithmeticException: / by zero   -> return 값 

