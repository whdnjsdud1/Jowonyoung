public class VoidMethodTestMain
{
	public static void main(String[] args) 
	{
		Member member1=new Member("kangkc","qwer1234","������",34,178.9,200);
		Member member2=new Member("suji","asdf0070","����",29,175.3,200);

		member1.infoPrint();
		System.out.println("");
		member2.infoPrint();

		System.out.println("\r\n=================\r\n");

		String name=member1.getName();
		int age=member1.getAge();
		double height=member1.getHeight();
		String passwd=member1.getPasswd();
		int hopeYearSal=member1.getHopeYearSal();

		System.out.println(name+"���� ���̴� "+age+"���̰� \n������ "+height+"cm �̰�\n��������� "+hopeYearSal+"���� �Դϴ�.");
		// ���������� ���̴� 34���̰� ������ 178.9cm �Դϴ�.

		System.out.println("\r\n=================\r\n");

		member1.changeMyInfo("abcd", 25, 167.5,250);

		passwd=member1.getPasswd();
		age=member1.getAge();
		height=member1.getHeight();
		hopeYearSal=member1.getHopeYearSal();

		System.out.println(name+"���� ��ȣ�� "+passwd+"�̰� \n���̴� "+age+"���̰� \n������ "+height+"cm �̰�\n��������� "+hopeYearSal+"���� �Դϴ�.");
		// ���������� ��ȣ�� asdf�̰� ������ 178.9cm �Դϴ�.

		System.out.println("\n===========================\n");

		String result = member1.setHopeMonthSal(400);

		System.out.println(result);

		System.out.println("\n===========================\n");

		member1.showInformation();

		System.out.println("\n===========================\n");

		Member member3=new Member("leess","1234","�̼���", 49, 180.2, 5000000);


		String strYearSal = member3.getStrYearSal();
		System.out.println(member3.getName()+"���� ��������� "+strYearSal+"���Դϴ�.");

		System.out.println("\n����ð� :" +MyUtil.getNowTime());
		
	}
}