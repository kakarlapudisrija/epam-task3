package Task3.com;

public class Calculate {
	int x,y,c;
	public Calculate(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int add()
	{
		c=x+y;
		return c;
	}
	public int subtract()
	{
		c=x-y;
		return c;
	}
	public int multiply()
	{
		c=x*y;
		return c;
	}
	public int divide()
	{
		c=x/y;
		return c;
	}
}
