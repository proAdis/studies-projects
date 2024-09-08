package SimpleLinkedList;



public class SortedList 
{
	//פונקציה המקבלת הצבעה לחוליה וערך שצריך להתווסף אחריה
	public static <T> void addAfter(Node<T> ptr, T val)
	{
		Node<T> temp=new Node<T>(val, ptr.getNext());
		ptr.setNext(temp);
	}
	
	//פונקציה המקבלת רשימה ממויינת וערך להוספה, ומכניסה את הערך למקום המתאים מבחינת המיון
	public static Node<Integer> addToSortedList(Node<Integer> head, int val)
	{	
		if(head==null || val<head.getValue())
		{
			return new Node<Integer>(val,head);
		}
		
		Node<Integer> ptr=head;
		
		while(ptr.getNext()!=null && ptr.getNext().getValue()<val)
			ptr=ptr.getNext();
		
		addAfter(ptr, val);
		
		return head;	
	}
	
	
	
	//פונקציה הבונה רשימה מקושרת ממויינת
	public static Node<Integer> buildSortedListLong()
	{
		
		System.out.println("Enter numbers, to finish press a negative number:");
		int val=Program2.in.nextInt();
		
		if(val<0)
			return null;
		
		Node<Integer> ptr, head=new Node<Integer>(val);
		
		val=Program2.in.nextInt();
		while(val>-1)
		{
			Node<Integer> temp=new Node<Integer>(val);
			
			if(val<head.getValue())
			{
				temp.setNext(head);
				head=temp;
			}
			else
			{
				ptr=head;
				while(ptr.getNext()!=null && ptr.getNext().getValue()<val)
					ptr=ptr.getNext();
				
				temp.setNext(ptr.getNext());
				ptr.setNext(temp);
			}
			
			val=Program2.in.nextInt();
		}
		
		return head;
	}
	
	
	public static Node<Integer> buildSortedList()
	{
		Node<Integer> head=null;
		
		System.out.println("Enter numbers, to finish press a negative number:");
		int val=Program2.in.nextInt();
		
		while(val>-1)
		{
			head=addToSortedList(head, val);
			
			val=Program2.in.nextInt();
		}
		
		return head;
	}
	
	public static void main(String[] args) 
	{
		Node<Integer> head=buildSortedList();
		
		Program1.printList(head);	
		
	}
}
