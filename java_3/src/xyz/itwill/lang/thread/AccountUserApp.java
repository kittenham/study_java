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
		one.getAccount().deposit(5000, one.getUserName());	//one이라는 사람이 Account로 deposit(입금)할 것이다.=> 잔액은 15000원이됨.
		two.getAccount().deposit(5000, two.getUserName()); //two이라는 사람이 Account로 deposit(입금)할 것이다.=> 잔액은 20000원이됨.
		three.getAccount().deposit(5000, three.getUserName()); //three이라는 사람이 Account로 deposit(입금)할 것이다.=> 잔액은 25000원이됨.
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
		
		//스레드 동기화(Thread Synchronize) : 
		
	}
}
