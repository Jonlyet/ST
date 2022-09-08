package javaStudy;

public class EnumExam {
	// 상수는 대문자로 쓰는 것이 관례
	public static final String MALE ="MALE";
	public static final String FEMALE ="FEMALE";
	
	public static void main(String[] args) {
		String gender1;  // static field는 객체 생성하지 않고 생성 가능 
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
	
		gender1 = "boy";
		
		Gender gender2; 
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		// gender2 = "boy"; 에러 발생 
	}
}

enum Gender{
	MALE, FEMALE; 
}