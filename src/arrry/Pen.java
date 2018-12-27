package arrry;

public class Pen {
	String colour;
	public Pen(String colour)
	{
		this.colour=colour;
	}
	public void colourOfpen()
	{
		System.out.println("pen colour is ==>"+colour);
	}
	public static void main(String[]arys)
	{
		Pen [] p = new Pen[5];
		p[0]=new Pen("red");
		p[1]= new Pen("yellow");
		p[2]= new Pen("white");
		p[3]= new Pen("black");
		p[4]= new Pen("green");
		for(Pen pen:p)
		{
			pen.colourOfpen();
		}
	}

}
