package inheritance;

public class MemberApp {
	public static void main(String[] args) {
		Member member1 = new Member();
		
		member1.setId("abc123");
		member1.setName("홍길동");
		
		member1.display();
		
		System.out.println("============================================================");
		
		Member member2 = new Member("def456", "임꺽정");
		member2.display();
		
		System.out.println("============================================================");
		
		//여기까지는 상속 없음
		
		
	}
}
