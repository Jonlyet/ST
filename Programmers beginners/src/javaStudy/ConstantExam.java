package javaStudy;

public class ConstantExam {
	
	public static void main(String[] args) {
		int i; 
		i = 10;
		i = 5; 
		
		// final int j;  상수는 대문자 사용
		final int J; 
		J = 10;
		
		//J = 5;  변수와 다르게 이미 위에 선언되었기 때문에 불가 
		
		double circleArea; 
		final double PI = 3.14159; // 상수로 미리 선언하면 값의 변경 위험성이 떨어진다 
		circleArea = 3 * 3 * PI;  
		
		final int Oil_Price = 1700; 
		
		int totalPrice = 50 *Oil_Price; // 위의 Oil_Price 값만 바꿔주면 수행되는 값들이 변하기 때문에 상수 사용 
	}
}
