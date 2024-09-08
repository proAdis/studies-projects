
public abstract class Shape 
{
	private String color;
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
	public String toString() 
	{
		return "The area is: "+getArea()+ "\nThe perimeter is: "+getPerimeter();
	}
}
