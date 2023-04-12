package enumerate;

public interface InterfaceOne {
	
	//상수필드 선언 - 인터페이스에서 상수필드를 선언하면, public static final 키워드 생략 가능
	//=> 클래스에도 상수필드를 선언 가능하지만 보다 쉬운 상수 선언을 위해 인터페이스에 선언한다.
	//상수(Constant) : 프로그램에서 값(리터럴) 대신 사용하기 위한 의미있는 단어. 바뀌면 안됨(그래서 final이 붙음).
	int INSERT=1, UPDATE=2, DELETE=3, SELECT=4;

}
