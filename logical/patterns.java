import java.util.Scanner;

class patterns{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:-");
		int n = scan.nextInt();
		scan.close();
		 /* pattern 1 :
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.println(j);	
			}
			System.out.print("\n");
		} */ 
		for (int i = 1; i <= n; i++) { 
			for (int j = 1; j <= 2 * n - 1; j++) { 
				if (j >= n - (i - 1) && j <= n + (i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); 
		}
		
		
		
	}
}