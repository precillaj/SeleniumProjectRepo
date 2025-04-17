package Day3;

public class Practice_TernaryOperator {

	public static void main(String[] args) {

		// var=exp ? restlt1 : result2
		
		//Eg 1
		int a=200, b=300;
		int result = (a<b) ? a:b;   // If expression a>b is True then 'a' value is assigned to result else 'b'
		System.out.println(result);
		
		//Eg 2
		int i = (1!=1) ? 500 : 100;
		System.out.println(i);
		
		//Eg 3
		int age = 15;
		String Vote_eligibility = (age >= 18) ? "Eligible for voting" : "Not Eligible for voting"; 
		System.out.println(Vote_eligibility);
		
		
	}

}
