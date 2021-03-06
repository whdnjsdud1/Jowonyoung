import java.util.Date;

public class TodayTest{
  
	public static void main(String[] args) 
	{
		// --- 현재 시각 나타내기 --- //
		Date now = new Date();
		System.out.println("현재시각 : "+now);

		String today = String.format("%tF , %tT", now, now);
		System.out.println("현재시각 : "+today);

		/*
		  <참고>
		  날짜 타입 format          설명
		  =====================================================
		  %tF                 날짜를 yyyy-mm-dd 형식으로 포맷해주는것
		  %tT				  날짜의 시각을 HH:MM:SS 형식으로 포맷해주는 것
		  %tp                 오전, 오후를 출력
		  %tA                 요일명 출력
		  %tY                 4자리 년도만 출력
		  %tB                 월의 이름(january, February...)
		  %tm                 월의 01,02,03 ~~ 10,11,12 로 출력
		  %td                 일수를 1~31 로 출력
		  %te                 %td와 동일함
		  %tk                 시간을 0 ~ 23 으로 출력
		  %tl                 시간을 1 ~ 12 으로 출력
		  %tM			      분을 00~59 으로 출력
		  %tS                 초를 00~59 으로 출력
		  %tZ				  타임존을 출력(한국은 KST로 나옴)

		*/
	}
}
