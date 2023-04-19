package xyz.itwill.lang.thread;


public class AccountUserApp {
	public static void main(String[] args) {
		//Account 클래스로 객체를 생성하여 저장 - 은행계좌 생성
		Account account = new Account(10000);	//잔액=10000원 지정.
		
		/*
		//단일 스레드(main)를 이용하여 AccountUser 클래스로 객체 생성해 저장
		//=> 은행계좌를 사용하는 사용자를 여러개 생성하여 같은 은행계좌를 사용하도록 설정
		AccountUser one = new AccountUser(account, "홍길동");
		AccountUser two = new AccountUser(account, "임꺽정");
		AccountUser three = new AccountUser(account, "전우치");
		//=> 이 세사람이 같은 은행계좌로 입금처리를 한다면,
		//▼
		//단일 스레드(main)를 이용하여 은행계좌 사용자를 이용한 은행계좌의 입금 처리
		one.getAccount().deposit(5000, one.getUserName());	//one이라는 사람이 Account에서 반환받아 deposit(입금)할 것이다.=> 잔액은 15000원이됨.
		two.getAccount().deposit(5000, two.getUserName()); //two이라는 사람이 Account에서 반환받아 deposit(입금)할 것이다.=> 잔액은 20000원이됨.
		three.getAccount().deposit(5000, three.getUserName()); //three이라는 사람이 Account에서 반환받아 deposit(입금)할 것이다.=> 잔액은 25000원이됨.
		//==> 이 스레드는 단일 스레드이기 때문에 홍길동이 입금할때 입꺽정이나 전우치가 동시에 입금할 수 없음.
		*/
		
		//▼
		//스레드를 여러개 생성하여 동시에 입금(출금) 처리
		//새로운 스레드를 생성하여 run() 메소드의 명령 실행 - 입금관리
		new AccountUser(account, "홍길동").start();
		new AccountUser(account, "임꺽정").start();
		new AccountUser(account, "전우치").start();
		//차례대로 입금이 안될 수 있음. =>각각 새로운 스레드가 만들어져서 처리가 되기 때문에. 순서가 없음.
		//중요한건 잔액이 정확히 15000, 20000, 25000 이 나와야함. => 결과가 잘나올때도 있고 아닐때도 있음... 일관성X(잘못된 프로그램)
		
		//※ 다중스레드의 문제점 : 다수의 스레드가 run() 스레드의 명령을 실행할 경우 같은 객체의 메소드를 호출하여 필드값(공유값 ex.Setter (Getter는아님))을 변경할 경우 잘못된 처리결과 발생 가능
		//=> 해결법 : 스레드 동기화를 이용하여 스레드에 대한 메소드 호출을 제어해 주면 됨.
		
		//스레드 동기화(Thread Synchronize) : 스레드에 의해 메소드 호출시 메소드의 모든 명령을 실행 하기 전까지 다른 스레드로 메소드를 호출하지 못하도록 방지하는 기능
		//⇒ 다른 스레드가 이미 메소드를 호출하여 실행중인 경우, 스레드를 일시중지하여 기존 스레드의 메소드 처리가 끝난 후 일시 중지된 스레드가 실행되도록 락(Lock) 기능 제공
		
//		<스레드 동기화 처리방법>
//		1. 메소드를 수정할 수 있을 때 사용하는 방법 (= 동기화 메소드(Synchronized Method)만드는 방법) 
//		⇒ synchronized 키워드 사용하여 메소드를 선언해 준다. 
//		- 형식)  접근제한자 synchronized 반환형 메소드명(자료형 매개변수, …){ 명령; ///}
//		2. 메소드를 수정할 수 없을 때 사용하는 방법
//		⇒ synchronized 키워드로 블럭을 설정하여 메소드 호출
//		- 형식)  synchronized(객체) { 객체, 메소드명(값, …)}
//		- synchronized 영역의 객체로 호출되는 모든 메소드는 동기화 처리되어 실행
		
	}
}
