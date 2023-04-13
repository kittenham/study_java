package xyz.itwill.Access;

public class PrivateMemberUse {
	public void run() {
		Supperss
		PrivateMember member = new PrivateMember();
		
		//private 접근 제한자로 설정된 필드와 메소드에 접근할 경우 에러발생
		member.num=100;
		member.display();
	}
}
