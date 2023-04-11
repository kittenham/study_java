package inheritance;

//정규직 사원정보(사원번호, 사원이름, 연봉)를 저장하기위한 클래스
//=> Employee 클래스를 상속받아 작성
public class EmployeeRegular extends Employee{
	
	private int anuualSalary;
	
	public EmployeeRegular() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeRegular(int empNo, String empName, int anuualSalay) {
		super(empNo, empName);
		this.anuualSalary = anuualSalay;
	}

	public int getAnuualSalay() {
		return anuualSalary;
	}

	public void setAnuualSalay(int anuualSalay) {
		this.anuualSalary = anuualSalay;
	}
	
	
	public int computeSalary() {
		return anuualSalary/12;
	}
	
	@Override
	public int computePay() {
		return anuualSalary/12;
	}

	/*
	//부모클래스의 final 메소드를 오버라이드 선언하여 에러 발생
	@Override
	public int computeIncentive() {
		return 100000000;
	}
	*/
	
}
