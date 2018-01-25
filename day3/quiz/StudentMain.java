package my.day3.quiz;

public class StudentMain {

	public static void main(String[] args) {
	//	학번,이름,국어,영어,수학
		Student st1 = new Student("kh0001","홍길동",(byte)90,(byte)91,(byte)93);
		Student st2 = new Student("hk002","유관순",(byte)89,(byte)90,(byte)85);
		
		
		System.out.println(st1.getExecute());
		System.out.println(st2.getExecute());
		//총점 
		//(double)평균
	}

}
