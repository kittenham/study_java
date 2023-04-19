package xyz.itwill.lang;

import java.util.Scanner;

//키보드로 사칙 연산식을 입력받아 연산결과를 계산하여 출력하는 프로그램 작성
//ex) 연산식 입력 >> 20 + 10
//[결과]30
//=> 입력 연산식에서 사용 가능한 연산자는 사칙 연산자(*,/,+,-)만 허용
//=> 형식에 맞지 않는 연산식이 입력된 경우 에러 메세지 출력 후 프로그램 종료
//=> 입력 연산식에 공백 입력이 가능하도록 처리

//[강사풀이]
public class ConsolCalculateAppA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산식 입력 >> ");	//(처음 입력받는 문자들은 전부 문자열(String)임)

		
		//키보드로 연산식을 입력받아 모든 공백 제거하여 변수에 저장
		//(입력받을때는 공백이 있어도 상관없지만 변수에 입력될때는 공백이 없도록 처리)
		String operation = sc.nextLine().replace(" ", ""); 	
//		System.out.println("operation = "+operation);
		
		sc.close();
		
		//연산식에서 검색할 연산자가 저장된 문자열 배열 선언		
		String[] operatorArray= {"*","/","+","-"};	
		
		//연산식에서 연산자를 검색하여 연산자의 시작위치(Index)를 반환받아 저장
		int index=-1;	//연산자의 시작위치 저장하기 위한 변수 .
		//-1인 이유) 시작위치는 0부터 주면안됨. 인덱스는 0부터 시작하니까 아직 못찾았을때 0부터 주면안됨. 더 앞부터.
		
		for(String operator : operatorArray) {
			index = operation.lastIndexOf(operator);		//이렇게 하면 음수값이 인식이 안됨.
			//String.lastIndexOf(operation) : String 객체에 저장된 문자열에서 매개변수로 전달받은 문자열(문자)을 
			//끝부터 차례대로 검색하여 시작위치를 반환하는 메소드
			//=> 매개변수로 받은 문자열을 찾을 수 없는 경우 : -1 을 반환
			
			//연산식에서 연산자가 검색된 경우 반복문 종료
			if(index!=-1) break;
		}
		
		if(index<=0 || index>=operation.length()-1) {	//=연산자가 없거나, 연산자가 식의 맨 앞에 있다면 or 연산자가 식의 맨 마지막에 있을때.(잘못된 연산식)
			System.out.println("[에러] 연산식을 잘못 입력했습니다.");
			System.exit(0);
		}
		
		try {
			//입력받은 문자열의 첫번째 피연산자를 분리하여 정수값으로 변환하여 저장
			//=>Integer.parseInt(String str) 메소드 호출시 NumberformatException 발생 가능(개발자가 스스로 예외를 만들어준것). 따라서 예외처리
			int num1=Integer.parseInt(operation.substring(0, index));	//substring이 아니라 String.split(String regEx) 써도 됨.
			
			//연산자를 분리하여 저장
			String operator = operation.substring(index, index+1);
			
			//두번째 피연산자를 분리하여 정수값으로 변환하여 저장
			int num2=Integer.parseInt(operation.substring(index+1));
			
			//연산자를 비교하여 피연산자에 대한 연산결과를 계산하여 저장
			int result = 0;
			
			switch(operator) {
			case "*" : result = num1*num2; break;
			case "/" : result = num1/num2; break;
			case "+" : result = num1+num2; break;
			case "-" : result = num1-num2; break;
			}
			
			//연산결과값 출력
			System.out.println("[결과]"+result);

			
		}catch(NumberFormatException e) {
			System.out.println("[에러] 연산식에 숫자가 아닌 값이 입력되었습니다.");
		}catch(ArithmeticException e) {
			System.out.println("[에러] 0으로 나눌 수 없습니다..");
		}catch(Exception e) {
			System.out.println("[에러] 프로그램에 예기치 못한 오류가 발생 되었습니다.");
		}
	}


}
