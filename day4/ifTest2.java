package my.day4;

import java.io.IOException;
import java.util.Scanner;

public class ifTest2 {
	public void execute(int n) {
		char ch = (char)n;
		
		String result;
		
		if ( ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z'))
			result ="영문자";
		else if ( '0' <=ch && ch <= '9')
			result = "숫자";
		else
			result = "특수기호";
		
		System.out.println("입력하신 문자"+ch+"은 "+result+" 입니다.");
	}
	public static void main(String[] args) 
		throws IOException{
			
			System.out.print("글자 1개를 입력하세요 => ");
		int n = System.in.read();
		
		ifTest2 obj =new ifTest2();
		obj.execute(n);
		
	
		
		/*
		Scanner sc =new Scanner(System.in);
		
		System.out.print("글자 1개를 입력하세요 => ");
		
		sc.nextLine();
*/
		}
	}

