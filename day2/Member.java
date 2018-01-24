/*
	�� �޼ҵ�(mothod)��?
	-- Ŭ�����ȿ��� �����Ǿ��� ������ �Լ���� �����ϸ� �ȴ�.
	   ���� ���ؼ�, ��� �ൿ�̳� ������ ��ü������ �����Ͽ� �����Ѱ� �̶�� ���� �ȴ�.
	-- �޼ҵ�(method)�� �ݵ�� ����Ÿ���� �������־�� �Ѵ�.
	   ����Ÿ���� ������ �� ����Ÿ�Կ� �ش��ϴ� Ÿ��(String, int, double..)�� ������ְ�
	   ����Ÿ���� ���� �޼ҵ�(method)�̶�� ����Ÿ���� �����ϴٶ�� ���� void �� ������־�� �Ѵ�.

	�� �޼ҵ�(method)�� ����

	1. �ν��Ͻ� �޼ҵ�(instance method)
		-- ��ü��.�޼ҵ��();
	2. ����ƽ �޼ҵ�(static method == Ŭ���� �޼ҵ�)
		-- Ŭ������.�޼ҵ��();
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

	// �޼ҵ� ���� //
	// void �� ��ȯ x
	public void infoPrint(){
		System.out.println("���̵�: " + userid);
		System.out.println("�� ȣ: " + passwd);
		System.out.println("�� ��: " + name);
		System.out.println("�� ��: " + age +"��");
		System.out.println("�� ��: " + height + "cm");
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
		return name+ "���� ���� ������޿� "+beforeChangeSal+"�������� "+hopeMonthSal+"�������� ����Ǿ����ϴ�."; 
	}
	public void showInformation(){
		System.out.println("=== "+name+"���� ���� ===");
		System.out.println("1. ���̵� : "+userid);
		System.out.println("2. �� ȣ : "+passwd);
		System.out.println("3. �� �� : "+name);
		System.out.println("4. �� �� : "+age+"��");
		System.out.println("5. �� �� : "+height+"cm");
		System.out.println("6. ������޿� : "+hopeMonthSal+"����");
	}
	
	public String getStrYearSal(){
		return MyUtil.getMoney(hopeMonthSal*12);
	}

}