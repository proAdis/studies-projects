
public class Teacher extends Person implements IgetSalary
{
	private int degree;  //דרגה
	private int hours;
	private int pricePerHour; //שכר לשעה
	
	public Teacher(String id, String name, int degree) 
	{
		super(id, name);
		this.degree = degree;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	@Override
	public double getSalary() 
	{
		return pricePerHour*hours*(1+degree/10.0);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I'm a teacher." +super.toString()+" My degree is: "+degree;
	}
}
