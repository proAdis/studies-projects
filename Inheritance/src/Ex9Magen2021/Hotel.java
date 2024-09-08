package Ex9Magen2021;

public class Hotel 
{
	private Room[]rooms;
	private int numRooms;
	
	public Hotel(int maxRooms) 
	{
		rooms=new Room[maxRooms];
		numRooms=0;
	}
	
	public void addRoom(Room r) throws Exception
	{
		if(numRooms<rooms.length)
			rooms[numRooms++]=r;
		else
			throw new Exception("The hotel is full!!");
	}
	
	public double avgPrice()
	{
		int counter=0;
		double sum=0;
		
		for (int i = 0; i < numRooms; i++) 
		{
			if(rooms[i] instanceof Suite && ((Suite)rooms[i]).isLuxury())
			{
				counter++;
				sum+=rooms[i].getPrice();
			}
		}
		
		return counter==0?0:sum/counter;
	}
	
	//פונקציה המחזירה את משך הזמן לניקיון כל החדרים בבית המלון
	public int clean()
	{
		int sum=0;
		for (int i = 0; i < numRooms; i++) 
		{
			sum+=rooms[i].clean();
		}
		return sum;
	}
	
	@Override
	public String toString() 
	{
		String str="The number of the rooms in our hotel is: "+numRooms+"\n";
		
		for (int i = 0; i < numRooms; i++) 
		{
			str+="room number "+(i+1)+":" +rooms[i].toString()+"\n";
		}
		
		return str;
	}
}
