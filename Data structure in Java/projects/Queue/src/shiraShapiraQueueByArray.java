
public class shiraShapiraQueueByArray <T>
{
	private T[] arr;
	private int head;  //���� �� ������ ����� �� ������
	private int tail;  //���� �� ������ ����� �� ������
	
	public shiraShapiraQueueByArray(int maxSize)
	{
		arr=(T[]) new Object[maxSize];
		head=0;
		tail=0;
	}
	
	public boolean isEmpty()	//��� ���� ���
	{
		return tail==head;
	}

	public boolean isFull()	//��� ���� ���
	{
		return tail-head==arr.length;
	}
	
	public T head()    //���� ���� ����
	{
		if(!isEmpty())
			return arr[head%arr.length];
		return null;
	}
	
	public T dequeue()	//����� �����
	{
		if(isEmpty())
			return null;
		T val=arr[head%arr.length];
		head++;
		return val;
	}
	
	public void enqueue(T val)   //����� ����
	{
		if(!isFull())
		{
			arr[tail%arr.length]=val;
			tail++;
		}
	}
}
