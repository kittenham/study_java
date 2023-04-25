package xyz.itwill.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

//그림그려보기 이벤트~
//프레임에서 마우스 버튼을 클릭하면 클릭한 위치의 좌표값을 출력하는 프로그램 작성하기
public class PaintApp extends JFrame{

	private static final long serialVersionUID = 1L;
	
	
	//마우스 버튼을 클릭한 위치의 좌표값을 저장하기 위한 필드
	private int x, y;	//= (private Point point;) 라고 작성해도 됨.
	
	public PaintApp(String title) {
		super(title);
		
		//프레임에서 마우스 관련 이벤트가 발생될 경우 이벤트 처리 객체로 이벤트 처리되도록 등록
		//=> MouseAdapter클래스를 상속받은 익명의 내부 클래스를 사용하여 이벤트 처리 객체 생성
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//MouseEvent.getX() : 마우스를 클릭한 X좌표값을 반환하는 메소드
				//MouseEvent.getY() : 마우스를 클릭한 X좌표값을 반환하는 메소드
				x=e.getX();
				y=e.getY();
				
				//**paint() 메소드를 수동으로 호출하는 메소드
				repaint();
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 200, 300, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new PaintApp("Paint");
		
	}
	
	
	//Window.paint(Graphics g) : 컨테이너(JFram, JWindow, JDialog 등)를 출력하는 메소드
	//=> paint() 메소드는 컨테이너 관련 이벤트가 발생된 경우 자동호출
	// ==> 1. 프로그램이 실행되어 컨테이너가 보여질 경우
	// ==> 2. 프로그램이 아이콘에서 해제되어 컨테이너가 보여질 경우
	// ==> 3. 컨테이너의 크기가 변경될 경우
	//Graphics 객체 : 컨테이너에 그림을 그리기 위한 기능을 제공하는 객체
	//paint() 메소드를 오버라이드선언하여 컨테이너에 필요한 명령을 실행
	
	@Override
	public void paint(Graphics g) {
//		System.out.println("paint 메소드 호출");
		
		//부모클래스의 숨겨진 메소드 호출 - 컨테이너 초기화
		super.paint(g);
	
	/*	
		//Graphics.setColor(Color c) : 그림을 그리기 위한 색을 변경하는 메소드
		g.setColor(Color.RED);
		g.drawRect(20, 40, 50, 50);		//사각형선만 그릴 수 있는 명령
		g.fillRect(20, 100, 100, 50);	//안이 꽉 채워진 사각형만 그릴 수 있는 명령
		
		g.setColor(Color.GREEN);
		g.drawOval(20, 175, 50, 50);	//직사각형안에 꽉차는 타원만 그릴 수 있는 명령(직사각형은 안그려짐. 타원만 그려짐)
		g.fillOval(20, 175, 50, 50);	//직사각형안에 꽉차는 속이 꽉찬 타원만 그릴 수 있는 명령(직사각형은 안그려짐. 타원만 그려짐)
		
		g.setColor(Color.BLUE);
		g.drawLine(100, 300, 200, 300);	//선 그리는 명령
		g.drawString("홍길동", 100, 200);	//색깔있는 글자 가능
		
	*/
		
		
		g.drawString("["+x+","+y+"]", x, y);		
	}
}
