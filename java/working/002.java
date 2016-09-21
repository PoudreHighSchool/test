package ehuler;

import java.util.Scanner;

public class main {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void p(String text)
	{
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		int num1 = 1, num2 = 2, tmp, sum = 2;
		while(num2 < 4000000)
		{
			tmp = num1 + num2;
			num1 = num2;
			num2 = tmp;
			if(num2 % 2 == 0)
			{
				sum += num2;
			}
		}
		p("" + sum);
	}
}
