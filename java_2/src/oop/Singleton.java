package oop;

//싱글톤 디자인 패턴을 적용하여 작성된 클래스 - 싱글톤 클래스(Singleton Class)
//프로그램에 객체를 하나만 제공하기 위한 목적의 클래스를 작성하기 위해 사용
//프로그램에 불필요한 객체가 여러개 생성되는 것을 방지하기 위한 디자인 패턴 중 하나
public class Singleton {
	
	//클래스의 객체(메모리주소)를 저장하기 위한 필드를 선언한다.
	//static 제한자를 사용하여 필드를 선언한다.
	//시스템 필드 : 클래스 내부에서만 사용하기 위한 필드로서, Getter 메소드와 Setter메소드를 선언하지 않는다.
	//=> 일반적인 필드와 구분하기 위해 필드명을 _로 시작되도록 작성하는 것을 권장
	private static Singleton _instance;
	
	//public을 private로 바꿈 -> ***생성자를 인닉화 선언 한 것.*** : 클래스 외부에서 생성자에 접근하지 못하도록 설정
	//=> 객체생성이 불가능하다. + 상속불가
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	
	//정적 영역(Static Block) : 클래스를 읽어 메모리(MethodArea)에 저장된 후 자동으로 실행될 명령을 작성하기 위한 영역
	//=> 이 명령은 프로그램에서 !한 번만! 실행되는 명령이다. 
	//(이 명령은 객체가 만들어지기 전에 실행됨. 따라서 객체필드, 객체메소드 사용X)
	//=> 따라서 정적필드, 정적 메소드만 사용 가능하다.
	static {
		_instance = new Singleton();	//클래스 내부에서는 객체필드, 객체메소드 생성가능
		// 클래스로 객체를 생성하여 시스템 필드에 저장
		//=> 프로그램에서 객체를 하나만 생성하여 필드에 저장한다.(실행이 한번만 되니까)
	}
	
	//시스템 필드에 저장된 객체(->객체생성전에 미리 만들어졌던 하나의 객체)를 반환하는 메소드.
	public static Singleton getInstance() {
		
	}
	
	//인스턴스 메소드
	public void display() {
		System.out.println("Singleton 클래스의 display() 메소드 호출");
	}
	

}
