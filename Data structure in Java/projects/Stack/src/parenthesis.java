
public class parenthesis 
{
	public static boolean isOpen(char ch)  //��� ����?
	{
		return ch=='(' || ch=='[' || ch=='{';
	}
	
	public static boolean isClose(char ch)  //��� ����?
	{
		return ch==')' || ch==']' || ch=='}';
	}
	
	public static boolean match(char open, char close) //��� ����� ���� �����
	{
		return open=='(' && close==')' || open=='[' && close==']' || open=='{' && close=='}';
	}
	
	//������ ����� ������ �������
	public static boolean checkExpression(String str)
	{
		Stack<Character> s=new Stack<Character>();
		char ch;
		
		for(int i=0; i<str.length(); i++)
		{
			ch=str.charAt(i);
			
			if( isClose(ch) && (s.isEmpty() || !match(s.pop(), ch)))
				return false;
				
			if(isOpen(ch))
				s.push(ch);		
		}
		return s.isEmpty();
	}

	public static void main(String[] args)
	{
		String str="5 + ( [ 3 + 2 ] / { 4 - 1 } )";
		//String str="( 2 + { 5 * 2 ) ) + ( 3 / 5 )";
		//String str="( 2 + { 5 * 2 } ) + ( 3 / 5 ";
		//String str="( 2 + { 5 * 2 } ) + ( 3 / 5 )]";
						
		if(checkExpression(str))
			System.out.println("All right!");
		else
			System.out.println("Invalid expression...");
	}
}
