package arrry;

public class Pattern1 
{
   public static void main(String[] args)
   {
	   char ch='C';
	   char ch1='A';
	   char nch;
	   char nch2;
	   for(int i=1;i<=3;i++)
	   {
		   nch=ch;
		   for(int j=1;j<=3;j++)
		   {
			   if(i+j>=4)
			   {
				   System.out.print(nch--);
			   }
			   else
			   {
				   System.out.print(" ");
			   }
		   }
		   nch2=ch1;
		   for(int j=1;j<=3;j++)
		   {
			  
			   if(j<=i)
			   {
				   System.out.print(nch2--);
			   }
			   else
			   {
				   System.out.print(" ");
			   }
		   }
		ch++;
		ch1++;
		   System.out.println();
	   }
   }
}
