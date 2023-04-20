package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//<강사풀이>
//키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출력하는 프로그램을 작성해보자.
//(조건)
//1. 생년월일 입력 [ex. 2000-01-01] >> [2023-04-18]	(date클래스사용)
//	 [결과] 태어난지 [1일]이 지났습니다. (타임스템프, -> 1로 바꿔주면됨)
//2. 형식에 맞지않은 생년월일을 입력한 경우 에러메세지 출력 후 프로그램 종료 (date, simpledateformat)
public class DayCalculateApp2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Date birthday = null; //초기화 안되어있으면 에러떨어짐.
		
		System.out.println("생년월일 입력 [ex. 2000-01-01] >> ");
		try {
			//키보드로 입력받은 문자열을 Date 객체로 변환하여 저장
			//=>키보드로 입력받은 문자열이 SimpleDateFormat에 저장된 패턴정보와 일치하지 않은 경우 ParseException 발생 - 일반예외이므로 반드시 예외처리해야함.
			birthday=dateFormat.parse(sc.nextLine());
		}catch (ParseException e) {
			System.out.println("[에러] 생년원일을 형식에 맞게 입력해주세요.");
			System.exit(0);
		} finally {
			sc.close();
		}
		
		//살아온 날짜를 계산하여 출력
		long day = (System.currentTimeMillis()-birthday.getTime())/(1000*60*60*24);
		
		System.out.println("[결과] 태어난지 ["+day+"일]이 지났습니다.");
		
		}
	}
	
