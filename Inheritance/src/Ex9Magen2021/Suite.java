package Ex9Magen2021;

public class Suite extends Room
{
	private boolean isLuxury;

	public Suite(int beds, double price, boolean isLuxury) 
	{
		super(beds, price);
		this.isLuxury = isLuxury;
	}

	public boolean isLuxury() 
	{
		return isLuxury;
	}

	public void setLuxury(boolean isLuxury) 
	{
		this.isLuxury = isLuxury;
	}
	
	public int clean()
	{
		return super.clean() + (isLuxury?30:20);
	}
}
