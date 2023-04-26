package xyz.itwill.io;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

//문서파일 편집기 프로그램 작성 - <메모장>을 만들어보자~
public class NotepadApp extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextArea jTextArea;
	JMenuItem init, open, save, exit;
	
	//FileDialog클래스 : 파일을 선택하기 위한 다이얼로그를 생성하기 위한 클래스
	FileDialog openDialog, saveDialog;	//필드선언
	
	//현재작업중인 문서파일의 경로를 저장하기 위한 필드
	private String filepath;
	
	public NotepadApp(String title) {
		super(title);
		
		JMenuBar jMenuBar = new JMenuBar();
		JMenu jMenu = new JMenu("파일(F)");	//메뉴바 항목
		jMenu.setMnemonic('F');
		
		//메뉴아이템을 선택할 경우 AcctionEvent 발생
		init = new JMenuItem("새로만들기(N)", 'N');
		open = new JMenuItem("열기(O)", 'O');
		save = new JMenuItem("저장(S)", 'S');
		exit = new JMenuItem("끝내기(X)", 'X');
		
		
		//단축키 만들기 : KeyStroke 사용
		init.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));	
			//Ctrl + N 이라는 단축키 만들기
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.SHIFT_DOWN_MASK+InputEvent.ALT_DOWN_MASK));
			//ALT + SHIFT + O
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.SHIFT_DOWN_MASK+InputEvent.ALT_DOWN_MASK));
			//ALT + SHIFT + S
		
		
		jMenu.add(init);
		jMenu.add(open);
		jMenu.add(save);
		jMenu.addSeparator();;	//구분선 만들기
		jMenu.add(exit);
		
		jMenuBar.add(jMenu);
		
		setJMenuBar(jMenuBar);
		
		jTextArea = new JTextArea();
		jTextArea.setFont(new Font("굴림체", Font.PLAIN, 20));
		JScrollPane jScrollPane = new JScrollPane(jTextArea); //스크롤바 만들기
		
		getContentPane().add(jScrollPane, BorderLayout.CENTER);
		
		openDialog = new FileDialog(this, "열기", FileDialog.LOAD);	//읽어들이기 용도의 다이얼로그
		saveDialog = new FileDialog(this, "저장", FileDialog.SAVE);	//저장용도의 다이얼로그
		//파일을 선택할 때 읽어들이기 용도인지 저장용도인지 설정하는 것
		
		
		init.addActionListener(new NotepadEventHandle()); //아래 생성된 이벤트 클래스가 실행되도록
		open.addActionListener(new NotepadEventHandle());
		save.addActionListener(new NotepadEventHandle());
		exit.addActionListener(new NotepadEventHandle());
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(450, 150, 1000, 600);	//메모장 초기 크기 설정
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NotepadApp("제목없음 - Java 메모장");	//메모장 이름 설정
	}
	
	
	
	public class NotepadEventHandle implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object evenSource = e.getSource();
			
			if(evenSource==init) {
				jTextArea.setText("");
				filepath="";	//필드값 초기화
				setTitle("제목없음 - Java 메모장"); //프레임 제목 초기화
			} else if(evenSource==open) {
				//열기 관련 파일 다이얼로그를 화면에 출력
				//=> 파일을 선택하거나 선택을 취소한 경우 파일 다이얼로그는 자동으로 숨김처리됨.
				openDialog.setVisible(true);
				
				//FileDialog.getFile() : 선택된 파일의 이름을 반호나하는 메소드
				if(openDialog.getFile()==null) return;
				
				//FileDialog.getDirectory() : 선택된 파일의 디렉터리 경로를 반환하는 메소드
				filepath=openDialog.getDirectory()+openDialog.getFile(); //선택된 파일의 경로 저장
				
				try {
					//파일 경로를 제공받아 파일 입력스트림 생성
					BufferedReader in = new BufferedReader(new FileReader(filepath));
					
					jTextArea.setText(""); //JTextArea 컴퍼넌트 초기화
					
					while(true) {
						String text = in.readLine(); //파일에 저장된 값을 한줄씩 읽어 문자열로 반환받아 저장
							//filereader는 한글자씩 읽는데 Bufferedreader는 한꺼번에 통째로 읽기 가능. readLine() 이니까 엔터전까지.
						if(text==null) break;
						jTextArea.append(text+"\n");
					}
					in.close();
					
					setTitle(openDialog.getFile()+" - Java 메모장");
				} catch(FileNotFoundException exception) {	//FileNotFoundException은 IOException 위에 써줘야함. IOException이 더 상위이기 때문
					JOptionPane.showMessageDialog(null, "프로그램에 문제가 발생 하였습니다.");
				}catch(IOException exception) {
					JOptionPane.showMessageDialog(null, "프로그램에 문제가 발생 하였습니다.");
				}
			} else if(evenSource==save) {
				saveDialog.setVisible(true);
				
				if(saveDialog.getFile()==null) return; //파일 선택을 취소했으면, 메소드 종료되도록 설정.
				
				filepath=saveDialog.getDirectory()+saveDialog.getFile(); //선택된 파일의 경로 저장

				try {
					//파일 경로를 제공받아 파일 입력스트림 생성
					BufferedWriter out = new BufferedWriter(new FileWriter(filepath));
					
					//JTextArea 컴퍼넌트의 모든 문자열을 반환받아 저장
					String text = jTextArea.getText();
					
					//반환받은 문자열을 출력스트림으로 전달하여 저장
					out.write(text);
					
					out.close();
					
					setTitle(saveDialog.getFile()+" - Java 메모장");
				}catch(IOException exception) {
					JOptionPane.showConfirmDialog(null, "프로그램에 문제가 발생하였습니다.");
				}
			} else if(evenSource==exit) {
				
				System.exit(0);
			}
		}
	}
	
}
