package arrry;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int [] a = {10,30,50,60,80};
		int big = a[1];
		int secBig =a[2];
		for(int i=0;i<=a.length-1;i++)
		{
			if(big<a[i])
			{
				secBig = big;
				big=a[i];
			}
			else if(secBig<a[i])
			{
				secBig=a[i];
			}
		}
		System.out.println(big);
		System.out.println(secBig);

	}

}
