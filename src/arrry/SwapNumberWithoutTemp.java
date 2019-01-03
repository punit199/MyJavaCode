package arrry;

public class SwapNumberWithoutTemp {

	public static void main(String[] args) {
		int [] a= {50,20,30,40,10};
		
		a[0]=a[0]+a[a.length-1];
		a[a.length-1]=a[0]-a[a.length-1];
		a[0]=a[0]-a[a.length-1];
		
		 for(int n:a)
		 {
			 System.out.println(n);
		 }
		
		

	}

}
