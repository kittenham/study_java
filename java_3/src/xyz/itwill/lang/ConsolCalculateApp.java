package xyz.itwill.lang;

import java.util.InputMismatchException;
import java.util.Scanner;

//키보드로 사칙 연산식을 입력받아 연산결과를 계산하여 출력하는 프로그램 작성
//ex) 연산식 입력 >> 20 + 10
//  [결과]30
//=> 입력 연산식에서 사용 가능한 연산자는 사칙 연산자(*,/,+,-)만 허용
//=> 형식에 맞지 않는 연산식이 입력된 경우 에러 메세지 출력 후 프로그램 종료
//=> 입력 연산식에 공백 입력이 가능하도록 처리

public class ConsolCalculateApp {

	public ConsolCalculateApp() throws InputMismatchException {
		
		Scanner scanner = new Scanner(System.in);
		//일단은 키보드로 연산식을 입력받는게 첫번째.
		System.out.print("연산식 입력 >> ");
		
		//두번째로 입력결과값이 잘 나와야 겠지.
		//숫자 두개를 더해야 하니까 숫자를 저장하는 변수는 두개가 존재해야 하고,
		//사칙 연산자를 저장할 변수도 하나 필요하다.
		//입력 연산식에서는 공백 입력이 가능하도록 해서 숫자와 연산자의 구분이 가능하도록 한다.
		
		int num1 = scanner.nextInt();
		String four = scanner.next();
		int num2 = scanner.nextInt();
		
		switch(four) {
		case "+" : System.out.println("[결과] "+(num1+num2)); break;
		case "-" : System.out.println("[결과] "+(num1-num2)); break;
		case "*" : System.out.println("[결과] "+(num1*num2)); break;
		case "/" : System.out.println("[결과] "+(num1/(double)num2)); break;
		}
		
		scanner.close();
		
		}
		
		//공백 입력이 되야만 연산처리가 가능해지므로 공백이 있든 없든 모두 가능하게 처리하고 싶다.
		//공백이 입력될 때 InputMismatchException가 나타남.
		//형식에 맞지 않는 연산식이 입력된 경우 프로그램 자체가 실행이 안됨.
		

	public static void main(String[] args)  {
		try {
			new ConsolCalculateApp();
		}catch(InputMismatchException e) {
			System.out.println("[에러] 입력 연산식이 형식에 맞지 않습니다.");
		}
		//입력연산식에서  사칙 연산자가 아닌 다른 연산자를 썼을때의 오류메세지와
		//공백입력이 가능하도록 처리하는 것이 따로 오류메세지가 떠야할까?
		//공백입력은 공백입력이 되든 안되든 둘다 가능해야 하나?
		//InputMismatchException으로 예외처리했더니 공백없이 입력, 다른연산자 입력 모두 이걸로 뜸.
		
	}
	
		
}
	

