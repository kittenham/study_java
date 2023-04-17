package xyz.itwill.lang.thread;

public class SingleThread {
	public void display() {
		
/*		
		System.out.println("SingleThread 클래스의 display() 메소드 시작");
		
		System.out.println("["+Thread.currentThread().getName()+"] 스레드에 의해 main() 메소드의 명령 실행");
		
		System.out.println("SingleThread 클래스의 display() 메소드 종료");
*/
		
		for(char i='a';i<='z';i++) {
			System.out.print(i);
		}
		//=> SingleThreadApp의 명령을 먼저 수행한 후에 얘가 실행됨. 하나의 스레드이기 때문에 동시 실행X
	
	
	}

}
