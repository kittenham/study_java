package xyz.itwill.lang;

//StringBuffer 클래스 : 문자열을 저장하기 위한 클래스
//=> StringBuffer 객체에 저장된 문자열의 문자를 조작하기 위한 관련 메소드를 제공(문자열 직접처리)
//=> String 객체는 저장된 문자열을 조작하기 위한 메소드를 제공하지 않고 조작결과를 반환하는 메소드 제공(처리결과를 반환 - 문자열 간접처리)
//=> String클래스보다 StringBuffer 클래스의 메소드가 문자열 처리속도가 우수함.(직접처리하는 거라서)
//엄연히 String과 StringBuffer 객체는 다른것!
public class StringBufferApp {
	public static void main(String[] args) {
		//StringBuffer 클래스는 "new 연산자를 생성자를 호출"하여 객체 생성
		StringBuffer sb = new StringBuffer("ABC");
		
		//StringBuffer객체에 저장된 문자열을 반환하는 메소드
		System.out.println("sb.toString() = "+sb.toString()); 	
		System.out.println("sb = "+sb); 	//결과는 위와 동일함.
		//StringBuffer 객체가 저장된 참조변수를 출력할 경우 toString 메소드 자동 호출되기 때문.
		
		//StringBuffer 객체에 저장된 문자열을 반환받아 String 객체로 생성하여 참조변수 저장.
		String str = sb.toString();	//이렇게 하면, StringBuffer 객체 >> String 객체로 바뀜.
		
		//데이터 처리시에는 StringBuffer 사용. 출력시에는 String으로 하는 경우가 많음.
		
		System.out.println("str = "+str);
		
		System.out.println("======================================================================");
		
		//StringBuffer.append(Object o) : StringBuffer 객체에저장된 문자열에 매개변수로 전달받은 값을 "추가"하는 메소드
		//=> String 객체에 저장된 문자열에 += 연산자를 사용한 것과 동일한 효과.
		sb.append("DEF");	//코드가 String객체에 +=연산자 쓰는 것보다 가독성과 효율성이 더 큼.
		System.out.println("sb = "+sb);	//출력시 ABCDEF 가 나옴
		
		System.out.println("======================================================================");
		
		//StringBuffer.insert(int index, Object o) : StringBuffer 객체에 저장된 문자열에 매개변수로 전달받은 문자열을 원하는 위치(첨자)에 삽입하는 메소드
		sb.insert(4, "X");	//인덱스가 4인 위치(따지고보면 다섯번째 자리. 0부터 시작이니까)에 X를 삽입해 주세요.(추가!=삽입)
		System.out.println("sb = "+sb); //출력 : ABCDXEF
		
		
		//StringBuffer.deleteCartAt(int index, Object o) : StringBuffer 객체에 저장된 문자열에 매개변수로 전달받은 위치(첨자)의 문자를 제거하는 메소드
		sb.deleteCharAt(2);
		System.out.println("sb = "+sb);	//출력 : ABDXEF
		
		
		//StringBuffer.delete(int beginIndex, int lastIndex) : StringBuffer 객체에 저장된 문자열에 매개변수로 전달받은 시작위치(첨자)의 문자부터 종료위치(첨자) 범위의 문자열을 제거하는 메소드
		sb.delete(4, 6);
		System.out.println("sb = "+sb);	//출력 : ABDX
		
		
		//StringBuffer.reverse() : StringBuffer 객체에 저장된 문자열의 문자를 역순으로 나열되도록 저장하는 메소드
		sb.reverse();
		System.out.println("sb = "+sb); //출력 : XDBA
		
//		StringBuffer vs StringBuilder => StringBuffer가 더 스레드에 안전함. 그래서 더 많이 씀~
		
		
		
		
		
	}
}
