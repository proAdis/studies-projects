
public class programQueueByArray {

	public static void main(String[] args) 
	{
		shiraTzioniQueueByArray<Integer> q1=new shiraTzioniQueueByArray<Integer>(5);
		
		for(int i=1; i<=5; i++)
			q1.enqueue(i);
		
		System.out.println(q1.isFull());
		
		q1.enqueue(8);
		
		while(!q1.isEmpty())
			System.out.print(q1.dequeue()+"  ");
		
		System.out.println();
		q1.enqueue(8);
		q1.enqueue(9);
		
		while(!q1.isEmpty())
			System.out.print(q1.dequeue()+"  ");

	}

}
