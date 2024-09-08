
public class DoubleStack <T>
{
	private T[] arr;
	private int indexS1;
	private int indexS2;
	
	public DoubleStack() 
	{
		arr=(T[])new Object[100];
		indexS1=-1;
		indexS2=arr.length;
	}
	
	public boolean isEmpty()  //��� ������� ������ ����
	{
		return this.indexS1==-1 && this.indexS2==arr.length;
	}
	
	public boolean isEmpty(int x)  //��� ������ ������� ����
	{
		if(x==1)
			return this.indexS1==-1;
		return this.indexS2==arr.length;
	}

	public boolean isFull()  //��� ������� ����, �� ���� ������ ���� ��� ��������
	{
		return indexS1+1==indexS2;
	}
	
	public void push(T val, int x)  //����� ��� ������� �������
	{
		if(isFull()) 
			return;
		if(x==1)
			arr[++indexS1]=val;
		else
			arr[--indexS2]=val;
	}
	
	public T pop(int x)  //����� ��� ������� �������
	{
		if(!isEmpty(x))
		{
			if(x==1)
				return arr[indexS1--];
			return arr[indexS2++];
		}
		return null;
	}
	
	
	public T top(int x)   //���� ���� ������ ������� 
	{
		if(!isEmpty(x))
		{
			if(x==1)
				return arr[indexS1];
			return arr[indexS2];
		}
		return null;
    }
}
