package my.day4;

import java.util.Scanner;

public class ifTest1 {

		public void execute(int n){
			String result = (holjak(n)==0)?"짝수입니다.":"홀수입니다.";
			System.out.println("입력하신 숫자 "+n+"은 "+result);
		}
		public int holjak(int n) {
			// 파라미터(매개변수) n값이 홀수이라면 1을 리턴시키고
			// 파라미터(매개변수) n값이 홀수이라면 0을 리턴시킨다.
			if(n%2 == 0)
				return 0;
			else 
				return 1;
		}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 => ");
		
		int n =Integer.parseInt(sc.nextLine());
		
		ifTest1 obj =new ifTest1();
		obj.execute(n);
		
		sc.close();
	}

}
