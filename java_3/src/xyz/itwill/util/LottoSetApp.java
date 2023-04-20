package xyz.itwill.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//1~45 범위의 정수 난수값을 6개 제공받아 출력하는 프로그램 작성
//=> 6개의 난수값은 서로 중복되지 않도록 작성하며 오름차준 정렬하여 출력

public class LottoSetApp {
	
	public static void main(String[] args) {
		//Integer 객체만 요소로 저장 가능한 Set 객체(HashSet 객체) 생성
		Set<Integer> lottoset = new HashSet<Integer>();
		Random random = new Random();
		
		while(true) {
			//1~45 범위의 난수값(Integer 객체)을 Set 객체의 요소로 저장
			//=> Set 객체에는 동일한 객체를 요소로 저장 불가.
			lottoset.add(random.nextInt(45)+1);
			if(lottoset.size()==6) break;	//Set 객체에 저장된 요소의 갯수가 6인 경우 반복문 종료
		}	//정렬을 할 수 없어서 다른 걸로 만들어줘야함.
		
		//Set.toArray(E[] a) : Set 객체에 저장된 모든 요소값(객체)를 매개변수로 전달반은 배열요소에 저장하는 메소드(= Set 객체를 배열로 변환)
		Integer[] lotto = lottoset.toArray(new Integer[0]);
		//그러면 여기까지 Set객체가 배열이된것.
		
		//Arrays.sort(Object[] a) : 매개변수로 전달받은 배열의 요소값을 정렬하는 메소드
		Arrays.sort(lotto);
		
		//Arrays.toString(Object[] a) : 매개변수로 전달받은 배열의 요소값을 문자열로 변환하여 반환하는 메소드
		System.out.println("행운의 숫자 = "+Arrays.toString(lotto));
	}

}
