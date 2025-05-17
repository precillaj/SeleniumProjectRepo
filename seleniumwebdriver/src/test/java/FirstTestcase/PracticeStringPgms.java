package FirstTestcase;

import java.io.*;
import java.util.HashSet;


public class PracticeStringPgms {

	public static void main(String[] args) throws IOException 
	{
		// Find number of unique letter occurance in given string
		
		//String strg = "aabbddff";
		//System.out.println("String One  " + strg + " --- > " +uniqueletters(strg));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter String -->  ");
		String strg = br.readLine();
		
		System.out.println("Unique letters in entered String ->>  " + uniqueletters(strg));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");			
	
	} 	 	
	
	/* Feedback :- Your current approach is counting the unique characters in the string, but it's not finding the 
	 * smallest window that contains all characters at least once. Think about how you can track the 
	 * occurrence of each character in the string to determine the smallest window that covers all 
	 * characters. */
	public static int uniqueletters(String strg)
	{
		if (strg == null || strg.isEmpty())
		{
			return 0;
		}
		
		HashSet<String> hs_uniquechar = new HashSet<>();
				
		for (int i=0; i<strg.length(); i++)
		{
			char c = strg.charAt(i);
			if (Character.isLetter(c))
			{
				hs_uniquechar.add(Character.toString(c));				
			}		
		}
		
		return hs_uniquechar.size();		
	}

}
