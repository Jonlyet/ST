package javaStudy;

public class StringExam {
	
	public static void main(String[] args) {
	// String 클래스는 New 연산자 없이 인스턴스를 만들 수 있다 
		
		String str1 = "hello";
		String str2 = "hello";

		String str3 = new String("hello"); 
		String str4 = new String("hello"); 
		
		if(str1 == str2)
			System.out.println("str과 str2는 같은 레퍼런스입니다."); // str과 str2는 같은 레퍼런스입니다. return
		
		if(str1 == str3)
			System.out.println("str1과 str3는 같은 레퍼런스입니다."); // return 값 없음 & 출력 불가
		
		if(str3 == str4)
			System.out.println("str3과 str4는 같은 레퍼런스입니다."); // return 값 없음 
		
		System.out.println(str1); //hello return

		System.out.println(str1.substring(3)); // lo return
		
		System.out.println(str1); //hello return & string클래스가 가지고 있는 내부의 값은 변하지 않는다 
	}

}
