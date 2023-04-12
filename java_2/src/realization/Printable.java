package realization;

public class Printable {
	//추상메소드(Abstract Method) : 자식클래스에서 반드시 오버라이드 선언
	void print();
	
	//JDK11 이상에서는 인터페이스에 명령을 작성할 수 있는 기본메소드 선언 가능
	//기본메소드(Default Method) : 인터페이스를 상속받은 자식클래스에서 오버라이드 선언하지 않아도 되는 메소드(원래 인터페이스 상속받으면 자식클래스는 무조건 오버라이드 해야하는데 얘는 아님)
	//=> 오버라이드 선언하지 않은 겨우 기본메소드 호출됨
	//형식)  default 반환명 메소드명(자료형 매개변수, ...){명령; ...}
	default void scan() {
		System.out.println("[에러]스캔 기능을 제공하지 않습니다.");
	}

}
