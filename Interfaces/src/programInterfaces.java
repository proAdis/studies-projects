
public class programInterfaces 
{
	public static double func(IgetSalary []arr)
	{
		double sum=0;
		for (int i = 0; i < arr.length && arr[i]!=null; i++) 
		{
			sum+=arr[i].getSalary();
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		Person [] people=new Person[4];
		
		people[0]=new Student("111111111","aaa",12);
		people[1]=new Teacher("222222222","bbb",2);
		people[2]=new Student((Student)people[0],"333333333");
		people[2].setName("ccc");
		people[3]=new Trainer("444444444", "ddd", 14, 3);
		
		
		for (int i = 0; i < people.length; i++) 
		{
			System.out.println(people[i]);
			if(people[i] instanceof IgetSalary)
				System.out.println("My salary is: "+((IgetSalary)people[i]).getSalary());
		}

		IgetSalary []arr=new IgetSalary[people.length];
		int k=0;
		for (int i = 0; i < people.length; i++) 
		{
			if(people[i] instanceof IgetSalary)
				arr[k++]=(IgetSalary)people[i];
		}
		
		System.out.println(func(arr));	
	}
}
