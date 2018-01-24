import java.util.Date;
import java.text.DecimalFormat;

public class MyUtil
{
	// --- ����ð��� ��Ÿ���� --- //
	public static String getNowTime(){
		Date now = new Date();
		String today = String.format("%tF %tT", now, now);
		return today;
	}

	// --- ���ڸ� �Է¹޾Ƽ� ���ڸ� ���� �޸�(,)�� �� ���Ͻ����ִ� �޼ҵ� �����ϱ� -- //
	public static String getMoney(long money){
		
		// ���ڷ� �Ǿ��� �����͸� ���ڸ� ���� �޸�(,)����ִ� ��ü�� ������.
		DecimalFormat df = new DecimalFormat("#,###");
		String strmoney = df.format(money);

		return strmoney;
	}

}
