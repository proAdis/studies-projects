import java.util.Arrays;

public class postfixExpression 
{
	public static double calculate(double op1, double op2, char op) //Calculate
	{
		//System.out.print(""+op1+op+op2+"=");
		switch(op)
		{
			case '+': return op1+op2;
			case '-': return op1-op2;
			case '*': return op1*op2;
			default : return op1/op2;
		}
	}
	
	public static double solutionExpression(String str)
	{
		Stack<Double> s=new Stack<Double>();
		
		String [] arr=str.split(" ");
		
		for(int i=0; i<arr.length; i++)
		{
			try
			{
				s.push(Double.parseDouble(arr[i]));
			}
			catch(NumberFormatException e)
			{
				double second=s.pop();
				s.push(calculate(s.pop(),second,arr[i].charAt(0)));
			}
		}
		return s.pop();
	}
	
	public static void main(String[] args) 
	{
		//System.out.println(solutionExpression("24 12 3 + - 3 18 2 / + * 2 * 35.7 +"));
		System.out.println(solutionExpression("1 2 - 3 * 4 +"));
	}
}
