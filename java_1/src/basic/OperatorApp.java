package basic;

//연산자(Operator)

public class OperatorApp {
	public static void main(String[] args) {
		// 최우선 연산자 : 무조건 가장 먼저 연산 처리되는 연산자

		System.out.println("10+20*3 = " + (10 + 20 * 3));
		System.out.println("(10+20)*3 = " + ((10 + 20) * 3));

		System.out.println("===========================================");

		// <단항 연산자> : 피연산자의 개수 1개인 연산자
		// +
		// -
		// ~
		// !
		// ++
		// --
		// (자료형) : 강제 형변환 연산자
		// new : 객체 생성 연산자

		System.out.println("===========================================");

		int a1 = 10;
		System.out.println("a1 = " + a1);
		System.out.println("-a1 = " + (-a1)); // 변수값은 그대로 10이지만 출력만 -10으로 나옴

		// ~00110010 -> 11001101

		System.out.println("===========================================");

		System.out.println("20>10 = " + (20 > 10));
		System.out.println("20>10 = " + !(20 > 10));
		// !20 (정수에 !(Not))을 붙이면 error

		System.out.println("===========================================");

		int a2 = 10, a3 = 10;
		System.out.println("a2 = " + a2 + ", a3 = " + a3);

		++a2; // a2=a2+1;
		--a3; // a3=a3-1;

		// ++연산자와 --연산자는 피연산자 앞, 뒤에 둘 다 작성가능(복합연산 계산시 증감 순서만 달라짐)
		// 하나의 연산식으로 구현된 단일 명령인 경우 연산자의 위치는 연산 결과에 미영향

		a2++;
		a3--;

		System.out.println("a2 = " + a2 + ", a3 = " + a3);

		int a4 = 10, a5 = 10;
		System.out.println("a4 = " + a4 + ", a5 = " + a5);

		System.out.println("=====");
		int result1 = ++a4; // 전처리
		int result2 = a5++; // 후처리
		System.out.println("a4 = " + a4 + ", a5 = " + a5);
		System.out.println("a4+a5 = " + (a4 + a5));
		System.out.println("=====");
		System.out.println("result1 = " + result1 + ", result2 = " + result2);
		System.out.println("result1+result2 = " + (result1 + result2));

		System.out.println("===========================================");

		// <이항 연산자>
		// 산술 연산자
		int b1 = 20, b2 = 10;
		System.out.println(b1 + " * " + b2 + " = " + (b1 * b2));
		System.out.println(b1 + " / " + b2 + " = " + (b1 / b2));
		System.out.println(b1 + " % " + b2 + " = " + (b1 % b2));
		System.out.println(b1 + " + " + b2 + " = " + (b1 + b2));
		System.out.println(b1 + " - " + b2 + " = " + (b1 - b2));

		System.out.println("===========================================");

		// 이동 연산자
		// << (왼쪽 이동 연산자)
		// >>, >>> (오른쪽 이동 연산자)

		System.out.println("===========================================");

		// 비교(관계) 연산자
		System.out.println("20 > 10 = " + (20 > 10));
		System.out.println("20 < 10 = " + (20 < 10));
		System.out.println("20 >= 10 = " + (20 >= 10));
		System.out.println("20 >= 10 = " + (20 >= 10));
		System.out.println("20 == 10 = " + (20 == 10));
		System.out.println("20 != 10 = " + (20 != 10));

		System.out.println("===========================================");

		// 논리 연산자 : Bit 논리 연산자, 일반 논리 연산자
		// Bit 논리 연산자 : &, ^, |
		// 일반 논리 연산자 : &&, ||
		int c = 20;
		System.out.println("c = " + c);
			// && 연산자는, 첫번째 비교식이 거짓인 경우 두번째 조건식은 미실행된다.
		System.out.println("c >= 10 && c <=30 " + (c >= 10 && c <= 30)); // 범위 표현시, 어디서부터 어디까지로 따로따로 표현
		int d = -20;
		System.out.println("d = " + d);
		System.out.println("d >= 10 && d <=30 " + (d >= 10 && d <= 30));
			// || 연산자는 첫번째 비교식이 참인 경우 두번째 조건식은 미실행된다.
		System.out.println("d < 10 || d > 30 " + (d < 10 || d > 30));

		System.out.println("===========================================");

		// 삼항 연산자
		// 형식) 조건식 ? 참 : 거짓
		// 조건식 :

		int d1 = 20, d2 = 10;
		// int d1=10, d2=20;
		System.out.println("큰 값 = " + (d1 > d2 ? d1 : d2));

		int d3 = 10;
		System.out.println("d3 = " + (d3 % 2 == 0 ? "짝수" : "홀수"));

		System.out.println("===========================================");

		
		// 대입 연산자
		
		int e=10;
		System.out.println("e="+e);
		
		e+=20;		//e=e+20;  둘 다 결과값은 같지만 앞에는 연산식이 하나, 뒤에는 두개임. 뒤에 있는 식은 형변환이 일어날 수도 있음
		System.out.println("e="+e);
		System.out.println("===========================================");
		
		
		
	}

}
