package basic;

//제어문(Control Statement)
//=> 선택문(If, switch), 반복문(for, while), 기타 제어문(break, continue, return)

// if문  :  조건식에 의해 명령을 선택 실행
// 형식1) If(조건식) { 명령; 명령; … }
// 형식2) If(조건식) { 명령; 명령; … } else { 명령; 명령; … }
// 형식3) If(조건식) { 명령; 명령; … } else if { 명령; 명령; … } else if { 명령; 명령; … } else { 명령; 명령; … }



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
		
		System.out.println("===========================================");

		boolean sw = true;		//boolean : 어떤 동작의 상태 저장시 사용
		
		/*
		if(sw==true) {
			System.out.println("현재 변수값은 [참]입니다.");
		} else {
			System.out.println("현재 변수값은 [거짓]입니다.");
		}
		*/
		
		//if문에서 조건식대신 boolean 변수값을 사용하여 명령을 선택해 실행 가능
		if(sw) {
			System.out.println("현재 변수값은 [참]입니다.");
		} else {
			System.out.println("현재 변수값은 [거짓]입니다.");
		}
		
		/*
		if(!sw) {		//Not 연산자. 명령도 참일때와는 반대여야 결과가 잘나옴
			System.out.println("현재 변수값은 [거짓]입니다.");
		} else {
			System.out.println("현재 변수값은 [참]입니다.");
		}
		*/
		
		System.out.println("===========================================");

		int jumsu = 85;
		
		//변수값이 0~100 범위의 유효값인지 아닌지를 구분하여 출력하는 프로그램 작성
		//=> 입력값에 대한 유효성 검증
		if(jumsu>=0 && jumsu<=100) {
			//System.out.println("[결과] 0~100 범위의 정상적인 점수가 입력 되었습니다.");	//바로 결과 출력
			
			//참일 때 바로 출력하는게 아니라 변수값으로 등급을 구분하여 출력하는 프로그램 작성 해보기
			//100~90 : A, 89~80 : B, 79~70 : C, 69~69 : D, 59~0 : F
			String grade = "";		//학점을 저장하기 위한 변수 설정 	//디버그하면 grade 값이 없어서 디버그 결과 안나옴
									//변수를 설정할 때는 초기값 설정 해줘야함(아니면 error 뜸) 초기값 없으면 "" Null 사용.
			if(jumsu>=90 && jumsu<=100) {		//if문 안의 if문
				grade = "A";
			}
			else if(jumsu>=80 && jumsu<=89) {
				grade = "B";
			}
			else if(jumsu>=70 && jumsu<=79) {
				grade = "C";
			}
			else if(jumsu>=60 && jumsu<=69) {
				grade = "D";
			}
			else if(jumsu>=0 && jumsu<=59) {
				grade = "F";
			}
			
			/* 위의 if문을 간결하게 작성해보기↓
			
			String grade; 			//	
			if(jumsu>=90) {		//밖의 if문에서 100보다 작다는 조건이 나왔으므로 여기서는 jumsu<=100을 다시 쓰지 않아도 됨.
				grade = "A";
			}
			else if(jumsu>=80) {	//
				grade = "B";
			}
			else if(jumsu>=70) {
				grade = "C";
			}
			else if(jumsu>=60) {		//밖의 if문에서 jumsu는 0보다 크다는 조건이 있으므로 jumsu>0를 쓸 필요X. 따라서
				grade = "D";
			}
			else {
				grade = "F";			//모든 조건이 거짓인 경우 실행되는 명령. => 따라서 grade 초기값 설정 안해도됨.
			
			} 
			 
			*/
			
			System.out.println("[결과] "+jumsu+"점 = "+grade+"학점");
		} else {
			System.out.println("[결과] 0~100 범위를 벗어난 정상적인 점수가 입력 되었습니다.");
		}
		
		System.out.println("===========================================");

		
	}

}
