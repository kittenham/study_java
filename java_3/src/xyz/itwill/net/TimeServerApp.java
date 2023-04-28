package xyz.itwill.net;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

//접속된 클라이언트에게 서버컴퓨터의 현재 날짜와 시간을 전달하는 서버프로그램 작성해보기
//=> NTP(Network Time Protocol) Server : 날짜와 시간을 제공하는 서버컴퓨터
public class TimeServerApp {
	public static void main(String[] args) {
		ServerSocket ntpServer = null;
		
		try {
			//ServerSocket 객체 생성 : 포트를 활성화하여 클라이언트가 접속 할 수 있는 환경 제공
			ntpServer = new ServerSocket(2000);	//2000번 포트 열기//클라이언트는 2000반 포트로 서버에 접속가능해짐
			
			
			//ServerSocket.toString() : ServerSocket 객체에 저장된 접속 관련 정볼르 문자열로 반환하는 메소드
//			System.out.println("ntpServer = "+ntpServer);	//2000번 포트를 통해 모든 컴퓨터들이 접속 할 수 있는 환경 셋팅됨.
			
			
			System.out.println("[메세지] NTP Server Running...");
			
//			Socket socket = ntpServer.accept();	
//				//이렇게 하면 하나의 클라이언트밖에 연결 못함.
//				//많은 클라이언트들이 연결되기를 원한다면 while을 사용해 의도적으로 무한루프를 만들어주면됨.
//			▼
			while(true) {
				Socket socket = ntpServer.accept();	
					//ServerSocket.accept() :클라이언트가 접속되면 클라이언트에 값을 주고 받을 수 있는 Socket 객체를 반환하는 메소드
					//=> 클라이언트가 접속되기 전까지 스레드는 일시 중지된다.
					//=> 클라이언트가 접속을 하면, 클라이언트의 소켓과 연결된 소켓을 생성하여 반환하고 스레드는 재실행한다.
				
					//서버안에 소켓은 클라이언트 수만큼 있음.(클라이언트 안의 소켓이 서버의 accept를 이용해 소켓을 생성하기 때문)
					
				//System.out.println("socket = "+socket);
				
				/*
				socket.getOutputStream();
					//Socket.getOutputStream() : Socket 객체의 출력스트림(OutputStream 객체)을 반환하는 메소드
				
				//날짜와 시간을 제공받아 출력 => 객체로 제공하면됨 => ObjectOutputStream으로 확장해주면됨.
				//▼
				ObjectOutputStream out = new ObjectOutputStream(stream);
					//OutputStream 객체를 전달받아 객체를 전달할 수 있는 출력스트림으로 확장
				
				out.writeObject(new Date());
					//출력스트림을 이용하여 시스템의 현재 날짜와 시간이 저장된 Date 객체를 생성하여 전달
					//-클라이언트에게 날짜와 시간을 전송
					 
				 */
				//▼한번에 정리해주기
				new ObjectOutputStream(socket.getOutputStream()).writeObject(new Date());
				
				//로그처리- 기록☆
				//Socket.getInetAddress() : 서버의 소켓과 연결된 외부 컴퓨터의 네트워크 식별자가 저장된 InetAddress 객체를 반환하는 메소드
				System.out.println("[정보] 클라이언트["+socket.getInetAddress()+"]에게 날짜와 시간을 제공하였습니다.");
				
				//목표를 달성했으니 클라이언트와의 접속 해제해주기.
				socket.close(); //소켓도 다쓰면 닫아줘야함.
				
			}
			
		} catch(IOException e) {
			System.out.println("[에러] 서버 네트워크에 문제가 발생 되었습니다.");
		}
	}

}
