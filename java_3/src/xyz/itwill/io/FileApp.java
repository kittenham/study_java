package xyz.itwill.io;

import java.io.File;
import java.io.IOException;

//File 클래스 : 파일 관련 정보를 저장하기 위한 클래스 (+디렉토리(폴더)도 저장가능)
public class FileApp {
	public static void main(String[] args) throws IOException {
		File fileOne = new File("c:\\data");
			//File 클래스의 File(String pathname) 생성자를 이용하여 매개변수로 전달받은 시스템(OS;운영체제)의 
			//파일경로를 전달받아 File 객체 생성
			//=> 파일경로 : 시스템에 존재하는 파일 위치를 표현하는 방법 - 절대경로 표현방법, 상대경로 표현방법
			//절대경로 표현방법(권장) : 파일 경로를 최상위 디렉토리(윈도우(C:), 리눅스(/))를 기준으로 파일위치를 표현하는 방법
			//상대경로 표현방법 : 현재 실행 프로그램의 작업 디렉토리를 기준으로 파일위치를 표현하는 방법
			// =>이클립스에서는 프로젝트 폴더를 작업 디렉토리로 처리
			// =>Window OS에서는 폴더(드라이브)와 파일을 구분하기 위한 \ 기호 사용.
			// ==> 하지만 Java에서는 \기호는 회피문자를 표현하는 용도로 사용하기 때문에 \\ 두번 사용해 줘야함.(\를 문자로 사용하기위해)
			// ==>Windows OS 에서는 폴더(드라이브)와 파일을 구분하기 위한 /(슬러시)문자 사용 가능

		if(fileOne.exists()) {
				//File.exists() : File 객체에 저장된 파일경로의 파일(디렉토리)가 시스템에 존재하지 않을 경우 [false] 반환,
				//존재할 경우 [true] 반환하는 메소드
			System.out.println("c:\\data 폴더가 이미 존재합니다.");
		} else {
			fileOne.mkdir();
				//File.mkdir() : File 객체에 저장된 파일경로의 디렉토리(폴더)를 생성하는 메소드
			System.out.println("c:\\data 폴더를 생성하였습니다.");
		}
		System.out.println("================================================================================");
		
//		File fileTwo = new File("c:\\data\\itwill.txt");	
		
		File fileTwo = new File("c:/data/itwill.txt");	//역슬러시(\)가 아닌 슬러시(/)도 가능
			//Windows OS 에서는 폴더(드라이브)와 파일을 구분하기 위한 /(슬러시)문자 사용 가능
		
		
		if(fileTwo.exists()) {
			System.out.println("c:\\data\\itwill.txt 파일이 이미 존재합니다.");
		} else {
			fileTwo.createNewFile();	//IOException 발생했지만 일단 떠넘기기
				//File.createNewFile() : File 객체에 저장된 파일 경로의 파일을 생성하는 메소드
			System.out.println("c:\\data\\itwill.txt 파일을 생성하였습니다.");
		}
		System.out.println("================================================================================");
		
		File fileThree = new File("c:/data", "itwill.xyz");
			//File 클래스의 File(String parents, String child) 생성자를 이용하여 
			//매개변수로 부모(디렉토리)와 자식(파일)을 따로 전달받아 파일경로가 저장된 File 객체 생성됨.
		
		if(fileThree.exists()) {
			fileThree.delete();
				//File.delete() : 파일 객체에 저장된 파일경로의 파일을 삭제하는 메소드
			System.out.println("c:\\data\\itwill.txt 파일을 삭제하였습니다.");
		} else {
			System.out.println("c:\\data\\itwill.txt 파일이 존재하지 않습니다.");
		}
		System.out.println("================================================================================");
		
		//파일경로를 상대경로 표현방식으로 전달하여 File 객체 생성
		// => 현재 프로그램의 작업 디렉토리(프로젝트 폴더)를 기준으로 파일 경로 설정
		// => 상대경로 표현방법은 [..]기호를 사용하여 상위 디렉토리를 표현하며 [파일]형식으로 작업디렉토리에 존재하는 
		//		파일이나 하위 디렉토리를 표현할 수 있다.([./파일] 형식으로 써도됨)
		File fileFour = new File("src");	//정확히 쓰면 ./src (=현재 디렉토리 아래에 있는 src 폴더)
		
		if(fileFour.exists()) {
			System.out.println("파일경로 = "+fileFour.toString());
				//File.toString() : File 객체에 저장된 파일경로를 문자열로 반환하는 메소드
				//=> 참조변수를 출력할 경우 toString() 메소드는 자동호출된다.(참고)
			
			//상대경로가 아닌 절대경로로 표현하고 싶을 때,
			System.out.println("파일경로 = "+fileFour.getAbsolutePath());
				//File.getAbsolutePath() : File 객체에 저장된 파일경로를 절대경로 표현방법읨 문자열로 반환하는 메소드
			
		} else {
			System.out.println("작업디렉토리에 [src]디렉토리가 없습니다.");
		}
		System.out.println("================================================================================");
		
		File fileFive = new File("c:/");
		
		if(fileFive.isDirectory()) {
			//File.isDirectory() : File 객체에 저장된 파일경로의 파일이 디렉토리가 아닌경우 [false]를 반환하고 
			//디렉토리인 경우 [true]를 반환하는 메소드 
			File[] subFiles = fileFive.listFiles();
				//File.listFiles() : File 객체에 저장된 파일경로의 디렉토리의 파일이나 하위디렉토리 목록을 
				//File 객체배열로 반환하는 메소드
			
			System.out.println(fileFive+" 폴더의 자식 목록 >> ");
			for(File file : subFiles) {
				if(file.isFile()) {
					System.out.println("파일 = "+file);
				} else {
					System.out.println("폴더 = "+file);
				}
			}
		}
	}
}
