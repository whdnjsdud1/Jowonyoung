/*
 	=== *** 자료형 *** ===
 	
 	※ 자료형의 종류
 	1. 원시형 타입(primitive Type)
 	 1.1 정수형(byte, short, int, long)
 	   -- byte(8bit == 1byte) : -2^7 ~ 2^7 - 1
 	   							-128 ~ 127
 	   -- short(16bit == 2byte) : -2^15 ~ 2^15 -1
 	   							  -32,768 ~ 32,767
 	   -- int (32bit == 4byte) : -2^31 ~ 2^31 -1
 	  정수기본은 int 이다.		-2,147,483,648 ~ 2,147,483,647
 	   -- long (64bit == 8byte) : -2^63 ~ 2^63 -1
 	  - 9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
 	  
 	  1.2 실수형(float, double)
 	  	1. float : 4byte  단정밀도. 소수점이하 7자리까지 표현
 	  	2. double : 8byte 배정밀도. 소수점이하 15~16자리까지 표현
 	    자바에서 실수의 기본타입은 double 이다.
 	    
 	  1.3 문자형(char)
 	  char : 자바는 유니코드 체계를 사용하므로 문자형 타입인 char 은 2byte 이며, 범위는 0~65535 이다.
 	  
 	  UNICODE 표 참조
 	  http://www.tamasoft.co.jp/en/general-info/unicode.html
 	  
 	  1.4 참(true) 또는 거짓(false)을 담아주는 타입인 boolean
 	  -- boolean 타입은 true, false 를 가진다.
 	  	자바의 논리형인 boolean 은 1,0으로 호환되지 않으며 형변환도 할 수 없다.
 	  
 */

package my.day3;

public class PrimitiveType {

	public static void main(String[] args) {
		
		byte bt1 = 10;
	//	byte bt2 = 200; //표현가능한 범위를 넘었으므로 오류.
		
		short st1 = 20000; // short -32,768 ~ 32,767
	//  short st2 = 40000; // 표현가능한 범위를 넘었으므로 오류.
		
		int it1 = 500000;
	//	int it2 = 10000000;
		
	//	long ln1 = 20000000000;  뒤에 L을 붙어야 사용가능 
		long ln2 = 20000000000L;
		
		int a = 9; // 10진수(0~9)
		System.out.println("10진수 9 => " + a);
		
		a = 011; // 8진수(0~7) => 정수 맨앞에 접두사로 숫자 0을 붙이면 8진수로 인식한다.
		System.out.println("8진수 011 => " + a);
		
		a = 0x11; // 16진수(0~9 A B C D E F) => 정수 맨앞에 접두사로 숫자 0x을 붙이면 8진수로 인식한다.
		// 1*16^1 + 1*16^0 = 16 + 1 = 17
		System.out.println("16진수 0x11 => " + a);
		
		System.out.println("--- *** printf 알아보기 *** ---");
		
		int b = 30;
		System.out.printf("10진수 %d, 8진수 %o, 16진수 %x",b,b,b);
		
		a=5;
		b=2;
		
		System.out.println("\n===============\n");
		
		System.out.println("a/b=" +(a/b));
		// a/b=2
		// 정수/정수 =몫(정수)
		
		double c =5.0;
		System.out.println("c/b="+(c/b));
		// c/b=2.5
		// 실수/실수=실수
		// 정수/실수=실수
		// 실수/정수=실수
		
		System.out.println("a%b="+(a%b));
		// 정수1%정수2 => 정수1을 정수2로 나눈 나머지값
		// 5%2=1
		
		double db1= 32.123456789;
		System.out.println("db1 ="+db1);
		
		float ft1 = 32.1234F;
		// 자바는 실수의 기본탕비이 double 이므로 float 형태로 나타내기 위해서는 숫자 뒤에 f(F)를 붙어야한다.
		System.out.println("ft1 ="+ft1);
		
		ft1 = 32.123456789F;
		System.out.println("ft1 = "+ft1);
		
		System.out.println("\n ====== 문자형(char) ========\n");
		char ch ='\u0041';
		System.out.println("ch = "+ch);
		
		ch='\u263A';
		
		System.out.println("ch = "+ch);
		
		ch='\uC870';
		System.out.println("ch = "+ch);
		
		System.out.println("\n==============\n");
		ch = 'A';
		System.out.println("ch = "+ch);
		
		ch = '☺';
		System.out.println("ch = "+ch);
		
		ch = '조';
		System.out.println("ch = "+ch);
		
		System.out.println("\n==============\n");
		
		ch = 65;
		System.out.println("ch = "+ch);
		
		ch = 9786;
		System.out.println("ch = "+ch);
		
		ch = 14224;
		System.out.println("ch = "+ch);
		
		ch = 'a';
		System.out.println("ch : "+ch);
		
		System.out.println("ch : "+(ch+1));
		
	
		// 'A' => 65, 'a' => 97  <32단계>
		// 'B' => 66, 'b' => 98
		// 대문자 + 32 = 소문자
		// 소문자 - 32 = 대문자
		// '0' => 48
		// '1' => 49
		// '9' => 57
		// ' ' => 32    
		
		System.out.println("A = "+('A'+0));  // 문자형을 십진수의 수로 알아보기위해 +0을 한다.
		System.out.println("0 = "+('0'+0));
		System.out.println("조 = "+('조'+0));
		System.out.println("(char)65 = "+(char)65);
		
		byte bt2 = 125;
		char ch2 ='C';
		int it2 = bt2 - ch2;
		System.out.println("it2 = "+it2);
		
		System.out.println("\n===== booolean 타입 =======\n");
		boolean bool = false;
		System.out.println("bool = "+bool);
		
		bool = 5>2;
		System.out.println("bool = "+bool);
		
		bool = (2.0 == 5/2);
		System.out.println("bool = "+bool);
		
		bool = ('A' == 65);
		System.out.println("bool = "+bool);
		
		bool = ('A' =='B'-1);
		System.out.println("bool = "+bool);
		
		bool = ('a' != 97);
		System.out.println("bool = "+bool);
		
	}
	
	
	
	/*
	 	=== 기억합시다!! ===
	 	int (4byte) 아래의 크기인
	 	byte(1byte), short(2byte), char(2byte) 타입이
	 	사칙연산 (+, -, *, /)을 만나면 자동적으로 int타입으로 자동형변환이 일어난다. 
	 */

}
