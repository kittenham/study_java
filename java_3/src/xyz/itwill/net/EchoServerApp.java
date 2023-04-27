package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//클라이언트에서 보내온 메세지를 제공받아 출력하는 서버 프로그램 작성해보자
public class EchoServerApp {
	public static void main(String[] args) {
		ServerSocket echoserver = null;
		
		try {
			echoserver = new ServerSocket(3000); //3000번 포트 활성화시키기
			System.out.println("[메세지] Echo Server Running...");
			
			while(true) {
				Socket socket = echoserver.accept();
				
				//메세지를 제공받아보자
				BufferedReader in= new BufferedReader(new InputStreamReader(socket.getInputStream())); 
					//1. 소켓의 입력스트림(원시데이터(getInputStream))을 문자데이터를 받을 수 있도록 확장(InputSteamReader)
					//2. 대량의 문자 데이터를 읽을 수 있는 입력스트림으로 다시한번 더 확장(BufferedReader)
				
				System.out.println("["+socket.getInetAddress().getHostAddress()+"]님이 보내온 메세지 = "+in.readLine());
				
				socket.close(); //다 썼으면 끝내기.
			}
			
		} catch (IOException e) {
			System.out.println("[에러] 서버 네트워크 문제가 발생하였습니다.");
		}
		
	}
}
