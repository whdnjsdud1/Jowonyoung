package my.day4.quiz;


public class StudentMain {

	public static void main(String[] args) {
	//	학번,이름,국어,영어,수학
	
		
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.info();
		st2.info();
		
		System.out.println(st1.getExecute());
		System.out.println(st2.getExecute());
		//총점 
		//(double)평균
	}

}
