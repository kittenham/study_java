package xyz.itwill.util;

import java.util.Date;

//Date 클래스 : 날짜와 시간을 저장하고 저장된 날짜와 시간 관련 기능을 메소드로 제공하기 위한 클래스
public class DateApp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Date 클래스의 기본 생성자를 사용하여 객체를 생성하면 시스템의 현재 날짜와 시간이 저장된 Date 객체를 생성
		Date now = new Date();
		
		//Date.toString() : Date 객체에 저장된 날짜와 시간을 문자열로 변환하여 반환하는 메소드
		System.out.println("now.toString() = "+now.toString());
		System.out.println("now = "+now);	//참조변수를 출력할 경우 toString() 자동 호출가능.
		
		
		//Date.getYear() : Date 객체에 저장된 날짜와 시간에서 [년도]를 반환하는 메소드
		//=> 주의) 1900년부터 1씩 증가된 정수값을 반환하기 때문에 1900을 더해줘야함.
		
		//Date.getMonth() : Date 객체에 저장된 날짜와 시간에서 [월]을 반환하는 메소드
		//=> 주의) 0(1월) ~ 11(12월) 범위의 정수값 반환.
		//=> 따라서, +1 을 해줘야 우리가 알고 있는 월의 숫자가 출력된다.
		
		//Date.getDate() : Date 객체에 저장된 날짜와 시간에서 [일]을 반환하는 메소드
		
		//Date.getDay() : Date 객체에 저장된 날짜와 시간에서 [요일]을 반환하는 메소드
		//=> 주의) 0(일) ~ 6(토) 범위의 정수값 반환. 출력할때 숫자가 출력되면 안되므로, 문자를 지정해줘야함.
		String[] day = {"일","월","화","수","목","금","토"};
		
		String printDate = (now.getYear()+1900)+"년"+(now.getMonth()+1)+"월"+(now.getDate())+"일"+(now.getDay())+"요일";
		//에러난거	@SuppressWarnings("deprecation") 처리하면 경고없어짐. (쓰는것을 추천(권장)하지 않는다는 뜻이기 때문에)

		System.out.println("현재날짜 = "+printDate);
		
		//Date.getTime() : Date 객체에 저장된 날짜와 시간에 대한 타임스템프를 반환하는 메소드.
		//타임스템프(TimeStamp) : 1970년 1월 1일을 기준으로 1ms 마다 1씩 증가된 정수값
		//=> 날짜와 시간을 정수값(long)으로 표현하여 연산 처리하기 위해 사용.
//		long currentTime = now.getTime();
		long currentTime = System.currentTimeMillis();	//위와 같은 결과값. 현재에 대한 시간(타임스템프)은 얘를 더 많이 씀.※※※중요!
		
		
		Date wantDate = new Date(100,0,1);	//Date객체를 만드는데(년, 월, 일) 저장 (쓰는 것 권장X)
		//=>[2000년, 1월, 1일, 0시, 0분, 0초]가 저장된 Date 객체 생성됨
		System.out.println("wantDate = "+ wantDate);
		
		long wantTime = wantDate.getTime();
		
		System.out.println("연산결과(일) = "+(currentTime-wantTime)/(1000*86400));
		
	}

}
