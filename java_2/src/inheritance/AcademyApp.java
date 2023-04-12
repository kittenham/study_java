package inheritance;

import oop.MainArgsApp;

//학원인적자원(학생, 강사, 직원) 관리 프로그램
public class AcademyApp {
	public static void main(String[] args) {
		
/*
		//학생정보(AcademyStudent 객체)를 저장하기 위한 요소들이 존재하는 배열을 선언
		AcademyStudent[] students = new AcademyStudent[300];	//학생 300명 만든게 아니라 학생정보를 300개 저장할 수 있는 참조요소를 가진 배열을 만든것.
		
		//강사정보(AcademyInstructor 객체)를 저장하기 위한 요소들이 존재하는 배열을 선언
		AcademyInstructor[] Instructors = new AcademyInstructor[50];	

		//직원정보(AcademyStaff 객체)를 저장하기 위한 요소들이 존재하는 배열을 선언
		AcademyStaff[] Staffs = new AcademyStaff[100];
		
		//=> 학생, 강사, 직원 정보를 따로따로 나누어서 관리하고자 한다면 효율성↓ (특정개체만 저장할 수 있기 때문에)
		//=> 따라서 아래와 같이 다시 만들어보자
*/
		
		//사람정보(AcademyPerson 객체)를 저장하기 위한 요소들이 존재하는 배열 생성
		AcademyPerson[] persons = new AcademyPerson[5];	
		//AcademyPerson은 학생, 강사, 직원정보 클래스 모두의 부모클래스임.
		//따라서, 배열요소(persons)에 학생정보(AcademyStudent 객체), 강사정보(AcademyInstructor 객체), 직원정보(AcademyStaff 객체) 모두 저장이 가능하다.
		//==> 부모 클래스는 모든 자식 클래스의 정보를 저장할 수 있다.
		//==> 부모클래스의 참조변수에는 자식클래스의 생성자로 부모클래스의 객체를 생성하여 저장 가능.
	
		
		//자식클래스의 생성자로 객체를 생성하면 부모클래스의 객체를 먼저 생성한 후 자식클래스의 객체를 생성
		//=> 배열요소에는 부모클래스의 객체가 저장되어 부모클래스의 메소드 호출
		//=> 객체 형변환을 이용하면 배열 요소에 자식클래스의 객체를 일시적으로 사용하여 다시 클래스에 메소드 호출이 가능
		persons[0] = new AcademyStudent(1000, "홍길동", "웹 개발자 과정");
		persons[1] = new AcademyInstructor(2000, "임꺽정", "Java 과목");
		persons[2] = new AcademyStaff(3000, "전우치", "운영관리팀");
		persons[3] = new AcademyStudent(4000, "일지매", "웹 디자인 과정");
		persons[4] = new AcademyStaff(5000, "장길산", "경영회계팀");
				

		//배열요소에 저장된 객체를 하나씩 제공받아 참조변수에 저장하여 일괄처리
		for(AcademyPerson person : persons) {	//일괄처리
			//오버라이드 선언된 메소드는 묵시적 객체 형변환에 의해 부모클래스의 메소드를 호출하지 않고 자식클래스의 메소드를 호출한다.
			//참조변수에 저장된 자식클래스의 객체에 의해 자식클래스의 메소드가 선택호출된다. [= 오버라이드에 의한 다형성]
//			person.display();	//person이라는 참조변수에는 AcademyStudent, AcademyInstructor, AcademyStaff 셋다 될 수 있다.
//			System.out.println("===============================================================");

		

		
		//오버라이드 선언되지 않은 자식클래스의 메소드를 호출하기 위해 명시적 객체 형변환을 이용하면, 참조변수의 자식클래스의 객체를 일시적으로 저장하여 자식클래스의 메소드를 호출할 수 있음.
		
			
//		for(AcademyPerson person : persons) {
//			System.out.println(((AcademyStudent)person).getCourse()+"의 학생정보 >> ");		
//		}
		//=> ClassCastException(객체 형변환 예외) 발생 : 상속관계가 아닌 클래스로 명시적 객체 형변환을 할 경우에 발생한다.
		//person 안의 AcademyInstructor와 AcademyStaff의 정보가 AcademyStrudent와는 연결되어 있지 않기 때문에.
		
		//해결법) 참조변수로 객체 형변한 가능한 클래스를 확인한 후 명시적 객체 형변환 이용
		//=> instance of 연산자를 사용하여 참조변수의 객체 형변환 가능 클래스 검사 가능
		//형식) 참조변수 instance of 클래스
		//참조 가능한 클래스인 경우 true를 제공하는 연산자
		
		if(person instanceof AcademyStudent) {
			System.out.println(((AcademyStudent)person).getCourse()+"의 학생정보 >> ");
		} else if(person instanceof AcademyInstructor) {
			System.out.println(((AcademyInstructor)person).getSubject()+"의 강사정보 >> ");
		} else if(person instanceof AcademyStaff) {
			System.out.println(((AcademyStaff)person).getDepart()+"의 직원정보 >> ");
		}
		person.display();
		System.out.println("====================================================================");
		}
	}
}
