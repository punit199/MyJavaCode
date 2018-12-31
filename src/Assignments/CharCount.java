package Assignments;

//WAP to count the occurance of a given character in a string

public class CharCount 
{
	public static void main(String[] args) 
	{
		
		cCount("counting c in class charcount",'c');
	}
	
	static void cCount(String str,char c ) 
	{
		int count = 0;
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i) == c) 
			{
				count++;
			}		
		}
		System.out.println("occurance of character = " + count);		
	}	
	
}
