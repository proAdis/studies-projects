public class Queue <T>
{
	private Node<T> head;
	private Node<T> tail;
	
	public Queue() //����� ��� ���
	{
		head=tail=null;
	}
	
	public boolean isEmpty()	//��� ���� ���
	{
		return head==null;
	}
	
	public boolean isFull()	//��� ���� ���
	{
		return false;
	}
	
	public T head()    //���� ���� ����
	{
		if(!isEmpty())
			return head.getValue();
		return null;
	}
	
	public T dequeue()	//����� �����
	{
		if(!isEmpty())
		{
			T val=head.getValue();
			head=head.getNext();
			return val;
		}
		return null;
	}
	
	public void enqueue(T val)   //����� ����
	{
		Node<T> temp=new Node<T>(val, null);
		if(isEmpty()) //���� ����� ���� ����
			head=tail=temp;
		else
		{
			tail.setNext(temp);
			tail=temp;  //tail=tail.getNext();
		}
	}
}
