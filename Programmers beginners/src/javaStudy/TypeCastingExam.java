package javaStudy;

public class TypeCastingExam {
	
	public static void main(String[] args) {
			int x = 500000; 
			long y =  x;  // x의 값이 y로 들어가므로 형변환이 발생 (묵시적 형변환)
			
			long x2 = 5; 
		//	int y2 = x2;  // long type을 int type에 담을때는 문제 발생 
			int y2 = (int) x2; //앞에 형변환을 시켜한다 (강제적 형변환)
			
	}
}
