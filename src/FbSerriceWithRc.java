
public class FbSerriceWithRc {
	static int a=0;
	static int b=1;
	static int sum=0;
	public static void run()
	{
		if(sum<=100)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			run();
		}
	}

	public static void main(String[] args) {
           System.out.println(a);
           System.out.println(b);
           run();


	}

}
