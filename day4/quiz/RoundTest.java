package my.day4.quiz;

public class RoundTest {

	public static void main(String[] args) {

		double db1=93.45678, db2=86.8765;
		System.out.println("db1 = "+db1+" , db2="+db2);
		
		System.out.println("\n=== 반올림 후 ===\n");
		
		System.out.println("db1 = "+Math.round(db1)+" , db2="+	Math.round(db2));
	
		System.out.println("\n=== 특정 소수부 자리에서 반올림 후 ===\n");
		
		System.out.println("db1 = "+Math.round(db1*10)/10.0+" , db2="+Math.round(db2*10)/10.0);
		// 93.45678  ==> 93
		// 93.45678 *10
		// 934.5678  ==> 935
		// 935/10.0  ==> 93.5
		
		//93.45678 * 100 ==> 9345.678
		//9346 / 100.0   ==> 93.46
		

	}

}
