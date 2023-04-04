package basic;

import java.util.Scanner;

//키보드로 점수를 입력받아 학점을 계산하여 출력하는 프로그램 작성
//=> 100~90 : A, 89~80 : B, 79~70:C, 69~60:D, 59~0:F
//키보드로 입력된 점수가 0~100 범위의 정수값이 아닌 경우 에러 메세지 출력 후 재입력되도록

public class InputCheckApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("점수입력[0~100] >> ");		
		int score = scanner.nextInt();					// 잘못된 값이 들어와도 F학점이 뜸.
				
		String grade="";
		switch(score/10) {
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F";
					
		}
		
		System.out.println("[결과] "+score+"점 = "+grade+"학점");
		*/
		
		//방법1.
		//반복문의 조건식이 무조건 참이 되도록 비정상적인 값을 초기값으로 저장해야함.
		int score=-1;			//※초기값으로 비정상적인 값을 넣어야함.
		while(score<0 || score>100) {		//=>비정상적인값일때, 반복되도록 조건식 만들기. 
					//입력을 몇 번을 해야하는지 알 수 없음(정상적인값이 들어올때까지 반복하니까.) => while 반복문 사용.
			System.out.println("점수입력[0~100] >> ");
			score=scanner.nextInt();
			if(score<0 || score>100) {
				System.out.println("[에러] 점수는 0~100 범위의 정수값만 입력 가능합니다.");
			}
		}
		
		System.out.println("===========================================");

		
		//방법2/.
		int score2;			//score2의 초기값 입력할 필요X. do-while문 안에서 사용자가 값을 입력할 것이기 때문.
		do {		
			System.out.println("점수입력[0~100] >> ");
			score2=scanner.nextInt();
			if(score2<0 || score2>100) {
				System.out.println("[에러] 점수는 0~100 범위의 정수값만 입력 가능합니다.");
			}
		} while(score2<0 || score2>100);
		//비효율적 이유- 똑같은 조건식을 두번 써야 한다는점.
		
		System.out.println("===========================================");

		
		//방법3. 가장 효율적인 방법. 내가 원할때 break를 통해 반복문을 나갈 수 있음.
		int score3;			
		while(true) {		//조건식 대신 [true]를 사용하면 무조건 참 - 무한루프
			System.out.println("점수입력[0~100] >> ");
			score3=scanner.nextInt();
			if(score3>=0 || score3<=100) break;
			System.out.println("[에러] 점수는 0~100 범위의 정수값만 입력 가능합니다.");
		}
		
		
		//무조건 한번은 실행.
	}

}
