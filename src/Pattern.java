
public class Pattern {

	public static void main(String[] args) {
		int n =10;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==j||i+j==8||(j-i==2&&i!=4)||(i+j==6&&i!=4))
				{
					System.out.print(n--);
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
