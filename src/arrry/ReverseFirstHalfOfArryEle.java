package arrry;

public class ReverseFirstHalfOfArryEle {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,8};
		int b [] = new int [a.length];
		int k=(a.length/2)-1;
		int h=(a.length/2);
		int j=a.length-1;
		for(int i=0;i<=(a.length/2)-1;i++)
		{
			b[k--]=a[i];
			b[h++]=a[j--];
		}
		for(int g:b)
		{
			System.out.print(g+" ");
		}

	}

}
