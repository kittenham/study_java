package xyz.itwill.util;

import java.util.List;

public class StudentManagerApp {

	public static void main(String[] args) {
		
		StudentManager manager = new StudentManager();
		
		//저장매체에 학생정보를 삽입하는 메소드를 호출
		manager.insertStudent(new Student(1000, "홍길동"));	//학생정보를 저장한 student 객체를 호출.전달
		manager.insertStudent(new Student(2000, "임꺽정"));
		manager.insertStudent(new Student(3000, "전우치"));
		manager.insertStudent(new Student(4000, "일지매"));
		
		if(manager.insertStudent(new Student(5000, "장길산"))) {	//만약 장길산의 학번이 1000이라면 삽입이 안됨.(확인해보기)
			System.out.println("[메세지] 학생정보를 성공적으로 삽입하였습니다.");
		} else {
			System.out.println("[메세지] 이미 저장된 학번의 학생정보이므로 삽입되지 않았습니다.");
		}
		
		System.out.println("============================================================================");
		
		//삽입이 잘 됐는지 출력을 통해 확인해보자
		List<Student> studentList = manager.selectStudentsList();	//전체학생을 반환받아 일괄처리해서 메소드 호출해 출력한 것.
		
		for(Student student : studentList) {
			System.out.println(student); 	//toString() 메소드 자동호출됨.
		}
		
		System.out.println("============================================================================");
		
		//저장매체에 저장된 학생정보 중 한명의 학생을 검색하기 위해 학번을 사용하는 방법
		//=>저장매체에 저장된 학생정보 중 학번이 2000인 학생정보를 검색하여 반환하는 메소드 호출
		Student searchStudent = manager.selecStudent(2000);
		if(searchStudent!=null) {
			System.out.println(searchStudent);
		} else {
			System.out.println("[메세지] 해당 학번의 학생정보를 찾을 수 없습니다.");
		}
		
		System.out.println("============================================================================");
		
		//저장매체에 저장된 학생정보 중 학번이 2000인 학생의 이름을 임걱정으로 변경하는 메소드 호출해보기
		searchStudent.setName("임걱정");
		if(manager.updateStudent(searchStudent)) {
			System.out.println("[메세지] 학생정보를 성공적으로 변경하였습니다.");
		}else {
			System.out.println("[메세지] 해당 학번의 학생정보를 찾을 수 없습니다.");
		}
		
		System.out.println("============================================================================");
		
		//저장매체에 저장된 학생정보 중 학번이 4000인 학생정보를 삭제하는 메소드 호출해보기
		if(manager.deleteStudent(4000)) {
			System.out.println("[메세지]학생정보를 성공적으로 삭제 하였습니다.");
		} else {
			System.out.println("[메세지]해당 학번의 학생정보를 찾을 수 없습니다.");
		}
		
		
	}
}
