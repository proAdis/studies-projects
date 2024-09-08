
public class Student extends Person
{
	private int grade;

	public Student(String id, String name, int grade) 
	{
		super(id, name);
		this.grade = grade;
	}

	public Student(Student s, String id) 
	{
		super(id,null);
		if(s!=null)
		{
			this.name=s.name;
			this.grade = s.grade;
		}
	}
	public Student(int grade) 
	{
		//super();

		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() 
	{
		//return "id"+getId()+"name"+name+"grade"+grade;
		return super.toString() + " grade: "+grade;
	}
	
}

