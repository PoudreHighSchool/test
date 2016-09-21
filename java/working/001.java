package ehuler;

public class main {
	
	public static void main(String[] args) {
		int sum = 23, tmp = 0;
		for (int i = 10; i < 1000; i++)
		{
			if(mults(i)){
				tmp = sum;
				sum = tmp + i;
			}
		}
		System.out.println(sum);
	}

	public static boolean mults(int num)
	{
		if (num % 3 == 0 || num % 5 == 0) return true;
		else return false;
	}

}
