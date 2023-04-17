package xyz.itwill.lang.thread;

public class MultiThreadOne extends Thread{	//Thread 클래스 상속받기
	@Override
	public void run() {
		for(char i='a';i<='z';i++) {
			System.out.print(i);
		}
		super.run();
	}

}
