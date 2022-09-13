package javaStudy;

/*
내부클래스: 클래스 안에 선언된 클래스
1. 중첩 클래스 또는 인스턴스 클래스라고 불린다 
2. 정적 중첩클래스 또는 스태틱 클래스 
3. 지역 중첩클래스 또는 지역 클래스
*/

public class InnerExam1 {
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();
		InnerExam1.Cal cal = t.new Cal();
		cal.plus();
		System.out.println(cal.value); //1 return 
	}

}
