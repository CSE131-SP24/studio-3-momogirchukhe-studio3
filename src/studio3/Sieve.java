package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number: ");
			int n = in.nextInt();
		
		boolean[] prime = new boolean[n];
		for (int k=0; k<n; k++)
			{
			prime[k] = true;
			//System.out.println(prime[k]);
			}
		for (int i=0; i<Math.sqrt(n); i++)
		{
			if (prime[i]==true)
			{
				for(int j=i*i;j<n;j=j+i)
				{
					prime[j] = false;
				}
			}
		}
		for (int x=0; x<n; x++)
		{
			System.out.println(prime[n]);
		}
	}

}
