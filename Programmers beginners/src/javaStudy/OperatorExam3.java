package javaStudy;

public class OperatorExam3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15; 
		
		System.out.println(a - b * c); // -145
		System.out.println((a - b) * c); // -75
		
		System.out.println(a > 5 && b > 5); // false
		System.out.println(a > 5 || b > 5); // true
		
		//System.out.println(++a - 5); // 1 
		//System.out.println(a ); // 6 
		
		System.out.println(a++ -5); // 0 증가하기 전에 연산을 하고 출력하기 때문에
		System.out.println(a); // 6

		
		
	}
}
