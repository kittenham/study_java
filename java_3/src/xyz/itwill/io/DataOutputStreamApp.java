package xyz.itwill.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamApp {
	public static void main(String[] args) throws IOException {
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("c:/data/data.txt"));
		//DataOutputStream 클래스 : OutputStream 객체를 전달받아 원하는 자료형의 값을 원시데이타로 전달하기위한 기능의
			//출력스트림을 생성하기 위한 클래스
		
		out.writeInt(100);	//현재 2진수로 저장되어있어서 메모장에는 출력이 제대로 되지않음.(문자를 읽어들이는 방법이달라서)
			//DataOutputStream.writeInt(int v) : 매개변수로 정수값을 전달받아 원시데이타로 변환하여 출력스트림으로 전달하는 메소드
		
		out.writeBoolean(true);
			//DataOutputStream.writeBoolean(boolean v) : 매개변수로 논리값을 전달받아 원시데이타로 변환하여 
			//출력스트림으로 전달하는 메소드
		
		out.writeUTF("홍길동");
			//DataOutputStream.writeUTF(String v) : 매개변수로 문자열을 전달받아 원시데이타로 변환하여 출력스트림으로 전달하는 메소드
		
		out.close();
	
		System.out.println("[메세지] ");
	}
	

}
