package inheritance;


//이벤트 관련 회원정보(아이디, 이름, 이메일)를 저장하기 위한 클래스
public class MemberEvent extends Member {	//상속 : 부모클래스(Member), 자식클래스(MemberEvent)
	
	/*
	부모클래스(Member)를 상속받아 사용할 수 있으므로 이 두가지 필드는 선언하지 않아도 됨.(필드 미선언)
	private String id;
	private String name;
	*/
	private String email;
	
	
	//자식클래스의 메소드에서는 먼저 this 키워드로 자식클래스 객체의 필드 또는 메소드를 참조하지만, 
	//if. 자식클래스 객체의 필드 또는 메소드가 없는 경우 부모클래스 객체의 필드 또는 메소드를 참조한다.
	//if, 부모클래스 객체의 필드 또는 메소드도 없는 경우에는 에러가 생긴다.
	//=> 부모클래스의 필드 또는 메소드가 은닉화 선언된 경우 참조 불가.(상속은 받을 수 있는데 (직접)참조는 불가. 접근을 할 수 없다는 뜻.(But, setter를 이용한 접근은 가능. public이라서. 혹은 아예 생성자를 새로 생성을 하든가.)

	
	//super 키워드 : 자식클래스의 메소드에 부모클래스 객체의 메모리 주소를 저장하기 위한 키워드
	// => 자식클래스의 메소드에서 부모클래스 객체의 필드 또는 메소드를 참조하기 위해 사용
	// => 자식클래스의 메소드에서 super 키워드를 사용하지 않아도 자식클래스의 메소드에서는 this 키워드로 참조되는 필드와 메소드가 없으면 자동으로 부모클래스 객체의 필드 또는 메소드 참조
	
	//super 키워드를 사용하는 경우
	//1.자식클래스의 생성자에서 부모클래스의 매개변수가 있는 생성자를 호출하여 초기화 처리하기 위해 super 키워드 사용 - 부모클래스 객체가 생성될 때 필드에 원하는 초기값 저장 가능
	//형식) super(값, 값, ...);
	// => 생략된 경우 부모클래스의 매개변수가 없는 기본 생성자를 호출하여 객체 생성
	// => 생성자에서 다른 생성자를 호출하는 명령은 반드시 첫번째 명령으로 작성
	//2. 자식클래스의 메소드에서 오버라이드 선언되어 숨겨진 부모클래스의 메소드를 호출할 경우 super 키워드 사용
		
	
	
	
	public MemberEvent() {
		//super(); 가 생략 되어 있는 것. //부모클래스의 매개변수가 없는 기본 생성자 호출(생략이 가능하다)
	}
	
/*
	public MemberEvent(String id, String name, String email) {
		super();
//		this.id = id;		=> 상속으로 두가지 필드(아이디, 이름)을 이 클래스에서 선언하지 않았으므로.
		setId(id);
//		this.name = name;
		setName(name);
		this.email = email;
	}

*/
	//[Alt]+[Shift]+[S] >> 팝업메뉴 - [O] >> 부모클래스의 생성자 선택 >> 필드 선택 >> Generate
	//super를 사용할 때 위의 것보다 더 효율적.
	public MemberEvent(String id, String name, String email) {
		super(id, name);//부모클래스의 매개변수가 있는 생성자 호출
		this.email = email;
	}
	
/*
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
*/
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//메소드 오버라이딩(Method Overriding) : 상속관계에서 부모클래스의 메소드를 자식클래스에서 재선언하는 기능
	//=> 부모클래스의 메소드를 자식클래스의 객체가 사용하기 부적절한 경우, 부모클래스의 메소드를 자식클래스에서 재선언하여 사용하는 방법
	//=> 부모클래스의 메소드는 숨겨지고(=Hide Method) 자식클래스의 메소드만 접근가능
	//작성규칙)  부모클래스의 메소드와 같은 [접근지정자, 반환형, 메소드명, 매개변수, 예외전달]을 사용하여 메소드 작성.(걍 똑같아야함)
/*
	public void display() {
//		System.out.println("아이디 = "+id);
		System.out.println("아이디 = "+getId());	<<
//		System.out.println("이름 = "+name);
		System.out.println("이름 = "+getName());	<<
		System.out.println("이메일 = "+email);
		
	}
*/
	
	//이클립스에서는 부모클래스의 메소드를 자식클래스에서 오버라이드 선언되도록 자동완성하는 기능을 제공한다.
	//오버라이딩 선언하고싶은 부모클래스의 메소드명 입력 >> [Ctrl] + [Space바] >> Override Method 선택
	
	//@Override : 오버라이드 선언된 메소드를 표현하기 위한 어노테이션
	//어노테이션(Annotation) : API문서에서 특별한 설명을 제공하기 위한 기능을 제공 (인터페이스로 만들어진것)
	//=> Java Source 작성에 필요한 특별한 기능을 제공하기 위해 사용되는 자료형
	//=> @Override, @Deprecated(사용하는 것을 권장하지 않습니다 라고 알려주기 위해 사용. 버전이 업데이트되면서 메소드를 없애기전에 먼저 알려주는것.), @SuppressWarings(소스코드 만들다가 경고 제거할때 사용)
	
	
	public void display() {
		super.display(); 	//super 키워드로 부모클래스의 숨겨진 메소드 호출
		System.out.println("이메일 = "+email);
	}
	
}
