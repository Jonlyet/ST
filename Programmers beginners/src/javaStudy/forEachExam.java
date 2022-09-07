package javaStudy;

public class forEachExam {

	public static void main(String[] args) {
		int[] iarr = {10, 20, 30, 40, 50};
		
		for (int i= 0; i < iarr.length; i++) { // for문은 반복해서 자료를 꺼내기 위해서 배열이나 자료구조의 크기를 먼저 알아낸다 반면에 for each는 그러지 않는다
			int value = iarr[i]; 
			System.out.println(value);
		}
	
		for(int value:iarr) {  // for each는 for(타입 값을 받아줄 변수명: 출력하고 싶은 자료구조)
			System.out.println(value);
		}
	}
	
}	
