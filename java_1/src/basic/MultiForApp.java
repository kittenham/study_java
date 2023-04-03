package basic;

//다중for문(중첩for문)

public class MultiForApp {
	public static void main(String[] args) {
		int cnt=0;		//이동방법의 갯수를 저장하기 위한 변수
		
		for(int i=1;i<=3;i++) {		//A나라>>섬으로 가는 3가지 방법-반복문
			for(int j=1;j<=4;j++)	//섬>>B나라로 가는 4가지 방법 - 반복문
				cnt++;			// A>>B나라로 가는 총 방법 : 12번			
		}
		System.out.println("이동방법의 갯수 = "+cnt);
		
		System.out.println("===========================================");

		//★ 출력하기
		System.out.println("★");
		
		System.out.println("===========================================");

		
		//★★★★★★★ 출력하기
		System.out.println("★★★★★★★"); //별을 더 많이 출력하려면 효율적인 방법X
		
		System.out.println("===========================================");

		
		for(int i=1;i<=7;i++) {
			System.out.print("★");
		}
		System.out.println();
		
		System.out.println("===========================================");

		
		//★★★★★★★ 4줄 출력하기
		for(int j=1;j<=4;j++) {		//"행(Row)" 처리 위한 반복문
			for(int i=1;i<=7;i++) {		//"열(Colum)" 처리 위한 반복문
				System.out.print("★");
			}
			System.out.println();	//엔터가 되어야 한 행이 내려감
		}
		
		System.out.println("===========================================");

		//2★	3★	4★	5★	6★	7★	8★	9★ <9행 8열>
		//2★	3★	4★	5★	6★	7★	8★	9★ <9행 8열>
		//2★	3★	4★	5★	6★	7★	8★	9★ <9행 8열>
		//2★	3★	4★	5★	6★	7★	8★	9★ <9행 8열>
		//2★	3★	4★	5★	6★	7★	8★	9★ <9행 8열>
		//2★	3★	4★	5★	6★	7★	8★	9★ <9행 8열>
		//2★	3★	4★	5★	6★	7★	8★	9★ <9행 8열>
		//2★	3★	4★	5★	6★	7★	8★	9★ <9행 8열>

		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"★\t");		//열마다 바뀌는 숫자를 출력하고 싶을때.
			}
			System.out.println();
		}
		
		System.out.println();

		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=8;j++) {
				System.out.print(i+"★\t");		//행마다 바뀌는 숫자를 출력하고 싶을때.
			}
			System.out.println();
		}
		System.out.println();

		//2*1=2		3*1=3	4*1=4	... 	9*1=9	 <9행 8열>
		//2*2=4		3*2=6	4*2=8	... 	9*2=18	 <9행 8열>
		//2*3=6		3*3=9	4*3=12	... 	9*3=27	 <9행 8열>
		//...
		//
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");	
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		System.out.println("===========================================");
		
		//★★★★★
		//★★★★★
		//★★★★★
		//★★★★★
		//★★★★★
		//중첩반복문 사용시 디버깅 하면 반복순서 볼수있음~
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("===========================================");

		
		//★			i=1, 별=1
		//★★			i=2, 별=2
		//★★★		i=3, 별=3
		//★★★★		i=4, 별=4
		//★★★★★	i=5, 별=5
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("===========================================");
		//★★★★★
		//★★★★
		//★★★
		//★★
		//★
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=(6-i);j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println();
		

		
		System.out.println("===========================================");
		//☆☆☆☆★	i=1, 흰별=4, 검은별=1
		//☆☆☆★★	i=2, 흰별=3, 검은별=2
		//☆☆★★★	i=3, 흰별=2, 검은별=3
		//☆★★★★	i=4, 흰별=1, 검은별=4
		//★★★★★	i=5, 흰별=0, 검은별=5
		
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {		//for(int j=4;j<=(5-i);i--);
				System.out.print("☆");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("===========================================");
		//1 2 3 4 5  >>j
		//☆☆☆☆★	i=1, 흰별=4, 검은별=1
		//☆☆☆★★	i=2, 흰별=3, 검은별=2
		//☆☆★★★	i=3, 흰별=2, 검은별=3
		//☆★★★★	i=4, 흰별=1, 검은별=4
		//★★★★★	i=5, 흰별=0, 검은별=5
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {		//for(int j=4;j<=(5-i);i--);
				if(i+j<6) {			//검은별과 흰별의 경계에 있는 흰 별의 위치를 보고 (i,j) 행렬따져서 계산
					System.out.print("☆");
				} else {
				System.out.print("★");
				}	
			}
			System.out.println();
		}
		
		System.out.println("===========================================");
		
	}
}
