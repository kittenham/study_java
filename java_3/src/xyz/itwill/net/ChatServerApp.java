package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

// 채팅서버 프로그램 - 다중스레드 프로그램
//**먼저 서버를 만들어주고 클라이언트를 만들어줘야함.

//=> 클라이언트에서 보내온 메세지를 전달받아 접속된 모든 클라이언트에게 전달하는 기능
//=> 클라이언트와 연결된 소켓은 새로운 스레드를 생성하여(메인스레드말고!) 독립적으로 입출력되도록 설저
public class ChatServerApp {
	
	private List<SocketThread> clientList;
		//현재 접속 중인 "모든" 클라이언트의 소켓정보가 저장된 List 객체를 저장하기 위한 필드
		//지금 socketThread가 소켓 정보를 가지고 있음. 따라서 여기서는  socketThread객체를 저장하기 위한 필드
	
	public ChatServerApp() {
		ServerSocket chatServer = null;
		
		try {
			chatServer = new ServerSocket(5000);
				//포트를 활성화하여 클라이언트가 접속할 수 있는 환경 제공
			System.out.println("[메세지] 채팅 서버 동작중...");
			
			clientList = new ArrayList<>();
				//ArrayList 객체를 생성하여 필드에 저장
			
			while(true) {	//무한루프를 만들어 소켓이 계속 만들어지도록 실시
				try {
					Socket socket = chatServer.accept();
						//클라이언트가 접속되면 클라이언트와 연결된 Socket 객체를 반환받아 저장
				
					System.out.println("[접속로그]"+socket.getInetAddress().getHostAddress()+"의 컴퓨터에서 서버에 접속 하였습니다.");
				
					SocketThread socketThread = new SocketThread(socket);
						//클라이언트와 연결된 Socket 객체가 저장된 SocketThread 객체 생성
						//=> Thread 클래스를 상속받은 스레드 클래스
					
					clientList.add(socketThread);
					//List 객체의 요소로 SocketThread 객체 추가
				
					socketThread.start();
						//스레드 객체를 이용하여 새로운 스레드 생성
						//=> 새로운 스레드는 run() 메소드를 호출하여 명령을 독립적으로 실행
				} catch (IOException e) {
					System.out.println("[에러로그]클라이언트의 접속 관련 문제가 발생 하였습니다.");
				}
			}
			
		} catch (IOException e) {
			System.out.println("[에러로그]서버가 정상적으로 동작되지 않습니다.");
		}
	}
	
	
	public static void main(String[] args) { 
		//메인스레드는 클라이언트가 접속하면 클라이언트의 소켓만 게속 실행할것
		new ChatServerApp();
	}
	
	
	//현재 접속중인 모든 클라이언트에게 메세지를 전달하는 메소드
	public void sendMessage(String message) {
		for(SocketThread socketThread : clientList) {
			// List 객체에 저장된 요소(SocketThread 객체)를 차례대로 제공받아 반복처리
			socketThread.out.println(message);
				//SocketThread 객체의 out 필드에 저장된 출력스트림을 사용하여 메세지 전달
				//=> 외부클래스는 내부클래스로 객체를 생성하여 접근제한자에 상관없이 필드나 메소드 접근이 가능
		}
		
	}
	
	
	//클라이언트와 연결된 소켓을 이용하여 입출력 기능을 제공하기 위한 스레드 클래스
	//=> 독립적인 입력 또는 출력 기능을 제공하기 위해 새로운 스레드를 생성하여 
	//명령을 실행할 수 있도록 Thread 클래스를 상속받아 run() 메소드 오버라이드 선언해야한다.
	public class SocketThread extends Thread { // 새로운 스레드 클래스 만들때 무조건 스레드 상속받아야함
		
		private Socket client;
			//클라이언트와 연결된 Socket 객체를 저장하기 위한 필드
		
		private BufferedReader in; //메세지를 주고받기 위해
			//클라이언트에서 보내온 메세지를 읽기 위한 입력스트림을 저장하기 위한 필드
		private PrintWriter out;	//BufferedWirter를 써도 되지만 PrintWriter가 사용할 수 있는 메소드가 더 많음
			//클라이언트에게 메세지를 보내기 위한 출력스트림을 저장하기 위한 필드
		
		public SocketThread(Socket client) {
			this.client = client;
			
		}
		
		
		//새로운 스레드가 실행할 명령을 작성하기 위한 메소드
		//=> client에서 보내온 메세지를 전달받아 모든 클라이언트에게 전달하는 명령을 작성한다.
		@Override
		public void run() {
			String aliasName = ""; 	//클라이언트의 대화명을 저장하기 위한 변수 선언 (스레드가 끝날때까지 변경되면 안되니까 제일 위에 작성)
			
			try {
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
					// 포켓의 입력스트림(원시데이터)을 제공받아 대량의 문자 데이터를 읽을 수 있는 입력 스트림으로 확장하고 그것을 필드에 저장한것.
		
				out= new PrintWriter(client.getOutputStream(), true);
					//소켓의 출력스트림을 제공받아 문자열을 전달할 수 있는 출력스트림으로 확장하여 필드에 저장
					//=> PrintWriter(OutputStream out, boolean autoFlush) : 생성자를 사용하여 PrintWriter 객체 생성
					//=> autoFlush 매개변수에 [true]를 전달하면 버퍼를 사용하지 않고 무조건 출력스트림으로 데이터를 전달한다.
					//(=따로 flush를 선언해주지 않아도 자동으로 flush가 실행된다.)
						//autoFlush 속성 : 사용시 'true', 사용 안할시 'false' 설정.
						//- 'true'일때 : 버퍼가 가득 차면 버퍼 내용을 전송하고 버퍼를 비움.
						//- 'false'일때 : 버퍼가 가득 차면 예외발생 후 작업을 중지시키고 에러페이지 출력.
					//out을 사용하면 접속한 인원 한명에게만 전달됨.
				
				aliasName = in.readLine();
					//클라이언트에서 보내온 대화명을 반환받아 변수에 저장
					//=> 클라이언트가 대화명을 보내오기 전까지 스레드는 일시중지된다.
				
				//"모든" 클라이언트에게 환영의 입장메세지를 전달하기
				//out을 사용하면 접속한 인원 한명에게만 전달되기 때문에 모든 클라이언트에게 전달하기 위해서는 다른 것이 필요
				//=> 맨 위에 public List<socketThread> clientList; 추가해줌.

				
				//현재 접속중인 모든 클라이언트에게 입장 메세지 전달
				//=>내부클래스에서는 외부클래스의 필드 또는 메소드를 접근제한자에 상관없이 접근 가능
				sendMessage("["+aliasName+"]님이 입장하였습니다.");
				
				//클라이언트에서 보내온 메세지를 전달받아 현재 접속중인 모든 클라이언트에게 전달할 수 있도록 한다.
				//=>클라이언트가 접속을 끊을때까지 유지(반복 처리)
				//클라이언트가 접속을 종료한 경우 IOException 발생
				while(true) {
					sendMessage("["+aliasName+"]"+in.readLine());
				}
			} catch (IOException e) {
				//클라이언트가 접속을 종료한 경우 실행될 명령 작성
				//리스트 객체에서 접속중인 클라이언트의 정보(socketThread 객체) 삭제
				clientList.remove(this);
				
				sendMessage("["+aliasName+"]님이 퇴장하였습니다.");

			}
			
		}
		
	}
	
}
