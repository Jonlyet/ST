package javastudy;

//String : 자신이 변하지 않음
//StringBuffer: 자기 자신이 변함
public class StringBufferExam {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str); // hello world
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
	
		if(sb2 == sb3)
			System.out.println("sb ==sb3"); //sb ==sb3 return 
			//메소드 체이닝: 자기자신을 리턴하여 계속하여 자신의 메소드를 호출하는 방식  
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2); // hello world 출력

				
	}
}
