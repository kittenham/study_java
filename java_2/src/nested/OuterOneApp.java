package nested;

import nested.OuterOne.InnerOne;

public class OuterOneApp {
	public static void main(String[] args) {
		OuterOne outerOne = new OuterOne(100);
		outerOne.outerDisplay();
		
//		InnerOne innerOne = new InnerOne(200);	//객체 자체가 안만들어짐.
		//객체 내부클래스로 객체 생성은 불가능하다.
//		innerOne.innerDisplay();
		
		InnerOne innerOne = outerOne.new InnerOne(200);
		//외부클래스의 객체를 사용하여 객체 내부 클래스에 생성자를 호출하여 객체 생성가능
		innerOne.innerDisplay();
		System.out.println("==============================================================");
	}
}
