package string;

public class ReverseTheString {
	
	static String str = "tinup";
	static String resultStr="";
	static int alp = str.length()-1 ;
	
	public static void rev() {
		if(alp>=0)
		{
			char ch = str.charAt(alp--);
			resultStr = resultStr+ch;
			rev();
		}
		
	}

	public static void main(String[] args) {
		rev();
		System.out.println(resultStr);
		
	

	}

}
