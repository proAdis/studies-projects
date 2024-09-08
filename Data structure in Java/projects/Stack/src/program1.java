
public class program1 
{
	public static <T> void spilledOn(Stack<T> source, Stack<T> destination)
	{
		while(!source.isEmpty() )  //&& !destination.isFull())
			
			destination.push(source.pop());
	}
	
	//פונקציה איטרטיבית להדפסת אברי מחסנית ללא פגיעה בתוכן שלה
	public static <T> void printStack(Stack<T> s)
	{
		Stack<T> temp=new Stack<T>();
		
		while(!s.isEmpty())
		{
			System.out.print(s.top()+",");
			temp.push(s.pop());
		}
		spilledOn(temp, s);
		System.out.println();
	}
	
	//פונקציה איטרטיבית להדפסת אברי מחסנית בסדר הפוך ללא פגיעה בתוכן שלה
	public static <T> void printReverseStack(Stack<T> s)
	{
		Stack<T> temp=new Stack<T>();
		spilledOn(s, temp);	
		
		while(!temp.isEmpty())
		{
			System.out.print(temp.top()+",");
			s.push(temp.pop());
		}
		System.out.println();
	}

	//פונקציה רקורסיבית להדפסת אברי מחסנית ללא פגיעה בתוכן שלה
	public static <T> void printRec(Stack<T> s)
	{
		if(s.isEmpty())
		{
			System.out.println();
			return;
		}
		
		T val=s.pop();
		System.out.print(val+" ");
		
		printRec(s);
		
		s.push(val);
	}
	
	//פונקציה רקורסיבית להדפסת אברי מחסנית בסדר הפוך ללא פגיעה בתוכן שלה
	public static <T> void printReverseRec(Stack<T> s)
	{
		if(s.isEmpty())
			return;
			
		T val=s.pop();
			
		printReverseRec(s);
		s.push(val);
		System.out.print(val+" ");
	}
	
	//פונקציה רקורסיבית המקבלת מחסנית וערך ומחזירה האם הערך מופיע במחסנית
	public static <T> boolean isExists(Stack<T> s, T val)
	{
		if(s.isEmpty())
			return false;
		
		if(s.top().equals(val))
			return true;
		
		T x=s.pop();
		boolean ans=isExists(s, val);
		s.push(x);
		return ans;
	}
	

	public static void main(String[] args) 
	{
		StackByArray<Integer> s1=new StackByArray<Integer>(5);
		
		/*
		for(int i=1; i<=10 ; i++)
			try 
			{
				s1.push(i);
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				break;
			}
		*/
		
//		for(int i=1; i<=10 && !s1.isFull(); i++)
//			s1.push(i);
//
//		while(!s1.isEmpty())
//			System.out.println(s1.pop());
		
		
		Stack<Integer> s2=new Stack<Integer>();
		for(int i=20; i<=25; s2.push(i++));
		
		//printStack(s2);
		//printReverseStack(s2);
		printRec(s2);
		printReverseRec(s2);
		System.out.println();
		
		System.out.println(isExists(s2, 23));
		System.out.println(isExists(s2, 29));
		System.out.println(isExists(s2, 23));
	}
}
