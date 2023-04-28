package xyz.itwill.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

//네트워크(Network) : 두 대 이상의 컴퓨터에서 값을 송수신 하기 위한 기능

//인터넷(Internet) : 현실세계에 존재하는 모든 컴퓨터들을 연결한 네트워크 통신망

//프로토콜(Protocol) : 인터넷을 사용하기 위한 네트워크 관련 약속 - 통신규약
//프로토콜 구조 : 네트워크 계층 > 인터넷 계층(IP) > 전송 계층(TCP,UDP) > 응용 계층(FTP,HTTP,SMTP)

//호스트(Host) : 네트워크 기능을 사용하는 컴퓨터(프로그램)

//네트워크 계층 - 이더넷, 라우터, 스위치허브
//=> 이더넷(Ethernet) : 호스트에서 사용하기 위한 통신장비
//=> 라우터(Router) : 네트워크 그룹과 네트워크 그룹을 연결하기위한 통신장비
//=> 스위치허브(SwitchHub) : 호스트와 호스트 또는 호스트와 네트워크 그룹을 연결하기 위한 통신장비

//IP(Internet Protocol) : 인터넷을 사용하기 위한 네트워크 주소(IP 주소)에 대한 통신규약 - IPV4, IPV6

//TCP(Transmission Control Protocol) : 연결형 프로토콜(네트워크 기능을 이용한 연결 후 통신 가능)로 신뢰할 수 있는
//데이터 전송에 대한 통신규약이다. - 전송제어 프로토콜
// => 소켓(Socket) 통신 - 1:1 연결
//UDP(User Datagram Protocol) : 비연결형 프로토콜(네트워크 기능을 이용한 연결 설정 없이 통신 가능)로 신뢰할 수 없는
//데이터 전송에 대한 통신규약이다. - 사용자 데이터그램 프로토콜
// => 고속통신 가능 - 1:N 연결 가능,  보낸 데이터 즉각처리 가능
//ex. 토렌트

//응용계층 : 전송계층을 기반으로 생성된 다수의 하위 프로토콜을 차영한 서비스 프로그램 - 응용 프로그램


//IP 주소 : 인터넷을 사용하기 위해 컴퓨터에 부여하는 네트워크 식별자
//=> IPV4 이용 : 32Bit를 이용하여 IP 주소 표현 - 10진수 0~255 범위의 정수값 4개를 [.]으로 구분하여 
//=> IPV6 이용 : 128Bit를 이용하여 IP 주소 표현 - 16진수 0000~FFFF 범위의 정수값 8개를 [:]으로 구분하여
//=> 공인 IP 주소와 사설 IP 주소가 존재. 
//==> 사설IP : (A클래스 : 10.0.0.0 ~ 10.255.255.255), (B클래스 : 172.16.0.0 ~ 172.31.255.255), (C클래스 : 192.168.0.0 ~ 192.168.255.255)로 구분

//Netmask 주소 : 네트워크 그룹(SubNet)을 표현하기 위한 주소
//=> A클래스 : 255.0.0.0 = 16,777,216 => 0.X.X.X ~ 127.X.X.X
//=> B클래스 : 255.255.0.0 = 65,536 => 128.X.X.X ~ 191.X.X.X
//=> C클래스 : 255.255.255.0 = 256 => 192.X.X.X ~ 232.X.X.X

//Gateway 주소 : 라우터에 부여된 IP 주소

//DNS 서버 : 도메인(호스트이름)을 IP 주소로 변환하는 기능의 서비스를 제공하는 컴퓨터

//도메인(Domain) : 인터넷을 사용하기 위해 네트워크 그룹 또는 호스트에게 부여하는 문자로된 네트워크 식별자
//=> 도메인 그룹에 등록되어 있어야 호스트 사용 가능하다. (= 도메인 호스트)

//포트번호(Port Number) : 네트워크 기능을 이용하여(=인터넷을 사용하여) 데이터를 송수신하기 위한 고유의 통신 경로
//=> 네트워크 프로그램은 반드시 0~65535 범위의 포트 중 하나를 사용하여 데이터를 전송해야한다.
//=> 포트가 충돌이 일어나면 안됨.
//=> 0~1023 : Well-Known Port(HTTP : 80, HTTPS : 443, SMTP : 24, POP3 : 110 등) => 따라서 이 번호 안의 포트들은 절대 쓰면 안됨.(약속된 포트들이라)
//=> 1024~49151 : 네트워크 프로그램 작성시 사용 가능한 포트
//=> 49152~65535 : 일시적으로 사용하는 임시 포트 => Private Port (사용하면 안됨!)
//*HTTPS가 데이터를 암호화해서 보내기 때문에 HTTP보다 더 보안성이 높다.

//패킷(Packet) : 인터넷에서 데이터를 전송하기 위한 단위 - Java에서는 byte 배열로 표현 가능

//방화벽(Firewall) : 네트워크를 이용한 접속 및 데이터 전송 차단 또는 허용을 위한 시스템(프로그램)

//java.net 패키지 : 네트워크 프로그램을 작성하기 위한 기능의 클래스가 선언된 패키지

public class InetAdressApp {

	public static void main(String[] args) throws UnknownHostException {
		
		//InetAddress 클래스 : 네트워크 식별자(IP 주소 및 호스트 이름)을 저장하기 위한 클래스
		//(네트워크를 할때 가장 기본적인 클래스)
		//InetAddress.getLocalHost() : 현재 사용중인 컴퓨터의 네트워크 식별자가 저장된 InetAdress 객체를 반환하는 메소드
		//=> UnkownHostException 발생(일반예외) : 호스트 이름의 컴퓨터를 검색할 수 없는 경우 발생되는 예외
		//현재 사용중인 컴퓨터는 기본적으로 [127.0.0.1]의 IP주소가 제공되며 [localhost]라는 이름으로 호스트 이름(네트워크에서 사용하는 컴퓨터 이름) 설정
		//이더넷 장치가 있으면  IP주소나 호스트 이름으로 사용.
		
		InetAddress myComputer = InetAddress.getLocalHost();
		
		//InetAddress.toString() : InetAddress객체에 저장된 네트워크 식별자를 문자열로 변환하여 반환하는 메소드
		System.out.println("My Computer = "+myComputer);
		
		//InetAddress.getHostName() : InetAddress 객체에 저장된 네트워크 식별자에서 IP주소를 문자열로 변환하여 반환하는 메소드
		System.out.println("myComputer = "+myComputer.getHostName());
		
		System.out.println("===================================================================================");
		
		//InetAddress.getByName(String Name) : 매개변수로 받은 호스트이름에 대한 네트워크 식별자가 저장된 InetAddress객체를 반환하는 메소드 
		InetAddress itwill = InetAddress.getByName("www.itwill.xyz");
		
		System.out.println("[www.itwill.xyz]의 IP 주소 = "+itwill.getHostAddress());
		
		System.out.println("===================================================================================");

		//InetAddress.getAllByName(String name) : 매개변수로 전달받은 호스트이름에 대한 네트워크 식별자가 저장된 
		//InetAddress 객체의 배열을 반환하는 메소드
		InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
		
		for(InetAddress address : naver) {
			System.out.println("www.naver.com]의 주소 = "+address.getHostAddress());
		}
		
		
	}
	
	
	

}
