package basic;

//for문 : 조건에 의해 명령을 반복실행

public class ForApp {
	public static void main(String[] args) {
		//"Java Programming"을 화면에 출력
		System.out.println("Java Programming");
		
		System.out.println("===========================================");
		
		//"Java Programming"을 화면에 5번출력 =>유지보수의 효율성낮음(비효유적)
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
		
		
		System.out.println("===========================================");

		
		for(int i=1, j=5; i<=3; i++,j--) {		//조건식은 &&, ||로 연결시켜야 함(, 쓰면X)
			System.out.println("i = "+i+", j = "+j);
		}
		
		System.out.println("===========================================");

		int i=1;		//for 구문에 상관없이 계속 존재
		
		for(i=1; i<=4; i++) {		//for(;i<=;i++) =>로 사용 가능. 위에 int i=1로 선언했기 때문에 for문에서는 초기식 선언 안해줘도 됨.
			System.out.println(i+"\t");	
		}		//i 변수에 [5]가 저장된 경우 반복문 종료.
		
		//여기는 i=5라는 값이 저장되어 있음.(위의 for문에서 i++로 i값이 증가했기 때문)
		
		for(;i>=1;i--) {		//초기식 생략. 이때의 i=5.
			System.out.println(i+"\t");
		}
		
		System.out.println("===========================================");
		
		
		//조건식이 생략된 경우는 무조건 참으로 처리 - 무한루프
		for(;;) {//초기식, 조건식, 증감식 전부 생략
			System.out.println("무한 반복되어 실행되는 명령");
			
		}
		
		System.out.println("===========================================");
		// 위의 무한반복코드 때문에 실행되지 않는 코드가 됨.(읽어지지 않는 코드이기 때문)
		
	}
}



