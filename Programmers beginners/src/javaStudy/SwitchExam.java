package javaStudy;

public class SwitchExam {
	public static void main(String[] args) {
		//switch, case, default, break 
		
		int value = 1;   // 해당되는 case를 사용하고 싶을땐 break를 사용 그렇지 않다면 사용하지 않는다
		
		switch (value){
		case 1 :
			System.out.println("1");
			break;
		case 2: 
			System.out.println("2");
			break;
		case 3: 
			System.out.println("3");
			break;
		default : 
			System.out.println("그 외 다른 숫자");
			
		}
		// jdk 7부터는 switch문에 문자열 가능
		String str = "A";
		switch(str) {
		case "A":
			System.out.println("A");
			break;
		case "B": 
			
		}
	}
}
