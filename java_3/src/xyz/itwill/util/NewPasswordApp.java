package xyz.itwill.util;

import java.util.Random;
import java.util.UUID;

//새로운 비밀번호를 생성하여 제공하는 프로그램을 작성해보자.
public class NewPasswordApp {
	
	//새로운 비밀번호를 생성하여 반환하는 메소드 - Random 클래스 이용
	public static String newPasswordOne() {
		Random random = new Random();
		
		//비밀번호로 사용될 문자들이 저장된 문자열 생성
		String str = "ABCCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*";	//임시비밀번호
		
		StringBuffer password = new StringBuffer();
		for (int i=1;i<=10;i++) {
			password.append(str.charAt(random.nextInt(str.length())));
			//str.length() : str 문자개수 반환
			//random.nextInt() : 0~44(문자개수-1)까지의 난수 반환(0부터 시작이라서)
			//str.charAt() : 반환받은 난수에서 원하는 위치의 문자 하나부터
			//password.append : 10개씩 제공받아 문자열에 추가.(반복이 10번이니까)
			//=>10글자짜리 임시비밀번호가 발급된다.(실행될때마다 다르게 나옴)
		}
		return password.toString();
	}
	
	
	//새로운 비밀번호를 생성하여 반환하는 메소드 - UUID 클래스 이용
	public static String newPasswordTwo() {
		
		//UUID 클래스 : 범용적으로 사용되는 식별자를 생성하기 위한 기능을 메소드로 제공하는 클래스
		//UUID.randomUUID() : 자동으로 식별자를 생성하여 식별자가 저장된 UUID 객체를 반환하는 메소드
		//=> UUID 객체에 저장된 식별자는 숫자와 영문자(소문자), 4개의 - 문자를 조합하여 36개의 문자로 구성된 문자열로 생성된다.
		//UUID.toString() : UUID 객체에 저장된 식별자를 문자열(String 객체)로 변환하여 반환하는 메소드
		return UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase();
		//고유값이 저장된 UUID 객체가 만들어지고
		//UUID 객체 안의 고유값이 문자열로 반환되고
		//-가 없어지고(36개문자중 4개의-를 없애는것)
		//남은 32개 문자 중 10개가 반환
		//모두 대문자로 반환
	}
	

	
	
	public static void main(String[] args) {
		System.out.println("새로운 비밀번호-1 = "+newPasswordOne());
		System.out.println("새로운 비밀번호-2 = "+newPasswordTwo());
	}
}
