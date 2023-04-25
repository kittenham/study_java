package xyz.itwill.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//키보드로 입력된 값을 원시데이터로 제공받아 모니터에 전달하여 출력하는 프로그램 작성해보기

public class FileInputStreamApp {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null; 
			//FileInputStreamApp 클래스 : 파일에 저장된 값을 원시데이타로 제공받기 위한 입력스트림을 생성하기 위한 클래스
		
		try {
			in = new FileInputStream("c:/data/byte.txt");
				//FileInputStream 클래스의 FileInputStream(String name) 생성자를 이용하여 매개변수로 파일경로를 
				//제공받아 파일 입력스트림을 생성
				//=> 매개변수로 전달받은 파일경로의 파일이 없는 경우, FileNotFoundException 발생
				//=> 파일이 없으면 파일 입력스트립을 생성할 수 없으므로 반드시 예외처리 해줘야 한다. 
				//(변수는 try 바깥에 사용해야 try가 끝나고도 사용가능)
		} catch (FileNotFoundException e) {
			System.out.println("[에러] 대상파일을 찾을 수 없습니다.");
		}
		
		System.out.println("[메세지] c:/data/byte.txt 파일에 저장된 내용입니다.");
		
		int readByte;
		
		while(true) {
			//파일 입력스트림을 이용하여 파일에 저장된 값을 원시데이타로 반환받아 저장 - Load
			readByte=in.read();
			
			//파일 입력스트림로 제공받을 파일 내용이 없는 경우 반복문 종료
			if(readByte==-1) break;
			
			//원시데이타를 모니터 출력스트림으로 전달하여 출력
			System.out.write(readByte);
		}
		
		//FileInputStream.close() : 파일 입력스트림을 제거하는 메소드
		in.close();
	}
}