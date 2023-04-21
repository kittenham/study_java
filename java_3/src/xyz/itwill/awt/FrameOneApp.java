package xyz.itwill.awt;

import java.awt.Frame;

//CUI(Character User Interface) 프로그램 : 문자 중심의 실행 환경에서 동작되는 프로그램
//GUI(Graphic User Interface) 프로그램 : 그래픽 중심의 실행 환경에서 동작되는 프로그램

//GUI 프로그램은 컴퍼넌트를 이용하여 작성된다. (스마트폰에서는 위젯이라고 불림)

//java.awt 패키지 : GUI 프로그램을 작성하기위한 클래스가 선언된 패키지
//=> 운영체제(OS)에 종속된 컴퍼넌트를 제공한다.
//javax.swing 패키지 : GUI 프로그램을 작성하기위한 클래스가 선언된 패키지 
//=> java.awt 패키지의 확장 패키지 (단, 기본패키지인 java.awt 패키지를 써야 확장 패키지인 javax.swing 패키지도 사용가능)
//=> 자바 컴퍼넌트 제공

//컴퍼넌트(Component) : GUI 프로그램에서 UI(User Interface; 사용자환경; 디자인)를 구현하기 위한 클래스
//=> Botton, List, Label, Canvas, Checkbox, Choice, Scrollbar, TextField, TextArea 등
//컨테이너(Container) : 컴퍼넌트를 배치할 수 있는 컴퍼넌트
//=> 독립적 컨테이너 : Frame, Window, Dialog 등  -독립적으로 사용가능
//=> 종속적 컨테이너 : Panel, ScrollPane 등  -다른 컨테이너에 배치하여 사용가능(단독으로 사용 못함)

public class FrameOneApp {
	
	public static void main(String[] args) {
		
		//Frame : 메뉴가 존재하는 컨테이너를 생성하기 위한 클래스
		//Frame frame = new Frame();	//=> 이렇게 하면 메모리에만 만들어진것.
		//Frame 클래스의 Frame(String title) 생성자로 객체를 생성하면 프레임의 제목을 설정된 프레임 생성
		Frame frame = new Frame("프레임 연습");
		
		//Component.setSize(int width, int height) : 컴포넌트의 크기를 변경하는 메소드
		//=> GUI 프로그램에서 크기 또는 위치의 단위는 '픽셀(Pixel)' 단위로 표현하여 설정
		//픽셀(Pixel) : 하나의 색으로 표현하는 점(Dot)
		frame.setSize(400, 300);
		
		//Component.setLocation(int x, int y) : 컴퍼넌트의 출력 위치를 변경하는 메소드
		frame.setLocation(600, 100);
		
		//Component.setVisible(boolean b) : 컴퍼넌트를 보이지 않게 처리하거나(false), 보이도록 처리하는(true) 메소드
		frame.setVisible(true);
		
	}

}
