package arrry;

public class Reverse {

	public static void main(String[] args) {
		int [] a = {100,20,40,30,60};
	    for(int i=0;i<=a.length-1;i++)
	    {
	    	int temp =0;
	    	
	    	if(i==0)
	    	{
	    		temp=a[i];
	    		a[i]=a[a.length-1];
	    		a[a.length-1]=temp;
	    	}
	    	/*if(i==1)
	    	{
	    		temp=a[i];
	    		a[i]=a[i+2];
	    		a[a.length-1]=temp;
	    	}*/
	    }
		
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		
		

	}

}
