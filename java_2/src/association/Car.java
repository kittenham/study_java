package association;

//association과 oop에 똑같은 Car 클래스가 있다고해도 둘은 다른 클래스임! 패키지가 다르기 때문에.

//클래스와 클래스의 관계 = 객체의 관계
//UML(Unified Modeling Language; 통합모델링언어)를 사용하여 클래스 다이어그램으로 표현
//클래스 다이어그램 : 구조 다이어그램. 클래스 내부의 정적인 내용이나 클래스 사이의 관계를 표기하는 다이어그램으로 시스템의 일부 또는 전체의 구조를 나타냄
/*
 1. 일반화 관계(Generalization) : 상속관계 - X is a Y
- 클래스를 선언할 때 기존 클래스를 상속받아 작성할 수 있도록
- 사원클래스와 관리자 클래스의 관계 : 관리자는 사원이다(0),  사원은 관리자다(X).
2. 실체화 관계(Realization) : 상속관계
- 클래스를 선언할 때 기존 인터페이스를 클래스가 상속받아 작성 (인터페이스를 구현)
- 인터페이스의 spec(명세,정의)만 있는 메서드를 오버라이딩 하여 실제기능으로 구현하는 것.
** 인터페이스(interface) : 현실에 존재하는 대상을 대상을 보다 추상적으로 표현하기 위한 자료형

⇒ 자바에서는 Generalization과 Realization 둘다 상속 관계 이므로 클래스와 인터페이스가 둘 다 부모클래스(슈퍼클래스)가 될 수 있음.

3. 연관관계 (Assoication) : 포함관계 - X has a Y
일종의 도구의 개념. 
ex.  컴퓨터 << CPU + Mainboard + Memory
4. 직접연관관계(Directed Association) : 한 방향으로만 도구로써 기능을 제공하는 관계
5. 집합연관관계(Aggregation) : 포함 관계로 설정된 객체들의 생명주기가 다른 포함 관계
ex. 컴퓨터 << 프린터
6. 복합연관관계(Compositon) : 포함 관계로 설정된 객체들의 생명주기가 같은 포함 관계
ex. 게임 << 캐릭터
7. 의존관계(Dependence) : 포함관계로 설정된 객체를 변경돼도 다른 객체에 영향을 주지않는 포함 관계
ex. TV << 리모컨
 */


//자동차 정보(모델명, 생산년도, 엔진정보)를 저장하기 위한 클래스
public class Car {
	private String modelName;
	private int productionYear;
	
	//엔진정보는 자료형을 쓰기 애매함. 따라서 클래스를 이용해 필드를 만들어주기
	//=>엔진정보를 저장하기 위한 필드를 만든다. - Engine 클래스를 자료형으로 선언된 필드
	//==> 필드에는 Engine 객체를 생성자 또는 Setter 메소드를 사용하여 "필드에 제공받아 저장" -> 포함관계가 만들어짐
	//If, 관계를 맺고있는 필드에 객체 저장,제공되지 않으면 관계가 설정되지 않음=> nullpointException 뜬다~
	private Engine carEngine;		//Car 클래스의 도구로 Engine 클래스가 사용됨 - 포함관계
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String modelName, int productionYear, Engine carEngine) {
		super();
		this.modelName = modelName;
		this.productionYear = productionYear;
		this.carEngine = carEngine;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public Engine getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}
	
	
	
	public void displayCar() {
		System.out.println("모델명 : "+modelName);
		System.out.println("생산년도 : "+productionYear);

//		System.out.println("엔진정보 : "+carEngine);	//이대로 출력하면 객체의 메모리주소가 출력됨.
		//따라서, 엔진정보를 출력해야함.
		//필드에 저장된 객체를 이용하여 메소드 호출
		//=> 포함관계로 설정된 클래스의 메소드를 호출하여 원하는 기능 구현할 수 있다.
		//=> 포함관계
		System.out.println("연료타입 : "+carEngine.getFualType());
		System.out.println("배기량 : "+carEngine.getDisplacement());
//		carEngine.displayEngine();	//코드의 중복성 최소화
		
		
		
		
		
	}
	
	

}
