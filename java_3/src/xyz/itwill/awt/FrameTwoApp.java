package xyz.itwill.awt;

import java.awt.Frame;

//GUI 프로그램을 UI 구성 및 이벤트 처리를 위해 Frame 클래스를 상속받아 작성하는 것을 권장한다.
public class FrameTwoApp extends Frame {
	private static final long serialVersionUID = 1L;
	
	
	//생성자에서 프레임을 구성하는 디자인 설정 <- UI를 여기서 구현.
	public FrameTwoApp(String title) {
		super(title);	//제목초기화할때(초기값)는 super 사용	//Frame(String title) 생성자를 이용하여 Frame 객체 생성

		//Frame.setTitle(String title) : 프레임의 제목을 변경하는 메소드
		//setTitle(title);
		
		//frame.setLocation(600, 100);
		//frame.setSize(400, 300); 		//=> 위 두 줄의 코드를 아래 한줄로 해결가능!
		//Component.setBounds(int x, int y, int width, int height) : 컴포넌트의 출력위치와 크기를 변경하는 메소드
		setBounds(600, 100, 400, 300);
		
		//Frame.setResizable(boolean resize) : 프레임의 크기 변경 여부를 설정하기 위한 메소드
		//=> false : 프레임 크기 변경 불가능,  true : 프레임 크기 변경 가능
		//setResizable(false);
		
		
	}
	
	
	public static void main(String[] args) {
		//Frame 클래스를 상속받은 자식클래스로 객체 생성
		//=> Frame 객체 생성 - 프레임 생성
		new FrameTwoApp("프레임 연습");		//프레임 title = "프레임 연습"
	}
	
	
}
