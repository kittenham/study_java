package xyz.itwill.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

//키보드로 이름과 태어난 년도를 입력받아 이름과 나이를 계산하여 출력하는 프로그램 작성
public class ConsoleIOApp {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//Java 프로그램 개발을 위해 기본적으로 제공되는 키보드 입력스트림(System.in)을 사용하여
		//InputStreamReader 클래스의 입력스트림으로 확장하고, 확장된 Reader 객체를 전달받아
		//이것을 다시 **대량의 문자데이터를 입력받을 수 있도록** BufferedReader 클래스의 입력스트림으로 다시 확장한 것.
		//=> 입출력클래스는 스트림의 다단계 연결을 사용하여 스트림 확장 가능.
		//=> 키보드로 문자열을 입력받기 위한 입력스트림 생성.
		
		//***스트림은 다단계연결로 확장가능***
		
		
		//Java 프로그램 개발을 위해 기본적으로 제공되는 모니터 출력스트림(System.out)은 
		//PrintStream 클래스로 생성되어 print() 또는 println() 메소드를 호출하여 매개변수로 전달받은 값을
		//문자열로 변환하여 출력스트림에 전달해 출력가능
		System.out.print("이름입력 >> ");
		
		String name = in.readLine();
			//BufferedReader.readLine() : 대량의 문자데이타를 읽어 문자열로 반환하는 메소드
		
		System.out.print("태어난 년도 입력 >> ");
			//키보드로 입력받은 문자열을 정수값으로 변환하여 저장 - NumberFormatException 발생
		
		int birthYear = Integer.parseInt(in.readLine());
		
		int age = Calendar.getInstance().get(Calendar.YEAR)-birthYear+1;
		
		System.out.println("[결과]"+name+"님의 나이는 "+age+"입니다.");
		
		

	}

}
