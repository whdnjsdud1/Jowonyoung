package my.day5.quiz;

import java.util.Scanner;

public class Switchquiz {
static Scanner sc = new Scanner(System.in);
 int num1 ,num2;
 String yun;
	public Switchquiz(){
		
		System.out.print("첫번째 수를 입력하세요 ");
		num1 =Integer.parseInt(sc.nextLine());
		System.out.print("두번째 수를 입력하세요 ");
		num2 =Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 선택하세요 :");
		yun =sc.nextLine();
		
	}
	
	public void show() {
		String dap = "";
		switch (yun) {
		case "+":
			dap=Integer.toString(num1+num2);
			break;
		case "-":
			dap=Integer.toString(num1-num2);
			break;
		case "*":
			dap=Integer.toString(num1*num2);
			break;
		case "/":
			dap=Double.toString((double)num1/num2);
			break;
		case "%":
			dap=Integer.toString(num1%num2);
			break;
		
		default:
			break;
		}
		System.out.println("결과 "+num1+yun+num2+" = "+dap);
		
	}

}
