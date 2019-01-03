package arrry;

public class SecondMinNumberInArry {

	public static void main(String[] args) {
		int [] a = {10,20,60,80,4,5};
		int min = a[1];
		int secMin=a[2];
		for(int i=0;i<=a.length-1;i++)
		{
			if(min>a[i])
			{
				secMin = min;
				min=a[i];
			}
			else if(secMin>a[i])
			{
				secMin=a[i];
			}
		}
		System.out.println(secMin);



	}

}
