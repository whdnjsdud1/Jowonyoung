/*
	---������(constructor) ---
	
	�� ������(constructor)��?
	-- ��ü�� ����(Ŭ������ ��ü������ = new Ŭ������(); ) �Ҷ� ����
	�ڵ������� ȣ��Ǿ����� ��� ������ ����Ѱ� �̶�� �����ϸ� �ȴ�.
	
	�� ������(constructor)�� ���Ѿ��� ��Ģ
	1. ������(constructor)�� �̸��� �ݵ�� Ŭ������� ���ƾ� �Ѵ�.
	2. ������(constructor)�� ��ȯŸ��(void,int)�� ����ϸ� �ȵȴ�.

	�� ������(constructor)�� �ֵ� ������ �Ϲ������� �ɹ�����(�ν��Ͻ�����, Ŭ��������(static ����))��
	�ʱ�ȭ�� �ϰ��� �ϴµ� �ִ�.

*/
public class MyConstructorTest
{
	String name;
	int age;
	String addr;

	public MyConstructorTest(){
		name = "�̼���";
		age = 25;
		addr = "����� ���α�";

			System.out.println("MyConstructorTest ��ü �����Ϸ�");
	}
	public MyConstructorTest(String name,int age,String addr){
		// �ɹ�������� ������������ ������ ��� ������������ �켱�Ѵ�.
		// �׷��� �ɹ�������� ������������ ������ ��� ������ �������� ����� this.�ɹ������� ���� �����Ѵ�.
		this.name = name;
		this.age = age;
		this.addr = addr;
		

			System.out.println("�Ķ���Ͱ� �ִ� MyConstructorTest ��ü �����Ϸ�");
	}

	public static void main(String[] args) 
	{
		System.out.println("����� ù���Դϴ�.");

		MyConstructorTest myobj = new MyConstructorTest();
		
		System.out.println("myobj.name : "+myobj.name);
		System.out.println("myobj.age : "+myobj.age);
		System.out.println("myobj.addr : "+myobj.addr);

		MyConstructorTest myobj2 = new MyConstructorTest();
		
		System.out.println("myobj2.name : "+myobj2.name);
		System.out.println("myobj2.age : "+myobj2.age);
		System.out.println("myobj2.addr : "+myobj2.addr);

		MyConstructorTest myobj3 = new MyConstructorTest("������", 23, "��õ������ ����");
		MyConstructorTest myobj4 = new MyConstructorTest("���߱�", 30, "����� ���ϱ�");

		System.out.println("\r\n=====\r\n");
		System.out.println("myobj3.name : "+myobj3.name);
		System.out.println("myobj3.age : "+myobj3.age);
		System.out.println("myobj3.addr : "+myobj3.addr);

		
		System.out.println("\r\n=====\r\n");
		System.out.println("myobj4.name : "+myobj4.name);
		System.out.println("myobj4.age : "+myobj4.age);
		System.out.println("myobj4.addr : "+myobj4.addr);
	
		myobj.myPrint();
		myobj.myPrint();
	}

	public void myPrint(){
		System.out.println("�ȳ��ϼ���?");
	}
}
