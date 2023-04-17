package xyz.itwill.lang.thread;

//은행계좌정보(잔액)을 저장하기 위한 클래스 - 입금 및 출력 관련 메소드 작성
public class Account {
	private int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	//=> 여기까지하면 VO 클래스
	//=> 밑에 추가로 입금 및 출력 관련 메소드가 들어가면 VO 클래스 아님.
	
	
	//입금 처리 메소드 - 매개변수로 입금자와 입금액수를 전달받아 처리
	public synchronized void deposit(int amount, String name)	{	//입금액은 매번 다를테니까 amount, 입금자명 name 설정
		balance+=amount; //입금액을 balance 만큼 증가시킴
		System.out.println("[입금알림]"+name+"님이 "+amount+"원 입금하여 잔액은 "+balance+"원 입니다.");
	}
	
	
	//출금 처리 메소드 - 매개변수로 출금자와 출금액수를 전달받아 처리
	public void withDraw(int amount, String name) {
		if(balance<amount) {	//출금액이 잔액보다 크면 안된다는 조건 있어야 함.
			System.out.println("[에러] "+name+"님, 잔액이"+balance+"원 남아 "+amount+"원을 출금할 수 없습니다.");
			return;	//해야 출금처리가 안됨.!! 꼭 해야함.
		}
		balance-=amount;
		System.out.println("[출금알림]"+name+"님에게 "+amount+"원 출금되어 잔액은 "+balance+"원 입니다.");
	}
	
}
