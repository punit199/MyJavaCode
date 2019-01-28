
public class HappyNumber {
   static int n=40;
   static int temp=n;
   public static void sumAll()
   {
   int sum=0;
	   while(n>0)
	   {
		   int r=n%10;
		   sum=sum+r*r;
		   n=n/10;
	   }
		if(sum==1)
		{
			System.out.println(temp+" is happy number");
		}
		else
		{
			n=sum;
			sumAll();
		}
	}
	public static void main(String[] args) {
		try
		{
		sumAll();
		}
		catch(StackOverflowError s)
		{
			s.printStackTrace();
			System.out.println(temp+" is not a happy number");
		}
	}

}
