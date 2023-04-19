package xyz.itwill.util;

import java.util.Random;
import java.util.Scanner;

//<숫자야구게임을 만들어보자.>
//숫자야구게임 : 0~9 범위의 정수 난수값을 3개 제공받아 키보드로 입력하여 맞추는 게임
//(조건)
//1. 난수값과 키보드 입력값은 0~9 범위의 3개의 범수값으로 서로 다르며 0으로 시작불가능하다.
//2. 키보드 입력값이 형식에 맞지 않은 경우 재입력되도록 작성
//3. 난수값과 입력값을 비교하여 동일한 정수값이 존재하는 경우 위치가 같으면 스트라이크, 다르면 볼로 처리.
//4. 스트라이크가 3개면 정답처리.=> 성공메세지 출력후 프로그램종료.
//5. 정답이 아니면 스트라이크와 볼의 개수를 출력한다.
//6. 키보드 정수값을 입력할 수 있는 기회는 15번을 제공. 
//7. 기회를 모두 소진한 경우 정답을 출력한다.
public class BaseballGameApp {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		//0~9 범위의 정수값 3개를 저장하기 위한 배열 선언 - 난수값을 배열요소에 저장
		int[] dap = new int[3];
		
		//0~9 범위의 정수값 3개를 저장하기 위한 배열 선언 - 난수값을 배열요소에 저장
		int[] num = new int[3];
		
		//while 나오는 이유 : 0~9 범위의 3개의 범수값으로 서로 다르며 0으로 시작불가능한 것인지 올바른 값인지 검증하기 위해
		//규칙에 맞는 난수값을 배열요소에 저장되도록 처리하기 위한 반복문 (따라서, 정상적일때 break 처리해서 나가야함)
		while(true) {	
			for(int i=0;i<dap.length;i++) {
				dap[i]=random.nextInt(10);	//0~9 범위의 난수값을 배열 요소에 저장
			}
			if(dap[0]!=0 && dap[0]!=dap[1] && dap[1]!=dap[2] && dap[2]!=dap[0]) break;	
			//세자리 수밖에 안되기 때문에 이렇게 썼지만, 수가 많아지면 중복처리 안되게하는 식 사용하면 됨.
		}
		
		Scanner sc = new Scanner(System.in);
		
		//키보드로 정수값을 입력받아 비교 처리하는 기회를 제공하기 위한 반복문
		for(int cnt=1;cnt<=15;cnt++) {
			
			//스트라이크와 볼의 갯수를 저장하기 위한 변수 선언
			int strike=0, ball=0;
			
			loop:
			while(true) {
				System.out.println(cnt+"번째 입력 >> ");
				String input = sc.nextLine();
				
				if(input.length()!=3){	//비정상적인 값이 입력된 경우(이경우에는 3글자를 입력하지 않았을 경우임)
					System.out.println("[에러] 3자리의 숫자만 입력 가능합니다.");
					continue;	//바로 위의 while문으로 올라가 다시 입력 반복 (여기서는 break가 아닌 continue를 써야 반복이 됨)
					}
				
				//입력받은 문자열의 문자를 차례대로 추출하여 배열요소에 저장할 것.
				for(int i=0;i<num.length;i++) {
//					num[i]=input.charAt(i);	// input이라는 String객체에 저장된 문자열에서 i번째 문자를 뽑아내서 배열요소에 저장하라는 말.
					//근데 그냥 저장하면 문자라서, 숫자로 변환해야함.
					num[i]=input.charAt(i)-'0';	//이렇게하면 문자가 숫자로 변환됨.
					
					//문자코드(CharacterCode) - '0'=48, ~ '9'=57
					//ex)  '4'-'0' = 52-48 = 4
					//num[i]=input.charAt(i)-'0'  >> 문자값 → 정수값으로 변환
					
					if(num[i]<0 || num[i]>9) {	//비정상적인 값이 입력된 경우
						System.out.println("[에러] 3자리의 숫자만 입력 가능합니다.");
						continue loop;	//바로위의 반복문(여기서는 if문)을 반복하는 것이 아닌 loop이름을 가진 반복문을 반복해주세요.(여기서는 loop:while문)
					}
				}
				
				if(num[0]!=0 && num[0]!=num[1] && num[1]!=num[2] && num[2]!=num[0]) break;
				System.out.println("[에러] 0으로 시작되거나 중복된 숫자가 존재합니다.");

				
			}
		}
		
		
	}
	
	
	

}
