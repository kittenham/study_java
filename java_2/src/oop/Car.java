package oop;

//클래스(Class) : 객체(object)를 생성하기 위한 자료형 - 참조형
//=> 자바에서는 객체(Object) 대신 인스턴스(instance)라는 용어로 사용
//=> 현실에 존재하는 사물 또는 관념을 클래스라는 자료형으로 표현하여 프로그램에 사용할 수 있도록 객체로 생성한다.

//클래스 선언 형식
//형식_  [public] class 클래스명{
//			필드(Field)
//			...
//			생성자(Constructor)
//			...
//			메소드(Method)
//			...
//		}

//자동차를 객체 모델링하여 클래스로 작성
//=> 자동차 속성 : 모델명, 엔진상태, 현재 속도  - 필드
//=> 시동 온(On), 시동 오프(Off), 속도증가, 속도감소, 이동 중지  - 메소드
public class Car {
	//[필드(Field)]
	String modelName;	//모델명
	boolean engineStatus;	//엔진상태 => (false: Engineoff,  true: Engineon)
	int currentspeed;	//현재 속도
	
	//[생성자(Constructor)] : 생성자 안만들것임. 
	//※ 생성자를 선언하지 않으면, 매개변수가 없는 기본 생성자(Default Constructor)가 자동으로 제공된다.
	
	//[메소드(Method)] : 필드를 사용하여 메소드의 명령으로 필요한 기능을 제공되도록 작성
	void startEngine() { //시동 온	// 필드만 이용할 것이라 매개변수 사용X
		engineStatus=true;	//위의 필드값에서 가져와서 사용한것
		System.out.println(modelName+"의 시동을 켰습니다.");
	}
	void stopEngine() { //시동 오프
		engineStatus=false;
		System.out.println(modelName+"의 시동을 껐습니다.");
	}
	void speedUp(int speed){//속도 증가	//매개변수 필요
		currentspeed+=speed;
		System.out.println(modelName+"의 속도가"+speed+"Km/h 증가되었습니다. 현재속도는"+currentspeed+"Km/h 입니다.");
	}
	void speedDown(int speed) {//속도 감소	//매개변수 필요
		currentspeed-=speed;
		System.out.println(modelName+"의 속도가"+speed+"Km/h 감소되었습니다. 현재속도는"+currentspeed+"Km/h 입니다.");
	}
	void speedzero(){ //이동 중지	//매개변수 없음
		currentspeed=0;
		System.out.println(modelName+"의 자동차가 멈췄습니다.");
	}
	
	

}
