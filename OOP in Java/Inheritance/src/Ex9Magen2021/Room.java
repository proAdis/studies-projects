package Ex9Magen2021;

public class Room 
{
	private int beds;
	private double price;
	
	public Room(int beds, double price) 
	{
		this.beds=beds;
		this.price=price;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public int clean()
	{
		return 5*beds;
	}

}
