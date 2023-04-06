package oop;

public class MemberApp {
	public static void main(String[] args) {
		//new 연산자로 Member 클래스의 매개변수가 없는 기본 생성자를 호출하여 객체 생성
		//=> 생성된 객체의 필드에는 기본값이 초기값으로 자동 저장
		Member member1=new Member();
		
		//Getter 메소드를 호출하여 Member 객체의 필드값을 반환받아 출력 => 객체 만든 후 바로 출력하면 원하는 값을 얻을 수 없음.
		System.out.println("아이디 = "+member1.getId());
		System.out.println("이름 = "+member1.getName());
		System.out.println("이메일 = "+member1.getEmail());
		System.out.println("=============================================================================");
		//Setter 메소드를 호출하여 Member 객체의 필드값 변경 => 원하는 결과를 얻기 위해 실시
		member1.setId("abc123");
		member1.setName("홍길동");
		member1.setEmail("abc123@itwill.com");
		
		/*
		System.out.println("아이디 = "+member1.getId());
		System.out.println("이름 = "+member1.getName());
		System.out.println("이메일 = "+member1.getEmail());
		*/
		member1.display();//중복이 많이 되니까 한번에 사용.
		
		System.out.println("=============================================================================");

		//new 연산자로 매개변수가 있는 생성자를 호출하여 객체 생성
		Member member2=new Member("def456");
		member2.display();	//이름, 이메일은 기본값이라 null이 출력됨
		
		System.out.println("=============================================================================");

		Member member3=new Member("ghi789", "임꺽정");
		member3.display(); 	//이메일은 기본값이라 null이 출력됨

		System.out.println("=============================================================================");

		Member member4=new Member("xyz123", "전우치", "xyz123@itwill.com");
		member4.display();

		
		
	}

}
