package my.day5;

import java.util.Scanner;

public class SwitchTest2 {
	
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- Menu -----");
		System.out.println("1. 가정용(liter 당 50원)");
		System.out.println("2. 상업용(liter 당 45원)");
		System.out.println("3. 공업용(liter 당 30원)");
		System.out.println("-----------------");
		System.out.print(">> 메뉴번호를 선택하세요 => ");
		
	}
	
	public static void main(String[] args) {
		SwitchTest2.menu();
		
		Scanner sc = new Scanner(System.in);

		int menuno = Integer.parseInt(sc.nextLine());
		System.out.print(">>물의 양을 적어주세요 ==>");
		int water = Integer.parseInt(sc.nextLine());

	

		String str;
		switch (menuno) {
		case 1:
			str="==== 가정용 수도비 ====\n"+
				"1. 물사용량 : "+water+"리터\n"
			  + "2. 사용 요금 : "+(water*50)+"원\n"
			  + "3. 수도 세금 : "+(water*50*0.05)+"원\n"
			  + "4. 납부 요금 : "+(water*50)*1.05+"원\n";
			break;
		case 2:
			str="==== 상업용 수도비 ====\n"+
					"1. 물사용량 : "+water+"리터\n"
				  + "2. 사용 요금 : "+(water*45)+"원\n"
				  + "3. 수도 세금 : "+(water*45*0.05)+"원\n"
				  + "4. 납부 요금 : "+(water*45)*1.05+"원\n";
			break;
		case 3:
			str="==== 공업용 수도비 ====\n"+
					"1. 물사용량 : "+water+"리터\n"
				  + "2. 사용 요금 : "+(water*30)+"원\n"
				  + "3. 수도 세금 : "+(water*30*0.05)+"원\n"
				  + "4. 납부 요금 : "+(water*30)*1.05+"원\n";
			break;

		default:
			str="메뉴번호는 1,2,3 만 가능합니다.";
			break;
		
	
		}
		System.out.println(str);
		

	}


}
