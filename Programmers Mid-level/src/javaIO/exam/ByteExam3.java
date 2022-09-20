package javaIO.exam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {
	// 자바 IO객체는 인스턴스를 만들고 모두 사용하면 CLOSE METHOD를 호출 
	// try-with-resource : 사용한 자원을 자동으로 종료시켜주는 기능 
	
	public static void main(String[] args) {
		try(
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.text"));
	
				){
		
		out.writeInt(100);
		out.writeBoolean(true);
		out.writeDouble(50.5);
		
	}catch (Exception e) {
		e.printStackTrace();
	
		}
	}
}
