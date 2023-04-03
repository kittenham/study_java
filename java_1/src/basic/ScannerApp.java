package basic;

import java.util.Scanner; //=>Scanner + [Ctrl} + [Space]
//import : 다른 패키지의 클래스를 불러오기 위해 사용하는 키워드

//import java.util.Scanner;

//System.out  : 출력스트림(출력을하기위한통로)을 사용하여 값을 화면에 전달하는 기능을 제공하는 객체(=out객체)

//System.in  : 키보드로투어 전달된 값을 입력스트림을 사용하여 프로그램에 전달하는 기능을 제공하는 객체 ->1byte로만 읽을 수 있음 => 따라서 프로그래머가 확장시켜서 사용해야함.

//사용자로부터 키보드로 이름과 나이를 입력받아 화면에 출력하는 프로그램 작성

public class ScannerApp {
	public static void main(String[] args) {
		//Scanner 클래스 : 입력스트림(키보드-System.in, 파일 등)을 전달받아 원하는 자료형으로 값을 입력받기 위한 기능(메소드)을 제공하는 클래스
		//Scanner 객체를 생성하여 참조변수에 저장
		//참조변수에 저장된 책체를 사용하여 메소드 후출하여 필요한 기능 구현
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("이름입력 >> ");
		//Scanner.nextLine() : 입력스트림(ex.키보드)에 전달된 값(입력값)을 문자열로 변환하여 반환하는 메소드
		//키보드로 입력된 값을 문자열로 반환받아 변수에 저장
		//=> 키보드 입력값이 없는경우 프로그램의 흐름(스레드)이 일시중지가 됨. 키보드로 뭔가를 입력할때까지.(기다리는것)
		//=> 키보드로 값을 입력한 후 엔터(Enter)를 입력하면, 프로그램의 흐름이 재실행됨.
		String name = scanner.nextLine();		//name이라는 변수에 저장.
		
		System.out.println("나이입력 >> ");
		//Scanner.netInt() : 입력값을 정수값으로 변환하여 반환하는 메소드
		//키보드로 입력된 값을 정수값으로 반환받아 변수에 저장
		//=> 키보드로 입력된 값이 정수값이 아닌경우 예외(Exception)발생(예기치못한 오류=사용자가 잘못입력)
		//=> 예외가 발생하면 프로그램은 거기서 강제종료됨.
		int age=scanner.nextInt();
		
		System.out.println("[결과] "+name+"님의 나이는 "+age+"살 입니다.");
		
		scanner.close();
		//Scanner.close() : Scanner 객체가 사용한 입력스트림을 제거하는 메소드 
		//- *파일스트림은 다시쓰기위해 썼으면 닫아야함.
	}
}
