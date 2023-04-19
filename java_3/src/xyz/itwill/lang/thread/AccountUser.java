package xyz.itwill.lang.thread;

//은행계좌 사용자정보(은행계좌, 사용자면)를 저장하기 위한 클래스
public class AccountUser extends Thread{
	private Account account;	//이 필드에는 은행계좌 정보(account 객체)를 저장할 것임. - 포함관계
	private String userName;
	
	public AccountUser() {
		// TODO Auto-generated constructor stub
	}

	public AccountUser(Account account, String userName) {
		super();
		this.account = account;
		this.userName = userName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	@Override
	public void run() {
//		account.deposit(5000, getUserName()); //입금
//		account.withDraw(5000, getUserName()); //출금 => 이렇게 하면 엉망진창
		//프로그램 개발자에 의해 생성된 스레드로 run() 메소드를 호출하여 명령 실행
		// => 은행계좌 사용자가 사용하는 은행계좌에 입금 처리하는 메소드 호출
		//account.deposit(userName, 5000);
		
		synchronized (account) {
			account.withDraw(5000, userName);
		}
		//이 메소드가 실행될때 다른 메소드가 실행될 수 없도록 rock 걸어줌.
		
	}
	
	
	

}
