package javaStudy;

public class VariableScopeExam {
	int globalScope = 10; 
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope =20; 
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope); 사용 불가
//		System.out.println(value); 사용불가
		System.out.println(value2);
	}
	
	public static void main(String[] args) { // 모든 클래스는 인스턴스화 하지 않고 사용불가 
//		System.out.println(globalScope);      // static을 사용하면 인스턴스화 하지 않아도 사용가능 
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(staticVal); // 위 클래스에서 static을 선언했기 때문에 에러 발생 x
	
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);  // 10 return 
		
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);  //10 return
		System.out.println(v2.globalScope);  // 20 return 
		
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal); // 100 return
		System.out.println(v2.staticVal); // 100 return 
		// 클래스 변수 : static한 변수, 값을 저장할 수 있는 공간이 하나 밖에 없어서 값을 공유한다 
		
	}	
}
