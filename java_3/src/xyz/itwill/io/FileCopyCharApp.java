package xyz.itwill.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//원본파일에 저장된 값을 원시데이터로 읽어 타겟파일에 전달하여 저장하는 프로그램 작성
//=> 파일 복사 프로그램 (반디집으로 해보자~!)
//=> 텍스트 형식의 원본파일(문서파일)을 복사하여 타겟파일로 전달하여 저장 가능
//=> 텍스트 형식의 파일을 제외한 원본파일(이진파일 BinaryFile)은 값에 대한 인코딩 처리에 의해 타겟파일에 변형된 값이 전달되어 저장된다.
public class FileCopyCharApp {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = null;
			//BufferedReader 클래스 : Reader 객체를 전달받아 *대량의 문자데이터를 읽기 위한 입력스트림을 생성하기 위한 클래스
			//=> 대량의 문자데이터를 처리할때는 FileReader/Writer쓰는 것보다 BufferedReader/Writer를 쓰는게 속도가 훨씬 빠르다.
		BufferedWriter out = null;
			//BufferedWriter 클래스 : Reader 객체를 전달받아 *대량의 문자데이터를 전달하기 위한 출력스트림을 생성하기 위한 클래스
				
		try {
			in = new BufferedReader(new FileReader("c:/data/BANDIZIP.EXE"));
			
			out = new BufferedWriter(new FileWriter("c:/data/BANDIZIP_char.EXE"));
		
			int readByte;
			while(true) {
				readByte=in.read();
				if(readByte==-1) break;
				out.write(readByte);
			}
			System.out.println("[메세지] 파일을 성공적으로 복사 하였습니다.");
			
		}catch(FileNotFoundException e) {
			
		}
	}

}
