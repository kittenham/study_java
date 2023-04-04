package basic;

import java.util.Scanner;

//가위바위보 게임 프로그램 작성
//=> 컴퓨터(난수값)와 사용자(키보드 입력값)의 가위바위보 대결
//=> 사용자가 이길경우 대결을 반복실행하며, 질 경우 대결을 종료.
//=> 대결종료 후 사용자의 승리 횟수를 출력.

public class RpaGameApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int count=0;		//사용자 승리횟수를 저장하기 위한 변수
		
		//가위바위보 대결 - 반복처리
		while(true) {
			//컴퓨터에게 가위바위보 중 하나를 제공받아 저장
			//=> 1 : 가위,  2: 바위,  3: 보
			//=> 1~3 범위의 정수값을 난수로 제공받아 저장
			int computer=(int)(Math.random()*3)+1;
		
			
			//사용자에게 가위바위보 중 하나를 키보드로 입력받아 저장
			//=> 입력값이 1~3 범위의 정수값이 아닌경우, 에러 메세지 출력 후 재입력.
			int user;
			while(true) {
				System.out.println("가위바위보[1:가위,2:바위,3:보] >> ");
				user=scanner.nextInt();
				if(user>=1 && user<=3) break;	//정상적인 값이 입력된 경우 반복문 종료
				System.out.println(""
						+ "[에러] 가위,바위,보 중 하나를 선택하여 입력해주세요.");		//비정상적인 값이 입력된 경우 에러메세지 출력.
			}
			
			//컴퓨터와 사용자의 가위바위보 출력
			System.out.print("[입력]컴퓨터 >> ");
			switch(computer) {
			case 1: System.out.print("가위"); break;
			case 2: System.out.print("바위"); break;
			case 3: System.out.print("보"); break;
			}
			
			System.out.println();
			
			System.out.print("[입력]사용자 >> ");
			switch(user) {
			case 1: System.out.print("가위"); break;
			case 2: System.out.print("바위"); break;
			case 3: System.out.print("보"); break;
			}
			System.out.println();
			
			
			//컴퓨터와 사용자의 가위바위보 승패를 확인하여 결과출력
			if(computer == user) {
				System.out.println("[결과] 컴퓨터와 사용자가 비겼습니다."); 	//승패없음
			} else if(computer==1 && user==2 || computer==2 && user==3 || computer==3 && user==1) {
				System.out.println("[결과] 사용자가 컴퓨터를 이겼습니다.");
				count++;		//이겼다고 끝내면 안되고 승리횟수도 출력해야하기 때문에 count++해주기!
			} else {
				System.out.println("[결과] 사용자가 컴퓨터에게 졌습니다.");
				break;		//대결종료 >> 반복문 종료
			}
			
			
			//승리횟수 출력
			if(count==0) {
				System.out.println("[메세지] 사용자가 컴퓨터에게 한 번도 이기지 못했습니다.");
			} else {
				System.out.println("[메세지] 사용자가 컴퓨터에게 "+count+"번 이겼습니다.");
			}
		
		}
		System.out.println();
	}
	
}
