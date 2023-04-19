package xyz.itwill.util;

import java.util.Calendar;
import java.util.Scanner;

//키보드로 [년]과 [월]을 입력받아 해당 년월에 대한 달력을 출력하는 프로그램 작성

public class WantCalendarApp {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("[년도]를 입력해주세요. >> ");
		int year = sc.nextInt();	//년도를 변수에 저장
		System.out.print("[월]을 입력해주세요. >> ");
		int month = sc.nextInt();	//월을 변수에 저장
		
		calendar.set(Calendar.YEAR, year);	//입력받은 년도로 세팅
		calendar.set(Calendar.MONTH, month); //입력받는 월로 세팅
		
		
		sc.close();
		
		
		calendar.set(year, month-1, 1);
		//입력받은 월은 0부터 1월시작이니까 -1 해야하고, 날은 1일로 세팅한다.
		
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("week = "+week);
		
		System.out.println("              "+calendar.get(Calendar.YEAR)+"년"+(calendar.get(Calendar.MONTH)+1)+"월");
		System.out.println("========================================");
		System.out.println("    일   월   화   수   목   금   토    ");
		System.out.println("========================================");
	
		for(int i=1;i<week;i++) {
			System.out.print("     ");
		}
		
		for(int i=1;i<=calendar.getActualMaximum(Calendar.DATE);i++) {
			if(i<=9) {
				System.out.print("    "+i);				
			} else {
				System.out.print("   "+i);
			}
			
			week++;	//토요일까지 출력되면(1주일이 끝났음) 다음줄로 내려가야함. 
			
			if(week%7==1) {	//다음 출력값이 일요일일 경우 다음줄로 내려가기~
				System.out.println();
			}
			
		}
		
	}

}
