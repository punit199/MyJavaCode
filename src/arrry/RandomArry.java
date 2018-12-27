package arrry;

import java.util.Scanner;

public class RandomArry {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		Object [] obj = new Object[scan.nextInt()];
		
		for(int i=0;i<=obj.length-1;i++)
		{
			obj[i]=scan.nextLine();
		}
		for(int i=0;i<=obj.length-1;i++)
		{
			System.out.println(obj[i]);
		}
	      
	}

}
