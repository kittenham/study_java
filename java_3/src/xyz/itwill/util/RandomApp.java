package xyz.itwill.util;

import java.util.Random;

//java.util 패키지 : 프로그램 작성에 유용한 기능을 제공하는 클래스(인터페이스)가 선언된 패키지

//Scanner 클래스 : 입력장치로부터 값을 입력받기 위한 기능의 메소드를 제공하기 위한 클래스
//Scanner 클래스가 입력을 여러개 받을 때는 메소드 호출할때 버그가 많이 발생.
//Arrays 클래스 : 배열 요소를 처리하기 위한 기능의 메소드를 제공하기 위한 클래스 (호출하면 배열요소값을 검색, 등등을 할 수 있음)

//Random 클래스 : 난수값 관련 기능을 메소드로 제공하기 위한 클래스

public class RandomApp {
	
	public static void main(String[] args) {
		
		//Random 클래스 : 난수값 관련 기능을 메소드로 제공하기 위한 클래스
		Random random = new Random();	//
		//Random(long seed) : 시드값을 조절하면 몇 초마다 똑같은 값이 나옴.
		//Random() : 시드 조절X => 마음대로~
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+"번째 난수값 >> "+random.nextInt(100));
			//random.nextInt(int bound) : "0 ~ bound-1" 범위의 정수 난수값을 반환하는 메소드
			//random.nextInt(100) : 0~99 범위의 정수 난수값을 반환
		}
	}

}
