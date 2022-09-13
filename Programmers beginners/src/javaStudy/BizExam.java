package javaStudy;

public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(5);
		try {
		biz.bizMethod(-3);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//비즈니스 메소드 시작
//비즈니스 메소드 종료
//비즈니스 메소드 시작
//javaStudy.BizException: 매개변수 i는 0 이상이어야 합니다
//	at javaStudy.BizService.bizMethod(BizService.java:8)
//	at javaStudy.BizExam.main(BizExam.java:9)
