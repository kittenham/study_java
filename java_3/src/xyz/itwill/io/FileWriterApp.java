package xyz.itwill.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


//키보드로 입력된 값을 문자데이타로 제공받아 파일로 전달하여 저장하는 프로그램 작성
//=> 
public class FileWriterApp {
	public static void main(String[] args) throws IOException {
		//키보드 입력스트림을 InputStreamReader 클래스의 입력스트림으로 확장
		//=> 원시데이터가 아닌 문자데이터를 입력받기 위한 입력스트림
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter out = new FileWriter("c;/data/char.txt");
		//FileWriter 클래스 : 파일에 문자데이타(2Byte)를 전달하기 위한 출력스트림을 생성하기 위한 클래스
		//=> FileWriter 클래스의 FileWriter(String name) 생성자로 이용하여 매개변수로 파일경로를 전달받아
		//	파일 출력스트림을 생성한다.
		//=>> 매개변수로 전달받은 파일경로의 파일이 없는경우, FileNotFoundException 발생 할 수 있음. => 예외처리 필요함.
		//=> 예외처리하지않고 예외를 전달할 경우 매개변수로 전달받은 파일경로의 파일을 생성하여 자동으로 출력스트림을 
		//	제공한다.
		//=>> 매개변수로 전달받은 파일경로의 파일이 있는경우, 기존 파일의 내용 대신 새로운 내용이 파일에 저장된다.(덮어씌우기(OverWrite))
		
		int readByte;
		
		while(true) {
			readByte=in.read(); //키보드 입력값을 문자데이터로 읽어서 변수에 저장.
			
			if(readByte==-1) break;
			
			out.write(readByte);
		}
		
		out.close();
		
		System.out.println("c;/data/char.txt 파일을 확인해 보세요.");
		
	}

}
