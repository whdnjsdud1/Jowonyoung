/*
	※ 메소드(mothod)란?
	-- 클래스안에서 구현되어진 일종의 함수라고 생각하면 된다.
	   쉽게 말해서, 어떠한 행동이나 행위를 구체적으로 서술하여 정의한것 이라고 보면 된다.
	-- 메소드(method)는 반드시 리턴타입을 정의해주어야 한다.
	   리턴타입이 있으면 그 리턴타입에 해당하는 타입(String, int, double..)을 기술해주고
	   리턴타입이 없는 메소드(method)이라면 리턴타입이 없습니다라는 뜻의 void 를 기술해주어야 한다.

	※ 메소드(method)의 종류

	1. 인스턴스 메소드(instance method)
		-- 객체명.메소드명();
	2. 스태틱 메소드(static method == 클래스 메소드)
		-- 클래스명.메소드명();
*/

public class Member
{
	String userid;
	String passwd;
	String name;
	int age;
	double height;
	int hopeMonthSal;

	public Member() { }

	public Member(String userid, String passwd,String name, int age,double height,int hopeMonthSal){
			this.userid=userid;
			this.passwd=passwd;
			this.name=name;
			this.age=age;
			this.height=height;
			this.hopeMonthSal=hopeMonthSal;
	}

	// 메소드 정의 //
	// void 는 반환 x
	public void infoPrint(){
		System.out.println("아이디: " + userid);
		System.out.println("암 호: " + passwd);
		System.out.println("성 명: " + name);
		System.out.println("나 이: " + age +"세");
		System.out.println("신 장: " + height + "cm");
	}

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getHeight(){
		return height;
	}
	public String getPasswd(){
		return passwd;
	}
	public void changeMyInfo(String passwd, int age, double height,int hopeMonthSal){
		this.passwd=passwd;
		this.age=age;
		this.height=height;
		this.hopeMonthSal=hopeMonthSal;
	}

	public int getHopeYearSal(){
		return hopeMonthSal * 12;
	}

	public String setHopeMonthSal(int newHopeMonthSal){
		int beforeChangeSal = hopeMonthSal;
		hopeMonthSal = newHopeMonthSal;
		return name+ "님의 기존 희망월급여 "+beforeChangeSal+"만원에서 "+hopeMonthSal+"만원으로 변경되었습니다."; 
	}
	public void showInformation(){
		System.out.println("=== "+name+"님의 정보 ===");
		System.out.println("1. 아이디 : "+userid);
		System.out.println("2. 암 호 : "+passwd);
		System.out.println("3. 성 명 : "+name);
		System.out.println("4. 나 이 : "+age+"세");
		System.out.println("5. 신 장 : "+height+"cm");
		System.out.println("6. 희망월급여 : "+hopeMonthSal+"만원");
	}
	
	public String getStrYearSal(){
		return MyUtil.getMoney(hopeMonthSal*12);
	}

}