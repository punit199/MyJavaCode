package string;

public class CheckStringIsPalidrom {

	public static void main(String[] args) {
		String str = "MOME";
		String res ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		System.out.println(res);
		if(res.equals(str))
		{
			System.out.println("This word  "+ "is palindrome = "+str);
		}
		else 
		{
			System.out.println("This word is not palindrome = "+ str);
		}

	}

}
