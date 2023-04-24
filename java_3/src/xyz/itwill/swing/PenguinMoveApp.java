package xyz.itwill.swing;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PenguinMoveApp extends JFrame{

	private static final long serialVersionUID = 1L;
	
	//펭귄의 폭과 높이를 따로따로 지정한 상수
	private static final int JFRAME_WIDTH=646;
	private static final int JFRAME_HEIGHT=461;
	
	//펭귄의 폭과 높이를 한번에 지정한 상수
	private static final int PENGUIN_SIZE=60;
	
	//배경이미지를 저장하기 위한 필드
	//Image 클래스 : 그림파일의 정보를 저장하기 위한 클래스
	private Image backImage;
	
	//펭귄이미지를 저장하기 위한 필드 - 배열
	private Image[] penguins;
	
	//펭귄 이미지를 선택하기 위한 필드 - 배열의 첨자
	private int penguinNo;
	
	//펭귄이미지가 출력될 좌표값을 저장하기 위한 필드
	private int penguinX, penguinY;
	
	public PenguinMoveApp(String title) {
		super(title);
		
		//ImageIcon 클래스 : 그림파일의 정보를 저장하기 위한 클래스(그래서 파일의 경로를 제공받아야함)
		//ImageIcon(URL location) : 그림파일의 URL 주소를 제공받아 ImageIcon 객체 생성
		//URL : 리소스파일(그림파일, 소리파일, 동영상 파일 등)의 경로를 저장하기 위한 
		//Object.getClass() : 메모리에 저장된 현재 실행 클래스의 Class 객체를 반환하는 메소드
		//Class.getResource(String name) : 현재 실행 클래스를 기준으로 리소스 파일을 읽어 URL 객체를 반환하는 메소드
		//ImageIcon.getImage() : ImageIcon 객체에 저장된 그림파일의 Image 객체를 반환하는 메소드
		//배경이미지 파일을 읽어 배경이미지를 필드에 저장 
		backImage = new ImageIcon(getClass().getResource("/images/back.jpg")).getImage();
		
		//펭귄이미지파일을 읽어 필드(배열)요소에 저장
		penguins = new Image[3];
		for(int i=0; i<penguins.length;i++) {
			penguins[i] = new ImageIcon(getClass().getResource("/image/penguin)"+(i+1)+".png"); 
		}
		
		//penguinNO=0;
		
		penquinX = 
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 200, JFRAME_WIDTH, JFRAME_HEIGHT);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PenguinMoveApp("펭귄 이동");
	}

}
