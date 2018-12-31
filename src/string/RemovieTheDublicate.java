package string;

public class RemovieTheDublicate {

	public static void main(String[] args) {
	  String str = "aniaml";
	  String strResult =" ";
	  for(int i=0;i<=str.length()-1;i++)
	  {
		  int count =0;
		  for(int j=0;j<=strResult.length()-1;j++)
		  {
			  if(str.charAt(i)==strResult.charAt(j))
			  {
				  count++;
			  }
		  }
		  if(count==0)
		  {
		  strResult = strResult+str.charAt(i);
		  }
	  }
	  System.out.println(strResult);

	}

}
