package SimpleLinkedList;



public class Program1 
{
	//פונקציה המקבלת ראש רשימה מקושרת ומדפיסה את אברי הרשימה
	public static <T> void printList(Node<T> head)
	{
		while(head!=null)
		{
			System.out.print(head.getValue()+", ");
			head=head.getNext();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) 
	{
		Node<Integer> n1=new Node<Integer>(17);
		Node<Integer> n2=new Node<Integer>(18,n1);
		Node<Integer> n3=new Node<Integer>(8);
		n1.setNext(n3);
		n3.setNext(new Node<Integer>(5));
		
		printList(n2);
		
		System.out.println(n1);
		System.out.println(n2.getNext());
	}

}
