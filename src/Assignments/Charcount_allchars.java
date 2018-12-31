package Assignments;

import java.util.HashMap;

// WAP to count occurance of a each character in a string

public class Charcount_allchars 
{
	
	public static void main(String[] args) 
	{
		allCharscount("Learing JAVA at TYSS");
				
	}
	
	static void allCharscount(String str) 
	{
		HashMap<Character,Integer> charcount = new HashMap<>();
		char[] strArray = str.toCharArray();
		
		for(char c:strArray) 
		{
			if(charcount.containsKey(c))
			{
				charcount.put(c, charcount.get(c)+1);
			}
			else 
			{
				charcount.put(c, 1);
			}
		}
		System.out.println(charcount);
	}

}
