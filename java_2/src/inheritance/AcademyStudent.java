package inheritance;

//학생정보(학생번호, 학생이름, 수강과목)을 저장하기 위한 클래스
//=> 학생번호와 학생이름 관련 속성과 행위는 AcademyPerson 클래스를 상속받아 작성
public class AcademyStudent extends AcademyPerson {
	private String course;
	
	public AcademyStudent() {
	}

	public AcademyStudent(int num, String name, String course) {
		super(num, name);		//부모객체의 생성자도 초기화시켜줘야함.
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public void display() {
		System.out.println("학생번호 = "+getNum());		//num, name 은 private이라 접근불가. getter사용해서 불러오기
		System.out.println("학생이름 = "+getName());
		System.out.println("수강과목 = "+course);
	}
	

}
