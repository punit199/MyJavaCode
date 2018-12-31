package Assignments;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		chkPalindromString("madams");
		
	}
	
	static void chkPalindromString(String str) 
	{		
		int length = str.length();
		String rev = "";
		
		for(int i = length-1; i >= 0; i--) 
		rev = rev + str.charAt(i);
			if(str.equals(rev)) 
			{
				System.out.println("String is Palindrome");
			}
			else
				System.out.println("String is not palindrome");
		
	}

}
