package Day3;

public class Practice_IncrementOperator {

	public static void main(String[] args) {
		
		// ++  Increment Operator
		int a=10;
		System.out.println(a);
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		int b=999;
		int result = b++;
		System.out.println(result);
		System.out.println(b);
		
		// Assignment Operators
		
		b+=5; // b=b+5
		System.out.println(b);
		
		b-=10; // b=b-10
		System.out.println(b);
		
		int c=200;
		c*=2;   // c=c*2
		System.out.println(c);
		
		c/=2;   // c=c/2
		System.out.println(c);
		
		c%=2;   // c=c%2
		System.out.println(c);
		
		// Difference b/w == and =
				// == -> relational (Comparison) operator returns True/False
				// = is a assignment operator
		
	}
	
	
}
