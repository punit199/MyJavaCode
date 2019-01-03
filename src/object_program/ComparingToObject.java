package object_program;

public class ComparingToObject {
	
	String bookNmae;
	String authorName;
	int price;

	public ComparingToObject(String bookNmae, String authorName, int price) {
		this.bookNmae = bookNmae;
		this.authorName = authorName;
		this.price = price;
	}
     public boolean equals(Object o)
     {
    	 ComparingToObject c = (ComparingToObject) o;
    	 return c.bookNmae==this.bookNmae;
     }
	public static void main(String[] args) {
		ComparingToObject co = new ComparingToObject("maths","ad sharma",500);
		ComparingToObject co1 = new ComparingToObject("maths","cbse",80);
		System.out.println(co.equals(co1));

	}

}
