/*
	Escape 문자 ==> 제어문자
	-- 인쇄할 수 없거나 키보드로 표현할 수 없는 특별한 문자를 가리키며,
	역슬래쉬(\)와 한개의 문자를 결합하여 작성한다.

	\n  ==> 개행. 스크린(화면) 커서의 위치를 다음 줄의 처음으로 옮긴다.
	\t  ==> 수평탭. 스크린(화면) 커서를 다음 탭으로 옮긴다.
	\r	==> 캐리지 리턴.스크린(화면) 커서의 위치를 현재 줄의 처음으로 옮긴다.개행 하지는 않는다. 이기호 다음에 오는 문자를 덮어 씌운다.
	\\  ==> 역슬래쉬를 출력할때 사용한다. (1개)
	\"  ==> 큰 따옴표를 출력할때 사용한다.
	\'  ==> 작은 따옴표를 출력할때 사용한다.
*/
public class Escape 
{
	public static void main(String[] args) 
	{
		System.out.print("--- Escape 문자 ---");
		System.out.println("\n국어\t영어\t수학");

		System.out.println("");

		System.out.println("이번엔 캐리지 리턴을 써볼까요?\r두");
		
		System.out.print("어떻게 될까요?");
		System.out.print("안녕하세요?\r\n");
		System.out.print("식사하셧습니까?");

		System.out.println("");

		System.out.print("김소월 님의\t\'진달래\'\n");
		System.out.print("\"\t\t나보기가 역겨워 가실 때에는\t\"\n");
		System.out.print("c:\\진달래.hwp");

	}
}
