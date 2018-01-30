package my.day5;


import java.util.Scanner;

public class Student {
	String userid;
	String name;
	int kr;
	int eng;
	int math;
	Scanner sc=new Scanner(System.in);
	/*public void info() {
	
		System.out.print("학번 : ");
		userid=sc.nextLine();
		
		System.out.print("이름 : ");
		name=sc.nextLine();
		
		System.out.print("국어 : ");
		kr=Integer.parseInt(sc.nextLine());
		
		System.out.print("영어 : ");
		eng=Integer.parseInt(sc.nextLine());
		
		System.out.print("수학 : ");
		math=Integer.parseInt(sc.nextLine());
		
		System.out.println("");
				
	}*/

	public String getExecute() {
		String result = "***"+name+"님의 성적결과\n"
			    + " 1. 학번 :"+userid+
				"\n 2. 성명 :" +name+
				"\n 3. 국어 :" +kr+
				"\n 4. 영어 :" +eng+
				"\n 5. 수학 :" +math+
				"\n 6. 총점 :" +sum()+
				"\n 7. 평균 :" +avg()+
				"\n 8. 학점: " +hakjum()+
				"\n 9. 선물: " +gift();
		
		sc.close();
		return result;
	}
	public int sum() {
		int sum=kr+eng+math;
		return sum;
	}
	public double avg() {
		int total = sum();
		double avg=total/3.0;
		return Math.round(avg*10)/10.0;
	}
	public String execute() {
		return "\n총점 : "+sum()+"\n평균 :"+avg();
	}
	public String hakjum() {
		
		String hakjum="";
		
	/*
		switch (변수 또는 수식) { // 변수 또는 수식이 조건에 해당됨.
							  // 변수 또는 수식의 타입은 byte, short, char, int 형이어야 한다.
							  // long 은 불가하다. float, double 불가하다.
							  // JDK 1.7 (== JDK 7.0) 이후 부터는 String 타입도 허용한다.
		case 값1:
			실행문1;
			break;		//{} 을 빠져나간다.
		
		case 값2:
			실행문2;
			break;		//{} 을 빠져나간다.
		
		case 값3:
			실행문3;
			break;		//{} 을 빠져나간다.
		
		default:
			실행문n;
			break;		//{} 을 빠져나간다.
		}
	*/
		double avg = avg();// 100.0  94.3  85.2
		
		
		switch ((int)avg/10) { // 100 94 85 71 68 52 49	
							// 10   9  8  7  6 5  4
		case 10:
		case 9:
			hakjum = "A";
			break;
		case 8:
			hakjum = "B";
			break;
		case 7:
			hakjum = "C";
			break;
		case 6:
			hakjum = "D";
			break;

		default:
			hakjum = "F";
			break;
		}

		return hakjum;
		
	}
	public String gift() {
		String gift ="";
		
		switch (hakjum()) {
		case "A":
			gift += "놀이공원 이용권,";
		case "B":
			gift += "뷔페식사권, ";
		case "C":
			gift += "치킨, ";
		case "D":
			gift += "아이스크림";
			break;
			
		default:
			gift = "꿀밤";
			break;
		}
		
		return gift;
	}

}
