package xyz.itwill.subject;

import java.util.Date;
import java.util.Scanner;	//다른패키지에 있기 때문에 여기서 사용하려면 가져와야함

//키보드로 이름과 태어난 년도를 입력받아 나이를 계산하여 이름과 나이를 출력하는 프로그램 작성해보자
//		이름 입력 >> 홍길동
//		태어난 년도 >> 2000
//		[결과]홍길동님의 나이는 24살입니다.
public class CalcAgeApp {
	public static void main(String[] args) {
		//Scanner 클래스로 객체를 생성하여 참조변수에 저장
		Scanner scanner = new Scanner(System.in);
		
		//키보드를 이용하여 사용자로부터 이름과 태어난 년도를 입력받아 변수에 저장
		System.out.print("이름입력 >> ");
		String name = scanner.nextLine();
		
		System.out.print("태어난 년도 >> ");
		int birthYear = scanner.nextInt();
		
		//java.util.Date 클래스로 객체를 생성하여 참조변수에 저장
		//Date 클래스 : 날짜와 시간을 저장하기 위한 클래스
		//=> Date 클래스의 기본 생성자를 사용하여 객체를 생성하면 시스템의 현재 날짜와 시간이 저장된 Date 객체 생성
		Date now = new Date();
		
		//now.getYear() : Date 객체에 저장된 날짜와 시간에서 년도를 정수값으로 반환하는 메소드
		//=> 1900년을 기준으로 1년에 1씩 증가된 정수값으로 반환
		//=> @Deprecated 어노테이션이 적용된 메소드
		//@Deprecated 어노테이션 : 메소드 사용을 권장하지 않도록 설정하는 어노테이션
		//@Deprecated 어노테이션 적용된 메소드를 호출할 경우 경고가 발생한다.
		//@SuppressWarnings 어노테이션 : 경고 메세지를 제거하는 어노테이션
		//=> value 속성을 사용하여 경고 관련 속성값을 설정 (value = "제거할 경고")
		//=> value 속성 외에 다른 속성이 없는 경우 속성값만 설정 가능('value =' 생략 가능)
		@SuppressWarnings(value = "deprecation")
		int currentYear = now.getYear()+1900;
		
		//현재 년도와 태어난 년도를 이용하여 나이를 계산
	
//		int age = 2023-birthYear+1;		//해가 바뀌면 시스템을 다시 다 뜯어 고쳐야함. 2023년이 아니니까.
		int age = currentYear-birthYear+1;		//현재 년도를 구해서 계속 쓸 수 있음.
	
		
		System.out.println("[결과]"+name+"님의 나이는 "+age+"살 입니다.");
		
		scanner.close();
		
	}
}
