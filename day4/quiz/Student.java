package my.day4.quiz;

import java.util.Scanner;

public class Student {
	String userid;
	String name;
	int kr;
	int eng;
	int math;
	Scanner sc=new Scanner(System.in);
	public void info() {
	
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
				
	}

	public String getExecute() {
		String result = "***"+name+"님의 성적결과\n"
			    + " 1. 학번 :"+userid+
				"\n 2. 성명 :" +name+
				"\n 3. 국어 :" +kr+
				"\n 4. 영어 :" +eng+
				"\n 5. 수학 :" +math+
				"\n 6. 총점 :" +sum()+
				"\n 7. 평균 :" +avg()+
				"\n 8. 학점: " +hakjum();
		
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
		return Math.round(avg*10)/10;
	}
	public String execute() {
		return "\n총점 : "+sum()+"\n평균 :"+avg();
	}
	public String hakjum() {
		double avg = avg();
		
		String hakjum;
		
		if(avg >=90)
			hakjum="A";
		else if(avg >= 80)
			hakjum="B";
		else if(avg >= 70)
			hakjum="C";
		else if(avg >= 60)
			hakjum="D";
		else
			hakjum="F";
		
		return hakjum;
		
	}

}
