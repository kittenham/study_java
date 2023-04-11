package inheritance;

//static 제한자 :클래스(내부클래스), 메소드, 필드에 사용하는 제한자
//=> 객체가 아닌 클래스로 접근하여 사용하기 위한 제한자

//final 제한자 : 클래스, 메소드, 필드에 사용하는 제한자

//1. final 제한자를 필드에 사용하여 선언 = final 필드
//형식)  접근제한자 final 자료형 필드명 = 초기값;
//=> 기능 : 필드에 저장된 값을 변경 불가능하게(고정시키는) 만들어준다. => 변경할 경우 에러 발생
//=> 필드를 선언할 때 반드시 초기값을 필드에 저장

//2. final 제한자를 메소드에 사용하여 선언 = final 메소드
//형식)  접근제한자 final 반환형 메소드명(자료형 매개변수명, ...){ }
//=> 자식클래스에 메소드를 오버라이드 선언하지 못하도록 제한하는 기능 제공

//3. final 제한자를 클래스에 사용하여 선언 = final 클래스
//형식) 접근제한자 final class 클래스명 { }
//=> final 클래스를 상속받지 못하도록 제한하는 기능 제공 (추상클래스 Abstract Class 와 반대되는 기능)


//사원정보(사원번호, 사원이름)를 저장하기위한 클래스
//=> 모든 사원 관련 클래스가 상속받아야하는 부모클래스 역할을 함.
//=> 객체생성이 목적이 아닌, 상속을 목적으로 작성된 클래스 -> 추상클래스로 선언하는 것을 권장

//추상클래스(Abstract Class) : abstract 제한자를 사용하여 선언된 클래스
//=> 객체생성 불가능 - 상속 전용 클래스 (부모클래스만 할 수 있다는 이야기)
//형식)  public abstract class 클래스명 { }
//abstract 제한자 : 클래스와 메소드의 설정에 사용 가능한 제한자
public abstract class Employee {
	
	private int empNo;
	private String empName;

	
	//상수필드(Constant Field) : 프로그램에서 값(리터럴) 대신 사용하기 위한 의미있는 단어로 제공되는 필드값
	//형식)  public static final 자료형 변수명 = 초기값;
	//=> 상수명은 대문자로 작성하여 스네이크 표기법을 이용하여 작성하는 것을 권장
	public static final double INCENTIVE_RATE = 1.5;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
/*	
	//급여를 계산하여 반환하는 메소드
	//=> 자식클래스에서 부모클래스의 메소드를 오버라이드 선언하지 않아도 에러 미발생
	//=> 자식클래스에서 부모클래스의 메소드를 오버라이드 선언하지 않으면 부모 클래스의 메소드 호출 -> 비정상적인 결과 제공
	public int computePay() {	//급여를 계산하여 반환하는 메소드 => 자식클래스들이 오버라이드 하라고 만드는것.
		return 0;
	}
*/
	//자식클래스에서 부모클래스의 메소드를 무조건 오버라이드 선언하도록 설정하기위해 abstract 제한자를 사용하여 추상메소드로 선언한다.
	//추상메소드(Abstract Method) : abstract 제한자를 사용하여 선언된 메소드
	//=> 메소드의 머릿부만 작성하고 몸체부는 작성하지 않는 미완성된 메소드
	//형식) 접근제한자 abstract 반환형 메소드형(자료형 매개변수명, ...);
	//=> 추상메소드가 선언된 클래스는 반드시 추상클래스로 선언해야한다.
	//=> 추상메소드가 선언된 클래스를 상속받은 자식클래스는 무조건 모든 추상메소드를 오버라이드 선언해야함 - 자식클래스에서 추상메서드를 오버라이드 선언하지않으면 자식클래스도 추상클래스가 된다.
	//=강제적으로 무조건 이런 메소드를 만들라고 지시하는 것.
	//=> 추상클래스로 객체를 생성할 경우 에러가 발생
	
	public abstract int computePay();
	
	
	//인센티브를 계산하여 반환하는 메소드
	//=> 모든 사원에게 급여의 150%를 인센티브로 제공되도록 계산 => Empolyee 클래스 안에 만들면됨.모든사원이니까
	
	//자식클래스에서 메소드를 오버라이드 선언하면 비정상적인 결과값이 반환될 수 있다.
	//따라서, 자식클래스에서 오버라이드 선언하지 못하도록 final 메소드로 선언하면 됨.(=> EmployeeRegular 클래스에서 확인가능)
	public final int computeIncentive() {
		//computePay는 추상메소드이기 때문에(abstract 사용. 명령이 없고 숨겨져있음(오버라이드)), 묵시적 객체 형변환에 의해 자식클래스의 메소드가 호출된다.
//		return (int)(computePay()*1.5);		//그냥 1.5하면 이게 인센트브율인지 잘 모를 수 있음.
		return (int)(computePay()*INCENTIVE_RATE);		//위랑 똑같음(상수필드 사용한 것) -> 1.5를 상수필드를 이용하여 인센티브인상률이라는 것을 명시한것.

		
	}
	
}
