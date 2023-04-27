package xyz.itwill.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

//NTP 서버에 접속하여 서버에서 보내온 날짜와 시간을 제공받아 출력하는 클라이언트 프로그램 작성해보기
//서버 실행 후 클라이언트 
//Class TimeServerApp과 같이보기(서버역할)
public class TimeClientApp {	//(클라이언트 역할)

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			//Socket 클래스 : TCP 프로그램에서 타겟 컴퓨터와의 연결을 위한 정보를 저장하기 위한 클래스
			//- 다른컴퓨터의 소켓과 연결되어 값을 송수신 할 수 있는 입출력 스트림을 제공한다.
			//=> Socket 클래스의 Socket(String host, int port) 생성자를 이용하여 매개변수에 접속 컴퓨터(서버)의 
			//네트워크 식별자(호스트 이름 또는 IP 주소)와 활성화된 포트번호를 전달하여 Socket 객체 생성 (= 서버에 접속)
			//=> UnknownHostException 및 IOException 발생 -> 일반예외이므로 반드시 예외 처리(두번다 써주는게 좋음~)
			Socket socket = new Socket("192.168.13.18", 2000);	//=>서버접속(ip주소의 2000번 포트를 통해 접속)
				//TCP 프로그램은 무조건 접속이 먼저. 접속 후에 연결되어 데이터를 주고 받을 수 있다.
			
//			System.out.println("socket = "+socket);
			
			//서버에서 보내온 날짜와 시간을 받아야 함.
			InputStream stream = socket.getInputStream();
				//
			//얘도 확장시켜줘야함
			ObjectInputStream in = new ObjectInputStream(stream);
				//InputStream 객체를 전달받아 객체를 받을 수 있는 입력스트림으로 확장
			
			//서버에서 객체를 받았으니 날짜 읽기(입력스트림을 이용하여 서버에서 보내온 Date 객체를 반환받아 저장)
			Date date = (Date)in.readObject();
			
			//Date객체에 저장된 날짜와 시간을 원하는 형식의 문자열로 변환하여 출력해보자
			System.out.println("[결과] 서버에서 보내온 날짜와 시간 = "+ new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초").format(date));
				

			socket.close(); //소켓도 다쓰면 닫아줘야함.
				//Socekt.close() : Socket 객체를 제거하는 메소드 (=접속 해제) - 데이터를 주고받을 수 없게됨.
		} catch (UnknownHostException e) {
			System.out.println("[에러] 서버를 찾을 수 없습니다.");	//서버 프로그램이 실행이 안되었으니까 접속 할 수 없다는 말.
		} catch (IOException e) {
			System.out.println("[에러] 서버에 접속 할 수 없습니다.");
		}

	}
}