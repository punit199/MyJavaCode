package Assignments;

//WAP to remove SPACES from a string

public class Space_Remove
{
	public static void main(String[] args) 
	{
		sRemoval("Space Removal from a string");
		spcRemoval("White Space removal from a string");
	}
	
		static void sRemoval (String str) 
		{
			String spaceRemoval = str.replaceAll("\\s", "");
			System.out.println(spaceRemoval);
		}
		
		static void spcRemoval(String str)
		{
			char[] strArray = str.toCharArray();
			StringBuffer sb = new StringBuffer();
			for(int i = 0;i < strArray.length;i++) 
			{
				if((strArray[i]!=' ')&&(strArray[i]!='\t')) 
				{
					sb.append(strArray[i]);
				}
			}
			String str1 =  sb.toString();
			System.out.println(str1);
		} 

}
