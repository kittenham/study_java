package inheritance;

//자동차정보(모델명, 소유자명)를 저장하기 위한 클래스
//
//=> 모든 Java 클래스는 무조건 Object 클래스를 상속받아 사용 가능
//Object 클래스 : 모든 Java 클래스의 최선조(가장부모) 클래스. (유일하게 전혀 상속받지 않는 클래스는 얘 하나밖에 없음)
//부모는 모든 자식들의 메소드를 참조할 수 있다.
//=> 따라서, Object 클래스로 참조변수를 만들면, 모든 클래스로 생성된 객체가 저장될 수 있다.
public class Car /* extends Object */ {		//눈에만 안보일 뿐이지 모든 클래스는 Object 클래스를 상속받는다.

	private String modelName;
	private String userName;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String modelName, String userName) {
		super();
		this.modelName = modelName;
		this.userName = userName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//주요클래스에는 display 만들지 X
	
	
	//Object 클래스의 toString 메소드를 오버라이드 선언
	//=> Object 클래스의 toString()메소드는 숨겨지고 Car 클래스의 toString() 메소드 호출
	//=> VO 클래스에서는 필드값을 문자열로 변환하여 반환하는 명령 작성 - 필드값 확인
	@Override
		public String toString() {
			return "모델명 = "+modelName+"소유자 = "+userName;	
		}
	
	
	
}
