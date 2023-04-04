package basic;

// 1~45 범위의 정수형 난수값을 6개 제공받아 출력하는 프로그램 작성
// 난수는 중복가능성O 
//따라서, 6개의 난수값이 서로 중복되지 않도록 작성하며 오름차순 정렬sort하여 출력해보자.
//정렬sort : 값을 차례대로 나열하는 기능 - 오름차순(Ascending Sort), 내림차순(Descending Sort) 정렬 有

public class LottoApp {
	public static void main(String[] args) {
		int[] lotto=new int[6];		//6개의 정수 난수값을 저장하기 위한 배열 생성해서 lotto라는 참조변수에 저장.
		
		//1~45범위의 정수난수를 6개 제공받아 배열 요소에 차례대로 저장
		for(int i=0;i<lotto.length;i++) {		//새로운 난수를 저장한 배열 요소를 표현할 첨자의 반복
			while(true) {			
				//요소에 저장된 새로운 난수값을 기존 요소의 난수값과 "모두 비교"하여 
				//같은 값이 있는 경우, 반복문에서 새로운 난수값을 다시 제공받아 저장
				//-> 새로운 난수값이 기존의 모든 난수값과 다른경우 반복문을 종료
			lotto[i]=(int)(Math.random()*45)+1;
			
			boolean result=false;		//중복상태를 저장하기 위한 변수 - false : 미중복, true : 중복
			
			for(int j=0;j<i;j++) {		//기존 난수값이 저장된 요소의 첨자를 표현하기 위한 반복문. //새로운 난수(i) 전까지.
				if(lotto[i]==lotto[j]) {
					result = true;
					break;
				}
					
				}
			if(!result) break;		//새로운 난수가 기존 난수값과 중복되지 않는 경우, while문을 종료. => 이렇게 하면 절대 중복값이 나오지 않음.
		}
		}
		
		//배열의 모든 요소값을 서로 비교하여 오름차순 정렬되도록 배열 요소값을 바꾸어 저장
		//=> 선택 정렬 알고리즘(selection Sort Algorithm)을 사용하여 오름차순 정렬
		
		for(int i=0;i<lotto.length-1;i++) {		//(비교하기 위한 배열 요소의 첨자를 표현하는 반복문 : 0~끝-1 (마지막은 비교할필요X))
			for(int j=i+1;j<lotto.length;j++) {						//피비교 요소의 첨자를 표현하는 반복문 : 비교+1 ~ 끝
				// lotto[i] : 비교요소, lotto[j] : 피비교요소
				if(lotto[i] > lotto[j]) {		//요소에 저장된 값을 서로 바꾸어 저장 = Swap
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
				
			}
		}
		
		//출력
		//배열의 모든 요소값 출력
		System.out.println("행운의 숫자 >> ");
		for(int number : lotto) {
			System.out.print(number+"  ");
		}
		
		System.err.println();
	}
}
