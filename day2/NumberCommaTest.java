import java.text.DecimalFormat;

public class NumberCommaTest
{
	public static void main(String[] args) 
	{
		long money = 34567890123L;  //21���� ������� ���ڵڿ� L�� �ٿ� ǥ���Ѵ�.

		System.out.println(money+ "��");

		// ���ڷ� �Ǿ��� �����͸� ���ڸ� ���� �޸�(,)����ִ� ��ü�� ������.
		DecimalFormat df = new DecimalFormat("#,###");

		String strMoney = df.format(money);

		System.out.println(strMoney + "��");
	}
}
