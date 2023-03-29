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
		int a3 = 2147483647;
		long a4 = 2147483648L;
		
		System.out.println("a1 = "+a1);
		System.out.println("a2 = "+a2);
		System.out.println("a3 = "+a3);
		System.out.println("a4 = "+a4);
		
		//int a5 = 100L;		//값에 대한 손실이 발생할 수 있으므로(가능성임) 에러발생.
		long a6 = 100;		//숫자에 비해 그릇이 크므로 에러발생X(공간이 남아도는 것이라 효율은 떨어짐. 가독성떨어짐)
		System.out.println("a6= "+a6);
		System.out.println("==============================");
		
		//실수형 리터럴 : 소수점이 있는 숫자값
		// => Java에서 실수형 리터럴은 기본적으로 8Byte(Double)로 표현 >> 부동 소수점 형식으로 숫자값 표현
		
		

		System.out.println("<<실수형(DoubleType)>>");
		System.out.println("실수값(4Byte) = "+12.3F);	//실수값F >> 4Byte 실수형 리터럴(FloatType)
		System.out.println("실수값(8Byte) = "+12.3);	//실수값 >> 8Byte 실수형 리터럴(DoubleType)
		
		//println() 메소드는 실수값이 아주 작거나 큰 경우 지수형태로 변환하여 출력
		System.out.println("실수값(8Byte) = "+0.0000000123);	//1.23*10의-8승
		System.out.println("실수값(8Byte) = "+1.23E+10);	//1.23*10의10승
		
		//실수값을 표현하기 위한 자료형 - float(4Byte), double(8Byte)
		float b1=1.23456789F;	//가수부를 표현하기 위한 크기(정밀도) :7자리 (넘으면 반올림됨)
		double b2=1.23456789;	//가수부를 표현하기 위한 크기(정밀도) :15자리
		
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		System.out.println("==============================");
		
		
	}
}
