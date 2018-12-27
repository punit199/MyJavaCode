package arrry;

public class DublicateNumber {

	public static void main(String[] args) {
		int [] a = {10,20,10,10,20,80};
		for(int i=0;i<=a.length-1;i++)
		{
			int count =0;
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(""+a[i]+"=="+count);
			}
		}

	}

}
