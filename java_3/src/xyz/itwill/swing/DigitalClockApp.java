package xyz.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//GUI 프로그램을 만들때는 다중 스레드로 만들어야 함.거의.

//시스템 현재 날짜와 시간을 제공받아 출력하는 GUI 프로그램 작성해보기
//=> 새로운 스레드를 생성하여 날짜와 시간정보를 1초마다 제공받아 컴퍼넌트를 변경
public class DigitalClockApp extends JFrame{

	private static final long serialVersionUID = 1L;
	
	//날짜와 시간을 출력할 JLabel 컴퍼넌트를 저장하기 위한 필드
	JLabel clockLabel;
	JButton startButton, stopButton;
	
	//날짜와 시간을 변경하는 스레드의 실행상태를 저장하기 위한 필드
	// => false : 스레드 중지상태,  true : 스레드 동작상태 (-> 버튼을 누를때 상태를 바꿔주면됨)
	//스레드는 최대한 변경하지 않는 것이 좋음.
	private boolean isRun;
	
	public DigitalClockApp(String title) {
		super(title);
		
		isRun=true;
		
/*
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String printDate = dateFormat.format(now);
*/
		
		
		clockLabel = new JLabel("2023년 04월 24일 15시 44분 22초", JLabel.CENTER);	//임의대로 시간을 넣는 것이 아닌 1초마다 바뀌도록 만들어줘야함.
		clockLabel.setFont(new Font("굴림체", Font.BOLD, 30));
		clockLabel.setForeground(Color.DARK_GRAY);
		
		startButton = new JButton("다시 실행");
		stopButton = new JButton("일시 중지");
		startButton.setFont(new Font("굴림체", Font.BOLD, 20));
		stopButton.setFont(new Font("굴림체", Font.BOLD, 20));
		JPanel jPanel = new JPanel();
		jPanel.add(startButton);
		jPanel.add(stopButton);

		startButton.setEnabled(false);	//시작버튼을 눌러 일시중지 시키고 다시 눌러 다시 재생하도록 만들기
		
		
		
		getContentPane().add(clockLabel, BorderLayout.CENTER);
		getContentPane().add(jPanel, BorderLayout.SOUTH);
		
		//스레드 클래스로 객체를 생성하여 새로운 스레드를 생성해 run() 메소드의 명령을 실행 (밑에 메인스레드말고 스레드 메소드를 다 만들면 여기 객체 생성해서 실행하도록 해야함)
		new ClockThread().start();
		
		//컴퍼넌트에서 이벤트가 발생될 경우 이벤트 처리 객체를 제공받아 이벤트 처리
		//=> Event-Queue 스레드에 의해 이벤트를 감지하여 JVM에 의해 이벤트 처리(내가 만들어주는것아님~)
		startButton.addActionListener(new ClockEventHandel());
		stopButton.addActionListener(new ClockEventHandel());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 200, 600, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new DigitalClockApp("디지털 시계");
	}

	
	//시스템의 현재날짜와 시간을 1초마다 제공받아 JLabel 컴퍼넌트를 변경하는 기능을 제공하는 스레드 클래스
	public class ClockThread extends Thread{
		@Override
		public void run() {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
			
			while(true) {
				
				if(isRun) {
				
				/*
				Date now = new Date();
				String printDate = dateFormat.format(now);
				
				//JLabel.setText(String text) : JLabel 컴퍼넌트의 문자열을 변경하는 메소드
				clockLabel.setText(printDate);
				*/
				//▼한줄로 나타내기
				//시스템의 현재 날짜와 시간을 제공받아 JLabel 컴퍼넌트의 문자열 변경
				clockLabel.setText(dateFormat.format(new Date()));
				}
				try {
					Thread.sleep(1000);		//스레드를 1초동안 중지
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	
	
	
	//버튼을 누른 경우 실행될 이벤트 처리 클래스
	public class ClockEventHandel implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object eventSource = e.getSource();
			
			if(eventSource==startButton) {
				startButton.setEnabled(false);
				stopButton.setEnabled(true);
				
				isRun=true;
			}else if(eventSource==stopButton) {
				startButton.setEnabled(true);
				stopButton.setEnabled(false);
				
				isRun=false;
			}
		}
	}
	
}
