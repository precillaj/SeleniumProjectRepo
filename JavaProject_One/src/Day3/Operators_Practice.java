package Day3;

public class Operators_Practice {

	public static void main(String[] args) {
		
		// Logical Operators
		boolean x=true;
		boolean y=false;
		
		System.out.println("x && y -> " + (x && y));
		System.out.println("x || y -> " + (x || y));
		System.out.println("!x -> " + (!x));  // not x "x value is true so not x value is false
		System.out.println("!y -> " + (!y));
		
		boolean b1 = 10>20;
		System.out.println("10>20 -> " + b1);
		
		boolean b2 = 100>20;
		System.out.println("100>20 -> " + b2);
		
		System.out.println("b1 && b2  -> " + (b1 && b2));
		System.out.println("b1 || b2  -> " + (b1 || b2));
		
		System.out.println( "(10>20) && (10>20) -> " + ((10>20) && (10>20)));
	}

}
