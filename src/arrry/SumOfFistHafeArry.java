package arrry;

public class SumOfFistHafeArry {

	public static void main(String[] args) {
		int firstHalfSum =0;
		int secHalfSum=0;
		int [] a = {10,20,60,9,80,90};
		for(int i=0;i<=(a.length/2)-1;i++)
		{
			firstHalfSum= firstHalfSum+a[i];
		}
		for(int j=(a.length/2);j<=a.length-1;j++)
		{
			secHalfSum=secHalfSum+a[j];
		}
		System.out.println(firstHalfSum);
		System.out.println(secHalfSum);
		

	}

}
