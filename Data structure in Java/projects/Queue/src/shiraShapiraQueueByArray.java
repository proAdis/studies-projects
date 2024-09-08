
public class shiraShapiraQueueByArray <T>
{
	private T[] arr;
	private int head;  //עומד על המיקום שממנו יש להוציא
	private int tail;  //עומד על המיקום שאליו יש להכניס
	
	public shiraShapiraQueueByArray(int maxSize)
	{
		arr=(T[]) new Object[maxSize];
		head=0;
		tail=0;
	}
	
	public boolean isEmpty()	//האם התור ריק
	{
		return tail==head;
	}

	public boolean isFull()	//האם התור מלא
	{
		return tail-head==arr.length;
	}
	
	public T head()    //הצצה לראש התור
	{
		if(!isEmpty())
			return arr[head%arr.length];
		return null;
	}
	
	public T dequeue()	//הוצאה מהתור
	{
		if(isEmpty())
			return null;
		T val=arr[head%arr.length];
		head++;
		return val;
	}
	
	public void enqueue(T val)   //הכנסה לתור
	{
		if(!isFull())
		{
			arr[tail%arr.length]=val;
			tail++;
		}
	}
}
