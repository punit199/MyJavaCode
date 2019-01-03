package arrry;

public class AvgValueOfEle {

	public static void main(String[] args) {
		int [] a= {10,20,30,50};
		int sum =0;
		int avg=0;
		for(int i:a)
		{
			sum = (sum+i);
			avg=sum/2;
		}
		System.out.println(avg);


	}

}
