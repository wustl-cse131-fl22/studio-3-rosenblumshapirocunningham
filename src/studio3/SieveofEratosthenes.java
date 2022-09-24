package studio3;

import java.util.Scanner;

public class SieveofEratosthenes {
	
	public static void main(String[] args) { 

	Scanner in = new Scanner(System.in);	
	
	System.out.println("Look for primes up to what number? ");
	
	int number = in.nextInt();
	
	int[] sieve = new int [number];
	boolean[] prime = new boolean [number];
	
	for(int v = 0; v<= number; v++)
	{
		sieve [v] = v;
	}
	
	
	for(boolean v = true; sieve[v] % n != 0; v++)
	{
		prime [v] = v;
		
	}
	
	for(int n=2; n<number;  n++)
	{	
		for (int v=0; v<=number; v++)
		{
			if (sieve[v] % n != 0) 
			{
				boolean[v]
			}
			
		
		}
		
		
	
	 }
		
		
	}
	




}






