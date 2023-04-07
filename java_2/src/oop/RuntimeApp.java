package oop;

import java.io.IOException;

//Runtime 클래스 : Java 프로그램과 운영체제(Operation System) 간의 필요한 기능을 제공하는 메소드가 선언된 클래스 
public class RuntimeApp {
	public static void main(String[] args) throws IOException {
//		Runtime runtime = new Runtime();
		//에러 뜨는 이유 => 생성자가 은닉화되어있어 new 연산자로 객체 생성 불가능
		//Runtime 클래스는 프로그램에 객체를 하나만 제공하기 위한 클래스 = 싱글톤(singleton) 클래스
		
		Runtime runtime1 = Runtime.getRuntime();	
		//Runtime.getRuntime() : Runtime 객체를 반환하는 메소드 (oracle 홈페이지에 설명 자세히 나와있음)
		//=> 정적 메소드이므로 클래스를 이용하여 호출 가능
		Runtime runtime2 = Runtime.getRuntime();	
		
		System.out.println("runtime1 = "+runtime1);
		System.out.println("runtime2 = "+runtime2);
		//=> getRuntime() 메소드를 여러번 호출해도 같은 객체를 반환 하는 것을 알 수 있다.
		
		System.out.println("============================================================");
		
		System.out.print("메모리 정리 전 JVM 사용 메모리의 크기 >> ");
		//Runtime.totalMemory() : JVM이 사용가능한 전체 메모리의 크기를 반환하는 메소드
		//Runtime.freeMemory() : JVM이 사용가능한 여유 메모리의 크기를 반환하는 메소드
		System.out.println(runtime1.totalMemory()-runtime1.freeMemory()+"Byte");
		
		//Runtime.gc() : 메모리를 정리하는 프로그램(Garbage Collector) 가비지 컬렉터를 실행하는 메소드
		runtime1.gc();	//System.gc();
		
		System.out.print("메모리 정리 후 JVM 사용 메모리의 크기 >> ");
		System.out.println(runtime1.totalMemory()-runtime1.freeMemory()+"Byte");

		//Runtime.exec(String command) : 운영체제에 명령을 전달하여 실행하는 메소드
		runtime2.exec("calc.exe");	//계산기
		
	}
}
