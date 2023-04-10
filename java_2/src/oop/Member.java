package oop;

/*
this 키워드 : 메소드에 숨겨져있는 키워드
=> 메소드 내부에 숨겨져있는 키워드로 메소드를 호출한 객체의 메모리 주소(HashCode)를 자동으로 전달받아 저장하는 키워드
메소드 내부의 명령에서 객체의 필드 또는 메소드를 사용하기 위해 this 키워드 사용
this 키워드 사용하지 않아도 자동으로 객체의 필드 또는 메소드에 접근하여 사용

<메소드에 this 키워드가 존재해야하는 이유(java)>
- 필드는 객체마다 메모리(HeapArea)에 따로 독립적으로 생성되지만, 메소드는 객체의 개수와 상관없이 메모리(MethodArea)에 하나만 생성되기 때문. 
⇒ 프로토타입(Prototype) 클래스
(≠ C언어는 메소드도 힙영역에 만들어짐.)
- 메소드에서 필드를 사용할 때 this 키워드를 사용하여 객체를 명확히 구분하여 필드 접근할 수 있다.
<this 키워드를 사용해야 할 경우>
1. 메소드에서 매개변수의 이름을 필드의 이름과 동일하게 작성한 경우 필드를 표현하기 위해 this 키워드 사용 [=매개변수와 필드 구분시에 사용] ⇒ 생성자 및 Setter 메소드
(매개변수와 필드 이름을 똑같이 만드는 이유 : 배포시 다른사람에게 명확,편리하게 알려주기 위해)
2. 생성자에서 다른 생성자를 호출하여 초기화 작업을 하기 위해 this 키워드 사용
public Member(){
	//this(값, 값, ...)   => 생성자에서 this 키워드로 다른 생성자를 호출하는 명령 (일반메소드에서는 X)
	 		* 생성자마다 코드가 중복되는 것을 줄여주기 위해 사용.
	 		* 주의점___ 다른 명령보다 먼저 실행되도록 작성해야함 - 다른 명령이 먼저 실행될 경우, 에러발생.(생성자에서 생성자 호출은 무조건 첫번째여야함.)
	this("NoId.", "NoName", "NoEmail");
}

//객체 생성시 객체 필드에 초기값으로 자동 저장될 기본값 변경 가능⇒ Null 대신 들어감
public class Member{
	private String id="NoId";
	private String id="NoName";
	private String id="NoEmail";
}
3. 이벤트 처리 프로그램 또는 다중 스레드 프로그램의 메소드에서 객체 자체를 표현하기 위해 this 키워드 사용
*/

//회원정보(ID, 이름, 이메일)(속성)를 저장하기 위한 클래스
//=> VO(Value Object) 클래스 : 특정 대상의 값을 저장할 목적의 객체를 생성하기 위한 클래스 (행위에 대해서는 생각X)
//==> 기본클래스(필드, Setter, Getter)
public class Member {
	//필드 선언 : 객체를 생성하면 객체의 필드에는 기본값이 초기값으로 자동저장된다.
	//**기본값 => (숫자형:0, 논리형:false, 참조형:null)
	private String id;
	private String name;
	private String email;

	//생성자 선언 : 객체를 생성하기 위한 특별한 형태의 메소드
	//=> 생성자를 선언하지 않으면 매개변수가 없는 기본 생성자가 제공된다.
	//=> 생성자를 선언하면 매개변수가 없는 기본 생성자를 제공하지 않는다.(한개라도 만들면 무조건 제공X)
	//* 생성자 선언의 궁극적인 목적 : 객체 생성시, 객체 필드에 원하는 초기값이 저장된 객체를 생성하기 위해 생성자를 선언한다.
	//* 형식)  접근제한자 클래스명(자료형 매개변수, 자료형 매개변수, ...){ 명령, 명령, .. }
	//=> 반환형 작성X. 생성자의 이름은 반드시 클래스 이름과 동일하게 작성.
	//=> 메소드 오버로드를 사용하여 생성자를 여러개 선언 가능
	// 일반적으로, 생성자에서는 필드에 필요한 초기값(내가 원하는 초기값. 기본값이 아님)을 저장하기 위한 명령 작성 - 초기화 작업.
	
	//매개변수가 없는 생성자를 선언 - 기본 생성자(Default Constructor)
	//=> 초기화 작업 미구현.- 객체 필드에 기본값이 초기값으로 저장된다.
	// 사용 이유 : 상속 => 기본생성자를 선언하지 않으면 상속 시 문제가 발생할 수 있으므로, 기본생성자를 선언하는 것을 권장.
	//eclipse를 사용하여 기본생성자 선언 가능
	//=> Ctrl + Space >> 나열된 목록 중 Constructor 선택 (기본생성자가 있는데 이거 한다고 또 나오지는 않음~)

	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//매개변수가 있는 생성자
	//=> 매개변수에 전달되어 저장된 값을 필드의 초기값으로 저장
	//eclipse를 사용하여 매개변수가 있는 생성자 선언 가능
	//=> Alt + Shift + S  >>  팝업메뉴 - [O]  >> 필드 선택  >> Generate
	

	public Member(String id) {
		this.id=id;	//id 필드값 초기화시킨것.
	}
	
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	
	
	//메소드 선언 (Alt + Shift + S + R)

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//필드값을 확인하기 위해 필드값을 출력하는 메소드 	(목적:디버깅)
	public void display() {
		System.out.println("아이디 = "+id);
		System.out.println("이름 = "+name);
		System.out.println("이메일 = "+email);
	}

}
