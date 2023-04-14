package inheritance;

//시간제 사원정보(사원번호, 사원이름, 시급, 근무시간)를 저장하기 위한 클래스
public class EmployeeTime extends Employee{
	
	private int moneyPerhour;
	private int workedhour;
	
	public EmployeeTime() {
	}

	public EmployeeTime(int empNo, String empName, int moneyPerhour, int workedhour) {
		super(empNo, empName);
		this.moneyPerhour = moneyPerhour;
		this.workedhour = workedhour;
	}

	public int getMoneyPerhour() {
		return moneyPerhour;
	}

	public void setMoneyPerhour(int moneyPerhour) {
		this.moneyPerhour = moneyPerhour;
	}

	public int getWorkedhour() {
		return workedhour;
	}

	public void setWorkedhour(int workedhour) {
		this.workedhour = workedhour;
	}
	
	//급여를 반환하는 메소드
	public int computeTimepay() {
		return moneyPerhour*workedhour;
	}

	@Override
	public int computePay() {
		return moneyPerhour*workedhour;
	}
}
