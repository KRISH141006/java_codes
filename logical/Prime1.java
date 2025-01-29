// WAJP to find out if give number is prime or not
import java.util.Scanner;
class Prime1
{
	boolean isPrime(int n){
		int count =0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}

		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println(new Prime1().isPrime(n));
		scan.close();
		
	}
}