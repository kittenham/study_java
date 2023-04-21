package xyz.itwill.util;

//>> 내가 작성한 식. 망함ㅋ 다시 생각해보기.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출력하는 프로그램을 작성해보자.
//(조건)
//1. 생년월일 입력 [ex. 2000-01-01] >> [2023-04-18]	(date클래스사용)
//	 [결과] 태어난지 [1일]이 지났습니다. (타임스템프, -> 1로 바꿔주면됨)
//2. 형식에 맞지않은 생년월일을 입력한 경우 에러메세지 출력 후 프로그램 종료 (date, simpledateformat)

public class DayCalculateApp {
//????
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//생년월일 저장 변수필요
//		String birth;
		
		/*
		//키보드로 생년월일 입력 받기. 정상적인 입력값을 받아야함
		while(true) {
			System.out.println("생년월일을 입력하세요. [ex.2000-01-01] >> ");
			
			//입력받은 생년월일은 -부호 포함 10자리로 입력. 5번째 자리&8번째 자리에 '-'문자가 있다.
			if(birth.length()==10 && birth.indexOf('-')==6 && birth.indexOf('-')==9) break;
			
			System.out.println("[에러] 형식에 맞게 생년월일을 입력해 주세요. [ex. 2000-01-01]");
			
		}
		*/
		System.out.print("생년월일을 입력하세요. ex.2000-01-01 >> ");
		String birth = sc.next();
		
		long currentTime = System.currentTimeMillis();
		
		Date birthDate = new Date();
		
		
		sc.close();
		
		SimpleDateFormat birthFormat = new SimpleDateFormat("yyyy-MM-dd");
		birthFormat.applyPattern("yyyy-MM-dd");
		
		
		//문자열로 입력된 걸 시간으로 바꿔서 계산해야함. (String -> Date)
		//생년월일 저장변수
	/*	
		try {
			Date birthDate = birthFormat.parse(birth); 
		} catch(ParseException e) {
			System.out.println("[에러] 형식에 맞게 생년월일을 입력해 주세요. [ex. 2000-01-01]");
			
		}
		
		long currentTime = System.currentTimeMillis();
		
	*/
		
		
		
		
				
		
		
		
		
		
		
	}
}
