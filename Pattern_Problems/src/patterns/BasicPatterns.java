package patterns;

public class BasicPatterns {

	public static void main(String[] args) {
		 int n = 5;
		 
		 System.out.println("Pattern 1:");
		 pattern1(n);
		 System.out.println();
		 System.out.println("Pattern 2: ");
		 pattern2(n);
		 System.out.println();
		 System.out.println("Pattern 3: ");
		 pattern3(n);
		 System.out.println();
		 System.out.println("Pattern 4: Using spaces ");
		 pattern4(n);
	}
	
	 static void pattern1(int n) {
		for(int row = 1; row <=n ;row++) {
			for(int col = 1; col <=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	 
	 static void pattern2(int n) {
		 for(int row = 1; row <=n ;row++) {
				for(int col = n; col >=row; col--) {
					System.out.print("* ");
				}
				System.out.println();
			}
	 }
	 
	 static void pattern3(int n) {
		 for(int row = 1; row <= 2*n; row++) {
			 int total;
			 if(row > n) {
				 total = 2 * n -row;
			 } else {
				 total = row;
			 }
			for(int col = 0; col<total; col++){
				System.out.print("* ");
			}
			System.out.println();
		}
				
		 }
	 
	 static void pattern4(int n) {
		 
		 
		 for(int row = 1; row<=2*n; row++) {
			 int total;
			 if(row>n) {
				 total = 2 * n - row;
			 } else {
				total = row;
				 }
			 
			 int spaces = n - total;
			 for(int s = 0; s<spaces; s++) {
				 System.out.print(" ");
			 }
			for(int col = 0; col<total; col++) {
				System.out.print("* ");
			}
			System.out.println();
			 }
		 }
	 }
	 
	


