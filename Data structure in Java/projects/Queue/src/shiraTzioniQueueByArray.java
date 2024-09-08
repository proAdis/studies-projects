public class shiraTzioniQueueByArray <T>
{
	private T[] arr;
	private int head;  //���� �� ������ ����� �� ������
	private int tail;  //���� �� ����� ������� �� ������
	private int counter;
	
	public shiraTzioniQueueByArray(int maxSize)   //����� ��� ���
	{
		arr=(T[]) new Object[maxSize];
		head=0;
		tail=-1;
		counter=0;
	}
	
	public boolean isEmpty()	//��� ���� ���
	{
		return counter==0;
	}
	//tail+1==head;
	public boolean isFull()	//��� ���� ���
	{
		return counter==arr.length;
	}
	
	public T head()    //���� ���� ����
	{
		if(!isEmpty())
			return arr[head];
		return null;
	}
	
	public T dequeue()	//����� �����
	{
		if(isEmpty())
			return null;
		counter--;
		T val=arr[head++];
		head%=arr.length;
		return val;
	}
	
	public void enqueue(T val)   //����� ����
	{
		if(!isFull())
		{
			counter++;
			arr[++tail]=val;
			//�� ���� ���� �� ������ ������ ����� ���� ������ 1
			if(tail==arr.length-1)
				tail=-1;
		}
	}
}
