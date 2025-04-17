package Day5;

public class PracticeLoops {

	public static void main(String[] args) {
		
		int i=1, j=2, x=10;
		
		// *********** While Loop ************
		
		/*// Eg 1		
		while (i<=10)
		{
			System.out.println("Hello -> "+ i);
			i++;
		} 
		
		// Eg 2
		while (j<=10)
		{
			System.out.println(j);
			j+=2;
		}
		
		// Eg 3
		while (i<=10)
		{
			if (i%2==0) 
			{
				System.out.println(i);				
			}
			i++;
		} 
		
		// Eg 4
		while (i<=10)
		{
			if (i%2==0) 
			{
				System.out.println("Even number -> " + i);				
			}
			else 
			{
				System.out.println("Odd number -> " + i);	
			}
			i++;
		} 
		
		// Eg 5
		while (x>=0)  	// 10...1 in descending order
		{
			System.out.println(x);
			x--;
		} */
		
		// *********** DO While Loop ************
		
		/*
		do
		{
			System.out.println(i);
			i++;
		}while (i<=10);  
		
		
		do
		{
			System.out.println(x);
			x--;
		}while (x>=0);    
		
		// *********** FOR Loop ************
		
		for(int a=1; a<=10 ; a++)	// 1...10 nos
		{
			System.out.println(a);
		} 
		
		for(int b=10; b>=0 ; b--)	// 10....1 nos
		{
			System.out.println(b);
		}	
		*/
		// Reverse a number
		int number = 12345;  
        int reverse = 0, count=0 ;
        
     // Handle 0 explicitly, since log10(0) is undefined
        if (number == 0) 
        {
            count = 1;
        } 
        else 
        {
	        for (; number != 0; number = number / 10) 
	        {
	            int digit = number % 10;
	            reverse = reverse * 10 + digit;
	            count++;
	        }
        }    
	        System.out.println("Reversed number: " + reverse); 
	        System.out.println(count);
        
	}

}
