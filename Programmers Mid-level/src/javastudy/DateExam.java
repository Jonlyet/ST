package javastudy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
	
	public static void main(String[] args) {
		
	Date date = new Date();
	System.out.println(date.toString()); // Mon Sep 19 02:13:45 KST 2022
	
	SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");

	System.out.println(ft.format(date));
	
	System.out.println(date.getTime()); // 1663521539700
	
	long today = System.currentTimeMillis();
	System.out.println(today); // 1663521507517

	System.out.println(today - date.getTime()); //43
	
	}
}
