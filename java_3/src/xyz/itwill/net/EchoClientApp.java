package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//키보드로 메세지를 입력받아 접속 서버에 전달하는 클라이언트 프로그램을 만들어보자
public class EchoClientApp {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			//1. 소켓의 입력스트림(원시데이터(getInputStream))을 문자데이터를 받을 수 있도록 확장(InputSteamReader)
			//2. 대량의 문자 데이터를 읽을 수 있는 입력스트림으로 다시한번 더 확장(BufferedReader)
		
		System.out.println("전달 메세지 입력 >> ");
		String message = in.readLine(); //예외전달. 키보드로 메세지를 입력받는일.
		
		//서버에 접속하기
		try {
			Socket socket = new Socket("192.168.13.31", 3000);
			
		/*	
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				//소켓의 출력스트림(원시데이터)을 제공받아 문자데이터를 전달 할 수 있도록 확장 한 후
				//대량의 문자데이터를 전달 할 수 있는 출력스트림으로 확장.
			
			out.write(message);
				//서버의 소켓과 연결된 출력스트림을 이용하여 문자열(메세지) 전달
			
			out.flush(); 
				//출력스트림의 버퍼에 존재하는 문자데이터를 출력스트림으로 전달.
				//Buffer를 이용하기 때문에 Buffer안에 데이터가 출력되지 않고 저장만 되어있기 때문에 출력할 수 있도록 명령내려야함.
		*/
			//▼한줄로 요약
			PrintWriter out = new PrintWriter(socket.getOutputStream());
				//소켓의 출력스트림을 제공받아 모든 자료형의 값을 문자열로 변환하여 전달할 수 있는 기능의 출력스트림으로 확장

			
			out.println(message);
				//PrintWriter.println(Object o) : 매개변수로 전달받은 모든 자료형의 값(객체)를 문자열로 변환하여 전달하는 메소드
				//따라서, BufferedWriter보다는 PrintWriter 가 좀 더 쓰기 좋음.(메소드가 더 많기 때문에)
			
		} catch (IOException e) {
			System.out.println("[에러] 서버에 접속할 수 없습니다.");
		}
		
	}
}
