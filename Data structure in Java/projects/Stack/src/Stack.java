
public class Stack <T>
{
	private Node<T> head;
	
	//����� ������ ����
	public Stack() 
	{
		head=null;
	}
	
	//��� ������� ����
	public boolean isEmpty()
	{
		return head==null;
	}
	
	//��� ������� ����
	public boolean isFull()
	{
		return false;
	}
	
	//���� ���� �������
	public T top()
	{
		return isEmpty()?null:head.getValue();
	}
	
	//����� ��� ��������
	public T pop()
	{
		if (isEmpty())
			return null;
		T val=head.getValue();
		head=head.getNext();
		return val;
	}
	
	//����� ��� �������
	public void push(T val) //throws Exception
	{
		head=new Node<T>(val,head);
	}
	
}
