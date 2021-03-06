// 1줄 주석문

/*
	여러줄
	주석문
*/

/**
	문서화 주석
	-->javadoc 를 이용해서 API 문서를 만들때 사용한다.
*/

// ==== *** CLASS(클래스)의 구조*** -----
/*
	CLASS(클래스)는 어떠한 어플리케이션 제작시 필요한 설계도면 이라고 생각하자.

	1.패키지 선언문
		==>패키지란 클래스가 저장되어진 디렉토리 경로라고 보면 된다.
		
		package 패키지명 ; ==> 패키지명은 반드시 소문자로 시작해야 한다.

		예> package my.com;
	

	2.import 문

		예> import 패키지명.클래스명;

		import java.lang.String;
		import java.lang.System;
		import java.lang.*;

	3.클래스 선언문

	4.컴파일하기

	5.실행하기
*/

import java.lang.String;
import java.lang.System;
import java.util.Date;

public class Hello
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Java!");
		System.out.println("안녕하세요? 반갑습니다.~~^^");
		//System.out 은 모니터를 뜻함.
		//System.out.println("문자열"); 은 실행한 후 자동적으로 줄바꿈이 일어남.
		
		System.out.print("hi java");
		System.out.print("열심히 합시다.");
		System.out.print("\n나는 자바를 공부합니다.");
		// \n 은 한줄 바꿈을 말한다.
		System.out.println("");

		System.out.println(new Date());
		//현재날짜를 나타내어 본다.
		// new Date() 가 현재 시스템의 날짜시간을 얻어오는 것이다.
	}
}

/*
c:\myjava\day1>javac Hello.java
(기계어로 컴파일)
Hello.class 가 생김
c:\myjava\day1>java Hello

*/