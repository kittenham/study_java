package xyz.itwill.exception;

public class ExceptionThrowApp {
	//메소드에서 발생된 예외를 직접처리하지 않고 예외를 메소드를 호출한 명령에게 전달하는 방법-예외전달
	//형식)  접근제한자 반환형 메소드명(자료형 매개변수, ...) throws 예외클래스, 예외클래스, ...{ }
	//=> 예외가 전달되는 메소드를 호출한 명령에서는 예외처리를 해주는 것을 권장
	//메소드에서 예외가 발생할때마다 try-catch 쓰지말고 예외전달로 떠넘기다가 마지막에(대부분 main메소드) 한번만 실행해주는 것이 효율적
	public static void display() throws ArrayIndexOutOfBoundsException {	
		int[] array= {10,20,30,40,50};
		
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"]="+array[i]);
		}
	}
	
	public static void mian(String[] args) {
		//예외가 발생되어 전달되는 메소드를 호출한 명령에서 예외 처리
		try {
			//ExceptionThrowApp.display();	//정적메소드는 클래스를 이용하여 호출 가능
			display();	//같은 클래스의 정적메소드는 클래스 표현없이 메소드 호출
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("[에러] 프로그램에 예기치 못한 오류가 발생되었습니다.");

		}
	}
}
