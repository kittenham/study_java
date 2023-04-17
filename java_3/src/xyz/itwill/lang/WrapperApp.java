package xyz.itwill.lang;


//Wrapper 클래스 : 원시형을 클래스로 선언한 자료형을 일괄적으로 표현하기 위한 이름
//=> Byte, Short, Integer, Long, Float, Double, Character, Boolean 클래스
//=> oracle 페이지에서 wrapper를 찾으면 없고, 대신 byte, short 등등으로 표현되어있음
//=> 목적 : 원시형 대신 객체로 표현하기 위해 사용하는 클래스
public class WrapperApp {
	public static void main(String[] args) {
		/*
		int num1=100, num2=200;	//이때의 int는 원시형 자료형.
		int num3=num1+num2;
		System.out.println("합계 = "+num3);
		*/
		
		//이렇게 만들어 줄수있음(자바의 객체지향대로라면 이렇게 쓰는게 정석.
		//but, 너무 길고 불편해서 원시형을 사용하는 경우가 더 多)
		//Integer 클래스 : 정수값(int)을 저장하기 위한 클래스
//		Integer num1=new Integer(100);	//버전9부터 없어질 예정이라는 경고가 뜸. 따라서 아래것 사용.
		
		//Integer.valueOf(Object i) : 매개변수로 값을 전달받아 정수값이 저장된 Integer 객체를 반환하는 메소드
		Integer num1=Integer.valueOf(100);
		Integer num2=Integer.valueOf("200");	//문자열을 전달받아도 내부적으로 정수값으로 저장됨.
		//Integer.intValue() : Integer 객체에 저장된 정수값을 반환하는 메소드
		Integer num3=Integer.valueOf(num1.intValue()+num2.intValue());
		System.out.println("num3 = "+num3.intValue());

		Integer num4=100, num5=200;
		Integer num6=num4+num5;
		System.out.println("num6 = "+num6);
		//=> 이렇게 사용하는데도 에러가 안나옴.(Wrapper클래스만 가능) 이유는,오토박싱 때문.
		//=> Wrapper 클래스는 오토박싱과 오토언박싱 기능을 제공받아 객체를 생성하거나 사용가능
		//=> new 연산자 사용할 필요X
		//오토박싱(AutoBoxing) : 원시형 리터럴(값)을 JVM이 자동으로 Wrapper 클래스의 객체로 생성하여 반환하는 기능
		//오토언박싱(AutoUnboxing) : JVM이 Wrapper 클래스에 저장된 값을 원시형 리터럴로 반환하는 기능 
		
		System.out.println("======================================================");
		
		//Integer.valueOf(String s, int radix) : 매개변수로 전달받은 값으로 
		//원하는 진수의 문자열을 정수값으로 변환해 Integer 객체에 저장하여 반환하는 메소드
		//=> 진수가 전달되지 않을경우 문자열을 10진수로 처리하여 반환한다.
		//=> 정수값으로 변환되지 못하는 문자열이 전달된 경우, NumberFormatException이 발생할 수 있다.
		//ex. 16진수인데 Z를 넣었을 경우 발생.
		Integer num=Integer.valueOf("ABC", 16);	//int num=0xABC
		//System.out.println시에는 Integer 객체에 저장된 정수값을 반환받아 10진수로 출력 
		//(저장은 16진수로 되더라도 출력은 무조건 10진수로 됨)
		System.out.println("num = "+num);
		
		System.out.println("======================================================");
		
		Integer su=50;
		
		System.out.println("su(10진수) = "+su);	//=> 50으로 출력됨.
		
		//8진수, 16진수, 2진수로 바꿔서 출력하고 싶을때,
		//Integer.toOcatalString(int i) : 매개변수로 전달된 정수값을 8진수 형태의 문자열로 변환하여 반환하는 메소드
		//Integer.toHexString(int i)
		//Integer.toBinaryString(int i)
		System.out.println("su(8진수) = "+Integer.toOctalString(50));
		System.out.println("su(16진수) = "+Integer.toHexString(50));
		System.out.println("su(2진수) = "+Integer.toBinaryString(50));
		
		su=-50;
		System.out.println("su(2진수) = "+Integer.toBinaryString(su));//보수화도 되는지 확인
		
		System.out.println("======================================================");
		
		String str1="100", str2="200";
		System.out.println("합계 = "+(str1+str2)); //문자열 결합. 300으로 나오지 않음.
		
		//Integer.parseInt(String s) : 매개변수로 문자열을 전달받아 정수값으로 변환하여 반환하는 메소드
		//=> 정수값으로 변환되지 못하는 문자열이 전달된 경우, NumberFormatException이 발생할 수 있다.
		//=> 얘는 예외처리 하는 것을 권장.
		System.out.println("합계 = "+(Integer.parseInt(str1)+Integer.parseInt(str2))); //문자열 결합. 300으로 나오지 않음.
		
		
		
		
		
		
		
	}

}
