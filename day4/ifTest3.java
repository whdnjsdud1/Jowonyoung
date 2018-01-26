package my.day4;

import java.io.IOException;

public class ifTest3 {
	public void execute(int n) {
		char ch = (char)n;
		
		String result;
		
		if ( Character.isDigit(ch))
			result ="숫자";
		else if (Character.isUpperCase(ch) )
			result = "대문자";
		else if (Character.isLowerCase(ch) )
			result = "소문자";
		else
			result = "특수기호";
		
		System.out.println("입력하신 문자"+ch+"은  "+result+" 입니다.");
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("글자 1개를 입력하세요 => ");
		int n = System.in.read();
		
		ifTest3 obj =new ifTest3();
		obj.execute(n);
	}

}
