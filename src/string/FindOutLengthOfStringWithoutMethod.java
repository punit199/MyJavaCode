package string;

public class FindOutLengthOfStringWithoutMethod {

	public static void main(String[] args) {
		String str = "punitkumar";
		String res ="";
		int count=0;
		while(true)
		{
			try
			{
				res =res + str.charAt(count++);
			}
			catch(StringIndexOutOfBoundsException s)
			{
				s.printStackTrace();
				break;
			}
		}
		System.out.println(count-1);



	}

}
