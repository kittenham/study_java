package oop;

public class Overload {
	
	public void displayInt(int param) {
		System.out.println("정수값 = "+param);
	}
	
	public void displayBoolean(boolean param) {
		System.out.println("논리값 = "+param);
	}
	
	public void displayString(String param) {
		System.out.println("문자열 = "+param);
	}
	
	
	
	//똑같은 매개변수를 만들어도 자료형이 다르면 에러가 떨어지지 않음
	//매소드 오버로딩(Method Overloading) : 클래스에서 동일한 기능을 제공하는 메소드가 매개변수에 의해 여러개 선언해야 할 경우 메소드의 이름을 같도록 선언하는 기능
	//단, 매개변수의 자료형 또는 개수가 달라야함!(같으면 똑같은 메소드가 되어 에러가 뜬다!)
	//=> 접근 제한자와 반환형은 오버로드 선언과 무관.

	public void display(int param) {
		System.out.println("정수값 = "+param);
	}
	
	public void display(boolean param) {
		System.out.println("논리값 = "+param);
	}
	
	public void display(String param) {
		System.out.println("문자열 = "+param);
	}
	
	
}
