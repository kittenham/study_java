package xyz.itwill.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//다른 컴퓨터에서 보내온 메세지를 얻어와 출력하는 UDP 프로그램
public class MessageReceiveApp {
	public static void main(String[] args) throws IOException{
		
		DatagramSocket socket = new DatagramSocket(4000);
			//데이터를 받는 컴퓨터는 포트를 활성화하기 위해 DatagramSocket 클래스의 DatagramSocket(int port) 생성자를
			//사용하여 객체 생성

		byte[] data = new byte[1024];
			//패킷에 의해 전달된 값(메세지)을 저장하기 위한 byte 배열 선언
		
		DatagramPacket packet = new DatagramPacket(data, data.length);
			//데이터를 받는 컴퓨터는 DatagramPacket 클래스의 DatagramPacket(byte[] data, int length) 생성자를 이용하여
			//DatagramPacket 객체 생성
		
		System.out.println("메세지 수신 중...");
		
		socket.receive(packet);
			//DatagramSocket.receive(DatagramPacket packet) : 연결 컴퓨터에 보내온 값(패킷)을 언어와 저장하는 메소드
			//- 패킷을 받기 전까지 스레드는 일시 중지된다.
		
		String message = new String(data);
			//byte 배열에 저장된 값을 제공받아 String 객체를 생성하여 저장
		
		System.out.println("[결과] 메세지 >> "+message);
		
		socket.close();
	}
}
