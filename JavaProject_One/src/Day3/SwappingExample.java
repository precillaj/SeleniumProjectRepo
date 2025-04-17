package Day3;

public class SwappingExample {

	public static void main(String[] args) {
		
		int a=6, b=9, c;
		
		// Way 1 - Using Temp variable
		/*
		c=a;
		a=b;
		b=c;
		System.out.println("Way 1 - A = " + a);
		System.out.println("Way 1 - B = " + b); */
		
		// Way 2 
		/*
		a = a+b;   	// a holds the sum of both 15
		b = a-b;	// b = 15-9 = 6
		a = a-b;	// a = 15-6 = 9
		System.out.println("Way 2 - A = " + a);
		System.out.println("Way 2 - B = " + b); */
		
		
		// Way 3 - Swap using XOR
		
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;	
		System.out.println("Way 3 - A = " + a);
		System.out.println("Way 3 - B = " + b);
		
	}

}
