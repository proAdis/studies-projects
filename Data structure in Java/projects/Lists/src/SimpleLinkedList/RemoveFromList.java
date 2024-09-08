package SimpleLinkedList;



public class RemoveFromList 
{
	//������� ������ ����� ���� ����� ������ �� ����� ������ �� ���� �������
	public static <T> Node<T> removeFirst(Node<T> head, T val)
	{
		if(head==null)
			return null;
		if(head.getValue().equals(val)) //�� ����� ������ ���� ���� ����� �� ������ ����� ������
			return head.getNext();
		
		//����� ����� ������ ����� ������
		Node<T> ptr=head;
		
		//������� �� ��� �� ������
		while(ptr.getNext()!=null)
		{
			if(ptr.getNext().getValue().equals(val)) //����� ������� ���� ���� ������
			{
				ptr.setNext(ptr.getNext().getNext());
				return head;
			}
			ptr=ptr.getNext(); //����� ���- ����� ������ ����
		}
		
		/*
		//�� ��� �� ����� ���� ������ ��� �� ����� �� ���� �������
		while(ptr.getNext()!=null && !ptr.getNext().getValue().equals(val))
			ptr=ptr.getNext();
		
		//���� ���� ����� ���� ����� �������
		if(ptr.getNext()!=null)//��� ���� ���� �� ���� ��� ������
		{
			ptr.setNext(ptr.getNext().getNext());
		}
		*/
			
		return head;
	}
	
	//������� ������ ����� ���� ����� ������ �� �� ������� �� ���� �������
	public static <T> Node<T> removeAll(Node<T> head, T val)
	{
		if(head==null)
			return null;
		
		//����� ���� ����� ������� ����� ������, ����� ���� ����
		Node<T> ptr=head;
		while(ptr.getNext()!=null)
		{
			if(ptr.getNext().getValue().equals(val)) //����� ���� �� ���� ������ ����
				ptr.setNext(ptr.getNext().getNext());
			else
				ptr=ptr.getNext(); //������ ����� �� ��� ���� �� ����� ����� ����� �
			//!!!��� ����� ��� ������!!!
		}
		
		//����� �� ��� ������ ����� ����� �� ����
		if(head.getValue().equals(val))
			head=head.getNext();  //return head.getNext();
		
		return head;
	}
	
	//������� ������ ����� ���� ����� ������ �� �� ������� �� ���� �������
	public static <T> Node<T> removeAll2(Node<T> head, T val)
	{
		//���� �� ���� �� ��� ������ ������� �� ���� �����
		while(head!=null && head.getValue().equals(val))
			head=head.getNext();
		
		if(head==null)
			return null;
		
		//����� ���� ����� ������� ����� ������, ����� ���� ����
		Node<T> ptr=head;
		while(ptr.getNext()!=null)
		{
			if(ptr.getNext().getValue().equals(val)) //����� ���� �� ���� ������ ����
				ptr.setNext(ptr.getNext().getNext());
			else
				ptr=ptr.getNext(); //������ ����� �� ��� ���� �� ����� ����� ����� �
			//!!!��� ����� ��� ������!!!
		}
		
		return head;
	}
	
	public static void main(String[] args) 
	{
		Node<Integer> head=Program2.buildIntegerList1();
		Program1.printList(head);
		
		head=removeFirst(head, 2);
		Program1.printList(head);
		head=removeAll(head, 4);
		Program1.printList(head);
		head=removeAll2(head, 1);
		Program1.printList(head);
		
		
	}

}
