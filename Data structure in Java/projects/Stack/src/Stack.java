
public class Stack <T>
{
	private Node<T> head;
	
	//אתחול מחסנית ריקה
	public Stack() 
	{
		head=null;
	}
	
	//האם המחסנית ריקה
	public boolean isEmpty()
	{
		return head==null;
	}
	
	//האם המחסנית מלאה
	public boolean isFull()
	{
		return false;
	}
	
	//הצצה לראש המחסנית
	public T top()
	{
		return isEmpty()?null:head.getValue();
	}
	
	//שליפת ערך מהמחסנית
	public T pop()
	{
		if (isEmpty())
			return null;
		T val=head.getValue();
		head=head.getNext();
		return val;
	}
	
	//דחיפת ערך למחסנית
	public void push(T val) //throws Exception
	{
		head=new Node<T>(val,head);
	}
	
}
