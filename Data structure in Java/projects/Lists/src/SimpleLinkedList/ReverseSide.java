package SimpleLinkedList;

public class ReverseSide 
{
	//������� ��������� ������ ����� ������ ������ �� ��������
	public static <T> Node<T> reverseIterative1(Node<T> head)
	{
		//�� ����� ������ ���� �� ���� ���� ���, ��� ��� �� �����
		if(head==null || head.getNext()==null)
			return head;
		
		Node<T> prev=head, curr=head.getNext(), ptr=curr.getNext();
		
		while(ptr!=null)
		{
			curr.setNext(prev);
			prev=curr;
			curr=ptr;
			ptr=ptr.getNext();
		}
		
		curr.setNext(prev);
		head.setNext(null);
		return curr;
	}
	
	public static <T> Node<T> reverseIterative2(Node<T> head)
	{
		//�� ����� ������ ���� �� ���� ���� ���, ��� ��� �� �����
		if(head==null || head.getNext()==null)
			return head;
		
		Node<T> prev=head, curr=head.getNext(), temp;
		
		while(curr!=null)
		{
			temp=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=temp;
		}
		
		head.setNext(null);
		return prev;
	}

	
	//������� ��������� ������ ����� ������ ������ ����
	public static <T> Node<T> reverseRec(Node<T> ptr)
	{
		if(ptr==null || ptr.getNext()==null)
			return ptr;
		
		Node<T> head=reverseRec(ptr.getNext());
		ptr.getNext().setNext(ptr);
		ptr.setNext(null);
		return head;
	}
	
	
	
	//������� ��������� ������ ����� ������ ������ ����
	//2n ������ �� 
	public static <T> Node<T> reverseRec2(Node<T> ptr)
	{
		if(ptr.getNext()==null)
			return ptr;
		
		Node<T> head=reverseRec2(ptr.getNext());
		ptr.getNext().setNext(ptr);
		
		return head;
	}
	
	//������� ������ ����� ������ ������ �� �������� ������ ����
	public static <T> Node<T> reverseWrap(Node<T> head)
	{
		if(head==null)
			return null;
		Node<T> newHead=reverseRec2(head);
		head.setNext(null);
		return newHead;
	}
	
	public static void main(String[] args) 
	{
		Node<Integer> head=Program2.buildIntegerList1();
		Program1.printList(head);
		
		head=reverseIterative1(head);
		Program1.printList(head);
		
		head=reverseIterative2(head);
		Program1.printList(head);
		
		head=reverseRec(head);
		Program1.printList(head);
		
		head=reverseWrap(head);
		Program1.printList(head);
	}
}
