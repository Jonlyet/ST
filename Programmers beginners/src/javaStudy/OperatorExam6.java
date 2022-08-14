package javaStudy;

public class OperatorExam6 {

	public static void main(String[] args) {
		int b1 = (5 > 4) ? 50: 40; // (5 > 4)의 식이 참이라면 b1 = 50, 거짓이라면 b1 = 40 
	
		System.out.println(b1); // 50
		
		int b2 = 0; 
		if ( 5 < 4) {
			b2 = 50;
		} else {
			b2 = 40;
		}
		System.out.println(b2); //40
		
	}
}
