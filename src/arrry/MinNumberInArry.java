package arrry;

public class MinNumberInArry {

	public static void main(String[] args) {
		int [] a = {10,20,60,80,4,5};
		int min = a[1];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
