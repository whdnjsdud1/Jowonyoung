public class VoidMethodTestMain
{
	public static void main(String[] args) 
	{
		Member member1=new Member("kangkc","qwer1234","강감찬",34,178.9,200);
		Member member2=new Member("suji","asdf0070","수지",29,175.3,200);

		member1.infoPrint();
		System.out.println("");
		member2.infoPrint();

		System.out.println("\r\n=================\r\n");

		String name=member1.getName();
		int age=member1.getAge();
		double height=member1.getHeight();
		String passwd=member1.getPasswd();
		int hopeYearSal=member1.getHopeYearSal();

		System.out.println(name+"님의 나이는 "+age+"세이고 \n신장은 "+height+"cm 이고\n희망연봉은 "+hopeYearSal+"만원 입니다.");
		// 강감찬님의 나이는 34세이고 신장은 178.9cm 입니다.

		System.out.println("\r\n=================\r\n");

		member1.changeMyInfo("abcd", 25, 167.5,250);

		passwd=member1.getPasswd();
		age=member1.getAge();
		height=member1.getHeight();
		hopeYearSal=member1.getHopeYearSal();

		System.out.println(name+"님의 암호는 "+passwd+"이고 \n나이는 "+age+"세이고 \n신장은 "+height+"cm 이고\n희망연봉은 "+hopeYearSal+"만원 입니다.");
		// 강감찬님의 암호는 asdf이고 신장은 178.9cm 입니다.

		System.out.println("\n===========================\n");

		String result = member1.setHopeMonthSal(400);

		System.out.println(result);

		System.out.println("\n===========================\n");

		member1.showInformation();

		System.out.println("\n===========================\n");

		Member member3=new Member("leess","1234","이순신", 49, 180.2, 5000000);


		String strYearSal = member3.getStrYearSal();
		System.out.println(member3.getName()+"님의 희망연봉은 "+strYearSal+"원입니다.");

		System.out.println("\n종료시간 :" +MyUtil.getNowTime());
		
	}
}