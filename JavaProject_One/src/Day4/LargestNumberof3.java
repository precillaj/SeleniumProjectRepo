package Day4;

public class LargestNumberof3 {

	public static void main(String[] args) {
		
		int a=1000, b=5000, c=15000;
		
		if (a>b && a>c) 
		{
			System.out.println("A is the largest number   -> " + a);
		}
		else if (b>a && b>c) 
		{
			System.out.println("B is the largest number   -> " + b);
		}
		else
		{
			System.out.println("C is the largest number   -> " + c);
		}

	}

}
