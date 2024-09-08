import java.util.Scanner;

public class programDoublStack {

	public static DoubleStack<Integer> buildDoubleStack()
	{
		Scanner in=new Scanner(System.in);
		DoubleStack<Integer> s=new DoubleStack<Integer>();
		System.out.print("Enter stack number (1/2), to finish press -1: ");
		int val, x=in.nextInt();
		
		while(x!=-1)
		{
			System.out.print("Enter a value to push to stack "+x+": ");
			val=in.nextInt();
			s.push(val,x);
			System.out.print("Enter stack number (1/2), to finish press -1: ");
			x=in.nextInt();
		}
		return s;
	}
	
	public static <T> void printStack(DoubleStack<T> ds, int x)
	{
		Stack<T> temp=new Stack<T>();
		while(!ds.isEmpty(x))
		{
			System.out.print(ds.top(x)+"\t");
			temp.push(ds.pop(x));
		}
		System.out.println();
		
		while(!temp.isEmpty())
			ds.push(temp.pop(),x);
	}
	
	public static void main(String[] args) 
	{
		DoubleStack<Integer> ds=buildDoubleStack();
		
		printStack(ds, 1);
		printStack(ds, 2);

	}
}
