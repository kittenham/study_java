package example;

public class Solo {
	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=6;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();

		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		
		
		
	}
}
