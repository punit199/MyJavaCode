package string;

public class RemoveSpace {

	public static void main(String[] args) {
		String str ="welcome to testing filed";
		String res ="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)!=' ')
			{
				res =res+str.charAt(i);
			}
		}
		System.out.println(res);
	}

}
