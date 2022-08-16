package javaStudy;

public class ForExam {
	
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++) {
//			if( i % 2 != 0 ) { 
//			continue;
//			}  // 짝수의 합 2550  
			
		total = total + i;
		if( i == 50) { //50까지의 합 1275 return 
			break;
		}
	}
		
		System.out.println(total);

	}
	
}
