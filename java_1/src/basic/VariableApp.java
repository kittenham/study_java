package basic;

//리터럴(Literal) : 프로그램에서 사용하기 위해 표현되는 값(value)
//변수(Variable) : 리터럴(값)을 저장하기 위해 메모리memory에 부여된 이름[식별자]

public class VariableApp {
	public static void main(String[] args) {
		int su; 	// 정수값을 저장하기 위한 변수 선언(생성)
		su = 100; 	// 대입연산자(=)를 이용하여 값을 변수에 저장. 변수는 왼쪽. 값은 오른쪽에 입력.
		System.out.print("초기값 = ");
		System.out.println(su); 		//변수에 저장된 값을 화면에 출력하겠다=> ()안이 공백이기 때문에.

		//int su://동일한 이름의 변수를 재선언 할 경우 에러 발생
		su = 200; 		//기존에 변수 su에 저장되어 있던 100은 삭제됨. 새로운 값200 저장.
		System.out.print("변경값 = ");
		System.out.println(su); 	// 변수에 저장된 값을 화면에 출력
		
		System.out.println("==============================");
		int num = 100;		//변수 선언 및 초기값 저장
		System.out.println("num = " +num);		//여기서 "+"는 더하기가 아니라 결합연산자 : 문자열을 결합함
	
		// "문자열"+값 또는 값+"문자열" >> 피연산자가 하나라도 문자열이면(문자열과 값 결합) 문자열 -> 결과값 : 문자열
		System.out.println("num = " +num);
		System.out.println("==============================");
		System.out.println("올해는 "+2+0+2+3+"년입니다.");		//올해는 2023년 입니다.
		System.out.println(2+0+2+3+"년은 토끼띠해입니다.");		
		//7년은 토끼띠해입니다. => 실행오류.(잘못된 결과 발생. 실행은 되지만 결과가 이상하게 나오는 것) - 앞에 문자열 없이 숫자만 있기 때문에 더해짐.
		//프로그램을 읽을 때 왼쪽부터 오른쪽으로 읽기 때문에 맨 앞이 문자열이면 문자열로 인식한 이후로는 숫자가 와도 전부 문자열로 인식함.
		//앞에 문자열 없이 숫자가 오면 숫자자체로 인식하기 때문에 연산자가 있으면 연산을 진행. 그러나 그 이후에 문자열이 또 온다면 그 이후로는 숫자가 와도 문자열로 인식한다.
		System.out.println(""+2+0+2+3+"년은 토끼띠해입니다.");		
		//디버깅 완료. ("" : NullString 비어있는 문자열- 추가) => 2023년은 토끼띠해입니다.

		System.out.println("==============================");

		//동일한 자료형의 변수는, 기호를 사용하여 나열선언 가능.
		int num1 = 100, num2 = 200;
		System.out.println("연산결과 = "+num1+num2); // 잘못된 결과 발생. 더하기가 안됨. 문자열로 인식.(왼쪽부터 읽으니까)
		System.out.println("연산결과 = "+(num1+num2)); // 디버깅. 원하던 결과. 300. 계산 우선순서 : () → *,/ → +,-
		System.out.println("연산결과 = "+(num1*num2));
		System.out.println("연산결과 = "+num1*num2);

		
		System.out.println("==============================");
		
		int kor = 88, eng = 90;
		int tot = kor + eng;		//연산 결과를 변수(tot)에 저장. 국어점수+영어점수(88+90이지만 점수가 바뀌면 변수에 들어가는 값도 바뀔 수 있도록)
		// 값은 무조건 변수에다가 저장해서 사용하기~
		System.out.println("점수 합계 = " +tot);
		
	
		System.out.println("==============================");
		
		//변수의 값이 저장되어 있지 않은 상태에서 변수를 사용할 경우 에러 발생
		// int count;								//변수 값 저장X 상태
		// System.out.println("count = "+count);
		
		// int count = 10;
		// System.out.println("count = "+count);	//에러X
		
		// int count = 10.0;
		// System.out.println("count = "+count);	//에러0. count값이 정수가 아닌 실수값이라서.
		
		

		
	}

}
