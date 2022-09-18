package javastudy;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)); 
		System.out.println(cal.get(Calendar.MONTH+1)); //MONTH는 0~11월을 표현하기 때문에 +1을 해야한다
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR)); //12시간제
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //오전이 아닐때 사용가능, 24시간제
		System.out.println(cal.get(Calendar.MINUTE));
	
		cal.add(Calendar.HOUR, 5);
	}
}
