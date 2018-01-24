import java.text.DecimalFormat;

public class NumberCommaTest
{
	public static void main(String[] args) 
	{
		long money = 34567890123L;  //21억이 넘을경우 숫자뒤에 L을 붙여 표기한다.

		System.out.println(money+ "원");

		// 숫자로 되어진 데이터를 세자리 마다 콤마(,)찍어주는 객체를 생성함.
		DecimalFormat df = new DecimalFormat("#,###");

		String strMoney = df.format(money);

		System.out.println(strMoney + "원");
	}
}
