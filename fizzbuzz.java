public class fizzbuzz
{
	



public static void main(String[] args)
		{
	int x;
	
	for (x = 1; x<=100; x++)
	{
		int a = x % 15;
		int b = x % 5;
		int c = x % 3;
		
		if (a == 0)
		{
			System.out.println("Fizzbuzz");
		}
	
		
		else if (b == 0)
		{
			System.out.println("Buzz");
		}
		
		else if (c == 0)
		{
			System.out.println("Fizz");
		}
		
		else if(c != 0)
		{
			System.out.println(" " +x);
		}
	}
	
	
		}
}