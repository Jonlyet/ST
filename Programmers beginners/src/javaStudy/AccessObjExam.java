package javaStudy;

public class AccessObjExam {
	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.p);
		System.out.println(obj.p2);
		System.out.println(obj.k);
		//System.out.println(obj.i); // private이라 접근 불가 
		
		//만약 다른 패키지로 파일을 옮긴다면 public만 사용 가능 
		
		
	}
}
