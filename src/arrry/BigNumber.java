package arrry;

public class BigNumber {

	public static void main(String[] args) {
		int [] a = {10,30,50,60,80};
		int big = a[1];
		for(int i=0;i<=a.length-1;i++)
		{
			if(big<a[i])
			{
				big=a[i];
			}
		}
		System.out.println(big);



	}

}
