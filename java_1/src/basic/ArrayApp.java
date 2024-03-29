package basic;

//Java 자료형 : 원시형(Primitivetype)과 참조형(Reference type)
//=>원시형 : 값을 표현하기 위한 자료형 : byte, char, short, int, long,float, double, boolean
//=>참조형 : 특정 대상을 표현하기 위한 자료형 - 배열(Array), 클래스(class), 인터페이스(interface), 나열형(Enum)

//기본형 변수 : 원시형(기본형)으로 생성된 변수 - 값을 저장하기 위한 변수(실제 값을 변수안에 저장)	ex) int num =10;
//참조형 변수 : 참조형으로 생성된 변수 - 특정 대상의 메모리 주소값을 저장하기 위한 변수		ex) String name="홍길동";
//=> 힙 영역에 생성된 배열 또는 객체의 메모리 주소를 저장하기 위해 저장하여 접근하기 위해 사용
//=> 참조변수는 비교연산자를 사용하여 비교할 경우 메모리 주소 비교
//=> 참조변수의 배열 또는 객체를 저장하지 않을 경우 초기값으로 null 을 저장한다.


//배열(Array) : 같은 자료형의 값을 여러개 저장하기 위한 메모리를 할당받기 위해 사용하는 자료형 (참조형)
public class ArrayApp {
	public static void main(String[] args) {
		//1차원 배열을 생성하여 참조변수에 생성된 배열의 메모리 주소(Hashcode)를 저장
		//형식) 자료형[] 참조변수=new 자료형[갯수];
		
		int[] num=new int[3];	//정수값 3개를 저장할 수 있는 메모리 할당해주세요 (이때, 자료형의 단위는 같아야함)
		
		//참조변수에 저장된 값을 출력할 경우 "자료형@메모리주소" 형식의 문자열로 변환되어 출력된다.
		//ex) num = [I@6a5fc7f7
		System.out.println("num = "+num);
		
		System.out.println("=====================================================================");
		

		//참조변수와 배열의 요소를 구분하는 첨자를 사용하여 배열 요소에 접근 가능
		//형식) 참조변수[첨자] - 배열의 요소에 접근 
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);
		System.out.println("num[2] = "+num[2]);
		//System.out.println("num[3] = "+num[3]); 		//ArrayIndexOUtofBoundsException (예외발생)=> 프로그램 강제 종료
		//배열의 요소를 구분하는 첨자를 잘못 사용한 경우 ArrayIndexOUtofBoundsException 발생
		//=> 예외가 발생된 경우 프로그램 강제 종료
		
		
		//참조변수.length : 배열 요소의 개수를 제공하는 표현식
		System.out.println("num.length = "+num.length);
		
		System.out.println("=====================================================================");

		int index=0;
		//배열 요소를 구분하는 첨자는 변수 또는 연산식 사용하여 표현 가능
		num[index]=10;
		num[index+1]=20;
		num[index+2]=30;
		
		//요소의 개수가 정해져 있으므로 반복문을 사용할때, for문을 사용.
		//for문을 사용하여 배열 요소에 대한 일괄처리를 실행.
		//for 구문의 초기식, 조건식, 증감식에서 사용하는 변수를 첨자로 표현하여 일괄처리.
		for(int i=0;i<3;i++) {		//요소는 0부터 시작해서 0~2까지이기 때문에 (요소개수-1)까지로 셈
			System.out.println("num["+i+"] = "+num[i]);
		}
		
		System.out.println("=====================================================================");

		//배열 생성시 배열 요소의 기본값 대신 원하는 초기값 저장 가능
		//형식(정석식))  차료형[] 참조변수=new 자료형[]{초기값, 초기값, ... };
		//블럭 내부에 작성된 초기값의 개수만큼 배열에 요소의 개수가 지정된다.
		
		int[] su1=new int[] {10,20,30};
		
		for(int i=0;i<su1.length;i++) {
			System.out.println("su1["+i+"] = "+su1[i]);
		}
		
		System.out.println("=====================================================================");

		//블럭 내부에 값을 나열하여 배열 생성 가능
		//형식(간편식))  자료형[] 참조변수={초기값, 초기값, ...};
		int[] su= {10,20,30};
		
		//Java에서는 배열을 일괄처리하기위해 향상된 for구문을 제공한다.
		//형식)  for(자료형 변수명 : 참조변수){ 명령; ...}		
		//이때의 변수명은 요소값들을 일시적으로 저장할 수 있는 변수명을 일시적으로 제공.
		//=> 참조변수에 저장된 배열의 요소값을 **커서(cursor)**를 사용하여 차례대로 하나씩 제공받아 변수에 저장하여 일괄처리하는 반복문
		//=> 배열의 모든 요소값을 제공받은 후 반복문 종료 (=참조변수(배열)에서 더이상 얻을 수 있는 요소값이 없을 경우 반복문 종료)
		// 따라서, (계산, 출력)에 대한 일괄처리만 가능하다.
		
		for(int temp:su) {
			System.out.println(temp+"\t");
			
		}
		
		System.out.println();
		System.out.println("=====================================================================");

		int[] array= {54,70,64,87,96,21,65,76,11,34,56,41,77,80};
		
		//배열의 모든 요소값에 대한 합계를 계산하여 출력하는 프로그램 작성
		int tot=0;
		
		for(int i=0;i<array.length;i++) {
			tot+=array[i];		//array[i] 는 배열의 요소
		}
		
		System.out.println("합계 = "+tot);
		
		System.out.println("=====================================================================");
		
		//배열 요소값이 30~60 범위의 정수값이 저장된 요소의 개수를 계산하여 출력하는 프로그램
		//향상된 for문 사용.
		
		int count=0;
		
		for(int element : array) {		//배열요소를 받아서 element에 저장
			if(element>=30 && element<=60) {
				count++;
			}
		}
		System.out.println("30~60 범위의 요소의 개수 = "+count);
		
	}

}
