import java.util.Random;

public class program1
{
	//������� ������ ��� �� ��� ������� �� ����� �������� ����
	//�������� ���� �� ���� ����� ���� ��� ��� ����� �� ���� ���� ���� ����
	public static int maxValue(Queue<Integer> q)
	{
		q.enqueue(null);  //����� ���� ���� ����
		int max=q.head();
		
		while(q.head()!=null)
		{
			if(q.head()>max)
				max=q.head();
			
			q.enqueue(q.dequeue());
		}
		
		q.dequeue();  //�� ������ ������ �� ����� ���� ����		
		return max;
	}
	
	//������� ������ ���� ��� ���� ����
	public static <T> void spilled(Queue<T> source, Queue<T> dest)
	{
		while(!source.isEmpty())
			dest.enqueue(source.dequeue());
	}

	//������� ������ ���� ���� ��� ����� ���� ���
	public static <T> void printQueue(Queue<T> q)
	{
		Queue<T> temp=new Queue<T>();
		
		while(!q.isEmpty())
		{
			System.out.print(q.head()+" ");
			temp.enqueue(q.dequeue());
		}
		spilled(temp, q);
		System.out.println();
	}
	
	public static Queue<Integer> buildRandomQueue(int size, int l, int h)
	{
		Queue<Integer> q=new Queue<Integer>();
		Random rnd=new Random();
		
		for(int i=0; i<size; i++)
			q.enqueue(rnd.nextInt(h-l+1)+l);
		return q;
	}
	
	public static void main(String[] args) 
	{
		Queue<Integer> q1=buildRandomQueue(10, 50, 100);
		printQueue(q1);
		int m=maxValue(q1);
		System.out.println(m);
	}
}
