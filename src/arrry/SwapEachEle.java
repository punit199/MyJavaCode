package arrry;

public class SwapEachEle {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,65};
		if(a.length%2==0)
		{
		int n = ((a.length)/2)-1;
		for(int i=0;i<=n;i++)
		{
			a[i]=a[i]+a[a.length-(i+1)];
			a[a.length-(i+1)]=a[i]-a[a.length-(i+1)];
			a[i]=a[i]-a[a.length-(i+1)];
		}
		}
		else
		{
			System.out.println("provide even no arry,cuurently this arry is odd");
		}
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		

	}

}
