package my.day3.quiz;

public class Student {
	String userid;
	String name;
	byte kr;
	byte eng;
	byte math;
	
	public Student() {}
	public Student(String userid,String name,byte kr,byte eng,byte math){
		this.userid=userid;
		this.name=name;
		this.kr=kr;
		this.eng=eng;
		this.math=math;
	}
	public String getExecute() {
		String result = "***"+name+"님의 성적결과\n"
			    + " 1. 학번 :"+userid+
				"\n 2. 성명 :" +name+
				"\n 3. 국어 :" +kr+
				"\n 4. 영어 :" +eng+
				"\n 5. 수학 :" +math+
				"\n 6. 총점 :" +sum(kr,eng,math)+
				"\n 7. 평균 :" +avg(kr,eng,math);
					
		return result;
	}
	public short sum(byte kr,byte eng,byte math) {
		short sum=(short)(kr+eng+math);
		return sum;
	}
	public double avg(byte kr,byte eng,byte math) {
		short avg= sum(kr,eng,math);
		double avg2=avg/3.0;
		return avg2;
	}
	public String execute(byte kr,byte eng,byte math) {
		return "\n총점 : "+sum(kr,eng,math)+"\n평균 :"+avg(kr,eng,math);
	}
	

}
