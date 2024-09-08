
public class Rectangle 
{
	private double length;
	private double width;
	private static int counter=0;

	public static Rectangle newInstance(double length, double width)
	{
		if(counter<3)
			return new Rectangle(length, width);
		return null;
	}
	
	public static Rectangle newInstance()
	{
		return newInstance(4,2);
	}
	
	private Rectangle(double length, double width) 
	{
		counter++;
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
}





