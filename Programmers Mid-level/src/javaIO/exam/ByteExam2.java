package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

	public static void main(String[] args) {
		//파일로 부터 읽어 들이는 것 -> FileInputStream
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null; 
		FileOutputStream fos = null; 
		
		try {
			fis = new FileInputStream("src/javaIO/exam/ByteExam1.java");
			fos = new FileOutputStream("byte.txt"); 
			
			int readCount = -1; 
			byte[] buffer = new byte[512];
			while((readCount = fis.read (buffer)) != -1){
				fos.write(buffer,0,readCount);
			}
			
		} catch (Exception e) {
		
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
		
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}
}
