package Day2;

public class Practice_Datatypes {

	public static void main(String[] args) {

		// Numeric Datatypes
		
		//int
		int a=100, b=200;
		System.out.println("Value of A = " +a);
		System.out.println("Value of A = " +b);
		System.out.println("SUM of A+B = " + (a+b));
		
		//Byte, Short, Long
		byte byt = 125;
		System.out.println("Value of Byte variable = " + byt);
		
		short shrt = 3235;
		System.out.println("Value of Short variable = " + shrt);
		
		long lng = 2323232323L; //end with L/l which represents long datatype,L stands for Literal
		System.out.println("Value of Long variable = " + lng);
		
		//Decimal numbers - Float, Double
		float flt = 15.5f; //end with f which represents float datatype,f stands for Literal
		System.out.println("Value of Float variable = " + flt);
		
		double dbl = 153433.44465666666778; 
		System.out.println("Value of Double variable = " + dbl);
		
		// char, String
		char chr = 'A'; 
		System.out.println("Value of char variable = " + chr);
		//char chr1 = 'ABC' // invalid
				
		String str = "Precilla Jebamani";
		System.out.println("Value of String variable = " + str);
		//String str1 = 'ABC' // invalid as text is not given within double quotes
		//String str2 = "A" ;// valid
		
		// Boolean data type
		boolean Bln = true, Bln2 = false;
		System.out.println("Value of boolean variable = " + Bln);
		System.out.println("Value of boolean variable = " + Bln2);
		//boolean Bln3 = "True"; // not valid as given within double quotes and treated as string so
		//String Bln4 = true ; // not valid as text is not within double quotes
		
		
	}

}
