package realization;

//인터페이스(Interface) : 현실에 존재하는 대상을 클래스보다 추상적으로 표현하기 위한 자료형(참고형)
//=> 상수필드(Constant Field)와 추상메소드(Abstract Method)만 선언 가능함.
//=> JDK11부터는 정적메소드(Static Method)와 기본메소드(Default Method)도 선언 가능함.
//형식)  [public] interface 인터페이스명 {	
//				public static final 자료형 필드명 = 값;		//상수필드. 인터페이스 안에서는 public static final 생략 가능. 어차피 일반필드는 못만드니까 만드는 필드 전부 상수필드~
//				...
//				public abstract 반환형 메소드형(자료형 매개변수, ...);	//추상메소드. 인터페이스 안에서는 public abstract 생략가능(이유는 상수필드와 같다.)
//			}
//=> 인터페이스의 이름은 파스칼 표기법을 이용한다.(모든단어 첫문자 대문자)

//인터페이스는 클래스가 상속받아 사용하기 위한 자료형이다. - 다중상속 가능
//형식)  public class 클래스명 implements 인터페이스명, 인터페이스명, ... { }
//=>인터페이스를 상속받은 메소드는 무조건 상속받은 인터페이스의 모든 추상메소드를 오버라이드 선언해야한다. (안하면, 상속받은 모든 메소드가 추상메소드가 되니까)
//=>인터페이스로 객체생성은 불가능하지만 참조변수를 생성하여 인터페이스를 상속받은 자식클래스로 객체를 생성하여 저장가능 (묵시적 객체 형변환을 통해 자식클래스를 사용) → 참조변수에 자식클래스의 메소드 호출

//인터페이스는 다른 인터페이스를 상속받아 사용 가능 - 다중상속 가능
//형식)  public interface 인터페이스명 extends 인터페이스명, 인터페이스명, … { }

//** 자료형이 같으면 extends,  자료형이 다르면 implements 를 사용

//<인터페이스를 선언하여 클래스가 상속받아 사용하는 이유>
//1. 클래스의 단일 상속 관련 문제를 일부 보완하기 위해 인터페이스 사용
//ex)  public class 늑대인간 extends 인간, 늑대  //⇒ 불가능. 클래스는 단일상속만 가능하기 때문에
//ex)  public class 늑대인간 extends 인간 implements 늑대  //⇒ 가능.
//ex)  public class 흡혈늑대인간 extends 인간 implements 늑대, 흡혈귀  //⇒ 가능.
//2. 클래스에 대한 작업지시서의 역할



public class WolfHumanApp {

	public static void main(String[] args) {
		WolfHuman wolfHuman = new WolfHuman();
		
		wolfHuman.speak();
		wolfHuman.smile();
		wolfHuman.walk();
		wolfHuman.change();
		wolfHuman.fastWalk();
		wolfHuman.cryLoudly();
		System.out.println("=======================================================================");
		
		//부모클래스로 참조변수를 생성하여 자식클래스의 객체 저장
		//=> 참조변수는 기본적으로 부모클래스의 메소드만 호출 가능
		//=> 객체 형변환을 이용하면 참조변수로 자식클래스의 메소드 호출가능
		Human human=new WolfHuman();
		
		human.speak();
		human.smile();
		human.walk();
		System.out.println("=======================================================================");
//		human은 오버라이드 하지 않은 일반메소드이기 때문에 명시적 객체 형변환을 이용하여 자식클래스를 호출해야한다.
		((WolfHuman)human).change();
		System.out.println("=======================================================================");
//		인터페이스(부모)로 참조변수를 생성하여 자식클래스의 객체 저장 가능
//		WolfHuman의 부모클래스는 Human과 Wolf 둘 모두임
		//자식클래스가 같은 클래스와 인터페이스는 명시적 객체 형변환을 이용하여 자식클래스의 객체를 공유하여 사용 가능하다.
		Wolf wolf = ((Wolf)human);	//human안에 있는 객체는 human 객체.
		
		//묵시적 객체 형변환에 의해 자동으로 자식클래스의 메소드가 호출된다.
		wolf.fastWalk();
		wolf.cryLoudly();
		System.out.println("=======================================================================");
		
	}

}
