package string;

public class FindOutNumOfWordInString {

	public static void main(String[] args) {
		String str = "welcome to science world";
		String resStr = " ";
		String [] s = str.split(" ");
		System.out.println(s.length);
		for(int i=s.length-1;i>=0;i--)
		{
			resStr = resStr+" "+s[i];
		}
		System.out.println(resStr.trim());
		

	}

}
