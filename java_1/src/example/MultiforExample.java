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
		
		loop:for(int i=1; i<=9; i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) continue loop;
				System.out.print("★");
			}
			System.out.println();
		}			
		
		System.out.println();
		System.out.println("=============");

		//<강사풀이>
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=2*2-1;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
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

		System.out.println("=============");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j || i+j==6) {
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








