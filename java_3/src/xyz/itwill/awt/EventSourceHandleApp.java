package xyz.itwill.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//[EXIT] 버튼을 누른 경우 프로그램을 종료하는 기능의 프로그램 작성
//=> 방법1) 디자인 클래스와 이벤트 처리 클래스를 하나의 클래스로 작성
//=> 방법2) 이벤트 처리 메소드(Inner Class)에서 디자인 클래스(Outer Class)의 컴퍼넌트 사용 가능 (이벤트 처리 메소드를 디자인클래스의 내부클래스로 만들어주는것.)
//=> 만들기는 쉽지만 유지보수가 어려움
public class EventSourceHandleApp extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;

	public EventSourceHandleApp(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		Button exit = new Button("EXIT");	//이벤트 소스
		exit.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		add(exit);
	
		//컴퍼넌트에서 발생된 이벤트를 this 키워드를 사용하여 현재 클래스의 객체로 이번트 처리
		exit.addActionListener(this);

		
		setBounds(800, 200, 300, 300);
		setVisible(true);
		
	}
		
		public static void main(String[] args) {
			new EventSourceHandleApp("이벤트처리");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
