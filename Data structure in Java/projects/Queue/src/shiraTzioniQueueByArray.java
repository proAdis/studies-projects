public class shiraTzioniQueueByArray <T>
{
	private T[] arr;
	private int head;  //עומד על המיקום שממנו יש להוציא
	private int tail;  //עומד על מיקום שלימינו יש להכניס
	private int counter;
	
	public shiraTzioniQueueByArray(int maxSize)   //בניית תור ריק
	{
		arr=(T[]) new Object[maxSize];
		head=0;
		tail=-1;
		counter=0;
	}
	
	public boolean isEmpty()	//האם התור ריק
	{
		return counter==0;
	}
	//tail+1==head;
	public boolean isFull()	//האם התור מלא
	{
		return counter==arr.length;
	}
	
	public T head()    //הצצה לראש התור
	{
		if(!isEmpty())
			return arr[head];
		return null;
	}
	
	public T dequeue()	//הוצאה מהתור
	{
		if(isEmpty())
			return null;
		counter--;
		T val=arr[head++];
		head%=arr.length;
		return val;
	}
	
	public void enqueue(T val)   //הכנסה לתור
	{
		if(!isFull())
		{
			counter++;
			arr[++tail]=val;
			//אם טייל נמצא על המיקום האחרון נעביר אותו למינוס 1
			if(tail==arr.length-1)
				tail=-1;
		}
	}
}
