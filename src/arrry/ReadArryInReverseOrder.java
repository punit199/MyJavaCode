package arrry;

public class ReadArryInReverseOrder {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50};
		int [] b=new int [a.length];
		int k =a.length-1;
		for(int i:a)
		{
			b[k--]=i;
		}
		for(int j:b)
		{
			System.out.println(j);
		}

	}

}
