package xyz.itwill.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//원본파일에 저장된 값을 원시데이터로 읽어 타겟파일에 전달하여 저장하는 프로그램 작성
//=> 파일 복사 프로그램 (반디집으로 해보자~!)
//=> 모든형식의 원본파일을 복사하여 타겟파일로 전달하여 저장할 수 있다.
public class FileCopyByteApp {
	public static void main(String[] args) throws IOException{
		BufferedInputStream in = null;
			//BufferedInputStream 클래스 : InputStream 객체를 전달받아 대량의 원시데이타를 읽기위한 입력스트림을 생성하기 위한 클래스
			// (= 보조 스트림 클래스) : 기존 스트림을 전달받아 기능을 확장하기 위한 스트림 클래스 
			//=> BufferedInputStream, BufferedOutputStream, DataInputStream, DataOutputStream 등이 존재
		BufferedOutputStream out = null;
			//
			//BufferedOutputStream 클래스 : OutputStream 객체를 전달받아 대량의 원시데이타를 읽기위한 출력스트림을 생성하기 위한 클래스
		try {
			in = new BufferedInputStream(new FileInputStream("c:/data/BANDIZIP.EXE"));
				//원본파일을 읽기 위한 입력스트림을 생성하여 저장함.
			out = new BufferedOutputStream(new FileOutputStream("c:/data/BANDIZIP.EXE"));
				//타겟파일에 원시데이타를 전달하여 저장하기 위한 출력스트림을 생성하여 저장함.
			
			int readByte;
			
			//
			while(true) {
				readByte=in.read();
				if(readByte==-1) break;
				out.write(readByte);
			}	
			System.out.println("[메세지] 파일을 성공적으로 복사 하였습니다.");
			
		} catch(FileNotFoundException e) {
			System.out.println("[에러] 원본 파일을 찾을 수 없습니다.");
		} finally {
			in.close();
			out.close();
		}
		
	}

}
