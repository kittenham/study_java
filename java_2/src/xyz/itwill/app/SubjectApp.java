package xyz.itwill.app;

import xyz.itwill.subject.JavaSubject;

//패키지(Package) : 같은 목적의 자료형(참조형)을 명확하게 구분하여 그룹화하기위해 사용하는 것
//Java에서 참조형 : 클래스(Class), 인터페이스(Interface), 열거형(Enum)
//Java 자료형을 보다 쉽게 관리하기 위해 패키지를 사용한다.
//패키지의 이름은 도메인을 역방향으로 나열하고 그룹명을 지정하여 작성하는 것을 권장

//도메인(Domain) : 인터넷에서 개인 또는 그룹이 사용하기 위한 네트워크 식별자
//ex)  naver.com,  google.com,  daum.net
//⇒ naver.com >> com.naver.board (이 형식으로 패키지 작성)

//패키지에 작성된 소스파일의 처음 위치에는 소스파일이 작성된 패키지를 반드시 명시해야 함(안하면 에러!)
//형식) package 패키지경로;
//=> Java 자료형이 어떤 패키지에서 선언된 자료형인지 명확하게 구분하여 사용할 수 있다. (똑같은 클래스명이라도 패키지가 다르면 다른 것!)

import xyz.itwill.subject.OracleSubject;
//import 키워드 : 다른 패키지에 작성된 Java 자료형을 명확히 표현하여 접근하기 위한 키워드
//형식)  import 패키지경로.자료형	//자료형은 패키지, 인터페이스,enum 중 하나
//=> package 키워드로 작성된 명령 하단에 선언하며 자료형 선언 위에 선언
//이클립스에서는 다른 패키지에 작성된 자료형을 사용할 경우 import 명령을 자동 완성하는 기능 제공
//⇒ [Ctrl] + [Space]
//⇒ [Ctrl] + [Space] + [O] >> import 명령을 정리하는 단축키 : 불필요한 자료형에 대한 import 설정을 제거하거나 필요한 자료형에 대한 import 설정을 추가하는 기능 제공

//import xyz.uniwill.subject.JavaSubject;
//자료형의 이름이 같은경우 import 불가능!

public class SubjectApp {
	
	public static void main(String[] args) {
		
//		OracleSubject에 있는 자료형을 사용하고싶음~
//		▼
//		OracleSubject subject1 = new OracleSubject();	//=> 에러! 찾을수 없다! >> OracleSubject라는 클래스는 다른 패키지에 존재하기 때문에.
		//같은 클래스에 작성된 클래스는 패키지 경로를 표시하지 않고 패키지 경로 없이 클래스만 사용하여 접근 가능하다.
		//하지만, 다른 패키지에 작성된 클래스는 반드시 패키지 경로를 표현해야만 클래스 접근이 가능하다.
		//형식)  패키지경로, 클래스명
//		따라서,
		xyz.itwill.subject.OracleSubject subject1 = new xyz.itwill.subject.OracleSubject();
		
		//하나하나 치기에는 너무 불편하기 때문에, => 다른 패키지에 작성된 클래스를 import 처리한 경우 패키지 경로 표현없이 클래스 접근 가능하다. 
		
		subject1.display();
		
		JavaSubject subject2 = new JavaSubject();
		subject2.display();
		
		//import 설정이 불가능한 자료형은 패키지 경로를 반드시 표현해야만 접근 가능
		xyz.uniwill.subject.JavaSubject subject3 = new xyz.uniwill.subject.JavaSubject();
	
	}

}
