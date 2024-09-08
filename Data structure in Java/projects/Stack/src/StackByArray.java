
public class StackByArray <T>
{
	private T[] arr;
	private int i;  //מיקום ראש המחסנית
	
	//אתחול מחסנית ריקה
	public StackByArray(int size) 
	{
		arr=(T[]) new Object[size];
		i=-1;
	}
	
	//האם המחסנית ריקה
	public boolean isEmpty()
	{
		return i==-1;
	}
	
	//האם המחסנית מלאה
	public boolean isFull()
	{
		return i==arr.length-1;
	}
	
	//הצצה לראש המחסנית
	public T top()
	{
		return isEmpty()?null:arr[i];
	}
	
	//שליפת ערך מהמחסנית
	public T pop()
	{
		return isEmpty()?null:arr[i--];
	}
	
	//דחיפת ערך למחסנית
	public void push(T val) //throws Exception
	{
		if(!isFull())
			arr[++i]=val;
		else
			System.out.println("StackOverFlow Exception");
			//throw new Exception("StackOverFlow Exception");
	}
}
