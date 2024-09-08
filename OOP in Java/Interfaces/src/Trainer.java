
public class Trainer extends Student implements IgetSalary
{
	private int numberOfHours; //מספר שעות
	
	
	public Trainer(String id, String name, int grade, int numberOfHours) 
	{
		super(id, name,grade);
		this.numberOfHours = numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) 
	{
		this.numberOfHours = numberOfHours;
	}
	public int getNumberOfHours() 
	{
		return this.numberOfHours;
	}

	@Override
	public double getSalary() 
	{
		return IgetSalary.minimumSalary*numberOfHours;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+" I'm also trainer of subject... "+numberOfHours+" hours at week.";
	}
}
