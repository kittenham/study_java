package inheritance;

//사원급여관리 프로그램
public class EmployeeApp {
	public static void main(String[] args) {
		
		//추상클래스로 객체를 생성할 경우 에러 발생
		//=> 추상클래스로 참조변수 생성 가능
//		Employee employee = new Employee();
		
		//
		/*
		Employee employee1 = new EmployeeRegular();
		Employee employee2 = new EmployeeTime();
		Employee employee3 = new EmployeeContract();
		*/
		
		Employee[] empArray = new Employee[5];
		
		empArray[0] = new EmployeeRegular(1000, "홍길동", 96000000);
		empArray[1] = new EmployeeTime(2000, "임꺽정", 5000, 150);
		empArray[2] = new EmployeeContract(3000, "전우치", 7000000);
		empArray[3] = new EmployeeTime(4000, "일지매", 20000, 100);
		empArray[4] = new EmployeeRegular(5000, "장길산", 60000000);
		
		for(Employee employee : empArray) {
			System.out.println("사원번호 = "+employee.getEmpNo());
			System.out.println("사원이름 = "+employee.getEmpName());
//			System.out.println("급여 = "+(((EmployeeRegular)employee).computeSalary()));	//자식이 여러개일때는 오버라이드가 안되어있으면 묵시적객체형변환 사용X
			//사원번호를 반환받아 출력
			//=> 참조변수는 부모클래스의 객체만 참조가능하므로 자식클래스의 메소드 호출은 불가능하다.
			//=> 명시적 객체 형변환을 이용하여 참조변수로 자식클래스의 객체를 참조하여 메소드 호출이 가능하다.
			//=> instanceof 라는 연산자를 이용해서 자식클래스를 구분하여 객체 형변환 해주어야 한다. -> ClassCastException 방지 가능 할 수 있다.
			if(employee instanceof EmployeeRegular) {
				System.out.println("사원급여 = "+((EmployeeRegular)employee).computeSalary());
			} else if(employee instanceof EmployeeTime) {
				System.out.println("사원급여 = "+((EmployeeTime)employee).computeTimepay());
			} else if(employee instanceof EmployeeContract) {
				System.out.println("사원급여 = "+((EmployeeContract)employee).computeContract());
			}
			
			//자식클래스에서 부모클래스의 메소드를 오버라이드 선언하면 묵시적 객체 형변환에 의해 자동으로 참조변수가 자식클래스로 형변환되어 자식클래스의 메소드를 호출 가능
			//자식클래스에서 오버라이드 하지않으면 부모클래스의 메소드가 호출이 됨 => 강제성이 없다...
			System.out.println("급여 = "+employee.computePay());
			System.out.println("인센티브 = "+employee.computeIncentive());
			
			System.out.println("======================================================================");
			
		}

		
	}

}
