package oop;


//실행이 목적인 클래스 - main 메소드를 반드시 작성 해야함!
public class MethodApp {
	// 프로그램 실행시 JVM(Java Virtual Machine)에 의해 자동호출하는 특별한 메소드 
	public static void main(String[] args) {	//void무반환형. 메인 메소드
		
		//클래스로 객체를 생성하여 객체의 메모리 주소를 참조변수에 저장
		//=> 같은 패키지에 작성된 클래스는 패키지 표현없이 클래스 사용이 가능하다.
		//=> 참조변수를 사용하여 객체의 필드 또는 메소드 접근이 가능하다.
		Method method=new Method();
		
		//참조변수를 출력할 경우 "자료형@메모리주소" 형식의 문자열을 제공받아 출력함.
		System.out.println("method = "+method);
		System.out.println("===================================================================");
		
		//메소드 호출 
		//- 객체를 이용해서 메소드를 호출함.->프로그램의 흐름(스레드)은 객체의 메소드로 이동하여 메소드의 명령을 실행하고 메소드가 종료되면 다시 되돌아와 다음 명령을 실행한다. 
		method.displayOne();	//displayOne이라는 메소드에 매개변수가 없으므로
		method.displayOne();
		method.displayTwo();
		//메소드 호출에 중요한 것 : 메소드의 이름, 매개변수에 전달하는 값
		
		System.out.println("===================================================================");
		
		method.prinOne();
		method.prinOne();
		
		System.out.println("===================================================================");

		method.prinTwo(50); 	//int num : 매개변수가 있음을 뜻함!
//		method.prinTwo(50.0);		//이 메소드는 int num을 매개변수를 가지므로 실수(ex.50.0) 값은 실행할 수 없음.(int는 실수 값을 표현할 수 없다.)
		method.prinTwo(-30);
		
		System.out.println("===================================================================");

		method.prinThree(35,79);
		method.prinThree(19,88);
		method.prinThree(67,12);
		
		System.out.println("===================================================================");
		
		//메소드를 호출하면 반환되는 값이 존재 >> 반환값을 변수에 저장
		//=> 메소드의 반환값을 지속적으로 사용하고자 할 경우, 반환값을 변수에 저장하면 됨.
		int result=method.returnTot(30,70);
		System.out.println("합계(메소드 호출의 반환값) = "+result);
		
		//메소드의 반환값을 지속적으로 사용하는 것이 아닌 한번만 일시적으로 사용할 경우 , 반환값을 변수에 미저장
		System.out.println("합계(메소드 호출의 반환값 = "+method.returnTot(30, 70));
		
		System.out.println("===================================================================");
		
		boolean result2 = method.isOddEven(10);
		if(result2) {
			System.out.println("매개변수로 저장된 값은 [짝수] 입니다.");
		} else {
			System.out.println("매개변수로 저장된 값은 [홀수] 입니다.");
		}
		System.out.println(result2);
		
		//위의 식과 같은 결과를 출력.
		if(method.isOddEven(9)) {
			System.out.println("매개변수로 전달된 값은 [짝수]입니다.");
		} else {
			System.out.println("매개변수로 저장된 값은 [홀수] 입니다.");
		}
		
		System.out.println("===================================================================");

		//배열의 메모리 주소를 반환하는 메소드를 호출하면 반환된 메모리 주소를 참조변수에 저장
		//=> 참조변수에 저장된 메모리 주소를 사용하여 배열 참조 가능
		int[] array=method.returnArray();
		for(int num:array) {
			System.out.print(num+"");
		}
		
		System.out.println();
		System.out.println("===================================================================");
		
		System.out.println("합계 = "+method.sumOne(10, 20, 30));
		
		System.out.println("===================================================================");

		
//		System.out.println("합계 = "+method.sumTwo(10,20,30)); 	=> 이렇게 하면 안됨.
		System.out.println("합계 = "+method.sumTwo(new int[]{10,20,30})); //= > new int[] 빠지면 배열X
		System.out.println("합계 = "+method.sumTwo(new int[]{}));	//=>요소가 0인 배열
		//배열만 무조건 전달해주면되고 요소의 개수는 상관X.
		
		System.out.println("===================================================================");
		
		//매개변수가 부정확할때 사용
		System.out.println("합계 = "+method.sumThree(10,20,30,40,50,60));
		System.out.println("합계 = "+method.sumThree());
		
	}

}
