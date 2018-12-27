package arrry;

public class MultiplyElement {

	public static void main(String[] args) {
		int [] a = {100,20,40,30,60};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}

}
