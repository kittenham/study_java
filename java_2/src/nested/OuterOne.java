package nested;

//중첩클래스(Nested Class) : 클래스(외부클래스OuterClass) 내부에 다른 큰래스(내부클래스InnerClass)를 선언 하는것.
//두 개의 클래스가 밀접한 관계에 있을 때 사용하며, 캡슐화를 강화할 목적으로 클래스를 선언하는 것이다.


public class OuterOne {
	private int outerNum;
	
	public OuterOne() {
}
	
	public OuterOne(int outerNum) {
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
		
		//외부클래스에서는 객체 내부 클래스의 필드 또는 메소드에 대한 직접적인 참조 불가능
		//System.out.println("innerNum = "+innerNum);
		//innerDisplay();
				
		
		//하지만 객체를 생성한 뒤에는 참조 가능하다.
		//외부클래스는 객체 내부클래스로 객체를 생성하여 접근제한자에 상관없이 객체 내부클래스의 필드 또는 메소드 참조 가능
//		InnerOne innerOne=new InnerOne();
//		System.out.println("innerNum = "+innerOne.innerNum);
//		innerOne.innerDisplay();
		
	}
	
	
	//일반 내부클래스(객체 중첩클래스) => 컴파일 결과를 [외부클래스$내부클래스.class] 파일로 제공
	//=> 객체내부클래스에서는 static 제한자를 사용하여 필드 또는 메소드 선언이 불가능 (접근을 못함)
	public class InnerOne{
		private int innerNum;
		
		public InnerOne() {
			// TODO Auto-generated constructor stub
		}

		public InnerOne(int innerNum) {
			super();
			this.innerNum = innerNum;
		}

		public int getInnerNum() {
			return innerNum;
		}

		public void setInnerNum(int innerNum) {
			this.innerNum = innerNum;
		}
		
		public void innerDisplay() {
			System.out.println("innerNum = "+innerNum);
			
			//객체 내부 클래스에서는 외부클래스의 필드 또는 메소드를 접근제한자에 상관없이 직접 참조 가능
			//innerDisplay()에서는 outerNum을 사용할 수 있지만, innerDisplay에서는 outerNum을 사용 못함.
			System.out.println("outerNum = "+outerNum);
			outerDisplay();
		}
		
		
	}
	
	

}
