package oop;

//

public class StudentApp {
	public static void main(String[] args) {
/*		
		Student student1 = new Student(1000, "홍길동", 90, 90);
		Student student2 = new Student(1000, "임꺽정", 94, 98);
		Student student3 = new Student(1000, "전우치", 91, 80);
		Student student4 = new Student(1000, "일지매", 76, 82);
		Student student5 = new Student(1000, "장길산", 84, 86);
	
		
//		student1.calcTot();
//		student2.calcTot();
//		student3.calcTot();
//		student4.calcTot();
//		student5.calcTot();
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
		
		System.out.println("===================================================================================");
		
		student1.setKor(100);	//첫번째 학생의 국어점수가 100점이었으므로 점수 바꿔주기!
		student1.calcTot();
		student1.display();
		
		System.out.println("===================================================================================");
		//kor점수 바뀌었을때 아예 가져오는 메소드 자체를 수정하여 호출했을때 바로바로 바꿔줄 수 있도록 하는 것이 유지보수가 쉬움~
*/	
		
		
/*		
		Student[] students = new Student[5];		//얘는 객체 아님. 참조변수 대신 객체 메모리주소 저장할 수 있는 요소를 여러개 가진 배열을 만들어 준것.
		//학생정보를 저장할 수 있는 참조변수가 5개 만든 배열을 만든 것 (!=학생 5명을 만든 것이 아님)
		//배열의 참조변수에는 기본적으로 [Null]이 초기값으로 저장된다.
		
		//객체를 생성하여 배열의 참조요소에 객체의 메모리 주소 저장 : 객체배열
		students[0] = new Student(1000, "홍길동", 90, 90);		//객체는 여기서 만들어짐.
//		students[1] = new Student(1000, "임꺽정", 94, 98);
		students[2] = new Student(1000, "전우치", 91, 80);
		students[3] = new Student(1000, "일지매", 76, 82);
		students[4] = new Student(1000, "장길산", 84, 86);
		
		//반복문을 사용하여 배열의 참조요소에 저장된 객체의 메소드를 "일괄적으로 호출하여 처리"한다.
		//참조변수에 null이 저장된 상태에서 객체의 메소드를 호출할 경우, NullPointExcetption 발생.  (따라서 배열을 쓸때 모든 객체를 다 저장해야함)
		//-> 첫번째 학생만 호출되고 두번째부터는 error => 예외가 발생된 지점에서 프로그램 강제종료 됨.
		for(int i=0;i<students.length;i++) {
			if(students[i]!=null) {		//참조변수에 null이 저장되어 있지 않은 경우 메소드를 호출=> NullPointException을 방지할 수 있음.
			students[i].display();		
			}
		}
*/
		
		
//		Student[] student = new Student[] {		//new Student[] 생략가능
//				
//		}
		
		Student[] students = {new Student(1000, "홍길동", 90, 90), new Student(1000, "임꺽정", 94, 98), new Student(1000, "전우치", 91, 80), new Student(1000, "일지매", 76, 82), new Student(1000, "장길산", 84, 86)};
		
		
		
		//배열의 참조요소에 저장된 객체의 메모리 주소를 차례대로 제공받아 변수에 저장하여 처리하는 향상된 for 구문을 사용하여 일괄처리 할 수 있다.
		//가장 짧고 효율적. (null이 아닐경우 메소드 호출한다는 조건식이 필요할수도있음)
//		int total=0;	//모든 학생들의 점수합계 => 이렇게 만드는 것보다 Tot이라는 메소드 안에 넣어서 계산하는 것이 더 객체지향스러움
		for(Student student : students) {
			student.display();
			
			//정적 필드는 클래스를 이용하여 접근해 사용 가능(=>public일때 사용가능)
			//객체로 접근 가능하지만 경고 발생
//			Student.total+=student.getTot();	//학생 합계를 반환받아 총 합계 변수에 누적하여 저장
			//정적 필드가 private 접근 제한자로 설정된 경우 메소드를 이용하여 접근 가능
			//=> 정적 메소드는 객체가 아닌 클래스로 접근하여 호출 가능
			Student.setTotal(Student.getTotal()+student.getTot());

		}
		
		System.out.println("===================================================================================");
		
		//모든 학생들의 점수들의 합계를 계산하여 출력
//		System.out.println("총합계 = "+Student.total);
		System.out.println("총합계 = "+Student.getTotal());
				
		System.out.println("===================================================================================");


		
	}

}
