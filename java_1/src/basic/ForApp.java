package basic;

//for문 : 조건에 의해 명령을 반복실행

public class ForApp {
	public static void main(String[] args) {
		//"Java Programming"을 화면에 출력
		System.out.println("Java Programming");
		
		System.out.println("===========================================");
		
		//"Java Programming"을 화면에 5번출력
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		
		System.out.println("===========================================");

		//"Java Programming"을 화면에 5번출력
		for(int i=1;i<=5;i++) {		//int i는 for문 안의 변수이기 때문에 이 for문 안에서만 사용할 수 있음
			System.out.println("Java Programming");
		}
		
		System.out.println("===========================================");

		//"Java Programming"을 화면에 5번출력
		for(int i=2;i<=10;i+=2) {		//int i는 for문 안의 변수이기 때문에 이 for문 안에서만 사용할 수 있음
			System.out.println("Java Programming");
		}

		System.out.println("===========================================");
		//"1	2	3	4	5"를 화면에 출력
		for(int i=1;i<=5;i++) {
			System.out.print(i+"\t");
		}
		
		System.out.println("");	
		System.out.println("===========================================");


		//"5	4	3	2	1"를 화면에 출력
		//방법1
		
		//방법2
		
		System.out.println("===========================================");

		//"2	4	6	8	10"를 화면에 출력
		//방법1
		
		//방법2
		
		//결과를 만드는 방법은 여러가지지만 그 중에서 효율적인 방법 찾아보기~
		
		System.out.println("===========================================");

		//1~100 범위의 정수들의 합계를 계산하여 출력하는 프로그램 작성 = 1+2+3+...+99+100=?
		int tot=0;		//정수들의 합계를 저장하기 위한 변수
		for(int i=1;i<=100;i++) {
			tot+=i;		//=> tot라는 변수에는 1~100까지의 연산결과가 저장된다.
		}
		System.out.println("1~100 범위의 정수들의 합계 = "+tot);
		
		System.out.println("===========================================");

		//두 변수에 저장된 정수들의 범위 합계를 계산하여 출력하는 프로그램 작성
		int begin=20, end=80;
		
		int sum=0;
		for(int i=begin;i<=end;i++) {
			sum+=i;
		}

		System.out.println(begin+"~"+end+" 범위의 정수들의 합계 = "+sum);
		
		System.out.println("===========================================");
		
		//시작값이 종료값보다 큰 경우 에러 메세지를 출력하고 프로그램을 강제로 종료
		//방법1
		int begin2=80, end2=20;
		
		if(begin2>end2) {
			System.out.println("[에러]시작값이 종료값보다 작아야 합니다.");
			System.exit(0); 		//프로그램 강제 종료 메소드 호출
		}
		
		int sum2=0;
		for(int i=begin2;i<=end2;i++) {
			sum2+=i;
		}

		//방법2 - 시작값이 종료값보다 큰 경우 두 변수에 저장된 값을 서로 바꾸어 저장되도록 작성
	
		if(begin2>end2) {
			//치환 알고리즘(Swap Algorithm) : 변수값을 서로 바꾸어 저장하는 알고리즘
			//알고리즘(Algorithm) : 프로그램 작성시 발생되는 문제를 해결하기 위한 명령의 흐름
			int temp=begin2;
			begin2=end2;
			end2=temp;
		}
		System.out.println(begin2+"~"+end2+" 범위의 정수들의 합계 = "+sum2);
		
		
	}
}

