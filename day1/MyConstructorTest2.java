public class MyConstructorTest2 
{
	String id;
	String pwd;
	String name;
	int age;

	public MyConstructorTest2(){}

	public MyConstructorTest2(String id,String pwd,String name,int age) {
	this.id=id;
	this.pwd=pwd;
	this.name=name;
	this.age=age;
}

	public static void main(String[] args) 
	{
		MyConstructorTest2 myobj1 = new MyConstructorTest2();
		myobj1.id="leess";
		myobj1.pwd="qwer1234";
		myobj1.name="이순신";
		myobj1.age = 25;

		System.out.println("myobj1.id :" +myobj1.id);
		System.out.println("myobj1.pwd :" +myobj1.pwd);
		System.out.println("myobj1.name :" +myobj1.name);
		System.out.println("myobj1.age :" +myobj1.age);
		System.out.println("");

		MyConstructorTest2  myobj2 =new MyConstructorTest2("youjs","asd","유재석",30);

		System.out.println("myobj2.id :" +myobj2.id);
		System.out.println("myobj2.pwd :" +myobj2.pwd);
		System.out.println("myobj2.name :" +myobj2.name);
		System.out.println("myobj2.age :" +myobj2.age);
		System.out.println("");
	}
}
