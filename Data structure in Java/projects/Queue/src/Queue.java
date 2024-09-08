public class Queue <T>
{
	private Node<T> head;
	private Node<T> tail;
	
	public Queue() //בניית תור ריק
	{
		head=tail=null;
	}
	
	public boolean isEmpty()	//האם התור ריק
	{
		return head==null;
	}
	
	public boolean isFull()	//האם התור מלא
	{
		return false;
	}
	
	public T head()    //הצצה לראש התור
	{
		if(!isEmpty())
			return head.getValue();
		return null;
	}
	
	public T dequeue()	//הוצאה מהתור
	{
		if(!isEmpty())
		{
			T val=head.getValue();
			head=head.getNext();
			return val;
		}
		return null;
	}
	
	public void enqueue(T val)   //הכנסה לתור
	{
		Node<T> temp=new Node<T>(val, null);
		if(isEmpty()) //איבר ראשון נכנס לתור
			head=tail=temp;
		else
		{
			tail.setNext(temp);
			tail=temp;  //tail=tail.getNext();
		}
	}
}
