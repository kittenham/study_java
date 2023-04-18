package xyz.itwill.lang.thread;


//다중 스레드 프로그램
//=>프로그램 개발자가 직접 스레드를 생성하여 다수의 명령을 동시에 실행되도록 만든 프로그램
//=> 프로그램의 모든 스레드가 소멸되야만 프로그램이 종료된다.(메인메소드만 종료되어도 프로그램 종료X)
//=> GUI 프로그램, Web 프로그램 등은 다중 스레드 프로그램으로 작성한다.


//프로그램 개발자가 스레드를 생성하여 명령을 실행하는 방법 ① - Thread 클래스 이용하는 방법
//1. Thread Class를 상속받은 자식클래스 작성 (=>MultiThreadOne Class)
//=> 자식을 이용해서 객체를 만들면 부모가 먼저 만들어지기 때문에 자식클래스를 이용한다.
//2. Thread Class를 상속받은 자식클래스에서 run() 메소드 오버라이드 선언 
//=> run() 메소드에는 프로그램 개발자에 의해 생성된 스레드가 실행하기 위한 명령을 작성 
//?프로그램 개발자가 run() 메소드를 오버라이드 선언해서 새롭게 자식클래스에 작성한 스레드를 실행
//3. Thread 클래스를 상속받은 자식클래스로 객체를 생성한다. => 스레드(부모클래스) 객체가 생성된다.
//자식클래스의 객체가 만들어지면 부모클래스도 객체가 생성된다.
//4. Thread 객체로 start() 메소드 호출 - Thread 객체를 이용하여 새로운 스레드 생성
//=> 생성된 스레드는 자동으로 Thread 객체의 run() 메소드를 호출하여(run()메소드는 오버라이드 되어있음. 따라서 자식클래스의 명령들이 호출됨.) run() 메소드의 명령 실행

//프로그램 개발자가 스레드를 생성하여 명령을 실행하는 방법 ② - Runnable 인터페이스 이용
//클래스가 이미 다른 클래스를 상속받아 Thread 클래스를 상속받지 못하는 경우, Runnable 인터페이스를 상속받아 새로운 스레드를 생성하기 위한 방법
//1. Runnable 인터페이스를 상속받은 자식클래스 작성
//2. Runnable 인터페이스를 상속받은 자식클래스에서 run() 메소드 오버라이드 선언
//⇒ run() 메소드에는 프로그램 개발자에 의해 생성된 스레드가 실행하기 위한 명령을 작성
//3. Thread 클래스로 객체를 생성하는데, 이때 Thread 클래스의 생성자 중 매개변수에 
//Runnable 인터페이스를 상속받은 자식클래스의 객체를 전달하여 Thread 객체를 생성하는 생성자를 호출한다.

public class MultiThreadApp {
	
	//JVM에 의해 main 스레드가 생성되어 main() 메소드를 호출하여 main() 메소드에 작성된 명령 실행
	//=> main() 메소드에 의해 전달된 예외는 JVM에 의해 자동으로 예외 처리한다.
	public static void main(String[] args) throws InterruptedException {
		
		//Thread 클래스로 직접 객체를 생성하여 start() 메소드 호출
		//=> 새롭게 생성된 메소드는 Thread 객체의 명령이 없는 run() 메소드 호출 - 무의미
//		Thread thread = new Thread();
//		Thread.start();
/*		
		MultiThreadOne one = new MultiThreadOne();
		//Thread.start() : Thread 객체로 새로운 스레드를 생성하기 위한 메소드
		//=> 생성된 스레드는 자동으로 Thread 객체의 run() 메소드를 호출하여(run()메소드는 오버라이드 되어있음.
		//=> 따라서, 자식클래스의 오버라이드 선언된 run() 메소드가 호출되어 명령실행
		one.start();	//얘는 실행되고,
		one.start();	//얘는 실행이 안됨. 예외가 발생되어서 얘의 main 스레드는 소멸되어 종료.
		//one.start();를 두번 작성하면 예외 발생. 이유) 하나의 Thread 객체는 하나의 스레드 생성만 가능하기 때문.
		//따라서, Thread 메소드를 사용하여 start()메소드를 여러번 호출할 경우 IllegalThreadStateException 발생함.
		//=> 다중 스레드 프로그램에서 예외가 발생된 경우, 예외가 발생된 스레드만 종료됨.
*/		
		//스레드 객체를 사용하여 start()메소드외에 다른 메소드를 호출하지 않을 경우 참조변수에 객체를 저장하지 않고 객체를 생성하여 직접 메소드 호출
		new MultiThreadOne().start();	//객체를 만들어서 start()메소드 한번만 만들어서 실행가능. 위 보다 더 효율적.
		new MultiThreadOne().start();
		
		
		
//		MultiThreadTwo two = new MultiThreadTwo();
//		Thread thread = new Thread(two);
		
		new Thread(new MultiThreadTwo()).start();	//위의 두 문장을 한문장으로 줄인 것.
		
		//=> 여기까지 총 스레드 3개. => [new MultiThreadOne().start(); 2개] + [new Thread(new MultiThreadTwo()).start(); 1개]
		
		
		
		for(char i='A';i<='Z';i++);{
			System.out.print(i);
			//Thread.sleep(long ms) : 매개변수로 전달된 시간(ms)동안 스레드가 일시중지된다.
			//=> 메소드에서 InterruptedException 발생(일반예외) -> 예외처리를 하지않으면 에러가 발생한다.-> 컴파일이 안되어서 실행이 안됨.
			Thread.sleep(500);	
			//일반예외(InterruptedException)가 나타날 수 있기 때문에 예외처리를 꼭 해줘야 한다.(throws 또는 try-catch 둘 중 하나 사용하면됨)
			//여기서는 main() 메소드에 throws 처리를 해서 예외처리했음.
			//=> 잠깐 멈췄다 나타나기 때문에 대문자와 소문자가 같이 나타나는 것처럼 보임.
		}
		
		//=> 실행시 대문자와 소문자가 뒤죽박죽으로 나타남. 실행 할 때마다 결과가 바뀜.
	}
	

}
