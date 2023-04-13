package xyz.itwill.Access;

public class PublicMemberUse {
	public void run() {
		PublicMember member = new PublicMember();
		
		member.num=100;
		member.display();
	}
}
