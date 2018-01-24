public class MethodInnerMethodTest
{
	public void showResult(int a,int b,int c){
		System.out.println(calc(a,b,c));
	}

	public String calc(int a, int b, int c){

		return "평균치 : "+ avg(a, b, c) ;
	}

	public double avg(int a, int b, int c){
		int result = sum(a,b,c);
		double result2 = (double)result/3;		// casting 연산자 (double)데이터 
										//정수 나누기 정수는 정수형이 나오므로 하나이상은 실수형으로 바까야한다
		return result2;
	}

	public int sum(int a, int b, int c){
		int result = a+b+c;
		return result;
	}

}
