package javaStudy;

public class OperatorExam4 {

	public static void main(String[] args) {
		int i = 10;
		int j = 10; 
		
		System.out.println(i == j); // true 리턴
		System.out.println(i != j); // false 리턴
		System.out.println(i < j); // false
		System.out.println(i <= j); // true
		System.out.println(i > j); // false
		System.out.println(i >= j); //true
		
		i += 10; // i = i + 10;
		System.out.println(i); // 20 출력
	}
}
