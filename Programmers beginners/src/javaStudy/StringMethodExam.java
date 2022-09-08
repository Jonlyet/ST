package javaStudy;

public class StringMethodExam {

	public static void main(String[] args) {
			// String str = new String("hello");
			String str = "hello";
			System.out.println(str.length()); //5 return
			System.out.println(str.concat(" world")); // hello world return
			System.out.println(str); // hello return 
			
			str = str.concat(" world");
			System.out.println(str); // hello world return 
			
			System.out.println(str.substring(3)); // lo world return
			System.out.println(str.substring(3, 7)); // lo w return 
			
			
	}
}
