
public class StackByArray <T>
{
	private T[] arr;
	private int i;  //����� ��� �������
	
	//����� ������ ����
	public StackByArray(int size) 
	{
		arr=(T[]) new Object[size];
		i=-1;
	}
	
	//��� ������� ����
	public boolean isEmpty()
	{
		return i==-1;
	}
	
	//��� ������� ����
	public boolean isFull()
	{
		return i==arr.length-1;
	}
	
	//���� ���� �������
	public T top()
	{
		return isEmpty()?null:arr[i];
	}
	
	//����� ��� ��������
	public T pop()
	{
		return isEmpty()?null:arr[i--];
	}
	
	//����� ��� �������
	public void push(T val) //throws Exception
	{
		if(!isFull())
			arr[++i]=val;
		else
			System.out.println("StackOverFlow Exception");
			//throw new Exception("StackOverFlow Exception");
	}
}
