package nested;

public class OuterThree {
	private int outerNum;
	
	public OuterThree() {
		// TODO Auto-generated constructor stub
	}

	public OuterThree(int outerNum) {
		super();
		this.outerNum = outerNum;
	}

	public int getOuterNum() {
		return outerNum;
	}

	public void setOuterNum(int outerNum) {
		this.outerNum = outerNum;
	}

	public void outerDisplay() {
		System.out.println("outerNum = "+outerNum);
		
		//외부클래스에서는 지역클래스 사용 불가능
		//
	}
	
	
	public void local() {
		//로컬클래스(=지역클래스; LocalClass) : 메소드 내부에 선언된 클래스 - 메소드가 종료되면 이 클래스 자체가 자동소멸됨
		//=> 지역클래스에는 final 또는 abstract 제안자만 사용하여 선언 가능
		//=> 접근제한자 및 static 제한자를 사용하여 지역클래스를 선언할 경우 에러 발생
		//=>비동기식 처리를 위한 스레드 객체를 생성하기 위해 사용
		class InnerThree{
			int innerNum;	//필드에도 접근제한자 못씀~
			
			void innerDisplay() {
				System.out.println("innerNum = "+innerNum);
			}
			
		}
		
		//지역클래스가 선언된 메소드에서만 객체를 생성하여 필드 또는 메소드 참조 가능
		InnerThree innerThree = new InnerThree();
		innerThree.innerNum=200;
		innerThree.innerDisplay();
		
	}
	
	
}
