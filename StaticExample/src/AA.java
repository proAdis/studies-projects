
public class AA extends Rectangle
{
	private static int counter=0;
	
	public AA()
	{
		counter++;
	}
	
	public static int getCounter() 
	{
		return counter;
	}
}
