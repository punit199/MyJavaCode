package string;

public class SortWithLength {

	public static void main(String[] args) {
		String str = "if you your";
		String [] s=str.split(" ");
		for(int i=0;i<=s.length-1;i++)
		{
			for(int j=i+1;j<=s.length-1;j++)
			{
				if(s[i].length()<s[j].length()-1)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		
		}
		for(String e:s)
		{
			System.out.print(e+" ");
		}

	}

}
