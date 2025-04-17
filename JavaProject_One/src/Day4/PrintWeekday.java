package Day4;

public class PrintWeekday {

	public static void main(String[] args) {
		
		//int dayofweek = 3;
		/*
		if (dayofweek == 1)
		{
			System.out.println("Monday");
		}
		else if (dayofweek==2)
		{
			System.out.println("Tuesday");
		}
		else if (dayofweek==3)
		{
			System.out.println("Wednesday");
		}
		else if (dayofweek==4)
		{
			System.out.println("Thursday");
		}
		else if (dayofweek==5)
		{
			System.out.println("Friday");
		}
		else if (dayofweek==6)
		{
			System.out.println("Saturday");
		}
		else if (dayofweek==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("INVALID");
		}
		
		
		//Using Switch case 
		switch (dayofweek)
		{
			 case 1 : System.out.println("Monday");
			 break;
			 case 2 : System.out.println("Tuesday");
			 break;
			 case 3 : System.out.println("Wednesday");
			 break;
			 case 4 : System.out.println("Thusday");
			 break;
			 case 5 : System.out.println("Friday");
			 break;
			 case 6 : System.out.println("Saturday");
			 break;
			 case 7 : System.out.println("Sunday");
			 break;
			 default : System.out.println("INVALID"); 				 
		}
		*/
		
		String dayoftheweek = "Saturday";
		
		switch (dayoftheweek)
		{
			 case "Monday" : System.out.println(1);
			 break;
			 case "Tuesday" : System.out.println(2);
			 break;
			 case "Wednesday" : System.out.println(3);
			 break;
			 case "Thusday" : System.out.println(4);
			 break;
			 case "Friday" : System.out.println(5);
			 break;
			 case "Saturday" : System.out.println(6);
			 break;
			 case "Sunday" : System.out.println(7);
			 break;
			 default : System.out.println("INVALID"); 				 
		}		
		
	}

}
