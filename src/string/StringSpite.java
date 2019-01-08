package string;

public class StringSpite {

	public static void main(String[] args) {
            String str ="aabbccddbbchjhjhjbbbbb";
            String s [] = str.split("");
            String com = "bb";
            int len = s.length;
            int k=0;
            int globel=0;
            String result []= new String[len/2];
            for(int j=0;j<=result.length-1;j++)
            {
            	String r="";
            	int count =1;
            		while(count<=2)
            		{
            		r=r+s[k++];
            		count++;
            		}
            		result[j]=r;
            }
            for(int i=0;i<=result.length-1;i++)
            {
            	System.out.println(result[i]);
            	if(result[i].equals(com))
            	{
            		globel++;
            	}
            }
            System.out.println(globel);
            
            


	}

}
