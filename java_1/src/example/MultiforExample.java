package example;

public class MultiforExample {
	public static void main(String[] args) {
		//★★★★★
		//★★★★
		//★★★
		//★★
		//★

		for(int i=5; i>=1; i--) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("★");
			}
			System.out.println();
		}


		System.out.println("===============================================================");
		//★★★★★	
		//☆★★★★		i<=j
		//☆☆★★★
		//☆☆☆★★
		//☆☆☆☆★
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=j) {
					System.out.print("★");
				}else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}

		System.out.println("===============================================================");
		//★
		//★★★
		//★★★★★
		//★★★★★★★
		//★★★★★★★★★
		
		lp:for(int i=1; i<=9; i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) continue lp;
				System.out.print("★");
			}
			System.out.println();
			

		}			

/*
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) break;		//이때의 break는 해당break를 포함하는 반복문 for(int j=1;j<=5;j++)만 종료함.
				System.out.println("i = "+i+", j = "+j);
			}
		}
*/
		System.out.println("===============================================================");
		//★☆☆☆★		1,1		5,1
		//☆★☆★☆		2,2		2,4
		//☆☆★☆☆		3,3
		//☆★☆★☆		4,2		4,4
		//★☆☆☆★		5,1		5,5
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.print("★");
				} else if(i+j==6) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}

		
		System.out.println("===============================================================");
	}
}








