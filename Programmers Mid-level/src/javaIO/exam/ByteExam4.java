package javaIO.exam;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam4 {
	
	public static void main(String[] args) {
		try( 
				DataInputStream in = new DataInputStream(new FileInputStream("data.txt")); //다양한 데이터 타입을 읽을때 -> DataInputStream 
				){
		
			int i = in.readInt();
			boolean b = in.readBoolean();
			double d = in.readDouble();
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
			/// 파일에 저장된 것을 불러 출력 
			
	}catch (Exception e) {
		e.printStackTrace();
		
		}
	
	}
}