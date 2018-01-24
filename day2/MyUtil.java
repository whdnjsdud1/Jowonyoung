import java.util.Date;
import java.text.DecimalFormat;

public class MyUtil
{
	// --- 현재시각을 나타내기 --- //
	public static String getNowTime(){
		Date now = new Date();
		String today = String.format("%tF %tT", now, now);
		return today;
	}

	// --- 숫자를 입력받아서 세자리 마다 콤마(,)를 찍어서 리턴시켜주는 메소드 생성하기 -- //
	public static String getMoney(long money){
		
		// 숫자로 되어진 데이터를 세자리 마다 콤마(,)찍어주는 객체를 생성함.
		DecimalFormat df = new DecimalFormat("#,###");
		String strmoney = df.format(money);

		return strmoney;
	}

}
