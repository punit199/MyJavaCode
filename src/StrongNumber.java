
public class StrongNumber {

	public static void main(String[] args) {
		System.out.println("strong number is sum of factorical of all number and sum must equal to given number");
		int n= 145;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int r = n%10;
			int mult=1;
			for(int i=r;i>=1;i--)
			{
				mult=mult*i;
			}
			sum=sum+mult;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is strong number");
		}
		else
		{
			System.out.println(temp+" is not strong number");
		}

	}

}
