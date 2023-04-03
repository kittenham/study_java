package example;

public class ForExample {
	public static void main(String[] args) {
		//본인 이름을 화면에 7번 출력하세요.
		//ex) 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동

		for(int i=1;i<8;i++) {
			System.out.print("김예지 ");
		}
		

		System.out.println();
		System.out.println("=========================================");
		//1~10 범위의 정수 중 홀수를 화면에 출력하세요.
		//ex) 1     3     5     7     9

		for(int i=1;i<10;i+=2) {
			System.out.print(i+"\t");
		}
		
		//<추가 풀이>
		/*
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				System.out.print(i+"\t");				
			}
		}
		*/

		System.out.println();
		System.out.println("=========================================");
		//1~100 범위의 정수에서 3의 배수들의 합계와 5의 배수들의 합계를 계산하여
		//3의 배수의 합계에서 5의 배수의 합계를 뺀 결과값을 출력하세요.
		//ex) 결과 = 633
		
		/*
		int sum=0, sum2=0;		//계산 누적을 해 줄 것이기 때문에 초기선언을 0으로 해줘야함!

		for(int i=3;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
			
		for(int j=5;j<=100;j++) {
			if(j%5==0) {
				sum2+=j;
			}
		}	
		
		System.out.println("3의배수 합계 = "+sum+", 5의배수 합계 = "+sum2);
		System.out.println("3의배수 합계-5의배수 합계 = "+(sum-sum2));
		*/
		
		//<풀이>
		 int tot3=0, tot5=0;
		 for(int i=1;i<=100;i++){
		 	if(i%3==0) tot3+=1;
		 	if(i%5==0) tot5+=1;
		 }
		System.out.println("[결과] 3의배수 합계 - 5의배수 합계 = "+(tot3-tot5));
		
		

		System.out.println("=========================================");
		//구구단 중 7단을 화면에 출력하세요.
		//ex) 7 * 1 = 7
		//    7 * 2 = 14
		//    ...
		//    7 * 8 = 56
		//    7 * 9 = 63

		//<내풀이> => 단 지정을 안해줌.
		for(int j=1;j<10;j++){
			System.out.println(7+" * "+j+" = "+(7*j));
    	}
		
		//<풀이>
		int dan=7;
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}

		System.out.println("=========================================");
		//5!의 결과값을 출력하세요.(5! = 5 * 4 * 3 * 2 * 1)
		//ex) 5! = 120

		int sum3 = 1;
       		for (int i = 5; i >= 1; i--) {
            		sum3 = sum3 * i;

        	}
       		System.out.println("5!" + " = " + sum3);
		
       		
       	//<풀이>
       	int numf=5, fac=1;
       	for(int i=numf; i>=1; i--) {
       		fac*=1;
       	}

		System.out.println("=========================================");
		//두 변수에 저장된 정수값 사이의 정수들을 화면에 출력하세요.
		//단, 한 줄에 정수값이 7개씩 출력되도록 프로그램을 작성하세요.
		//ex) 36    27    38     39     40     41     42
		//    43    44    45     46     47     48     49
		//    50    51    52     53     54     55     56
		//    57
		int begin=36, end=57;
		

        	for(int i=begin; i<=end; i++) {
            		System.out.print(i+"\t");
            		if(i%7==0){			//만약 7번째에 오는 숫자가 7의 배수가 아니라면 7개씩 한줄에 출력이 안될 수도 있으므로.
                		System.out.println("");
            		}

            	}
		
        System.out.println();
        	
        //<풀이>
        int begin2=36, end2=57;
        int count=0;		// 출력갯수를 저장할 변수!
        
        for(int i=begin2; i<=end2; i++) {
    		System.out.print(i+"\t");
    		count++;				//
    		if(count%7==0) {		//한줄에 7개씩 출력 할 수 있도록 개수 지정!
    			System.out.println();
    		}
    			
    	}

        System.out.println();
		System.out.println("=========================================");	
	}
}





