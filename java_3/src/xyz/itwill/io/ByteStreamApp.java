package xyz.itwill.io;

import java.io.IOException;

//java.io 패키지 : 입력과 출력 관련 클래스가 선언된 패키지

//Stream(스트림) : 값을 전달하기 위한 목적으로 생성된 입력클래스와 출력클래스의 객체
//=> 시냇물이 프르는 모양을 모델링하여 만들어 값이 한쪽 방향으로 전달되며 순차적으로 처리된다.

//원시데이타 기반의 스트림(Byte Stream) : 가공되지 않은 원시데이타를 전달하기 위한 입출력스트림
//=> 값을 1Byte 단위로 입력 또는 출력하기 위한 스트림
//=> InputStream 클래스와 OutputStream 클래스를 최상위 클래스로 관계가 설정된 클래스


//키보드로 원시데이터(1Byte)를 입력받아 모니터에 전달하여 출력하는 프로그램 작성
//=> EOF(End Of File : 입력종료 - Ctrl+Z) 신호를 입력하면 프로그램 종료(MAC 에서는 Ctrl+D), 자바에서는 EOF 값(상수)를 "-1"로 취급.

public class ByteStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[메세지] 키보드를 눌러 값을 입력해 주세요.[프로그램 종료 : Ctrl+Z]");
		
		//키보드 입력값을 저장하기 위한 변수
		int readByte;
		
		while(true) {
			//System.in : Java 프로그램 개발을 위해 기본적으로 제공되는 키보드 입력 스트림이다.
			// => InputStream 클래스를 기반으로 제공되는 입력스트림(객체)
			// => 키보드를 누르면 키보드의 문자값이 입력스트림으로 전달됨.
			//InputStream.read() : 입력스트림에 존재하는 값을 원시데이타(1Btye)로 읽어 정수값(int)으로 반환하는 메소드(실제저장은 int)
			// => 만약 입력스트림에 값이 없는 경우, 스레드는 일시중지상태로 전환된다.
			// => 입력스트림에 엔터(Enter)가 입력될 경우 스레드 다시 실행
			// => 입력스트림 또는 출력스트림 관련 메소드는 IOException이 발생된다.
			// ==> IOException은 일반예외이므로 반드시 예외처리를 해주어야 한다!
			readByte=System.in.read();
			
			//입력종료신호(Ctrl+Z : EOF)가 전달된 경우 반복문 종료
			if(readByte==-1) break;
			
			//System.in : Java 프로그램 개발을 위해 기본적으로 제공되는 모니터 출력 스트림이 저장된 필드//자료형이 printStream
			// => OutputStream 클래스를 기반으로 제공되는 입력스트림(객체) - PrintStream 클래스
			// => 출력스트림에 값을 전달하여 모니터가 출력처리
			//OutputStream.write(int b) : 매개변수로 제공받은 값을 원시데이타(1Byte)로 출력스트림에 전달하는 메소드
			System.out.write(readByte);
			
		}
	
		System.out.println("[메세지] 프로그램을 종료합니다.");
	}
}

//입력과 출력이 글자 하나씩(1Byte씩) 읽고출력읽고출력을 반복하지만 우리 눈에 보이게 나오는건 한번에 나오긴함
