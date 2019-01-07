package arrry;

public class EvenArry {

	public static void main(String[] args) {
      int [] a= {10,20,30,40,60,80};
      int l =a.length/2;
      int [] res = new int[l];
      int k=0;
      for(int i=0;i<=a.length-1;i++)
      {
    	  if(i%2==0)
    	  {
    	  res[k++]=a[i];
    	  }
      }
      for(int j:res)
      {
    	  System.out.println(j);
      }

	}

}
