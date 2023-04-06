package oop;


//메소드(Method) : 클래스 내부에 선언된 함수 - 멤버함수
//=>필드(멤버변수)를 이용하여 필요한 기능을 제공하기 위한 명령들의 모임
//함수(Function) : 매개변수값을 제공받아 계산(연산)하여 결과를 반환하는 명령의 모임 - 기능제공

//클래스는 두가지 용도가 있음 : 1. 라이브러리용  2. 실행용


//1. 라이브러리용 클래스 : 오로지 객체생성을 위한 클래스(or 참조가 목적인 클래스)(실행목적이 아님!) => 메인메소드가 없음!(메인 메소드 미작성)
public class Method {
	void displayOne () {	//반환형이 아닌 
		System.out.println("Method 클래스의 displayOne() 메소드 호출");
	}
	
	void displayTwo() {
		System.out.println("Method 클래스의 displayOne() 메소드 호출");
	}
	
	void prinOne() {
		int tot=0;
		for(int i=1;i<=100; i++) {
			tot+=i;
		}
		System.out.println("1~100범위의 정수들의 합계 = "+tot);
	}
	
	void prinTwo(int num) {
		// 매개변수에 저장된 값에 대한 검증
		if(num<=0) {
			System.out.println("[에러] 매개변수에는 0보다 큰 값이 저장되어야 합니다.");
			return;		//메소드 종료함.=> 메소드가 종료되면 메소드를 호출했던 곳으로 다시 되돌아가감. => return 밑에 for문은 실행안됨.
		}
		
		int tot=0;
		for(int i=1;i<=num;i++) {
			tot+=i;
		}
		System.out.println("1~"+num+"범위의 정수들의 합계 = "+tot);
	}
	
	
	
	void prinThree(int num1, int num2) {
		/*
		if(num1>num2) { 	//비정상적인 값이 전달되어 저장된 경우, 메소드 실행을 끝내는 방법
			System.out.println("[에러] 첫번째 전달값이 두번째 전달값보다 작아야 합니다.");
			return;		//메소드 종료함.=> 메소드가 종료되면 메소드를 호출했던 곳으로 다시 되돌아가감. => return 밑에 for문은 실행안됨.
		}
		*/
		
		if(num1>num2) {		//비정상적인 값이 전달되어 저장된 경우, 끝내지 않고 num1과 num2의 값을 바꾸는 방법
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		
		int tot=0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;
		}
		System.out.println(num1+"~"+num2+"범위의 정수들의 합계 = "+tot);
	}
	
	
	int returnTot(int num1, int num2) {		//void가 아님! //입출력은 프로그램이 하는것(mian메소드에서) 메소드는 계산후 반환
		int tot = 0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;
		}
		//변수에 저장된 값을 메소드를 종료하며 메소드를 호출하는 명령에게 반환
		//=> 반환되는 값의 자료형과 메소드의 반환형이 동일해야함.
		return tot;
	}
	
	
	//매개변수로 정수값을 전달받아 홀수와 짝수를 구분하여 반환하는 메소드 작성
	//=>false 반환 = 홀수,  true 반환 = 짝수	==> boolean 사용하면됨.
	boolean isOddEven(int num) {	//is 메소드는 대부분 boolean을 나타냄
		if(num%2!=0) {
			return false;
		} else {
			return true;
		}
	
	}
	
	
	//배열을 반환하는 메소드
	int[] returnArray() {
//		int[] array= {10,20,30,40,50};
//		return array;	//배열의 메모리 주소 변환 : 배열반환
	
	
//	return{10,20,30,40,50};	==> 이건 배열이 아님! 이렇게 하면 배열안만들어지고 error뜸.
	return new int[]{10,20,30,40,50}; //==>이건 배열O, 다이렉트로 배열만드는 방법(정석)
	}
	
	//매개변수 3개에 전달된 정수들의 합계를 계산하여 반환하는 메소드
	int sumOne(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	//매개변수로 배열을 전달받아 배열의 모든 요소값들의 합계를 계산하여 반환하는 메소드
	int sumTwo(int[] array) {
		int tot=0;
		for(int num:array) {
			tot+=num;
		}
		return tot;
	}
	
	
	// 매개변수 생략 기호(...)를 이용하여 매개변수를 작성하면 값을 0개 이상 전달받아 메소드에서 배열처럼 사용 가능(무조건 1차열배열만)
	// 따라서 원하는데로 출력해도 됨. => 한마디로, 매개변수의 개수가 부정확할때 사용.
	int sumThree(int... array) {		// "..." 점 3개 : 매개변수 생략기호		//값들로 전닯받아 배열처럼 사용가능
		int tot=0;
		for(int num:array) {
			tot+=num;
		}
		return tot;
	}
	
	
}
