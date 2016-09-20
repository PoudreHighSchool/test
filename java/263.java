package ehuler;

import java.util.Scanner;

public class main {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void p(String text)
	{
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		boolean potato = true;
		int counter = 3;
		while(potato)
		{
			if (findPrime(counter))
			{
				//Initial Prime Found
				if(sexyPair(counter))
				{
					//First pair found
					if(sexyPair(counter + 6))
					{
						//second pair found
					}
				}
			}
		}
	}
	
	public static boolean sexyPair(int n)
	{
		if (findPrime(n + 6))
		{
			return true;
		}
		else return false;
	}
	
	public static boolean prac(int num)
	{
		int counter = 0, tmp = 0;
		for(int i=1; i<=num; i++)
		{
			if(num % i==0)
			{
				tmp = counter;
				counter = tmp + 1;
			}
		}
		int[] nums;
		
		nums = new int[counter];
		counter = 0;
		tmp = 0;
		for(int i=0; i<=num -1; i++)
		{
			if(num % i==0)
			{
				nums[counter] = i;
				tmp = counter;
				counter = tmp + 1;
			}
		}
		
		for (int i = nums.length; i >= 0; i--)
		{
			
		}
		
		return false;
	}
	
	public static boolean canSum(int num, int arr[])
	{
		int counter = 0;
		int[] poo;
		for(int i = 0; i < arr.length; i++)
		{
			if( num == arr[i]) return true;
			else {
				for(int i1 = 0; i1 < arr.length; i1++)
				{
					if(num < arr[i1])
					{
						counter += 1;
					}
				}
				poo = new int[counter];
				counter = 0;
				for(int i1 = 0; i1 < poo.length; i1++)
				{
					poo[i1] = arr[i1];
				}
			}
		}

		return false;
	}
	
	public static boolean findPrime(int n)
	{
		boolean potato = true;
		for(int i = n - 1; i > 1; i--)
		{
			if( n % i == 0)
			{
				potato = false;
			}
		}
		return potato;
	}

}
