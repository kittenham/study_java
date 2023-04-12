package realization;

public class PrintableApp {
	public static void main(String[] args) {
		//기본메소드를 사용하기 위해서는 참조변수를 인터페이스로 선언
		Printable printOne = new PintSingle();
		
		printOne.print();
		printOne.scan();  //부모 인터페이스의 기본 메소드 호출
		
		System.out.println("====================================================================");
		
		Printable printTwo = new PrintMulti();
		
		printTwo.print();
		printTwo.scan(); 	//기본메소드가 아니라 자식클래스의 메소드 호출(묵시적 객체형변환으로 인해서)
	}
}
