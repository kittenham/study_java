package example;

//컴퓨터로부터 제공받은 정수 난수값을 키보드로 입력하여 맞추는 프로그램을 작성하세요.
//=> 1~100 범위의 정수 난수값을 제공받도록 작성
//=> 난수값을 맞출 수 있는 기회는 10번만 제공되도록 작성
//=> 키보드 입력값이 1~100 범위가 아닌 경우 메세지 출력 후 재입력
//=> 난수값과 입력값이 같은 경우 입력 횟수 출력 후 프로그램 종료
//=> 난수값과 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메세지 출력
//=> 난수값을 10번 안에 맞추지 못한 경우 난수값이 출력되도록 작성
// => 1~100 범위의 정수 난수값을 제공받도록 작성
// => 난수값을 맞출 수 있는 기회는 10번만 제공되도록 작성
// => 키보드 입력값이 1~100 범위가 아닌 경우 메세지 출력 후 재입력
// => 난수값과 입력값이 같은 경우 입력 횟수 출력 후 프로그램 종료
// => 난수값과 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메세지 출력
// => 난수값을 10번 안에 맞추지 못한 경우 난수값이 출력되도록 작성

import java.util.Scanner;

public class UpAndDownExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int computer = (int) (Math.random() * 100) + 1; 	//1~100 범위의 정수 난수값을 제공받아 변수에 저장

		System.out.println("1~100범위의 정수를 입력하세요 >>");

		int count = 0;

		for (count = 1 ; count <= 10; count++) {
			int user = 0;

			while (true) {		//잘못된 값인가 검증하는 반복문임. 옳은 값이면 반복문 탈출 후 밑의 if문 실시됨.

				user = scanner.nextInt();
				if (user >= 1 && user <= 100)	//옳은 값일 경우 반복문 종료.(전체적인 while문 종료)
					break;
				System.out.println("[에러] 잘못된 입력값입니다. 1~100 범위의 숫자를 입력해 주세요.");

			}
			if (user > computer) {
				System.out.println("정답은 해당 숫자보다 작은 값입니다. 더 큰 값을 입력해 주세요.");
			} else if (user < computer) {
				System.out.println("정답은 해당 숫자보다 큰 값입니다. 더 작은 값을 입력해 주세요.");
			} else {
				System.out.println("정답입니다. "+count+"번 만에 맞췄습니다.");
				break;
			}

		}
		System.out.println(computer);



/*설계
1. 시작
2. 컴퓨터의 난수값 정하기
3. 사용자 입력의 반복.(10번)=> 반복 숫자가 정해져있기 때문에 for문 사용.
3-1. 사용자의 입력
3-2. 컴퓨터의 난수값과 사용자의 입력값을 비교 (작은값, 큰값, 정답)
3-3. 10번 안에 난수값을 못 맞추면 화면에 난수값(정답) 출력


*/

		//<강사풀이>
		int dap=(int)(Math.random()*100)+1;
		
		boolean result=false; 		//정답상태를 저장하기 위한 변수 => [false : 정답을 맞추지 못한 상태,  true : 정답을 맞춘 상태.]
		
		for(int cnt=1;cnt<=10;cnt++) {	
			int input;
			while(true) {	//1~100범위의 정수값만 허용할 수 있도록 범위설정하기. 옳은 값일때 while반복문 빠져나감.
				System.out.println(cnt+"번째 정수값 입력[1~100]");
				input=scanner.nextInt();
				if(input>=1&&input<=100) break;	//정상적인 값이 입력된 경우 반복문 종료
				System.out.println("[에러] 1~100범위의 정수값만 입력해 주세요.");
			}
			
			if(dap==input) {
				System.out.println("[메세지] 축하합니다. "+cnt+"번 만에 맞췄습니다.");
				break;	//for(int cnt=1;cnt<=10;cnt++) 반복 종료
			}else if(dap>input) {
				System.out.println("[결과]"+input+"보다 큰 값을 입력해 보세요.");
			}else {
				System.out.println("[결과]"+input+"보다 작은 값을 입력해 보세요.");
			}
		}
		
		if(!result) {	//result가 true면 정답이니까 실행할 필요 없고, result에 저장된 값이 true가 아닌 경우 메세지를 출력하기 위함.
			System.out.println("[메세지] 정답을 맞추지 못했군요. 정답은 ["+dap+"] 입니다.");
		}
		
		scanner.close();

		
		
		
	}

}