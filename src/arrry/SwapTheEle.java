package arrry;

public class SwapTheEle {

	public static void main(String[] args) {
		int [] a= {50,20,30,40,10};
		int temp=a[0];
		 a[0]=a[a.length-1];
		 a[a.length-1]=temp;
		 for(int n:a)
		 {
			 System.out.println(n);
		 }

	}

}
