/*
		== 변수의 종류 ==

		1. 맴버변수(member 변수) -->
			1.1 클래스변수(== static 변수)
			1.2 인스턴스변수(instance 변수 == non static 변수)
		 -- 맴버변수 (member 변수)가 사용되어지는 범위는 해당 클래스(지금은 Myvariable) 내에서 어디서나 사용가능하다.
		 -- 맴버변수는 선언되어지는 위치는 일반적으로 해당 클래스명 바로 아래에 선언된다.
		 -- 변수 선언후 값을 부여 (== 변수의 초기화)하지 않더라도 자동적으로 JVM(Java Virtual Machine)이 알아서 기본값을 부여해준다.
			정수형(byte, short, int, long)타입은 기본값인 0 으로 초기화되고,
			실수형(float, double)타입은 기본값인 0.0 으로 초기화되고,
			char 타입은 기본값인 ' '(공백) 으로 초기화되고,
			Object 타입은 기본값인 null 로 초기화 된다.

		2. 지역변수(local 변수)
		 -- 지역변수(local 변수)가 사용되어지는 범위는
			지역변수가 생성된 { } 내에서만 사용가능하다.
		 -- 지역변수는 특정 메소드내에서나, 생성자(instructor)내에서 선언되어지는 것이다.
	*/

	public class MyVariable
{
	int a = 10; // = 은 같다가 아니라 대입한다는 뜻이다. =은 대입연산자.
	static int b=20;
	// 명시적 초기화

	int no1;
	static int no2;
	// JVM 기본 초기화

	String name1 ="한석규";
	static String name2 = "두석규";

	String id;
	String pwd;
	String name;
	static String address;
	
	public static void main(String[] args) 
	{
		int c = 30;

		MyVariable myobj=new MyVariable();
		// myobj 을 클래스 MyVariable의 객체변수라 부른다.
		// myobj 을 클래스 MyVariable의 인스턴스(instance)라 부른다.
		// new MyVariable(); 을 객체생성이라고 하고 인스턴스(instance)화 한다 라고도 한다.
		
		//"문자열"+변수명 은 + 는 더하기가 아니라 문자열 결합을 뜻한다.
		// System.out.println("b : "+b);		 //비권장
		// System.out.println("b : "+myobj.b);   //비권장

		System.out.println("a : "+myobj.a);		 //인스턴스변수
		System.out.println("b : "+MyVariable.b); //클래스 변수
		System.out.println("c : "+c);			 //지역변수
		
		System.out.println("\r\n ============\r\n");

		int no3 = 0;

		System.out.println("no1:"+myobj.no1);
		System.out.println("no2:"+MyVariable.no2);
		System.out.println("no3:"+no3);

		System.out.println("name1:"+myobj.name1);
		System.out.println("name2:"+MyVariable.name2);

		System.out.println("\r\n===============\r\n");

		MyVariable member1= new MyVariable();

		member1.id = "sonsm";
		member1.pwd = "qwer1234";
		member1.name = "손성민";
		MyVariable.address = "의정부시";

		MyVariable member2= new MyVariable();
		member2.id ="kimms";
		member2.pwd = "asdf0070";
		member2.name = "김민석";
		member2.address="서울시 강남구";

	
		System.out.println("\r\n === member1 ===\r\n");
		System.out.println("member1.id :"+member1.id);
		System.out.println("member1.pwd :"+member1.pwd);
		System.out.println("member1.name :"+member1.name);
		System.out.println("member1.address :"+member1.address);
		
		System.out.println("\r\n === member2 ===\r\n");
		System.out.println("member2.id :"+member2.id);
		System.out.println("member2.pwd :"+member2.pwd);
		System.out.println("member2.name :"+member2.name);
		System.out.println("member2.address :"+member2.address);
	}
}
