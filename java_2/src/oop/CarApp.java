package oop;

//클래스로 객체를 생성하는 방법

// Car class를 객체로 생성하여 작성된 프로그램
public class CarApp {
	public static void main(String[] args) {
		//Car 클래스 객체를 생성하여 참조변수에 저장
		//=> 하나의 클래스로 서로 다른 객체를 여러개 생성 가능. =>얘네는 속성은 같아도 속성값은 다르다.(=모양은 같아도 내용물은 틀린..)
		// 클래스는 객체를 생성하기 위한 틀(Template)의 역할을 함. 
		// 객체를 생성하면 객체의 필드에서는 기본값(숫자형:0, 논리형:false, 참조형:null)을 초기값으로 자동저장된다.
		Car carOne=new Car();
		Car carTwo=new Car();
		Car carThree=new Car();
		
		System.out.println("carOne = "+carOne);
		System.out.println("carTwo = "+carTwo);
		System.out.println("carThree = "+carThree);
		//객체의 메모리주소가 다 다르다는 것을 확인 가능.
		//메모리주소가 같다 = 같은 객체를 사용한다.

		
		System.out.println("============================================================");
		
		//객체.필드명	//이때, 객체는 참조변수에 저장이 되어있는중. 따라서,
		//=> " 참조변수.필드명 " 으로 작성 : 참조변수에 저장된 객체가 . 연산자를 사용하여 필드에 접근하여 사용
		//문제점) 객체를 사용하여 필드에 직접적인 접근을 허용할 경우, 필드에 비정상적인 값이 저장되어 원하지 않는 잘못된 값이 나올 수 있다.
		//해결법) 클래스 선언시, 클래스의 필드를 은닉화 처리하여 선언하면 됨. -> 은닉화 선언(바깥에서 보이지 않도록. 안에서는 보여도 상관없으)된 필드에 접근할 경우 에러 발생
		
		//carOne.modelName="싼타페";//객체의 필드값이 변경되는 경우 - 필드가 은닉화 처리되어 에러 발생
		carOne.setModelName("싼타페"); 		//필드값을 변경하는 Setter 메세지 호출
		// set과 get을 쓸때 set을 get보다 먼저 써야함.
		carOne.getModelName();	//객체의 필드에 값 저장 = 객체의 필드값 변경 (변경하지 않으면 null이 뜬다)
		carOne.isEngineStatus();
		carOne.getCurrentSpeed();
		
		
		System.out.println("첫번째 자동차 모델명 : "+carOne.getModelName());		//객체의 필드값을 반환하는 Getter 메소드 호출 - 반환받은 필드값 사용(출력)
		System.out.println("첫번째 자동차 엔진상태 : "+carOne.isEngineStatus());	
		System.out.println("첫번째 자동차 현재속도 : "+carOne.getCurrentSpeed());
		System.out.println("============================================================");
		/*
		carTwo.modelName="쏘나타";
		carTwo.engineStatus=true;
		carTwo.currentSpeed=80;
		
		System.out.println("두번째 자동차 모델명 = "+carTwo.modelName);
		System.out.println("두번째 자동차 엔진상태 = "+carTwo.engineStatus);
		System.out.println("두번째 자동차 현재속도 = "+carTwo.currentSpeed);
		*/
		
		carTwo.setModelName("쏘나타");	//첫번째 modelName이랑 메모리 주소가 다르기 때문에 가능
		//엔진상태와 현재속도는 값을 지정해주지 않으면 객체의 필드에는 기본값이 자동저장되어 나옴.
		carTwo.setEngineStatus(true);
		carTwo.setCurrentSpeed(80);
		
		System.out.println("두번째 자동차 모델명 : "+carTwo.getModelName());
		System.out.println("두번째 자동차 엔진상태 : "+carTwo.isEngineStatus());
		System.out.println("두번째 자동차 현재속도 : "+carTwo.getCurrentSpeed());
		
		System.out.println("============================================================");

		//메소드 호출 
		//=> " 객체.메소드명(값,값...) "
		//=> " 참조변수.메소드명(값, 값...) " : 참조변수에 저장된 객체가 . 연산자를 사용하여 메소드 호출
		
		carOne.startEngine(); 	//시동켜짐
		carOne.speedUp(50);		//메소드를 호출해서 필드값 변경되는것
		carOne.speedUp(500);		//메소드는 중복 호출 가능하기 때문에 필요할 때마다 호출함.
		carOne.speedDown(400);
		carOne.speedzero();
		carOne.stopEngine();
		
		
		
		
		
	}

}
