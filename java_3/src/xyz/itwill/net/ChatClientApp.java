package xyz.itwill.net;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//채팅 클라이언트 프로그램 - GUI로 만들어보자
//=> 서버에서 보내온 메세지를 전달받아 JTextArea 컴퍼넌트에 출력 -> 무한루프
//=> JTextField 컴퍼넌트에서 입력된 메세지를 서버에 전달 - 이벤트 처리 메소드
public class ChatClientApp extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JTextArea jTextArea; //출력 컴퍼넌트
	private JTextField jTextField; //입력 컴퍼넌트
	
	private Socket socket;	//서버와 연결된 Socket 객체를 저장하기 위한 필드
	
	private BufferedReader in; //서버에서 보내온 메세지를 전달받기 위한 입력스트림을 저장하는 필드
	private PrintWriter out; //서버에게 메세지를 보내기 위한 출력스트림을 저장하는 필드
	
	private String aliasName; //대화명을 저장하기 위한 필드
	
	
	public ChatClientApp(String title) {
		super(title);
		
		jTextArea.setFont(new Font("굴림체", Font.BOLD, 20));
		jTextField.setFont(new Font("굴림체", Font.BOLD, 20));
		
		jTextArea.setFocusable(false);
		
		getContentPane().add(jTextArea, BorderLayout.CENTER);
		getContentPane().add(jTextField, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 200, 400, 500);
		setVisible(true);
		
		jTextField.addActionListener(this);
			//JTextField 컴퍼넌트에서 발생된 ActionEvent를 처리하기 위한 ActionListener 객체

		
		try {
			socket = new Socket("192.168.13.31", 5000); //이렇게 하면 서버에 접속된것			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "서버에 접속할 수 없습니다.", "접속오류", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		
		while(true) { 	//정상적인 대화명을 입력받기 위한 반복문 작성
			aliasName = JOptionPane.showInputDialog(this, "대화명을 입력해주세요.","대화명 입력", JOptionPane.QUESTION_MESSAGE);
			String regEx="^[가-힣]{2,6}$"; //정규표현식 저장 (한글로 2~6글자)
			if(Pattern.matches(regEx, aliasName)) break;
				//정규표현식과 입력값의 패턴이 같은 경우 반복문을 종료하는 명령
			
			aliasName = JOptionPane.showInputDialog(this, "정상적인 대화명을 입력해주세요.","입력", JOptionPane.ERROR_MESSAGE);			
		}
		
		out.println(aliasName);
			//입력된 대화명을 서버에게 전달
		
		while(true) { //서버에서 보내온 메세지를 반환받아 JTextArea 컴퍼넌트에 추가하여 출력(프로그램이 종료되기 전까지 무한반복)
			try {
				jTextArea.append(in.readLine()+"\n");
				
				jTextArea.setCaretPosition(jTextArea.getText().length());
					//JTextArea 컴퍼넌트의 스크롤을 가장 끝으로 이동되도록 처리
				
			} catch (IOException e) { //여기 예외발생은 서버측에서 강제로 종료된 경우 발생하는 것.
				aliasName = JOptionPane.showInputDialog(this, "서버와 연결이 끊어졌습니다.","접속오류", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		new ChatClientApp("자바채팅");
	}
	
	
	//JTextField 컴퍼넌트에서 입력된 문자열(메세지)를 반환받아 서버에 전달하는 명령 작성
	@Override
	public void actionPerformed(ActionEvent e) {
		String message = jTextField.getText();
		
		if(!message.equals("")) { //입력된 메세지가 존재할 경우
			out.println(message); //서버에 메세지 전달
			jTextField.setText("");// JTextField 컴퍼넌트 초기화 -> 새로 메세지 입력가능해짐
		}
	}

}
