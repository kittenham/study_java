package oop;

//static 키워드 : 객체가 아닌 클래스로 접근하기 위한 기능을 제공하는 제한자
//=> 클래스(내부 클래스일때만 사용가능), 필드, 메소드 작성시 사용
//제한자(Modifier) : 특별한 기능을 제공(제한)하기 위해 사용하는 키워드
//=> 접근제한자Access Modifier(private, package, protected, public), static, final, abstract  


//학생정보(학번, 이름, 국어, 영어, 총점)를 저장하기 위한 클래스 => VO 클래스
//VO 클래스에는 Setter, Getter만 만들어 저장하는 클래스.
//원래는 데이터만 저장하는 클래스를 따로 만들어야함. (여기는 귀찮아서 같이 그냥만듦)
public class Student {
	
	//인스턴스 필드(Instance Field) : 객체가 생성될 때, 메모리(HeapArea)에 생성되는 필드 (객체에 있는 요소로 만들어짐) -객체필드
	private int num;		//계산을 할때-숫자형, 계산을 하지 않을때-문자형 사용하면 되지만, 처리속도가 숫자형이 매우 빠르기 때문에 처리속도가 빠른걸 원할 때는문자형으로 사용할때도 숫자형으로 사용하면 됨.목적에 맞게 사용하면됨.
	private String name;
	private int kor, eng, tot;
	
	//정적 필드(Static Field) : 클래스를 읽어 메모리(MethodArea)에 저장될 때 생성되는 필드
	//=> 객체가 생성되기 전에 메모리에 하나만 생성되는 필드
	private static int total=0;	//메소드 영역에 클래스가 만들어지고 그 클래스 내부에 딱 하나 만들어 지는 필드
	//생성자가 설정되기 전에 미리 만들어지는 것. 생성자에서 초기화되지 않고, 직접 초기값을 필드에 저장.
	//위와 같이 =0일 경우 =0은 생략가능(기본값을 초기값으로 사용할 경우 초기값 저장 생략가능)
	//클래스로 생성된 모든 객체가 정적 필드 사용 가능 - 공유값 : 메모리 절약 및 피드값 변경에 용이
	//클래스 외부에서는 "클래스를 사용하여 접근"할 수 있다.
	
	
	//생성자(Constructor) : 객체를 생성하면서 객체 인스턴스 필드에 원하는 초기값을 저장하기 위해 작성한다.
	public Student() {		// 단축키 Ctrl + space
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name, int kor, int eng) {		//생성자 단축키 shift + alt + S + O
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
//		tot=kor+eng;	//여기에다 총점을 계산하여 필드에 저장하는 명령 작성하면 굳이 밑에서 다시 총점계산 메소드를 생성할 필요 없음. 훨씬 편리함.
		calcTot();		//혹은 이렇게 사용.=> 이건 윗줄의 것보다 코드의 중복성을 최소화 하여 프로그램의 생산성 및 유지보수의 효율성 증가
	
	}

	//인스턴스 메소드(Instance Method) : this 키워드가 제공되는 메소드
	//=> this 키워드를 이용하여 인스턴스 필드 및 메소드 접근 가능
	//=> 클래스를 사용하여 정적 필드 및 메소드 접근 가능 - 클래스는 생략가능
	public int getNum() {		//Setter&Getter 단축키 shift + alt + S + R
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		calcTot();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}
	
	
//	public void calcTot() {		//총점을 계산하는 메소드 	
	private void calcTot() {	//다른 메소드들 안에 들어가 사용하기 때문에 calcTot();을 굳이 따로 쓰지 않는 경우(=외부에서 사용X 경우), public이 아닌 private로 은닉화 선언하는 경우가 多
	tot=kor+eng;
	}
	//은닉화 선언된 메소드 : 클래스 내부에서만 호출하여 사용하는 메소드
	//=> 코드의 중복성을 최소화하기 위한 기능을 제공하는 메소드
	
	
	public void display() {		//필드값을 좀 더 쉽게 확인하려고. (상속없이) - 원래는 VO클래스에서 쓰지않는 방법
		System.out.println("["+name+"]님의 성적 >> ");
		System.out.println("국어 = "+kor+", 영어 = "+eng+", 총점 = "+tot);
	}
	
	
	//정적 메소드(Static Method) : this 키워드를 제공하지 않는 메소드
		// => this 키워드가 없으므로 인스턴스 필드 및 메소드 접근 불가능
		// => 클래스를 사용하여 정적 필드 및 메소드 접근 가능 - 클래스 생략 가능
		public static int getTotal() {
			return total;
		}

		public static void setTotal(int total) {
			Student.total = total;
		}
	
	
}
