package SimpleLinkedList;



public class Program3 
{
	//������� ������ ����� �� ������ ����� ������� �� �� ������ ������� ������� ���� �� ����
	//����� ����� ��� ������ ���� ������ ������
	public static int evenItemsBeforeOdd(Node<Integer> head)
	{
		if(head==null)
			return 0;
		
		int counter=0;
		while(head.getNext()!=null)
		{
			if(head.getValue()%2==0 && head.getNext().getValue()%2==1)
			{
				System.out.print(head.getValue()+", ");
				counter++;
			}
			
			head=head.getNext();
		}
		System.out.println();
		return counter;
	}
	
	public static int evenItemsBeforeOdd1(Node<Integer> head)
	{
		int counter=0;
		
		while(head!=null && head.getNext()!=null)
		{
			if(head.getValue()%2==0 && head.getNext().getValue()%2==1)
			{
				System.out.print(head.getValue()+", ");
				counter++;
				head=head.getNext();
			}
			
			head=head.getNext();
		}
		System.out.println();
		return counter;
	}

	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Node<Integer>head=Program2.buildIntegerList1();
		Program1.printList(head);
		
		if(head==null)
			head=new Node<Integer>(10);
		else
		{
			Node<Integer> ptr=head;
			while(ptr.getNext()!=null) //������� �� ������ ������� ������
			{
				ptr=ptr.getNext();
			}
			ptr.setNext(new Node<Integer>(10));
		}
		Program1.printList(head);
			
		System.out.println(evenItemsBeforeOdd(head));
		System.out.println(evenItemsBeforeOdd1(head));	
	}
}
