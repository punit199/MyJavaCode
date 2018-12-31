package string;

public class RevHalfSeparately {

	public static void main(String[] args) {
		String str = "wonderfull";
		String firsthalf="";
		String secondHalf="";
		
		System.out.println(str.length());
		for(int i=str.length()-1;i>=0;i--)
		{
			if(i<(str.length())/2)
			{
				firsthalf = firsthalf+str.charAt(i);
			}
			else
			{
				secondHalf = secondHalf+ str.charAt(i);
			}
		}
		System.out.println(firsthalf);

		System.out.println(secondHalf);
		System.out.println(firsthalf.concat(secondHalf));

	}

}
