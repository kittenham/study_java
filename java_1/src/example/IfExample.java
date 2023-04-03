package example;

public class IfExample {
	public static void main(String[] args) {
		//변수에 저장된 문자값을 출력하세요.
		//단, 변수에 저장된 문자값이 소문자인 경우 대문자로 변환하여 출력하세요.
		char mun='x';
		
		if(mun>='a' && mun<='z') {
                	System.out.println(Character.toUpperCase(mun));
           	} else{
                	System.out.println(mun);
            }
		
		//<풀이>
		//소문자와 대문자의 차이 = 32
		
		mun-=32;	
		
		if(mun>='a' && mun<='z') {		//변수값이 영문자 소문자인 경우
			mun-=32;		//변수값을 32 감소시키자(형변환 일어나지 X)
							//mun=mun-32	=> 하면X
							//mun=(char)(mun-32)	=>가능
			
		}
		
			
		System.out.println("mun = "+mun);
		System.out.println("============================================================");
		//변수에 저장된 정수값이 4의 배수인지 아닌지를 구분하여 출력하세요.
		int num=345644;
		
		if(num%4==0) {
                	System.out.println(num + "은 4의 배수입니다.");
           	} else{
                	System.out.println(num+"은 4의 배수가 아닙니다.");
           	}

		System.out.println("============================================================");
		//올해가 평년인지 윤년을 구분하여 출력하세요.
		// => 년도를 4로 나누어 나머지가 0인 경우 윤년
		// => 위 조건을 만족하는 년도 중 100으로 나누어 나머지가 0인 경우 평년
		// => 위 조건을 만족하는 년도 중 400으로 나누어 나머지가 0인 경우 윤년
		
		int year=2000;
		
		/*
		if(year%4==0){
			System.out.println(year+"은 윤년입니다.");
            if(year%100==0){
                System.out.println(year+"은 평년입니다.");
            } else if ((year%400)==0) {
                System.out.println(year+"은 윤년입니다.");
            }
        }
		*/ // => 틀린 풀이. 다시 생각해보기
		
		//<풀이>
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("[결과]"+year+"년은 윤년입니다.");
		} else {
			System.out.println("[결과]"+year+"년은 평년입니다.");
		}
		

		System.out.println("============================================================");
		//이름이 [홍길동]인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받은 경우
		//총점과 평균, 학점을 계산하여 이름, 총점, 평균, 학점을 출력하세요.
		// => 국어,영어,수학 점수 중 하나라도 0~100 범위가 아닌 경우 프로그램 강제 종료
		//    System.exit(0) : 프로그램을 강제로 종료하는 메소드
		// => 평균을 이용한 학점 계산 : 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
		// => 평균은 소숫점 두자리까지만 출력하고 나머지는 절삭 처리 하세요.
		
		String name="홍길동";
		int kor=89, eng=93, math=95;
		int total=(kor+eng+math);
		double ave = (total/3.0);
		
		if((kor<0||kor>100)||(eng<0||eng>100)||(math<0||math>100)) {
				//과목 점수 입력을 받자마자 정상인지 아닌지 판단 할 수 있도록 grade if문 전에 입력해줘야함.
			System.out.println("[에러] 0~100 범위의 벗어난 비정상적인 점수가 입력되었으므로 프로그램을 강제 종료합니다.");
			System.exit(0);
		}
		
		String grade="";
		
		if(ave>=0 && ave<=100) {
			
			if(ave>=90 && ave<=100) {
				grade = "A";
			}
			else if(ave>=80 && ave<=89) {
				grade = "B";
			}
			else if(ave>=70 && ave<=79) {
				grade = "C";
			}
			else if(ave>=60 && ave<=69) {
				grade = "D";
			}
			else if(ave>=0 && ave<=59) {
				grade = "F";
			}
		}
		
		
		System.out.println("이름 : "+name+", 총점 : "+total+", 평균 : "+(int)(ave*100)/100.0+", 학점 = "+grade);
		
		
	//<풀이>
		
		String name2="홍길동";
		int kor2=89, eng2=93, math2=95;
		int total2=(kor2+eng2+math2);
		double ave2 = (total2/3.0);
		
		if((kor2<0||kor2>100)||(eng2<0||eng2>100)||(math2<0||math2>100)) {
			//과목 점수 입력을 받자마자 정상인지 아닌지 판단 할 수 있도록 grade if문 전에 입력해줘야함.
			//친절하지 못함. 과목을 통째로 검수했기 때문.=> 사용자에게 친절한 화면을 제공하려면 과목을 각각 검수해야함.
		
		System.out.println("[에러] 0~100 범위의 벗어난 비정상적인 점수가 입력되었으므로 프로그램을 강제 종료합니다.");
		System.exit(0);
	}
		//=>이 경우에는 과목 각각을 검수하지만, 국어+수학이 잘못된 점수였을때 국어만 검사후 프로그램이 종료되어 수학은 검수를 못하는 단점이 있음.
		//따라서, 검증결과를 저장하기 위한 변수 지정의 필요가 있음.
		if(kor2<0||kor2>100) {
		System.out.println("[에러] 0~100 범위의 벗어난 비정상적인 국어점수가 입력되었으므로 프로그램을 강제 종료합니다.");
		System.exit(0);
	}
		if(eng2<0||eng2>100) {
		System.out.println("[에러] 0~100 범위의 벗어난 비정상적인 영어점수가 입력되었으므로 프로그램을 강제 종료합니다.");
		System.exit(0);
	}
		if(math2<0||math2>100) {
		System.out.println("[에러] 0~100 범위의 벗어난 비정상적인 수학점수가 입력되었으므로 프로그램을 강제 종료합니다.");
		System.exit(0);
	}
		
		//검증 결과를 저장하기 위한 변수를 지정(boolean)-> flase:검증성공, true:검증실패 (내가 약속하는것)
		boolean vaild=false;
		
		if(kor2<0||kor2>100) {
			System.out.println("[에러] 0~100 범위의 벗어난 비정상적인 국어점수가 입력되었으므로 프로그램을 강제 종료합니다.");
			System.exit(0);
			vaild=true;
		}
			if(eng2<0||eng2>100) {
			System.out.println("[에러] 0~100 범위의 벗어난 비정상적인 영어점수가 입력되었으므로 프로그램을 강제 종료합니다.");
			System.exit(0);
			vaild=true;
		}
			if(math2<0||math2>100) {
			System.out.println("[에러] 0~100 범위의 벗어난 비정상적인 수학점수가 입력되었으므로 프로그램을 강제 종료합니다.");
			System.exit(0);
			vaild=true;
		}
		

		
		String grade2="";
		switch((int)ave/10){
		case 10:
		case 9: grade2="A"; break;
		case 8: grade2="B"; break;
		case 7: grade2="C"; break;
		case 6: grade2="D"; break;
		default: grade2="F";
		}
		
		System.out.println("이름 : "+name2+", 총점 : "+total2+", 평균 : "+(int)(ave2*100)/100.0+", 학점 = "+grade2);

		

		System.out.println("============================================================");
	}
}