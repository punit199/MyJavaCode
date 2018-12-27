package arrry;

public class Example {

	public static void main(String[] args) {
	    int [] a = {2,3,5,4};
	    int [] b= new int[a.length];
	    
	    for(int i=0;i<=a.length-1;i++)
	    {
	    	int mult=1;
	    	for(int j=i+1;j<=a.length-1;j++)
	    	{
	    		mult=mult*a[j];
	    	}
	    	b[i]=mult;
	    }
	    for(int cP:a)
	    {
	    	System.out.println(cP);
	    }

	    System.out.println("<----------------------------------------------------------------------------------->");
	    for(int cP:b)
	    {
	    	System.out.println(cP);
	    }
	}

}
