package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//UDP 프로그램 : DatagramSocket 클래스와 DatagramPacket 클래스를 이용하여 작성 
//=> 값을 전달받는 컴퓨터와 값을 전달받는 컴퓨터로 구분(서버와 클라이언트 개념X)


//키보드로 메세지를 입력받아 다른 컴퓨터에게 전달하는 UDP 프로그램 작성
public class MessageSendApp {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("전달 메세지 입력 >> ");
		String message = in.readLine(); //예외전달. 키보드로 메세지를 입력받는일.
		
		DatagramSocket socket = new DatagramSocket();
			//DatagramSocket 클래스 : 다른 컴퓨터와 연결하기 위한 정보를 저장하기 위한 클래스
		
		InetAddress address = InetAddress.getByName("192.168.13.31");
			//연결할 컴퓨터의 네트워크 식별자가 저장된 InetAddress 객체를 반환받아 저장
		
		byte[] data = message.getBytes();
			//String.getBytes() : String 객체에 저장된 문자열을 byte 배열로 변환하여 반환하는 메소드
			//byte 배열로 변환하는 이유 : 원시데이터로 전송해야 하니까~.
		
		DatagramPacket packet = new DatagramPacket(data, data.length, address, 4000);
			//DatagramPacket 클래스 : 연결 컴퓨터에게 보낼 패킷정보를 저장하기 위한 클래스
			//=> DatagramPacket 클래스의 DatagramPacket(byte[] data, int length, InetAddress, int port)
			//[=보낼데이터, 보낼데이터의 크기, 보낼컴퓨터의 네트워크 식별자, 그 컴퓨터의 활성화된 포트] 생성자를 사용하여 
			//데이터를 보내기 위한 패킷정보가 저장된 DatagramPacket 객체 생성
		
		socket.send(packet);
			//DatagramSocket.send(DatagramPacket packet) : 매개변수로 전달받은 DatagramPacket 객체의 패킷정보를 이용해
			//데이터(패킷)를 전달하는 메소드
		
		socket.close();
			//DatagramSocket.close() : DatagramSocket 객체를 제거하는 메소드
		
		System.out.println("[결과] 연결 컴퓨터에게 메세지를 보냈습니다.");
	}
}
//DatagramSocket은 딱 보내는 역할만 함. DatagramPacket이 보내는 정보를 가지고 보낸다.
