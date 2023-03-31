package basic;

//제어문(Control Statement)
//=> 선택문(If, switch), 반복문(for, while), 기타 제어문(break, continue, return)

//> if  :  조건식에 의해 명령을 선택 실행
// 형식1) If(조건식) { 명령; 명령; … }
// 형식2) If(조건식) { 명령; 명령; … } else { 명령; 명령; … }


public class IfApp {
	public static void main(String[] args) {
		int su= 90;
		int suu=40;
		
		System.out.println("su = "+su); 		//무조건 실행됨.
		
		//변수값이 50 이상인 경우에만, 화면에 출력되도록 프로그램 작성하고 싶을 때,
	// if문 사용.
		if(su>=50) {
		System.out.println("su = "+su);
		}
		if(suu>=50) {
		System.out.println("suu = "+suu);
		}										//출력 안 됨.
	
		//블럭{ } 내부에 작성된 명령이 하나만 작성된 경우, 블럭{ } 기호 생략 가능
		if(su>=50) System.out.println("su = "+su);
		
		System.out.println("===========================================");

		int score=80;
		
		//변수 값이 60 이상인 경우 합격 메세지를 출력하고 60 미만인 경우 불합격 메세지가 출력되도록 프로그램 작성
		if(score>=60) {
			System.out.println("[결과]점수가 60점 이상이므로 <합격>입니다.");
		}
		if(score<60) {
			System.out.println("[결과]점수가 60점 미만이므로 <불합격>입니다.");
		}
		
		System.out.println("===========================================");
		
	//if-else문
		if(score>=60) {
			System.out.println("[결과]점수가 60점 이상이므로 <합격>입니다.");
		} else {
			System.out.println("[결과]점수가 60점 미만이므로 <불합격>입니다.");
		}

		
		//변수값을 홀수 또는 짝수로 구분하여 출력하는 프로그램 작성
		int num=9;
		/*
		if(num%2 !=0) {
			System.out.println("홀수");
		}
		if((num%2 ==0) {
			System.out.println("짝수");
		}
		*/
		if(num%2 !=0) {
			System.out.println(num+" = 홀수");
		} else {System.out.println(num+" = 짝수");
		
		}

		System.out.println("===========================================");

		char mun = 'O';		//영문자O
		char mun2 = '0';	//숫자0
		
		//문자변수에 저장된 문자값을 영문자와 비영문자로 구분하여 출력하는 프로그램 작성
		//=> X>=작은값 && X<큰값  :  X는 작은값부터 큰값 사이의 범위 안에 표현되는 값이다.(범위조건식,범위연산식)
		if(mun>'A' && mun<'Z' || mun>'a' && mun<'z') {			//연산순서 : & -> ^ -> |
			System.out.println("[결과] "+mun+" = 영문자");
		} else {
			System.out.println("[결과] "+mun+" = 비영문자");
		}
		
	}

}
