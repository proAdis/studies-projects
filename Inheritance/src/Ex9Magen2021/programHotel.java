package Ex9Magen2021;

public class programHotel {

	public static void main(String[] args) 
	{
		Family f=new Family(3, 700, true);
		
		System.out.println(f.clean());

		Suite s=new Suite(2, 1000, true);
		
		System.out.println(s.clean());
		
		
		Room r=s;
		System.out.println(r.clean());
		
	}

}
