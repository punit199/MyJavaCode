package arrry;

public class SumOfAllEvenPogitionEle {

	public static void main(String[] args) {
		int sum =0;
		int [] a= {40,20,60,80,70};
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
			sum = sum +a[i];
			}
		}
		System.out.println(sum);

	}

}
