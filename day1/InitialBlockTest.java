public class InitialBlockTest  
{
	String id;
	String pwd;
	String name;
	/* == Ŭ���� �ʱ�ȭ �� ==  static{ }
		Ŭ���� �ʱ�ȭ ���� �ش� Ŭ������ �޸𸮿� ó�� �ε��Ǿ����� �� 1���� ��������ִ� ���̴�.
	*/
	 
	 static{
		 System.out.println("Ŭ���� InitialBlockTest �ʱ�ȭ �� ������");
	 }
	/* == �ν��Ͻ� �ʱ�ȭ �� == 	{ }
		��� �����ڿ��� ���������� ����Ǿ����� �� �ڵ尡 �ִ°�� ���
		������ �����ڸ��� �ߺ��ǰ� ������(�ڵ�����)���� �ν��Ͻ� �ʱ�ȭ ����
		1���� ����� (�ڵ��ϸ�) �ȴ�.
		������ ���� �ν��Ͻ� �ʱ�ȭ ���� ���� ����ȴٴ� ���� �������.
		�׸��� �ν��Ͻ� �ʱ�ȭ ���� ��ü�� �����Ǿ��������� ����ȴٴ°��̴�.
	 */
	{
		System.out.println("Ŭ���� InitialBlockTest �� ��ü���� �Ϸ�");
	}

	public InitialBlockTest(){
	//	System.out.println("Ŭ���� InitialBlockTest �� ��ü���� �Ϸ�");
		System.out.println("�⺻�����ڷ� ������");
	}

	public InitialBlockTest(String id,String pwd,String name){
	this.id = id;
	this.pwd = pwd;
	this.name = name;
	//System.out.println("Ŭ���� InitialBlockTest �� ��ü���� �Ϸ�");
	System.out.println("�Ķ���Ͱ� �ִ� �����ڷ� ������");
}
	public static void main(String[] args) 
	{
		InitialBlockTest obj1=new InitialBlockTest();
		obj1.id = "leess";
		obj1.pwd = "qwer1234";
		obj1.name = "�̼���";

		InitialBlockTest obj2=new InitialBlockTest("kanghd","asdf0070","��ȣ��");

	}
}
