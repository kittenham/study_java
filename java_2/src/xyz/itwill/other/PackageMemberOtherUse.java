package xyz.itwill.other;

import xyz.itwill.Access.PackageMember;

public class PackageMemberOtherUse {
	public void run() {
		PackageMember member=new PackageMember();
		
//		member.num=100;		//에러떨어짐. 같은 패키지에서만 접근 가능
//		member.display();
	}
}
