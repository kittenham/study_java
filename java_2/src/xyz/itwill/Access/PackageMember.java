package xyz.itwill.Access;

//package 접근 제한자 : 같은 패키지의 클래스에서 접근 가능하도록 설정
//=> 다른 패키지의 클래스에서 접근 불가능
//=> 클래스, 필드, 메소드 선언시 접근 제한자 관련 키워드를 사용하지 않으면 자동설정되는 접근제한자이다. (따라서, package 접근 제한자는 키워드가 따로 없다)

public class PackageMember {
	int num;
	
	public void display() {
		private int num
	}
}
