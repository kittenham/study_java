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
		
		synchronized (account) {
			
		}
		
		
	}
	
	
	

}
