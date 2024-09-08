
public class program 
{
	public static void main(String[] args) 
	{
		Student s3=null;
		Student s4=new Student(s3,"53463");
		
		Student s1=new Student(14);
		//s1.setId("22222222");
		s1.setName("abababab");
		Student s2=new Student("123456789","palmonit",7);
		
		System.out.println(s1);
		System.out.println(s2);		
	}
}
