package basic;

//지역변수(Local Variable) : 특정 구문에서 선언된 변수 - 블럭{}내부에서 선언된 변수

public class LocalVariableApp {
	int number=100;			//얘는 지역변수 아님.
	
	public static void main(String[] args) {
		int num1=100;		//얘는 지역변수임. 메인메소드가 끝날때까지 사용가능
	
		//임의블럭 - 임시적으로 만든 것이기 때문에 메인메소드의 블럭아님.
		{
			int num2=200;		//임의블럭 안의 변수도 지역변수.
			System.out.println("=======임의블럭 내부=======");
			System.out.println("num1 = "+num1);
			System.out.println("num2 = "+num2);
		}
		System.out.println("=======임의블럭 외부=======");
		System.out.println("num1 = "+num1);
			
		//System.out.println("num2 = "+num2); 		
			//임의블럭 종료시 num2 변수가 자동 소멸되므로 사용 불가능.
			//임의블럭안의 변수는 지역변수이기 때문에 임의블럭 외부로 나오면 변수는 소멸되어 사용X.
			//소멸되었기 때문에 임의 블럭 밖에서는 재사용 가능.(사용 영역이 다르기 때문)
	}
}
	
