package SimpleLinkedList;



public class PrintReverseList 
{
	//������� ��������� ������ ����� ������ ������ ������� �� ����� ���� ���� ���� ������
	//�������� ������ ��������� ��� �����=�������
	public static <T> void printReverseIterative(Node<T> head)
	{
		Node<T> ptr, tail=null;
		
		while(tail!=head)
		{
			ptr=head;
			while(ptr.getNext()!=tail)
				ptr=ptr.getNext();
			
			System.out.print(ptr.getValue()+", ");
			tail=ptr;
		}
		
		System.out.println();
	}
	
	
	//������� ��������� ������ �� ���� ������ ��������� ��� �������
	//���� �������� ����� ���� ���� = O(n)
	public static <T> void printReverseRec(Node<T> head)
	{
		if(head==null)
			return;
		
		printReverseRec(head.getNext());
		System.out.print(head.getValue()+" ");
	}
	
	
	public static void main(String[] args) 
	{
		Node<Integer> head=Program2.buildIntegerList1();
		
		//printReverseIterative(head);

		printReverseRec(head);
		System.out.println();
	}

}
