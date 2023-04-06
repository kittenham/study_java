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


//클래스를 작성할 때, 필드와 메소드에는 접근 지정자를 사용하여 접근 유무를 설정할 수 있다.(은닉화 시키는것)
//접근 지정자(Access Modifier) : private, package(default), protected, public
//=>클래스(public, package(default) 두개만 사용가능), 필드, 메소드, 생성자를 선언할 때 접근 허용을 설정하기 위한 키워드
//private : 클래스 내부에서만 접근 가능하도록 허용하는 접근 제한자


//자동차를 객체 모델링하여 클래스로 작성
//=> 자동차 속성 : 모델명, 엔진상태, 현재 속도  - 필드
//=> 시동 온(On), 시동 오프(Off), 속도증가, 속도감소, 이동 중지  - 메소드

//Car class는 실행을 위한 클래스가 아님. 객체 생성을 위한 클래스임. 따라서 실행 클래스가 따로 필요함.(CarApp을 따로 만들어 주었다.)
public class Car {
	//[필드(Field)]
	private String modelName;	//모델명
	private boolean engineStatus;	//엔진상태 => (false: Engineoff,  true: Engineon)
	private int currentSpeed;	//현재 속도
	
	//[생성자(Constructor)] : 생성자 안 만들것임.
	//※ 생성자를 선언하지 않으면, 매개변수가 없는 기본 생성자(Default Constructor)가 자동으로 제공된다.
	
	//[메소드(Method)] : 필드를 사용하여 메소드의 명령으로 필요한 기능을 제공되도록 작성
	void startEngine() { //시동 온	// 필드만 이용할 것이라 매개변수 사용X
		engineStatus=true;	//위의 필드값에서 가져와서 사용한것
		System.out.println(modelName+"의 시동을 켰습니다.");
	}
	void stopEngine() { //시동 오프
		if(currentSpeed!=0) {	//자동차가 멈춰있지 않은 상태인 경우
			/*
			currentSpeed=0;
			System.out.println(modelName+"의 자동차가 멈췄습니다.");		//=>이동중입니다 후 return해도됨.
*/
			speedzero();
		}
		engineStatus=false;
		System.out.println(modelName+"의 시동을 껐습니다.");
	}
	void speedUp(int speed){//속도 증가	//매개변수 필요
		//속도 증가는 우선적으로 시동이 켜진 후에 이루어져야하기 때문에 시동을 키는 조건이 있어야함.
		if(engineStatus) { //엔진이 꺼져있는 경우
			System.out.println(modelName+"의 시동이 꺼져있습니다.");
			return;	//시동이 꺼져있을때 속도 증가가 안되니까 아예 속도 증가 메소드를 종료해버려야하기 때문.
		}
		if(currentSpeed+speed>150) {
			speed=150-currentSpeed;
		}
		currentSpeed+=speed;
		System.out.println(modelName+"의 속도가 "+speed+"Km/h 증가되었습니다. 현재속도는 "+currentSpeed+"Km/h 입니다.");
	}
	void speedDown(int speed) {//속도 감소	//매개변수 필요
		if(!engineStatus) { //엔진이 꺼져있는 경우
			System.out.println(modelName+"의 시동이 꺼져있습니다.");
			return;	//시동이 꺼져있을때 속도 증가가 안되니까 아예 속도 증가 메소드를 종료해버려야하기 때문.
		}
		if(currentSpeed<speed) {
			speed=currentSpeed;
		}
		currentSpeed-=speed;
		System.out.println(modelName+"의 속도가 "+speed+"Km/h 감소되었습니다. 현재속도는 "+currentSpeed+"Km/h 입니다.");
	}
	void speedzero(){ //이동 중지	//매개변수 없음
		currentSpeed=0;
		System.out.println(modelName+"의 자동차가 멈췄습니다.");
	}
	
	//은닉화 처리된 필드를 위해 필드값을 반환하는 Getter 메소드와 필드값을 변경하는 Setter 메소드를 선언(작성할 수 있다)
	//Setter 메소드 선언 = "캡슐화"
	
	
	//Getter 메소드 : 클래스 외부에서 필드값을 사용할 수 있도록 필드값을 반환하는 메소드
	//필드의 자료형이 boolean인 경우, 메소드의 이름을 [is필드명]으로 작성
	//형식)  public 반환형 get필드명() { return 필드명; }
	
	public String getModelName() {
		return modelName;
	}
	
	
	//Setter 메소드 : 매개변수로 값을 전달받아 매개변수에 저장된 값으로 필드값을 변경하는 메소드
	//형식)  public void set필드명(자료형 변수명){필드명=변수명;}
	public void setModelName(String name) {
		//매개변수에 저장된 값에 대한 검증
//		modelName=modelName;	//둘 다 매개변수임. 매개변수를 매개변수에 넣는것. =>쓸모가 없음.
		this.modelName=modelName;	//필드와 매개변수를 구분하기 위해 this.를 앞에 넣어 필드를 설정해준다.
		//this : 메소드 내부에서 클래스의 객체를 표현하는 키워드
		//=> this 키워드를 사용하여 필드 표현
	}
	public boolean isEngineStatus() {
		return engineStatus;
	}
	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	//이클립스에서는 Setter, Getter를 자동으로 만들어줌~~
	//이클립스에서는 은닉화 처리된 필드에 대한 Getter 메소드와 Setter 메소드를 생성하는 기능
	// 이클립스-Source-Generate Getter and Setters... => [단축키] : Alt + Shift + S (팝업메뉴 등장!) -> + R 누르기 -> getter setter를 할 필드 선택(or Select all 누르기) -> Generate
	
}
