package Ex9Magen2021;

public class Family extends Room
{
	private boolean babyCot;

	public Family(int beds, double price, boolean babyCot) 
	{
		super(beds, price);
		this.babyCot = babyCot;
	}

	public boolean isBabyCot() {
		return babyCot;
	}

	public void setBabyCot(boolean babyCot) {
		this.babyCot = babyCot;
	}
	

	public int clean() 
	{
		return super.clean()+ (babyCot?10:0);
	}
}
