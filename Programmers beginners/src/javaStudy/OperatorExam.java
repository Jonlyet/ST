package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		int i1 = -5; // - : 부호연산자 //  5: 피연산자. 
		int i2 = +i1;  // *변수 앞에 +가 붙으면 부호 비트를 그대로 유지 
		int i3 = -i1;   // *변수 앞에 -가 붙으면 음수는 양수로, 양수는 음수로 변경 
		
		System.out.println(i1); // -5 출력
		System.out.println(i2); // -5 출력
		System.out.println(i3); //  5 출력
		
		int i4 = ++i3; // i3 = i3+1;   ++가 앞에 붙어 있을 경우 먼저 더하고 i4에 값을 넣어준다  
		System.out.println(i4); // 6출력
		System.out.println(i3); //6 출력 // 위의 i3 = i3+1; 결과때문
	
		int i5 = i3++; // i3 = i3 + 1;  //  ++가 뒤에 붙어 있을 경우 먼저 i5에 대입하고 그리고 +1을 해준다
		System.out.println(i5); //6출력 
		System.out.println(i3); //7출력 
	
		int i = 5; 
		int j =2; 
		System.out.println(i + j); // 7
		System.out.println(i - j); // 3
		System.out.println(i * j); // 10
		System.out.println(i / j); // 2 -> 정수끼리의 연산은 정수의 값을 리턴
		System.out.println(i /(double) j); // 2.5 출력
		System.out.println(i % j); // 나머지값 1  출력
		
		
	}
}
