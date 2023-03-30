package basic;

public class DataTypeApp {
	public static void main(String[] args) {
		//정수형(IntegerType) 리터럴 : 소숫점이 없는 숫자값
		// => Java에서 정수형 리터럴은 기본적으로 4Byte(Integer)로 표현 >> -2147483648~2147483647
		System.out.println("<<정수형(IntegerType)>>");
		System.out.println("정수형(10진수 100) = "+100);	//10진수 정수형 리터럴 출력
		System.out.println("정수형(8진수 100) = "+0100);	//10진수 앞에 0 붙이면 => 8진수 저수형 리터럴 출력
			//println() 메소드는 정수값을 무조건 10진수로 변환하여 출력
		System.out.println("정수형(16진수 100) = "+0x100);	//10진수 앞에 0x 붙이면 => 16진수 저수형 리터럴 출력
		
		System.out.println("정수형(10진수 100) = "+100L);	//숫자값L - 정수형 리터럴(8Byte - LongType)
		
		System.out.println("정수형(10진수 100) = "+2147483647);
		// 4Byte로 표현 가능한 정수값 : -2147483648~2147483647
		// 4Byte로 표현 불가능한 정수값을 사용할 경우 에러 발생
		//System.out.println("정수형(10진수 100) = "+2147483648);	//에러발생.
		//따라서 이럴때는 Long(L)type을 사용 - 정수값 뒤에 L(소문자l도 가능)을 붙여 8byte의 LongType으로 작성하여 사용한다.
		System.out.println("정수형(10진수 100) = "+2147483648L);
	
		
		//정수값을 표현하기 위한 자료형(키워드) : byte(1Byte), short(2Byte), int(4Byte), long(8Byte)
		byte a1 = 127;		//1Byte : -128~127
		short a2 = 32767;		//2Byte : -
		int a3 = 2147483647;		//21억 안 넘으면 int
		long a4 = 2147483648L;		//21억 넘으면 long
		
		System.out.println("a1 = "+a1);
		System.out.println("a2 = "+a2);
		System.out.println("a3 = "+a3);
		System.out.println("a4 = "+a4);
		
		//int a5 = 100L;		//값에 대한 손실이 발생할 수 있으므로(가능성임) 에러발생.
		long a6 = 100;		//숫자에 비해 그릇이 크므로 에러발생X(공간이 남아도는 것이라 효율은 떨어짐(공간낭비). 가독성떨어짐)
		System.out.println("a6= "+a6);
		System.out.println("===========================================");
		
		
		
		
		//실수형 리터럴 : 소수점이 있는 숫자값
		// => Java에서 실수형 리터럴은 기본적으로 8Byte(Double)로 표현 >> 부동 소수점 형식으로 숫자값 표현
		
		System.out.println("<<실수형(DoubleType)>>");
		System.out.println("실수값(4Byte) = "+12.3F);	//실수값F >> 4Byte 실수형 리터럴(FloatType)
		System.out.println("실수값(8Byte) = "+12.3);	//실수값 >> 8Byte 실수형 리터럴(DoubleType)
		
		//println() 메소드는 실수값이 아주 작거나 큰 경우 지수형태로 변환하여 출력
		System.out.println("실수값(8Byte) = "+0.0000000123);	//1.23*10의-8승
		System.out.println("실수값(8Byte) = "+1.23E+10);	//1.23*10의10승
		
		//실수값을 표현하기 위한 자료형 - float(4Byte), double(8Byte)
		float b1=1.23456789F;	//가수부를 표현하기 위한 크기(정밀도) :7자리 (넘으면 반올림됨) //float형 리터럴에 double형 숫자 적으면 error
		double b2=1.23456789;	//가수부를 표현하기 위한 크기(정밀도) :15자리
		
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		System.out.println("===========================================");
		
		
		
		
		
		//문자형(CharacterType) 리터럴 : 문자 하나를 ' ' 안에 표현 (문자 여러개X. 무조건 하나)
		// => Java에서 문자형 리터럴은 기본적으로 2Byte(Character)로 표현 
		
		//문자형 리터럴은 일반문자 외에 회피문자(제어문자)가 존재
		// 회피문자(Escape Character) : 프로그램에서 표현불가능한 문자를 표현하기 위한 문자 - \ 기호 사용
		// => '\n' : Enter (강제개행), '\t' : Tab, '\'' : '문자, '\"' : "문자, '\\' : \문자, '\0' : NULL문자
		
		// 문자형 리터럴은 내부적으로 약속된 정수값(0~65535)으로 표현 : 유니코드Unicode
		// => Alt키와 함께 문자를 누르면 나오는 값 >> 'A' : 65,  'a' : '97',  '0' : 48,  ' ' : 32,  '\n' : 13,  '가'(완성형) : 44032 
		
		System.out.println("<<문자형(CharacterType)>>");
		System.out.println("문자값(2Byte) = "+'A');
		System.out.println("문자값(2Byte) = "+'가');
		System.out.println("문자값(2Byte) = "+'\'');
		System.out.println("문자값(2Byte) = "+'\\');
		
		//문자값을 표현하기 위한 자료형 : Char (2Byte)
		char c1 = 'A';		// A라는 문자를 c1에 대입
				//문자형 변수에는 문자값에 대한 약속된 정수값이 저장
		char c2 = 65;		//문자형 변수에는 문자값 대신 약속된 정수값 저장 가능
		char c3 = 'a'-32;	//문자값에 대한 연산 결과값 저장 가능
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		
		char c4 = 45003;
		System.out.println("c4 = "+c4);
		System.out.println("===========================================");

		
		
		
		//논리형(BooleanType) 리터럴 : false(거짓), true(참) => 연산 불가능
		// => Java에서 문자형 리터럴은 기본적으로 1Byte(BooleanType)로 표현
		
		System.out.println("<<논리형(BooleanType)>>");
		System.out.println("논리값(1byte) = "+false);
		System.out.println("논리값(1byte) = "+true);
		//관계 연산자(비교 연산자)를 이용한 연산식의 결과값으로 논리형 리터럴을 사용(제공)
		
		System.out.println("논리값(1byte) = "+(20>10));
		System.out.println("논리값(1byte) = "+(20<10));

		//논리값을 표현하기 위한 자료형 : boolean(2byte)
		boolean d1 = false;
		boolean d2 = true;
		
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("===========================================");

		
		
		
		
		//문자열(StringType) 리터럴 : " " 안에 0개 이상의 문자들로 표현
		//=> 문자열은 원시형(기본형)이 아닌 참조형으로 String 클래스로 표현
		
		System.out.println("<<문자형(StringType)>>");
		System.out.println("문자열 = "+"홍길동");
		System.out.println("문자열 = "+"유관순 열사가 대한독립만세를 외쳤습니다."); 
			//대한독립만세를 강조할 때 ""바로 쓰면 X(error). \" 사용!
		System.out.println("문자열 = "+"유관순 열사가 \"대한독립만세\"를 외쳤습니다."); 
		
		//문자열을 표현하기 위한 자료형 : String 클래스 = String 객체
		String name = "임꺽정";
		System.out.println("이름 = "+name);
		System.out.println("===========================================");

		
		
	}
}
