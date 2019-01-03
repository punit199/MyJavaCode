package object_program;

public class ComparingString {

	public static void main(String[] args) {
		  StringBuilder s1 = new StringBuilder("Test");
	      StringBuilder s2 = new StringBuilder("Test");

	         System.out.println(s1);
	         System.out.println(s2);
	         System.out.println(s1==s2);
	         System.out.println(s1.equals(s2));
	         System.out.println(s1.toString()==s2.toString());
	         System.out.println(s1.toString().equals(s2.toString())); 
	         System.out.println(s1.equals(s2));
	         
	}

}
